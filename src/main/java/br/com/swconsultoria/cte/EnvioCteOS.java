package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AssinaturaEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.cteOS.TCTeOS;
import br.com.swconsultoria.cte.schema_300.retCTeOS.TRetCTeOS;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import lombok.extern.java.Log;

import javax.xml.bind.JAXBException;

/**
 * Classe Responsavel por Enviar o Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
@Log
class EnvioCteOS {

    /**
     * Metodo para Montar a CTE
     *
     * @param config
     * @param enviCTe
     * @param valida
     * @return TEnviCTe
     * @throws CteException
     */
    static TCTeOS montaCteOS(ConfiguracoesCte config, TCTeOS enviCTe, boolean valida) throws CteException {
        try {

            /**
             * Cria o xml
             */
            String xml = XmlCteUtil.objectToXml(enviCTe);

            /**
             * Assina o Xml
             */
            xml = Assinar.assinaCte(config, xml, AssinaturaEnum.CTE_OS);

            //Retira Quebra de Linha
            xml = xml.replaceAll(System.lineSeparator(), "");

            log.info("[XML-ASSINADO]: " + xml);

            /**
             * Valida o Xml caso sejá selecionado True
             */
            if (valida) {
                new Validar().validaXml(config, xml, ServicosEnum.ENVIO_CTE_OS);
            }

            return XmlCteUtil.xmlToObject(xml, TCTeOS.class);
        } catch (JAXBException e) {
            throw new CteException(e);
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
    static TRetCTeOS enviaCteOS(ConfiguracoesCte config, TCTeOS enviCTe)
            throws CteException {

//        try {
//
//            String xml = XmlCteUtil.objectToXml(enviCTe);
//            OMElement ome = AXIOMUtil.stringToOM(xml);
//
//            if (config.getEstado().equals(EstadosEnum.PR)
//                    || config.getEstado().equals(EstadosEnum.MT)
//                    || config.getEstado().equals(EstadosEnum.MS)) {
//                Iterator<?> children = ome.getChildrenWithLocalName("CTe");
//                while (children.hasNext()) {
//                    OMElement omElement = (OMElement) children.next();
//                    if (omElement != null && "CTe".equals(omElement.getLocalName())) {
//                        omElement.addAttribute("xmlns", "http://www.portalfiscal.inf.br/cte", null);
//                    }
//                }
//            }
//
//            log.info("[XML-ENVIO]: " + ome);
//
//            CteRecepcaoOSStub.CteDadosMsg dadosMsg = new CteRecepcaoOSStub.CteDadosMsg();
//            dadosMsg.setExtraElement(ome);
//            CteRecepcaoOSStub.CteCabecMsg cteCabecMsg = new CteRecepcaoOSStub.CteCabecMsg();
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
//            CteRecepcaoOSStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoOSStub.CteCabecMsgE();
//            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);
//
//            CteRecepcaoOSStub stub = new CteRecepcaoOSStub(
//                    WebServiceCteUtil.getUrl(config, ServicosEnum.ENVIO_CTE_OS));
//            CteRecepcaoOSStub.CteRecepcaoOSResult result = stub.cteRecepcaoOS(dadosMsg, cteCabecMsgE);
//
//            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);
//
//        } catch (RemoteException | XMLStreamException | JAXBException e) {
//            throw new CteException(e);
//        }
        return null;

    }

}
