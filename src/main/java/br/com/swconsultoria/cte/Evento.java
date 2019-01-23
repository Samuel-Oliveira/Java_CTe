package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento;
import br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoUtil;
import br.com.swconsultoria.cte.util.WebServiceUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cterecepcaoevento.CteRecepcaoEventoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

class Evento {

    static br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento cancelamento(ConfiguracoesCte config,
                                                                                 br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlCteUtil.objectCteToXml(evento);
            xml = evento(config, xml, ConstantesCte.SERVICOS.CANCELAR, valida);

            return XmlCteUtil.xmlToObject(xml, br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static TRetEvento epec(ConfiguracoesCte config,
                           TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlCteUtil.objectCteToXml(evento);
            xml = evento(config, xml, ConstantesCte.SERVICOS.EPEC, valida);

            return XmlCteUtil.xmlToObject(xml, TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento multimodal(ConfiguracoesCte config,
                                                                                     br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlCteUtil.objectCteToXml(evento);
            xml = evento(config, xml, ConstantesCte.SERVICOS.MULTIMODAL, valida);

            return XmlCteUtil.xmlToObject(xml, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento cce(ConfiguracoesCte config,
                                                                       br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlCteUtil.objectCteToXml(evento);
            xml = evento(config, xml, ConstantesCte.SERVICOS.CCE, valida);

            return XmlCteUtil.xmlToObject(xml, br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordo(ConfiguracoesCte config,
                                                                                              br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlCteUtil.objectCteToXml(evento);
            xml = evento(config, xml, ConstantesCte.SERVICOS.PRESTACAO_DESACORDO, valida);

            return XmlCteUtil.xmlToObject(xml, br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento gvt(ConfiguracoesCte config,
                                                                    br.com.swconsultoria.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlCteUtil.objectCteToXml(evento);
            xml = evento(config, xml, ConstantesCte.SERVICOS.GVT, valida);

            return XmlCteUtil.xmlToObject(xml, br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    private static String evento(ConfiguracoesCte config, String xml, String tipoEvento, boolean valida)
            throws CteException {

        try {

            xml = Assinatura.assinar(config, xml, Assinatura.EVENTO);

            if (valida) {
                String erros = ValidarCte.validaXml(config, xml, ConstantesCte.SERVICOS.EVENTO);

                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new CteException("Erro Na Validação do Xml: " + erros);
                }
            }

            if (config.isLog()) {
                System.out.println("Xml Evento: " + xml);
            }

            OMElement ome = AXIOMUtil.stringToOM(xml);

            CteRecepcaoEventoStub.CteDadosMsg dadosMsg = new CteRecepcaoEventoStub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CteRecepcaoEventoStub.CteCabecMsg cteCabecMsg = new CteRecepcaoEventoStub.CteCabecMsg();
            cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoIbge()));
            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

            CteRecepcaoEventoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoEventoStub.CteCabecMsgE();
            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

            CteRecepcaoEventoStub stub = new CteRecepcaoEventoStub(
                    WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.EVENTO));

            return stub.cteRecepcaoEvento(dadosMsg, cteCabecMsgE).getExtraElement().toString();

        } catch (RemoteException | XMLStreamException e) {
            throw new CteException(e.getMessage());
        }

    }

}
