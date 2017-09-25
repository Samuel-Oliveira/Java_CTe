package br.com.samuelweb.cte;

import java.rmi.RemoteException;

import javax.xml.bind.JAXBException;
import javax.xml.stream.XMLStreamException;

import org.apache.axiom.om.OMElement;
import org.apache.axiom.om.util.AXIOMUtil;

import br.com.samuelweb.exception.EmissorException;
import br.com.samuelweb.util.CertificadoUtil;
import br.com.samuelweb.util.ConstantesCte;
import br.com.samuelweb.util.ObjetoUtil;
import br.com.samuelweb.util.WebServiceUtil;
import br.com.samuelweb.util.XmlUtil;
import br.inf.portalfiscal.www.cte.wsdl.cteinutilizacao.CteInutilizacaoStub;
import br.inf.portalfiscal.www.cte.wsdl.cteinutilizacao.CteInutilizacaoStub.CteInutilizacaoCTResult;

/**
 * Classe Responsavel por inutilizar uma Faixa de numeracao da Cte.
 * 
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 * 
 */
public class Inutilizacao {

	private static ConfiguracoesIniciais configuracoesCte;
	private static CertificadoUtil certUtil;

	public static br.inf.portalfiscal.cte.schema_200.retInutCTe.TRetInutCTe inutilizar2(br.inf.portalfiscal.cte.schema_200.inutCTe.TInutCTe inutCte, boolean valida) throws EmissorException {
		try {
			return XmlUtil.xmlToObject(inutilizar(XmlUtil.objectCteToXml(inutCte), valida) .getExtraElement().toString(), br.inf.portalfiscal.cte.schema_200.retInutCTe.TRetInutCTe.class);
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
	}
	
	public static br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe inutilizar3(br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe inutCte, boolean valida) throws EmissorException {
		try {
			return XmlUtil.xmlToObject(inutilizar(XmlUtil.objectCteToXml(inutCte), valida) .getExtraElement().toString(), br.inf.portalfiscal.cte.schema_300.retInutCTe.TRetInutCTe.class);
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
	}
	
	public static CteInutilizacaoCTResult inutilizar(String xml, boolean valida) throws EmissorException{

		certUtil = new CertificadoUtil();
		configuracoesCte = ConfiguracoesIniciais.getInstance();
		certUtil.iniciaConfiguracoes();

		try {

			xml = Assinatura.assinar(xml, Assinatura.INFINUT);

			if (valida) {
				String erros = ValidarCte.validaXml(xml, ConstantesCte.SERVICOS.INUTILIZACAO);
				if (!ObjetoUtil.isEmpty(erros)) {
					throw new EmissorException("Erro Na Validação do Xml: " + erros);
				}
			}

			System.out.println("Xml Inutilizar: " + xml);
			OMElement ome = AXIOMUtil.stringToOM(xml);

			CteInutilizacaoStub.CteDadosMsg dadosMsg = new CteInutilizacaoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);

			CteInutilizacaoStub.CteCabecMsg CteCabecMsg = new CteInutilizacaoStub.CteCabecMsg();
			CteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));
			CteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

			CteInutilizacaoStub.CteCabecMsgE CteCabecMsgE = new CteInutilizacaoStub.CteCabecMsgE();
			CteCabecMsgE.setCteCabecMsg(CteCabecMsg);

			CteInutilizacaoStub stub = new CteInutilizacaoStub(WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.INUTILIZACAO));
			
			return stub.cteInutilizacaoCT(dadosMsg, CteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new EmissorException(e.getMessage());
		}

	}

}