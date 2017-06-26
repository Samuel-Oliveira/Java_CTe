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

import br.com.samuelweb.cte.ConfiguracoesIniciais;
import br.com.samuelweb.exception.EmissorException;
import br.com.samuelweb.util.CertificadoUtil;
import br.com.samuelweb.util.ConstantesMDFe;
import br.com.samuelweb.util.ObjetoUtil;
import br.com.samuelweb.util.WebServiceUtil;
import br.com.samuelweb.util.XmlUtil;
import br.inf.portalfiscal.mdfe.schema_300.consReciMDFe.TConsReciMDFe;
import br.inf.portalfiscal.mdfe.schema_300.retConsReciMDFe.TRetConsReciMDFe;
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeRetRecepcao.MDFeRetRecepcaoStub;

/**
 *
 * @author john
 */
public class RetornoMdfe {
    
    private static MDFeRetRecepcaoStub.MdfeRetRecepcaoResult result;
    private static ConfiguracoesIniciais configuracoes;
    private static CertificadoUtil certUtil;

    public static TRetConsReciMDFe consultarRecibo(TConsReciMDFe consReciMdfe, boolean validar) throws EmissorException, Exception {

        try {
            /**
             * Informacoes do Certificado Digital.
             */
            certUtil = new CertificadoUtil();
            certUtil.iniciaConfiguracoes();
            configuracoes = ConfiguracoesIniciais.getInstance();

            /**
             * Cria o xml
             */
            String xml = XmlUtil.objectMdfeToXml(consReciMdfe);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (validar) {
                String erros = ValidarMDFe.validaXml(xml, ConstantesMDFe.SERVICOS.CONSULTA_RECIBO);
                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new EmissorException("Erro Na Validação do Xml: " + erros);
                }
            }

            System.out.println("Xml Consulta Recibo: " + xml);

            OMElement ome = AXIOMUtil.stringToOM(xml);
            MDFeRetRecepcaoStub.MdfeDadosMsg dadosMsg = new MDFeRetRecepcaoStub.MdfeDadosMsg();
            dadosMsg.setExtraElement(ome);

            MDFeRetRecepcaoStub.MdfeCabecMsg cabecMsg = new MDFeRetRecepcaoStub.MdfeCabecMsg();

            /**
             * Codigo do Estado.
             */
            cabecMsg.setCUF(String.valueOf(configuracoes.getEstado().getCodigoIbge()));

            /**
             * Versao do XML
             */
            cabecMsg.setVersaoDados(configuracoes.getVersao());

            MDFeRetRecepcaoStub.MdfeCabecMsgE cabecMsgE = new MDFeRetRecepcaoStub.MdfeCabecMsgE();
            cabecMsgE.setMdfeCabecMsg(cabecMsg);

            String url = WebServiceUtil.getUrl(ConstantesMDFe.MDFE, ConstantesMDFe.SERVICOS.CONSULTA_RECIBO);

            MDFeRetRecepcaoStub stub = new MDFeRetRecepcaoStub(url);

            result = stub.mdfeRetRecepcao(dadosMsg, cabecMsgE);
            
            return XmlUtil.xmlToObject(result.getExtraElement().toString(), TRetConsReciMDFe.class);
        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new EmissorException(e.getMessage());
        }

    }
}
