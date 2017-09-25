/*
* To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.samuelweb.mdfe;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.cte.Assinatura;
import br.com.samuelweb.cte.ConfiguracoesIniciais;
import br.com.samuelweb.exception.EmissorException;
import br.com.samuelweb.util.CertificadoUtil;
import br.com.samuelweb.util.ConstantesMDFe;
import br.com.samuelweb.util.ObjetoUtil;
import br.com.samuelweb.util.WebServiceUtil;
import br.com.samuelweb.util.XmlUtil;
import br.inf.portalfiscal.mdfe.schema_300.enviMDFe.TEnviMDFe;
import br.inf.portalfiscal.mdfe.schema_300.retEnviMDFe.TRetEnviMDFe;
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeRecepcao.MDFeRecepcaoStub;
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeRecepcao.MDFeRecepcaoStub.MdfeCabecMsg;
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeRecepcao.MDFeRecepcaoStub.MdfeCabecMsgE;
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeRecepcao.MDFeRecepcaoStub.MdfeDadosMsg;
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeRecepcao.MDFeRecepcaoStub.MdfeRecepcaoLoteResult;

/**
 *
 * @author john
 */
public class EnvioMdfe {

    private static MdfeRecepcaoLoteResult result;
    private static ConfiguracoesIniciais configuracoes;
    private static CertificadoUtil certUtil;

    public static TEnviMDFe montaMdfe(TEnviMDFe enviMdfe, boolean validar) throws EmissorException {
        try {
            return XmlUtil.xmlToObject(montaMdfe(XmlUtil.objectMdfeToXml(enviMdfe), validar), TEnviMDFe.class);
        } catch (JAXBException e) {
            throw new EmissorException("Erro ao Montar MDFe : " + e.getMessage());
        }
    }

    public static String montaMdfe(String xml, boolean validar) throws EmissorException {

        /**
         * Assina o Xml
         */
        xml = Assinatura .assinar(xml, Assinatura.MDFE);

        /**
         * Valida o Xml caso sejá selecionado True
         */
        if (validar) {
            String erros = ValidarMDFe.validaXml(xml, ConstantesMDFe.SERVICOS.ENVIO);
            if (!ObjetoUtil.isEmpty(erros)) {
                throw new EmissorException("Erro Na Validação do Xml: " + erros);
            }
        }

        System.out.println("Cte Assinado: " + xml);

        return xml;
    }

    public static TRetEnviMDFe enviarMdfe(TEnviMDFe enviMdfe) throws EmissorException, Exception {
        try {
            result = enviar(XmlUtil.objectMdfeToXml(enviMdfe));
            return XmlUtil.xmlToObject(result.getExtraElement().toString(), TRetEnviMDFe.class);
        } catch (JAXBException e) {
            throw new EmissorException(e.getMessage());
        }
    }

    public static MdfeRecepcaoLoteResult enviar(String xml) throws EmissorException, Exception {
        try {
            /**
             * Informacoes do Certificado Digital.
             */
            certUtil = new CertificadoUtil();
            certUtil.iniciaConfiguracoes();
            configuracoes = ConfiguracoesIniciais.getInstance();

            OMElement ome = AXIOMUtil.stringToOM(xml);

            System.out.println("MDFe para Envio: " + ome.toString());
            MdfeDadosMsg dadosMsg = new MdfeDadosMsg();
            dadosMsg.setExtraElement(ome);
            MdfeCabecMsg mdfeCabecMsg = new MdfeCabecMsg();
                 /**
             * Codigo do Estado.
             */
            mdfeCabecMsg.setCUF(String.valueOf(configuracoes.getEstado().getCodigoIbge()));

            /**
             * Versao do XML
             */
            mdfeCabecMsg.setVersaoDados(configuracoes.getVersao());
            
            MdfeCabecMsgE mdfeCabecMsgE = new MdfeCabecMsgE();
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);
            
            MDFeRecepcaoStub stub = new MDFeRecepcaoStub(WebServiceUtil.getUrl(ConstantesMDFe.MDFE, ConstantesMDFe.SERVICOS.ENVIO));
            return stub.mdfeRecepcaoLote(dadosMsg, mdfeCabecMsgE);
            
        } catch (RemoteException | XMLStreamException e) {
            throw new EmissorException(e.getMessage());
        }
    }
}
