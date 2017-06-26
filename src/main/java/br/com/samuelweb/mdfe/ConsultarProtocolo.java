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
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeConsulta.MDFeConsultaStub;

/**
 *
 * @author john
 */
public class ConsultarProtocolo {
    private static MDFeConsultaStub.MdfeConsultaMDFResult result;
    private static ConfiguracoesIniciais configuracoes;
    private static CertificadoUtil certUtil;

    public static br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.TRetConsSitMDFe consultarProtocolo(br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.TConsSitMDFe consSitMdfe, boolean validar) throws EmissorException, Exception {
        try {
            result = consultar(XmlUtil.objectMdfeToXml(consSitMdfe), validar);
            return XmlUtil.xmlToObject(result.getExtraElement().toString(), br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.TRetConsSitMDFe.class);
        } catch (JAXBException e) {
            throw new EmissorException(e.getMessage());
        }
    }

    public static MDFeConsultaStub.MdfeConsultaMDFResult consultar(String xml, boolean validar) throws EmissorException, Exception {
     

        try {
            certUtil = new CertificadoUtil();
            configuracoes = ConfiguracoesIniciais.getInstance();
            certUtil.iniciaConfiguracoes();

            if (validar) {
                String erros = ValidarMDFe.validaXml(xml, ConstantesMDFe.SERVICOS.CONSULTA_PROTOCOLO);
                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new EmissorException("Erro Na Validação do Xml: " + erros);
                }
            }

            System.out.println("Xml Consulta: " + xml);
            OMElement ome = AXIOMUtil.stringToOM(xml);

            MDFeConsultaStub.MdfeCabecMsg cabecMsg = new MDFeConsultaStub.MdfeCabecMsg();
            /**
             * Codigo do Estado.
             */
            cabecMsg.setCUF(configuracoes.getEstado().getCodigoIbge());
            cabecMsg.setVersaoDados(configuracoes.getVersao());
            
            MDFeConsultaStub.MdfeDadosMsg dadosMsg = new MDFeConsultaStub.MdfeDadosMsg();
            dadosMsg.setExtraElement(ome);
            
            
            MDFeConsultaStub.MdfeCabecMsgE cabecMsgE = new MDFeConsultaStub.MdfeCabecMsgE();
            cabecMsgE.setMdfeCabecMsg(cabecMsg);
            String url = WebServiceUtil.getUrl(ConstantesMDFe.MDFE, ConstantesMDFe.SERVICOS.CONSULTA_PROTOCOLO);
            
            MDFeConsultaStub stub = new MDFeConsultaStub(url);
            return stub.mdfeConsultaMDF(dadosMsg, cabecMsgE);
        } catch (RemoteException | XMLStreamException e) {
            throw new EmissorException(e.getMessage());
        }
    }
}
