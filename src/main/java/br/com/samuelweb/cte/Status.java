package br.com.samuelweb.cte;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.cte.dom.Configuracoes;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesCte;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ;
import br.inf.portalfiscal.cte.schema_300.retConsStatServCTe.TRetConsStatServ;
import br.inf.portalfiscal.www.cte.wsdl.CteStatusServico.CteStatusServicoStub;

/**
 * Classe responsavel por fazer a Verificacao do Status Do Webservice
 *
 * @autor Samuel Oliveira
 */
class Status {

	static TRetConsStatServ statusServico(Configuracoes config) throws CteException {

		try {

			TConsStatServ consStatServ = new TConsStatServ();
			consStatServ.setTpAmb(config.getAmbiente());
			consStatServ.setVersao(config.getVersao());
			consStatServ.setXServ("STATUS");

			String xml = XmlUtil.objectCteToXml(consStatServ);

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
			cteCabecMsg.setVersaoDados(config.getVersao());
			CteStatusServicoStub.CteCabecMsgE cteCabecMsgE = new CteStatusServicoStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteStatusServicoStub stub = new CteStatusServicoStub(
					WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.STATUS_SERVICO));
			return XmlUtil.xmlToObject(stub.cteStatusServicoCT(dadosMsg, cteCabecMsgE).getExtraElement().toString(),
					TRetConsStatServ.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

}