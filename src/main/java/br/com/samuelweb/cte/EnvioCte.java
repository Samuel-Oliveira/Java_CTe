/**
 * 
 */
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
	private static ConfiguracoesIniciais configuracoesCte;
	private static CertificadoUtil certUtil;

	/**
	 * Metodo para Montar a CTE V 2.00
	 * 
	 * @param TEnviNFe
	 * @return TEnviCTe
	 * @throws NfeException
	 */
	public static br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe montaCte2(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe enviCTe, boolean valida) throws EmissorException {
		try {
			return XmlUtil.xmlToObject( montaCte(XmlUtil.objectCteToXml(enviCTe) , valida), br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe.class);
		} catch (JAXBException e) {
			throw new EmissorException("Erro ao Montar Cte: "+e.getMessage());
		}
	}
	
	/**
	 * Metodo para Montar a CTE V 3.00
	 * 
	 * @param TEnviNFe
	 * @return TEnviCTe
	 * @throws NfeException
	 */
	public static br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe montaCte3(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe, boolean valida) throws EmissorException {
		try {
			return XmlUtil.xmlToObject( montaCte(XmlUtil.objectCteToXml(enviCTe) , valida), br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe.class);
		} catch (JAXBException e) {
			throw new EmissorException("Erro ao Montar Cte: "+e.getMessage());
		}
	}
	
	private static String montaCte(String xml, boolean valida) throws EmissorException {

		/**
		 * Assina o Xml
		 */
		xml = Assinatura.assinar(xml, Assinatura.CTE);

		/**
		 * Valida o Xml caso sejá selecionado True
		 */
		if (valida) {
			String erros = ValidarCte.validaXml(xml, ConstantesCte.SERVICOS.ENVIO_CTE);
			if (!ObjetoUtil.isEmpty(erros)) {
				throw new EmissorException("Erro Na Validação do Xml: " + erros);
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
	 * @throws EmissorException
	 */
	public static TRetCTeOS enviaCteOS(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws EmissorException {

		try {
			result = enviar(XmlUtil.objectCteToXml(enviCTe), ConstantesCte.CTE_OS);
			return XmlUtil.xmlToObject(result.getExtraElement().toString(), TRetCTeOS.class);
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}

	}

	/**
	 * Metodo para Enviar a CTE Versao 2.00.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws EmissorException
	 */
	public static br.inf.portalfiscal.cte.schema_200.retEnviCTe.TRetEnviCTe enviaCte2(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe enviCTe) throws EmissorException {

		try {
			result = enviar(XmlUtil.objectCteToXml(enviCTe), ConstantesCte.CTE);
			return XmlUtil.xmlToObject(result.getExtraElement().toString(), br.inf.portalfiscal.cte.schema_200.retEnviCTe.TRetEnviCTe.class);
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}

	}

	/**
	 * Metodo para Enviar a CTE versao 3.00.
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws EmissorException
	 */
	public static br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe enviaCte3(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCTe) throws EmissorException {
		
		try {
			result = enviar(XmlUtil.objectCteToXml(enviCTe), ConstantesCte.CTE);
			return XmlUtil.xmlToObject(result.getExtraElement().toString(), br.inf.portalfiscal.cte.schema_300.retEnviCTe.TRetEnviCTe.class);
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	/**
	 * Metodo para Enviar
	 * 
	 * @param TEnviCTe
	 * @return TRetEnviCTe
	 * @throws EmissorException
	 */
	private static CteRecepcaoLoteResult enviar(String xml, String tipo) throws EmissorException {

		try {
			/**
			 * Informacoes do Certificado Digital.
			 */
			certUtil = new CertificadoUtil();
			certUtil.iniciaConfiguracoes();
			configuracoesCte = ConfiguracoesIniciais.getInstance();

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
			cteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

			CteCabecMsgE cteCabecMsgE = new CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRecepcaoStub stub = new CteRecepcaoStub(WebServiceUtil.getUrl(tipo, ConstantesCte.SERVICOS.ENVIO_CTE));
			return stub.cteRecepcaoLote(dadosMsg, cteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new EmissorException(e.getMessage());
		}

	}

}
