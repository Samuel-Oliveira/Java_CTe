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
import br.inf.portalfiscal.www.cte.wsdl.cterecepcaoevento.CteRecepcaoEventoStub;

public class Evento {

	public static CteRecepcaoEventoStub.CteRecepcaoEventoResult result;
	private static ConfiguracoesIniciaisCte configuracoesCte;
	private static CertificadoUtil certUtil;
	
	
	public static br.inf.portalfiscal.cte.schema_200.evCancCTe.TRetEvento cancelamento2(br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.CANCELAR,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_200.evCancCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento cancelamento3(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.CANCELAR,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento epec(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.EPEC,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento multimodal(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.MULTIMODAL,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_200.evCCeCTe.TRetEvento cce2(br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.CCE,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_200.evCCeCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento cce3(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.CCE,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordo(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.PRESTACAO_DESACORDO,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento gvt(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento evento, boolean valida) throws CteException{
		
		try {
			
			String xml = XmlUtil.objectToXml(evento);
			xml = evento(xml,ConstantesUtil.SERVICOS.GVT,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new CteException(e.getMessage());
		}
		
	}

	private static String evento(String xml, String tipoEvento , boolean valida) throws CteException {
		
		certUtil = new CertificadoUtil();
		configuracoesCte = ConfiguracoesIniciaisCte.getInstance();

		try {
			
			/**
			 * Informacoes do Certificado Digital.
			 */
			certUtil.iniciaConfiguracoes();
			
			xml = Assinatura.assinaCte(xml, Assinatura.EVENTO);
			
			if(valida){
				String erros ="";
				erros = Validar.validaXml(xml, ConstantesUtil.SERVICOS.EVENTO);
				
				if(!ObjetoUtil.isEmpty(erros)){
					throw new CteException("Erro Na Validação do Xml: "+erros);
				}
			}
			
			System.out.println("Xml Evento: "+ xml);

			OMElement ome = AXIOMUtil.stringToOM(xml);

			CteRecepcaoEventoStub.CteDadosMsg dadosMsg = new CteRecepcaoEventoStub.CteDadosMsg();
			dadosMsg.setExtraElement(ome);
			CteRecepcaoEventoStub.CteCabecMsg cteCabecMsg = new CteRecepcaoEventoStub.CteCabecMsg();

			cteCabecMsg.setCUF(String.valueOf(configuracoesCte.getEstado().getCodigoIbge()));

			/**
			 * Versao do XML
			 */
			cteCabecMsg.setVersaoDados(configuracoesCte.getVersaoCte());

			CteRecepcaoEventoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoEventoStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRecepcaoEventoStub stub = new CteRecepcaoEventoStub(WebServiceUtil.getUrl(ConstantesUtil.CTE, ConstantesUtil.SERVICOS.EVENTO));
			result = stub.cteRecepcaoEvento(dadosMsg, cteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new CteException(e.getMessage());
		}
		
		return result.getExtraElement().toString();
	}

}
