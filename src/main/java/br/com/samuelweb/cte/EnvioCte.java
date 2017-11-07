package br.com.samuelweb.cte;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.*;
import br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe;
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteCabecMsg;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteCabecMsgE;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteDadosMsg;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteRecepcaoLoteResult;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
class EnvioCte {

    private static CteRecepcaoLoteResult result;

    /**
     * Metodo para Montar a CTE
     *
     * @param TEnviNFe
     * @return TEnviCTe
     * @throws NfeException
     */
    static TEnviCTe montaCte(TEnviCTe enviCTe, boolean valida) throws CteException {
        try {

            /**
             * Assina o Xml
             */
            String xml = Assinatura.assinar(XmlUtil.objectCteToXml(enviCTe), Assinatura.CTE);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (valida) {
                String erros = ValidarCte.validaXml(xml, ConstantesCte.SERVICOS.ENVIO_CTE);
                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new CteException("Erro Na Validação do Xml: " + erros);
                }
            }

            if(ConfiguracoesIniciais.getInstance().isLog()){
                System.out.println("Cte Assinado: " + xml);
            }

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe.class);
        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    /**
     * Metodo para Enviar a CTEOS.
     *
     * @param TEnviCTe
     * @return TRetEnviCTe
     * @throws CteException
     */

    static TRetCTeOS enviaCteOS(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws CteException {

        try {
            result = enviar(XmlUtil.objectCteToXml(enviCTe), ConstantesCte.CTE_OS);
            return XmlUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);
        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    /**
     * Metodo para Enviar a CTE
     *
     * @param TEnviCTe
     * @return TRetEnviCTe
     * @throws CteException
     */
    static TRetEnviCTe enviaCte(TEnviCTe enviCTe) throws CteException {

        try {
            result = enviar(XmlUtil.objectCteToXml(enviCTe), ConstantesCte.CTE);
            return XmlUtil.xmlToObject(result.getExtraElement().toString(), br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe.class);
        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    /**
     * Metodo para Enviar
     *
     * @param TEnviCTe
     * @return TRetEnviCTe
     * @throws CteException
     */
    private static CteRecepcaoLoteResult enviar(String xml, String tipo) throws CteException {

        try {
            /**
             * Informacoes do Certificado Digital.
             */
            CertificadoUtil.iniciaConfiguracoes();
            ConfiguracoesIniciais configuracoesCte = ConfiguracoesIniciais.getInstance();

            OMElement ome = AXIOMUtil.stringToOM(xml);

            if (configuracoesCte.isLog()) {
                System.out.println("Cte para Envio: " + ome.toString());
            }

            CteDadosMsg dadosMsg = new CteDadosMsg();
            dadosMsg.setExtraElement(ome);
            CteCabecMsg cteCabecMsg = new CteCabecMsg();

            /**
             * Codigo do Estado.
             */
            cteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));

            /**
             * Versao do XML
             */
            cteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

            CteCabecMsgE cteCabecMsgE = new CteCabecMsgE();
            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

            CteRecepcaoStub stub = new CteRecepcaoStub(WebServiceUtil.getUrl(tipo, ConstantesCte.SERVICOS.ENVIO_CTE));
            return stub.cteRecepcaoLote(dadosMsg, cteCabecMsgE);

        } catch (RemoteException | XMLStreamException e) {
            throw new CteException(e.getMessage());
        }

    }

}
