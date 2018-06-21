package br.com.samuelweb.cte;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.cte.dom.Configuracoes;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.ObjetoUtil;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.www.cte.wsdl.cterecepcaoevento.CteRecepcaoEventoStub;

class Evento {

	static br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento cancelamento(Configuracoes config,
			br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException {

		try {

			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(config, xml, ConstantesCte.SERVICOS.CANCELAR, valida);

			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento.class);

		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	static br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento epec(Configuracoes config,
			br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento evento, boolean valida) throws CteException {

		try {

			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(config, xml, ConstantesCte.SERVICOS.EPEC, valida);

			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento.class);

		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	static br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento multimodal(Configuracoes config,
			br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws CteException {

		try {

			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(config, xml, ConstantesCte.SERVICOS.MULTIMODAL, valida);

			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento.class);

		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	static br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento cce(Configuracoes config,
			br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException {

		try {

			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(config, xml, ConstantesCte.SERVICOS.CCE, valida);

			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento.class);

		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	static br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordo(Configuracoes config,
			br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws CteException {

		try {

			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(config, xml, ConstantesCte.SERVICOS.PRESTACAO_DESACORDO, valida);

			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento.class);

		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	static br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento gvt(Configuracoes config,
			br.inf.portalfiscal.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException {

		try {

			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(config, xml, ConstantesCte.SERVICOS.GVT, valida);

			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento.class);

		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	private static String evento(Configuracoes config, String xml, String tipoEvento, boolean valida)
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
			cteCabecMsg.setVersaoDados(config.getVersao());

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
