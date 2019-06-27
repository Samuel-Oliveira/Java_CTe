package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.com.swconsultoria.cte.util.*;
import br.com.swconsultoria.cte.wsdl.CteRecepcaoOS.CteRecepcaoOSStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;
import java.util.Iterator;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
class EnvioCteOS {

    /**
     * Metodo para Montar a CTE OS
     *
     * @param TEnviNFe
     * @return TEnviCTe
     * @throws NfeException
     */
    static TCTeOS montaCteOS(ConfiguracoesCte config, TCTeOS enviCTe, boolean valida) throws CteException {
        try {

            /**
             * Assina o Xml
             */
            String xml = Assinatura.assinar(config, XmlCteUtil.objectCteToXml(enviCTe), Assinatura.CTE_OS);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (valida) {
                String erros = ValidarCte.validaXml(config, xml, ConstantesCte.SERVICOS.ENVIO_CTE_OS);
                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new CteException("Erro Na Validação do Xml: " + erros);
                }
            }

            if (config.isLog()) {
                System.out.println("Cte OS Assinado: " + xml);
            }

            return XmlCteUtil.xmlToObject(xml, TCTeOS.class);
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

    static TRetCTeOS enviaCteOS(ConfiguracoesCte config, TCTeOS enviCTe)
            throws CteException {

        try {

            OMElement ome = AXIOMUtil.stringToOM(XmlCteUtil.objectCteToXml(enviCTe));

            if (config.getEstado().equals(Estados.PR)) {
                Iterator<?> children = ome.getChildrenWithLocalName("CTe");
                while (children.hasNext()) {
                    OMElement omElement = (OMElement) children.next();
                    if (omElement != null && "CTe".equals(omElement.getLocalName())) {
                        omElement.addAttribute("xmlns", "http://www.portalfiscal.inf.br/cte", null);
                    }
                }
            }

            if (config.isLog()) {
                System.out.println("Cte para Envio: " + ome.toString());
            }

            CteRecepcaoOSStub.CteDadosMsg dadosMsg = new CteRecepcaoOSStub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);
            CteRecepcaoOSStub.CteCabecMsg cteCabecMsg = new CteRecepcaoOSStub.CteCabecMsg();

            /**
             * Codigo do Estado.
             */
            cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoIbge()));

            /**
             * Versao do XML
             */
            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

            CteRecepcaoOSStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoOSStub.CteCabecMsgE();
            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

            CteRecepcaoOSStub stub = new CteRecepcaoOSStub(
                    WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.ENVIO_CTE_OS));
            CteRecepcaoOSStub.CteRecepcaoOSResult result = stub.cteRecepcaoOS(dadosMsg, cteCabecMsgE);

            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);

        } catch (RemoteException | XMLStreamException | JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

}
