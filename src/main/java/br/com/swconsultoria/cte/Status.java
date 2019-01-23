package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.consStatServCTe.TConsStatServ;
import br.com.swconsultoria.cte.schema_300.retConsStatServCTe.TRetConsStatServ;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.WebServiceUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.CteStatusServico.CteStatusServicoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe responsavel por fazer a Verificacao do Status Do Webservice
 *
 * @autor Samuel Oliveira
 */
class Status {

    static TRetConsStatServ statusServico(ConfiguracoesCte config) throws CteException {

		try {

			TConsStatServ consStatServ = new TConsStatServ();
			consStatServ.setTpAmb(config.getAmbiente());
            consStatServ.setVersao(ConstantesCte.VERSAO.CTE);
			consStatServ.setXServ("STATUS");

            String xml = XmlCteUtil.objectCteToXml(consStatServ);

			OMElement ome = AXIOMUtil.stringToOM(xml);
			CteStatusServicoStub.CteDadosMsg dadosMsg = new CteStatusServicoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);

			CteStatusServicoStub.CteCabecMsg cteCabecMsg = new CteStatusServicoStub.CteCabecMsg();
			/**
			 * Codigo do Estado.
			 */
			cteCabecMsg.setCUF(config.getEstado().getCodigoIbge());

			/**
			 * Versao do XML
			 */
            cteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);
			CteStatusServicoStub.CteCabecMsgE cteCabecMsgE = new CteStatusServicoStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteStatusServicoStub stub = new CteStatusServicoStub(
					WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.STATUS_SERVICO));
            return XmlCteUtil.xmlToObject(stub.cteStatusServicoCT(dadosMsg, cteCabecMsgE).getExtraElement().toString(),
					TRetConsStatServ.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

}