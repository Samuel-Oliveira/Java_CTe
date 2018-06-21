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
import br.inf.portalfiscal.cte.schema_300.distdfeint.DistDFeInt;
import br.inf.portalfiscal.cte.schema_300.retdistdfeint.RetDistDFeInt;
import br.inf.portalfiscal.www.cte.wsdl.CTeDistribuicaoDFe.CTeDistribuicaoDFeStub;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
class DistribuicaoDFe {

	/**
	 * Classe Reponsavel Por Consultar as CTE na SEFAZ
	 *
	 * @param DistDFeInt
	 * @return RetDistDFeInt
	 */
	static RetDistDFeInt consultaCte(Configuracoes config, String tipoCliente, String cpfCnpj, String nsu)
			throws CteException {

		try {

			DistDFeInt distDfe = new DistDFeInt();
			distDfe.setCUFAutor(config.getEstado().getCodigoIbge());
			distDfe.setTpAmb(config.getAmbiente());
			distDfe.setVersao(ConstantesCte.VERSAO.DISTRIBUICAO);

			if (ConstantesCte.TIPOS.CNPJ.equals(tipoCliente)) {
				distDfe.setCNPJ(cpfCnpj);
			} else {
				distDfe.setCPF(cpfCnpj);
			}

			DistDFeInt.DistNSU distNSU = new DistDFeInt.DistNSU();
			distNSU.setUltNSU(nsu);

			distDfe.setDistNSU(distNSU);

			String xml = XmlUtil.objectCteToXml(distDfe);

			if (config.isLog()) {
				System.out.println("Xml DistDFe: " + xml);
			}

			OMElement ome = AXIOMUtil.stringToOM(xml);

			CTeDistribuicaoDFeStub.CteDadosMsg_type0 dadosMsgType0 = new CTeDistribuicaoDFeStub.CteDadosMsg_type0();
			dadosMsgType0.setExtraElement(ome);

			CTeDistribuicaoDFeStub.CteDistDFeInteresse distDFeInteresse = new CTeDistribuicaoDFeStub.CteDistDFeInteresse();
			distDFeInteresse.setCteDadosMsg(dadosMsgType0);

			CTeDistribuicaoDFeStub stub = new CTeDistribuicaoDFeStub(
					WebServiceUtil.getUrl(config, ConstantesCte.CTE, ConstantesCte.SERVICOS.DISTRIBUICAO_DFE));
			CTeDistribuicaoDFeStub.CteDistDFeInteresseResponse result = stub.cteDistDFeInteresse(distDFeInteresse);

			return XmlUtil.xmlToObject(result.getCteDistDFeInteresseResult().getExtraElement().toString(),
					RetDistDFeInt.class);

		} catch (RemoteException | XMLStreamException | JAXBException e) {
			throw new CteException(e.getMessage());
		}
	}

}
