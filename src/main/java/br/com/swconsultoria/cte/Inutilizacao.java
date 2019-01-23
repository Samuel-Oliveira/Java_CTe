package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_300.inutCTe.TInutCTe;
import br.com.swconsultoria.cte.schema_300.retInutCTe.TRetInutCTe;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.ObjetoUtil;
import br.com.swconsultoria.cte.util.WebServiceUtil;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import br.com.swconsultoria.cte.wsdl.cteinutilizacao.CteInutilizacaoStub;
import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;
import java.rmi.RemoteException;

/**
 * Classe Responsavel por inutilizar uma Faixa de numeracao da Cte.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
class Inutilizacao {

    static TRetInutCTe inutilizar(ConfiguracoesCte config, TInutCTe inutCte, boolean valida) throws CteException {
		try {

            String xml = Assinatura.assinar(config, XmlCteUtil.objectCteToXml(inutCte), Assinatura.INFINUT);

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
            CteCabecMsg.setVersaoDados(ConstantesCte.VERSAO.CTE);

			CteInutilizacaoStub.CteCabecMsgE CteCabecMsgE = new CteInutilizacaoStub.CteCabecMsgE();
			CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

			CteInutilizacaoStub stub = new CteInutilizacaoStub(
					WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.INUTILIZACAO));

            return XmlCteUtil.xmlToObject(stub.cteInutilizacaoCT(dadosMsg, CteCabecMsgE).getExtraElement().toString(),
					TRetInutCTe.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

}