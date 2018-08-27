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
import br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe;
import br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe;
import br.inf.portalfiscal.www.cte.wsdl.cteinutilizacao.CteInutilizacaoStub;

/**
 * Classe Responsavel por inutilizar uma Faixa de numeracao da Cte.
 *
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
class Inutilizacao {

	static TRetInutCTe inutilizar(Configuracoes config, TInutCTe inutCte, boolean valida) throws CteException {
		try {

			String xml = Assinatura.assinar(config, XmlUtil.objectCteToXml(inutCte), Assinatura.INFINUT);

			if (valida) {
				String erros = ValidarCte.validaXml(config, xml, ConstantesCte.SERVICOS.INUTILIZACAO);
				if (!ObjetoUtil.isEmpty(erros)) {
					throw new CteException("Erro Na Validação do Xml: " + erros);
				}
			}

			if (config.isLog()) {
				System.out.println("Xml Inutilizar: " + xml);
			}

			OMElement ome = AXIOMUtil.stringToOM(xml);

			CteInutilizacaoStub.CteDadosMsg dadosMsg = new CteInutilizacaoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);

			CteInutilizacaoStub.CteCabecMsg CteCabecMsg = new CteInutilizacaoStub.CteCabecMsg();
			CteCabecMsg.setCUF(String.valueOf(config.getEstado().getCodigoIbge()));
			CteCabecMsg.setVersaoDados(config.getVersao());

			CteInutilizacaoStub.CteCabecMsgE CteCabecMsgE = new CteInutilizacaoStub.CteCabecMsgE();
			CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

			CteInutilizacaoStub stub = new CteInutilizacaoStub(
					WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.INUTILIZACAO));

			return XmlUtil.xmlToObject(stub.cteInutilizacaoCT(dadosMsg, CteCabecMsgE).getExtraElement().toString(),
					TRetInutCTe.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

}