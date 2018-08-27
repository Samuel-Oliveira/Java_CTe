package br.com.samuelweb.cte;

import java.rmi.RemoteException;
import java.util.Iterator;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.cte.dom.Configuracoes;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.Estados;
import br.com.samuelweb.cte.util.ObjetoUtil;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe;
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteCabecMsg;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteCabecMsgE;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteDadosMsg;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteRecepcaoLoteResult;

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
	static TEnviCTe montaCte(Configuracoes config, TEnviCTe enviCTe, boolean valida) throws CteException {
		try {

			/**
			 * Assina o Xml
			 */
			String xml = Assinatura.assinar(config, XmlUtil.objectCteToXml(enviCTe), Assinatura.CTE);

			/**
			 * Valida o Xml caso sejá selecionado True
			 */
			if (valida) {
				String erros = ValidarCte.validaXml(config, xml, ConstantesCte.SERVICOS.ENVIO_CTE);
				if (!ObjetoUtil.isEmpty(erros)) {
					throw new CteException("Erro Na Validação do Xml: " + erros);
				}
			}

			if (config.isLog()) {
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

	static TRetCTeOS enviaCteOS(Configuracoes config, br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe)
			throws CteException {

		try {
			result = enviar(config, XmlUtil.objectCteToXml(enviCTe), ConstantesCte.CTE_OS);
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
	static TRetEnviCTe enviaCte(Configuracoes config, TEnviCTe enviCTe) throws CteException {

		try {
			result = enviar(config, XmlUtil.objectCteToXml(enviCTe), ConstantesCte.CTE);
			return XmlUtil.xmlToObject(result.getExtraElement().toString(),
					br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe.class);
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
	private static CteRecepcaoLoteResult enviar(Configuracoes config, String xml, String tipo) throws CteException {

		try {

			OMElement ome = AXIOMUtil.stringToOM(xml);

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

			CteDadosMsg dadosMsg = new CteDadosMsg();
			dadosMsg.setExtraElement(ome);
			CteCabecMsg cteCabecMsg = new CteCabecMsg();

			/**
			 * Codigo do Estado.
			 */
			cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoIbge()));

			/**
			 * Versao do XML
			 */
			cteCabecMsg.setVersaoDados(config.getVersao());

			CteCabecMsgE cteCabecMsgE = new CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRecepcaoStub stub = new CteRecepcaoStub(
					WebServiceUtil.getUrl(config, tipo, ConstantesCte.SERVICOS.ENVIO_CTE));
			return stub.cteRecepcaoLote(dadosMsg, cteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new CteException(e.getMessage());
		}

	}

}
