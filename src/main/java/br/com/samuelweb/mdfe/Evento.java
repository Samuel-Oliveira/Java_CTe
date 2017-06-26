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
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeRecepcaoEvento.MDFeRecepcaoEventoStub;

/**
 *
 * @author john
 */
public class Evento {

    public static MDFeRecepcaoEventoStub.MdfeRecepcaoEventoResult result;
    private static ConfiguracoesIniciais configuracoes;
    private static CertificadoUtil certUtil;

    public static br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TRetEvento incluirCondutor(br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TEvento evento, boolean validar) throws EmissorException, Exception {

        try {
            String xml = XmlUtil.objectMdfeToXml(evento);
            xml = evento(xml, ConstantesMDFe.SERVICOS.INCLUIR_CONDUTOR, validar);
            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TRetEvento.class);
        } catch (JAXBException e) {
            throw new EmissorException(e.getMessage());
        }
    }

    public static br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TRetEvento cancelar(br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TEvento evento, boolean validar) throws EmissorException, Exception {
        try {
            String xml = XmlUtil.objectMdfeToXml(evento);
            xml = evento(xml, ConstantesMDFe.SERVICOS.CANCELAR, validar);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TRetEvento.class);

        } catch (JAXBException e) {
            throw new EmissorException(e.getMessage());
        }
    }

    public static br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TRetEvento encerrar(br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TEvento evento, boolean validar) throws EmissorException, Exception {
        try {
            String xml = XmlUtil.objectMdfeToXml(evento);
            xml = evento(xml, ConstantesMDFe.SERVICOS.ENCERRAR, validar);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TRetEvento.class);

        } catch (JAXBException e) {
            throw new EmissorException(e.getMessage());
        }
    }



    private static String evento(String xml, String tipoEvento, boolean valida) throws EmissorException, Exception {

        certUtil = new CertificadoUtil();
        configuracoes = ConfiguracoesIniciais.getInstance();

        try {

            /**
             * Informacoes do Certificado Digital.
             */
            certUtil.iniciaConfiguracoes();

            xml = Assinatura.assinar(xml, Assinatura.EVENTOMDFE);

            if (valida) {
                String erros = "";
                erros = ValidarMDFe.validaXml(xml, ConstantesMDFe.SERVICOS.EVENTO);

                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new EmissorException("Erro Na Validação do Xml: " + erros);
                }
            }

            System.out.println("Xml Evento: " + xml);

            OMElement ome = AXIOMUtil.stringToOM(xml);
            MDFeRecepcaoEventoStub.MdfeDadosMsg dadosMsg = new MDFeRecepcaoEventoStub.MdfeDadosMsg();
            dadosMsg.setExtraElement(ome);

            MDFeRecepcaoEventoStub.MdfeCabecMsg mdfeCabecMsg = new MDFeRecepcaoEventoStub.MdfeCabecMsg();

            mdfeCabecMsg.setCUF(String.valueOf(configuracoes.getEstado().getCodigoIbge()));

            /**
             * Versao do XML
             */
            mdfeCabecMsg.setVersaoDados(configuracoes.getVersao());

            MDFeRecepcaoEventoStub.MdfeCabecMsgE mdfeCabecMsgE = new MDFeRecepcaoEventoStub.MdfeCabecMsgE();
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);

            MDFeRecepcaoEventoStub stub = new MDFeRecepcaoEventoStub(WebServiceUtil.getUrl(ConstantesMDFe.MDFE, ConstantesMDFe.SERVICOS.EVENTO));
            result = stub.mdfeRecepcaoEvento(dadosMsg, mdfeCabecMsgE);

        } catch (RemoteException | XMLStreamException e) {
            throw new EmissorException(e.getMessage());
        }

        return result.getExtraElement().toString();
    }

}
