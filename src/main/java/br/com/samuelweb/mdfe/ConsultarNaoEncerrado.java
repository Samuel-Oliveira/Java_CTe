/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.samuelweb.mdfe;

import java.rmi.RemoteException;

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
import br.inf.portalfiscal.www.mdfe.wsdl.MDFeConsNaoEnc.MDFeConsNaoEncStub;

/**
 *
 * @author john
 */
public class ConsultarNaoEncerrado {

    private static MDFeConsNaoEncStub.MdfeConsNaoEncResult result;
    private static ConfiguracoesIniciais configuracoes;
    private static CertificadoUtil certUtil;

    public static br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.TRetConsMDFeNaoEnc consultar(br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.TConsMDFeNaoEnc consMDFeNaoEnc, boolean validar) throws Exception {
        try {
            result = consultar(XmlUtil.objectMdfeToXml(consMDFeNaoEnc), validar);
            return XmlUtil.xmlToObject(result.getExtraElement().toString(), br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.TRetConsMDFeNaoEnc.class);
        } catch (RemoteException | XMLStreamException e) {
            throw new EmissorException(e.getMessage());
        }
    }

    public static MDFeConsNaoEncStub.MdfeConsNaoEncResult consultar(String xml, boolean validar) throws EmissorException, Exception {

        try {
            certUtil = new CertificadoUtil();
            configuracoes = ConfiguracoesIniciais.getInstance();
            certUtil.iniciaConfiguracoes();

            if (validar) {
                String erros = ValidarMDFe.validaXml(xml, ConstantesMDFe.SERVICOS.CONSULTA_NAO_ENCERRADO);
                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new EmissorException("Erro Na Validação do Xml: " + erros);
                }
            }

            System.out.println("Xml Consulta: " + xml);
            OMElement ome = AXIOMUtil.stringToOM(xml);

            MDFeConsNaoEncStub.MdfeCabecMsg cabecMsg = new MDFeConsNaoEncStub.MdfeCabecMsg();
            /**
             * Codigo do Estado.
             */
            cabecMsg.setCUF(configuracoes.getEstado().getCodigoIbge());
            cabecMsg.setVersaoDados(configuracoes.getVersao());

            MDFeConsNaoEncStub.MdfeDadosMsg dadosMsg = new MDFeConsNaoEncStub.MdfeDadosMsg();
            dadosMsg.setExtraElement(ome);

            MDFeConsNaoEncStub.MdfeCabecMsgE cabecMsgE = new MDFeConsNaoEncStub.MdfeCabecMsgE();
            cabecMsgE.setMdfeCabecMsg(cabecMsg);
            String url = WebServiceUtil.getUrl(ConstantesMDFe.MDFE, ConstantesMDFe.SERVICOS.CONSULTA_NAO_ENCERRADO);

            MDFeConsNaoEncStub stub = new MDFeConsNaoEncStub(url);
            return stub.mdfeConsNaoEnc(dadosMsg, cabecMsgE);

        } catch (RemoteException | XMLStreamException e) {
            throw new EmissorException(e.getMessage());
        }
    }

  
}
