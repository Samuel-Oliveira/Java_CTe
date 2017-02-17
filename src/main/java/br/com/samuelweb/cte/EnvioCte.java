/**
 * 
 */
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
import br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetCTeOS;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteCabecMsg;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteCabecMsgE;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteDadosMsg;
import br.inf.portalfiscal.www.cte.wsdl.CteRecepcao.CteRecepcaoStub.CteRecepcaoLoteResult;

/**
 * Classe Responsavel por Enviar o Cte.
 * 
 * @author Samuel Oliveira - samuk.exe@hotmail.com - www.samuelweb.com.br
 */
public class EnvioCte {

	private static CteRecepcaoLoteResult result;
	private static ConfiguracoesIniciaisCte configuracoesCte;
	private static CertificadoUtil certUtil;

	/**
	 * Metodo para Montar a CTE V 2.00
	 * 
	 * @param TEnviNFe
	 * @return TEnviCTe
	 * @throws NfeException
	 */
	public static br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe montaCte2(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe enviCTe, boolean valida) throws CteException {
		try {
			return XmlUtil.xmlToObject( montaCte(XmlUtil.objectToXml(enviCTe) , valida), br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe.class);
		} catch (JAXBException e) {
			throw new CteException("Erro ao Montar Cte: "+e.getMessage());
		}
	}
	
	/**
	 * Metodo para Montar a CTE V 3.00
	 * 
	 * @param TEnviNFe
	 * @return TEnviCTe
	 * @throws NfeException
	 */
	public static br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe montaCte3(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe, boolean valida) throws CteException {
		try {
			return XmlUtil.xmlToObject( montaCte(XmlUtil.objectToXml(enviCTe) , valida), br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe.class);
		} catch (JAXBException e) {
			throw new CteException("Erro ao Montar Cte: "+e.getMessage());
		}
	}
	
	private static String montaCte(String xml, boolean valida) throws CteException {

		/**
		 * Assina o Xml
		 */
		xml = Assinatura.assinaCte(xml, Assinatura.CTE);

		/**
		 * Valida o Xml caso sejá selecionado True
		 */
		if (valida) {
			String erros = Validar.validaXml(xml, ConstantesUtil.SERVICOS.ENVIO_CTE);
			if (!ObjetoUtil.isEmpty(erros)) {
				throw new CteException("Erro Na Validação do Xml: " + erros);
			}
		}

		System.out.println("Cte Assinado: " + xml);

		return xml;

	}

	/**
	 * Metodo para Enviar a CTEOS.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static TRetCTeOS enviaCteOS(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws CteException {

		try {
			result = enviar(XmlUtil.objectToXml(enviCTe), ConstantesUtil.CTE_OS);
			return XmlUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	/**
	 * Metodo para Enviar a CTE Versao 2.00.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_200.retEnviCTe.TRetEnviCTe enviaCte2(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe enviCTe) throws CteException {

		try {
			result = enviar(XmlUtil.objectToXml(enviCTe), ConstantesUtil.CTE);
			return XmlUtil.xmlToObject(result.getExtraElement().toString(), br.inf.portalfiscal.cte.schema_200.retEnviCTe.TRetEnviCTe.class);
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}

	}

	/**
	 * Metodo para Enviar a CTE versao 3.00.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws CteException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe enviaCte3(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws CteException {
		
		try {
			result = enviar(XmlUtil.objectToXml(enviCTe), ConstantesUtil.CTE);
			return XmlUtil.xmlToObject(result.getExtraElement().toString(), br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe.class);
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
	private static CteRecepcaoLoteResult enviar(String xml, String tipo) throws CteException {

		try {
			/**
			 * Informacoes do Certificado Digital.
			 */
			certUtil = new CertificadoUtil();
			certUtil.iniciaConfiguracoes();
			configuracoesCte = ConfiguracoesIniciaisCte.getInstance();

			OMElement ome = AXIOMUtil.stringToOM(xml);

			System.out.println("Cte para Envio: " + ome.toString());

			CteDadosMsg dadosMsg = new CteDadosMsg();
			dadosMsg.setExtraElement(ome);
			CteCabecMsg cteCabecMsg = new CteCabecMsg();

			/**
			 * Codigo do Estado.
			 */
			cteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));

			/**
			 * Versao do XML
			 */
			cteCabecMsg.setVersaoDados(configuracoesCte.getVersaoCte());

			CteCabecMsgE cteCabecMsgE = new CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRecepcaoStub stub = new CteRecepcaoStub(WebServiceUtil.getUrl(tipo, ConstantesUtil.SERVICOS.ENVIO_CTE));
			return stub.cteRecepcaoLote(dadosMsg, cteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new CteException(e.getMessage());
		}

	}

}
