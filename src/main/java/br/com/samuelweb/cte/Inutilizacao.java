package br.com.samuelweb.cte;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.CertificadoUtil;
import br.com.samuelweb.cte.util.ConstantesUtil;
import br.com.samuelweb.cte.util.ObjetoUtil;
import br.com.samuelweb.cte.util.WebServiceUtil;
import br.com.samuelweb.cte.util.XmlUtil;
import br.inf.portalfiscal.www.cte.wsdl.cteinutilizacao.CteInutilizacaoStub;
import br.inf.portalfiscal.www.cte.wsdl.cteinutilizacao.CteInutilizacaoStub.CteInutilizacaoCTResult;

/**
 * Classe Responsavel por inutilizar uma Faixa de numeracao da Cte.
 * 
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 * 
 */
public class Inutilizacao {

	private static ConfiguracoesIniciaisCte configuracoesCte;
	private static CertificadoUtil certUtil;

	public static br.inf.portalfiscal.cte.schema_200.retInutCTe.TRetInutCTe inutilizar2(br.inf.portalfiscal.cte.schema_200.inutCTe.TInutCTe inutCte, boolean valida) throws CteException {
		try {
			return XmlUtil.xmlToObject(inutilizar(XmlUtil.objectToXml(inutCte), valida) .getExtraElement().toString(), br.inf.portalfiscal.cte.schema_200.retInutCTe.TRetInutCTe.class);
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
	}
	
	public static br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe inutilizar3(br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe inutCte, boolean valida) throws CteException {
		try {
			return XmlUtil.xmlToObject(inutilizar(XmlUtil.objectToXml(inutCte), valida) .getExtraElement().toString(), br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe.class);
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
	}
	
	public static CteInutilizacaoCTResult inutilizar(String xml, boolean valida) throws CteException{

		certUtil = new CertificadoUtil();
		configuracoesCte = ConfiguracoesIniciaisCte.getInstance();
		certUtil.iniciaConfiguracoes();

		try {

			xml = Assinatura.assinaCte(xml, Assinatura.INFINUT);

			if (valida) {
				String erros = Validar.validaXml(xml, ConstantesUtil.SERVICOS.INUTILIZACAO);
				if (!ObjetoUtil.isEmpty(erros)) {
					throw new CteException("Erro Na Validação do Xml: " + erros);
				}
			}

			System.out.println("Xml Inutilizar: " + xml);
			OMElement ome = AXIOMUtil.stringToOM(xml);

			CteInutilizacaoStub.CteDadosMsg dadosMsg = new CteInutilizacaoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);

			CteInutilizacaoStub.CteCabecMsg CteCabecMsg = new CteInutilizacaoStub.CteCabecMsg();
			CteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));
			CteCabecMsg.setVersaoDados(configuracoesCte.getVersaoCte());

			CteInutilizacaoStub.CteCabecMsgE CteCabecMsgE = new CteInutilizacaoStub.CteCabecMsgE();
			CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

			CteInutilizacaoStub stub = new CteInutilizacaoStub(WebServiceUtil.getUrl(ConstantesUtil.CTE, ConstantesUtil.SERVICOS.INUTILIZACAO));
			
			return stub.cteInutilizacaoCT(dadosMsg, CteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new CteException(e.getMessage());
		}

	}

}