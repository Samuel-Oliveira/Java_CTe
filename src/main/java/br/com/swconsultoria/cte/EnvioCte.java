package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.enviCTe.TEnviCTe;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.com.swconsultoria.cte.schema_300.retEnviCTe.TRetEnviCTe;
import br.com.swconsultoria.cte.util.*;
import br.com.swconsultoria.cte.wsdl.CteRecepcao.CteRecepcaoStub;
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
class EnvioCte {

    private static CteRecepcaoStub.CteRecepcaoLoteResult result;

	/**
	 * Metodo para Montar a CTE
	 *
	 * @param TEnviNFe
	 * @return TEnviCTe
	 * @throws NfeException
	 */
    static TEnviCTe montaCte(ConfiguracoesCte config, TEnviCTe enviCTe, boolean valida) throws CteException {
		try {

			/**
			 * Assina o Xml
			 */
            String xml = Assinatura.assinar(config, XmlCteUtil.objectCteToXml(enviCTe), Assinatura.CTE);

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

            return XmlCteUtil.xmlToObject(xml, TEnviCTe.class);
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

    static TRetCTeOS enviaCteOS(ConfiguracoesCte config, TEnviCTe enviCTe)
			throws CteException {

		try {
            result = enviar(config, XmlCteUtil.objectCteToXml(enviCTe), ConstantesCte.CTE_OS);
            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);
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
    static TRetEnviCTe enviaCte(ConfiguracoesCte config, TEnviCTe enviCTe) throws CteException {

		try {
            result = enviar(config, XmlCteUtil.objectCteToXml(enviCTe), ConstantesCte.CTE);
            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(),
                    TRetEnviCTe.class);
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
    private static CteRecepcaoStub.CteRecepcaoLoteResult enviar(ConfiguracoesCte config, String xml, String tipo) throws CteException {

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

            CteRecepcaoStub.CteDadosMsg dadosMsg = new CteRecepcaoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);
            CteRecepcaoStub.CteCabecMsg cteCabecMsg = new CteRecepcaoStub.CteCabecMsg();

			/**
			 * Codigo do Estado.
			 */
			cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoIbge()));

			/**
			 * Versao do XML
			 */
            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

            CteRecepcaoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRecepcaoStub stub = new CteRecepcaoStub(
					WebServiceUtil.getUrl(config, tipo, ConstantesCte.SERVICOS.ENVIO_CTE));
			return stub.cteRecepcaoLote(dadosMsg, cteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new CteException(e.getMessage());
		}

	}

}
