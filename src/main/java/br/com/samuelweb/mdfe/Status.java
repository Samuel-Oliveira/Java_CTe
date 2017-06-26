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
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeStatusServico.MDFeStatusServicoStub;

/**
 *
 * @author john
 */
public class Status {

    private static ConfiguracoesIniciais configuracoes;

    public static br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.TRetConsStatServ statusServico(br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.TConsStatServ consStatServ, boolean validar) throws EmissorException, Exception {
        try {
            MDFeStatusServicoStub.MdfeStatusServicoMDFResult result = statusServico(XmlUtil.objectMdfeToXml(consStatServ),validar);
            return XmlUtil.xmlToObject(result.getExtraElement().toString(),br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.TRetConsStatServ.class);
        } catch (JAXBException e) {
            throw new EmissorException(e.getMessage());
        }
    }

    private  static MDFeStatusServicoStub.MdfeStatusServicoMDFResult statusServico(String xml, boolean valida) throws EmissorException, Exception {
        configuracoes = ConfiguracoesIniciais.getInstance();
        CertificadoUtil certificadoUtil = new CertificadoUtil();
        certificadoUtil.iniciaConfiguracoes();

        try {
            if (valida) {
                String erros = ValidarMDFe.validaXml(xml, ConstantesMDFe.SERVICOS.STATUS_SERVICO);
                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new EmissorException("Erro Na Validação do Xml: " + erros);
                }
            }
            OMElement ome = AXIOMUtil.stringToOM(xml);
            MDFeStatusServicoStub.MdfeDadosMsg dadosMsg = new MDFeStatusServicoStub.MdfeDadosMsg();
            dadosMsg.setExtraElement(ome);

            MDFeStatusServicoStub.MdfeCabecMsg mdfeCabecMsg = new MDFeStatusServicoStub.MdfeCabecMsg();
            /**
             * Codigo do Estado.
             */
            mdfeCabecMsg.setCUF(configuracoes.getEstado().getCodigoIbge());

            /**
             * Versao do XML
             */
            mdfeCabecMsg.setVersaoDados(configuracoes.getVersao());
            MDFeStatusServicoStub.MdfeCabecMsgE mdfeCabecMsgE = new MDFeStatusServicoStub.MdfeCabecMsgE();
            mdfeCabecMsgE.setMdfeCabecMsg(mdfeCabecMsg);
            String url = WebServiceUtil.getUrl(ConstantesMDFe.MDFE, ConstantesMDFe.SERVICOS.STATUS_SERVICO);
            MDFeStatusServicoStub stub = new MDFeStatusServicoStub(url);
        
            return stub.mdfeStatusServicoMDF(dadosMsg, mdfeCabecMsgE);

        } catch (RemoteException | XMLStreamException e) {
            throw new EmissorException(e.getMessage());
        }
    }
}
