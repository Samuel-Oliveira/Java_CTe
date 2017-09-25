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
import br.inf.portalfiscal.www.cte.wsdl.cterecepcaoevento.CteRecepcaoEventoStub;

public class Evento {

	public static CteRecepcaoEventoStub.CteRecepcaoEventoResult result;
	private static ConfiguracoesIniciais configuracoesCte;
	private static CertificadoUtil certUtil;
	
	
	public static br.inf.portalfiscal.cte.schema_200.evCancCTe.TRetEvento cancelamento2(br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.CANCELAR,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_200.evCancCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento cancelamento3(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.CANCELAR,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCancCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento epec(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.EPEC,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evEPECCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento multimodal(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.MULTIMODAL,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_200.evCCeCTe.TRetEvento cce2(br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.CCE,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_200.evCCeCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento cce3(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.CCE,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evCCeCTe.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento prestacaoDesacordo(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.PRESTACAO_DESACORDO,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}
	
	public static br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento gvt(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento evento, boolean valida) throws EmissorException{
		
		try {
			
			String xml = XmlUtil.objectCteToXml(evento);
			xml = evento(xml,ConstantesCte.SERVICOS.GVT,valida);
			
			return XmlUtil.xmlToObject(xml, br.inf.portalfiscal.cte.schema_300.evGTV.TRetEvento.class);
			
		} catch (JAXBException e) {
			throw new EmissorException(e.getMessage());
		}
		
	}

	private static String evento(String xml, String tipoEvento , boolean valida) throws EmissorException {
		
		certUtil = new CertificadoUtil();
		configuracoesCte = ConfiguracoesIniciais.getInstance();

		try {
			
			/**
			 * Informacoes do Certificado Digital.
			 */
			certUtil.iniciaConfiguracoes();
			
			xml = Assinatura.assinar(xml, Assinatura.EVENTO);
			
			if(valida){
				String erros ="";
				erros = ValidarCte.validaXml(xml, ConstantesCte.SERVICOS.EVENTO);
				
				if(!ObjetoUtil.isEmpty(erros)){
					throw new EmissorException("Erro Na Validação do Xml: "+erros);
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
			cteCabecMsg.setVersaoDados(configuracoesCte.getVersao());

			CteRecepcaoEventoStub.CteCabecMsgE cteCabecMsgE = new CteRecepcaoEventoStub.CteCabecMsgE();
			cteCabecMsgE.setCteCabecMsg(cteCabecMsg);

			CteRecepcaoEventoStub stub = new CteRecepcaoEventoStub(WebServiceUtil.getUrl(ConstantesCte.CTE, ConstantesCte.SERVICOS.EVENTO));
			result = stub.cteRecepcaoEvento(dadosMsg, cteCabecMsgE);

		} catch (RemoteException | XMLStreamException e) {
			throw new EmissorException(e.getMessage());
		}
		
		return result.getExtraElement().toString();
	}

}
