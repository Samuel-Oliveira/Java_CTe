package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.consSitCTe.TConsSitCTe;
import br.com.swconsultoria.cte.schema_300.retConsSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.WebServiceUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.CteConsulta.CteConsultaStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe responsavel por Consultar a Situaçao do CTE na SEFAZ.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */

class ConsultaProtocolo {

	/**
	 * Classe Reponsavel Por Consultar o status da CTE na SEFAZ
	 *
	 * @param chave
	 * @return CteConsultaCTResult
	 * @throws CteException
	 */
    static TRetConsSitCTe consultar(ConfiguracoesCte config, String chave) throws CteException {

		try {

			TConsSitCTe consSitCTe = new TConsSitCTe();
            consSitCTe.setVersao(ConstantesCte.VERSAO.CTE);
			consSitCTe.setTpAmb(config.getAmbiente());
			consSitCTe.setXServ("CONSULTAR");
			consSitCTe.setChCTe(chave);

            OMElement ome = AXIOMUtil.stringToOM(XmlCteUtil.objectCteToXml(consSitCTe));

			CteConsultaStub.CteDadosMsg dadosMsg = new CteConsultaStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);

			CteConsultaStub.CteCabecMsg cteCabecMsg = new CteConsultaStub.CteCabecMsg();
			cteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoIbge()));
            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

			CteConsultaStub.CteCabecMsgE cteCabecMsgE = new CteConsultaStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteConsultaStub stub = new CteConsultaStub(
					WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.CONSULTA_PROTOCOLO));

            return XmlCteUtil.xmlToObject(stub.cteConsultaCT(dadosMsg, cteCabecMsgE).getExtraElement().toString(),
					TRetConsSitCTe.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}
	}
}
