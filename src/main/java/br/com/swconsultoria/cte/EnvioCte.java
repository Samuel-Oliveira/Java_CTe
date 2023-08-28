package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.enviCTe.TEnviCTe;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import lombok.extern.java.Log;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
@Log
class EnvioCte {

    /**
     * Metodo para Montar a CTE
     *
     * @param config
     * @param enviCTe
     * @param valida
     * @return TEnviCTe
     * @throws CteException
     */
    static TEnviCTe montaCte(ConfiguracoesCte config, TEnviCTe enviCTe, boolean valida) throws CteException {
        try {

            /**
             * Cria o xml
             */
            String xml = XmlCteUtil.objectToXml(enviCTe);

            /**
             * Assina o Xml
             */
            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.CTE);

            //Retira Quebra de Linha
            xml = xml.replaceAll(System.lineSeparator(), "");

            log.info("[XML-ASSINADO]: " + xml);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.ENVIO_CTE);
            }

            return XmlCteUtil.xmlToObject(xml, TEnviCTe.class);

        } catch (Exception e) {
            throw new CteException(e.getMessage());
        }

    }

    /**
     * Metodo para Enviar a CTE
     *
     * @param config
     * @param enviCTe
     * @return TRetEnviCTe
     * @throws CteException
     */
    static TRetEnviCTe enviaCte(ConfiguracoesCte config, TEnviCTe enviCTe) throws CteException {

//        try {
//
//            String xml = XmlCteUtil.objectToXml(enviCTe);
//
//            OMElement ome = AXIOMUtil.stringToOM(xml);
//
//            if (config.getEstado().equals(EstadosEnum.PR) ||
//                    config.getEstado().equals(EstadosEnum.MT)  ||
//                    config.getEstado().equals(EstadosEnum.MS)) {
//                Iterator<?> children = ome.getChildrenWithLocalName("CTe");
//                while (children.hasNext()) {
//                    OMElement omElement = (OMElement) children.next();
//                    if (omElement != null && "CTe".equals(omElement.getLocalName())) {
//                        omElement.addAttribute("xmlns", "http://www.portalfiscal.inf.br/cte", null);
//                    }
//                }
//            }
//
//            log.info("[XML-ENVIO]: " + xml);
//
//            CteRecepcaoStub.CteDadosMsg dadosMsg = new CteRecepcaoStub.CteDadosMsg();
//            dadosMsg.setExtraElement(ome);
//            CteRecepcaoStub.CteCabecMsg cteCabecMsg = new CteRecepcaoStub.CteCabecMsg();
//
//            /**
//             * Codigo do Estado.
//             */
//            cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoUF()));
//
//            /**
//             * Versao do XML
//             */
//            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);
//
//            CteRecepcaoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoStub.CteCabecMsgE();
//            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);
//
//            CteRecepcaoStub stub = new CteRecepcaoStub(
//                    WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE));
//            CteRecepcaoStub.CteRecepcaoLoteResult result = stub.cteRecepcaoLote(dadosMsg, cteCabecMsgE);
//
//            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(),
//                    TRetEnviCTe.class);
//
//        } catch (RemoteException | XMLStreamException | JAXBException e) {
//            throw new CteException(e.getMessage());
//        }
        return null;
    }

}
