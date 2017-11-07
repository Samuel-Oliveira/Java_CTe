package br.com.samuelweb.cte;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.*;
import br.inf.portalfiscal.www.cte.wsdl.cterecepcaoevento.CteRecepcaoEventoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

class Evento {

    static br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento cancelamento(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlUtil.objectCteToXml(evento);
            xml = evento(xml, ConstantesCte.SERVICOS.CANCELAR, valida);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento epec(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlUtil.objectCteToXml(evento);
            xml = evento(xml, ConstantesCte.SERVICOS.EPEC, valida);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento multimodal(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlUtil.objectCteToXml(evento);
            xml = evento(xml, ConstantesCte.SERVICOS.MULTIMODAL, valida);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento cce(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlUtil.objectCteToXml(evento);
            xml = evento(xml, ConstantesCte.SERVICOS.CCE, valida);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordo(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlUtil.objectCteToXml(evento);
            xml = evento(xml, ConstantesCte.SERVICOS.PRESTACAO_DESACORDO, valida);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    static br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento gvt(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException {

        try {

            String xml = XmlUtil.objectCteToXml(evento);
            xml = evento(xml, ConstantesCte.SERVICOS.GVT, valida);

            return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento.class);

        } catch (JAXBException e) {
            throw new CteException(e.getMessage());
        }

    }

    private static String evento(String xml, String tipoEvento, boolean valida) throws CteException {


        CteRecepcaoEventoStub.CteRecepcaoEventoResult result;
        try {

            ConfiguracoesIniciais configuracoesCte = ConfiguracoesIniciais.getInstance();
            CertificadoUtil.iniciaConfiguracoes();

            xml = Assinatura.assinar(xml, Assinatura.EVENTO);

            if (valida) {
                String erros = ValidarCte.validaXml(xml, ConstantesCte.SERVICOS.EVENTO);

                if (!ObjetoUtil.isEmpty(erros)) {
                    throw new CteException("Erro Na Validação do Xml: " + erros);
                }
            }

            if (configuracoesCte.isLog()) {
                System.out.println("Xml Evento: " + xml);
            }

            OMElement ome = AXIOMUtil.stringToOM(xml);

            CteRecepcaoEventoStub.CteDadosMsg dadosMsg = new CteRecepcaoEventoStub.CteDadosMsg();
            dadosMsg.setExtraElement(ome);

            CteRecepcaoEventoStub.CteCabecMsg cteCabecMsg = new CteRecepcaoEventoStub.CteCabecMsg();
            cteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));
            cteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

            CteRecepcaoEventoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoEventoStub.CteCabecMsgE();
            cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

            CteRecepcaoEventoStub stub = new CteRecepcaoEventoStub(WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.EVENTO));

            return stub.cteRecepcaoEvento(dadosMsg, cteCabecMsgE).getExtraElement().toString();

        } catch (RemoteException | XMLStreamException e) {
            throw new CteException(e.getMessage());
        }

    }

}
