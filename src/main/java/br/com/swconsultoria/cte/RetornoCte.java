package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.consReciCTe.TConsReciCTe;
import br.com.swconsultoria.cte.schema_300.retConsReciCTe.TRetConsReciCTe;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.WebServiceUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cteRetRecepcao.CteRetRecepcaoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe Responsavel por Consultar o Recibo da Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
class RetornoCte {

	/**
	 * Metodo para Consultar o Recibo da CTE..
	 * 
	 * @param TEnviNFe
	 * @return String
	 * @throws NfeException
	 */
    static TRetConsReciCTe consultaRecibo(ConfiguracoesCte config, String recibo) throws CteException {

		try {

			TConsReciCTe consReciCTe = new TConsReciCTe();
            consReciCTe.setVersao(ConstantesCte.VERSAO.CTE);
			consReciCTe.setTpAmb(config.getAmbiente());
			consReciCTe.setNRec(recibo);

			/**
			 * Cria o xml
			 */
            String xml = XmlCteUtil.objectCteToXml(consReciCTe);

			if (config.isLog()) {
				System.out.println("Xml Consulta Recibo: " + xml);
			}

			OMElement ome = AXIOMUtil.stringToOM(xml);

            CteRetRecepcaoStub.CteDadosMsg dadosMsg = new CteRetRecepcaoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);
            CteRetRecepcaoStub.CteCabecMsg cteCabecMsg = new CteRetRecepcaoStub.CteCabecMsg();

			/**
			 * Codigo do Estado.
			 */
			cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoIbge()));

			/**
			 * Versao do XML
			 */
            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

            CteRetRecepcaoStub.CteCabecMsgE cteCabecMsgE = new CteRetRecepcaoStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRetRecepcaoStub stub = new CteRetRecepcaoStub(
					WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.CONSULTA_RECIBO));
            CteRetRecepcaoStub.CteRetRecepcaoResult result = stub.cteRetRecepcao(dadosMsg, cteCabecMsgE);

            return XmlCteUtil.xmlToObject(result.getExtraElement().toString(), TRetConsReciCTe.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

}
