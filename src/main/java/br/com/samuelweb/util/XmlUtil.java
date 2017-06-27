/**
 * 
 */
package br.com.samuelweb.util;

import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.io.StringWriter;
import java.text.Normalizer;
import java.util.zip.GZIPInputStream;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.transform.stream.StreamSource;

import br.com.samuelweb.cte.ConfiguracoesIniciais;
import br.com.samuelweb.exception.EmissorException;
import br.inf.portalfiscal.cte.schema_300.distdfeint.DistDFeInt;
import br.inf.portalfiscal.mdfe.schema_300.procMDFe.MdfeProc;

/**
 * Classe Responsavel por Metodos referentes ao XML
 * 
 * @author Samuel Oliveira
 *
 */
public class XmlUtil {

	/**
	 * Transforma o String do XML em Objeto
	 * 
	 * @param String
	 * @param Class<T>
	 * @return <T> T
	 */
	public static <T> T xmlToObject(String xml, Class<T> classe) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller unmarshaller = context.createUnmarshaller();

		return unmarshaller.unmarshal(new StreamSource(new StringReader(xml)), classe).getValue();
	}
	
	/**
	 * Le o Arquivo XML e retona String
	 * 
	 * @return String
	 * @throws EmissorException
	 */
	public static String leXml(String arquivo) throws EmissorException {

		StringBuilder xml = new StringBuilder();
		BufferedReader in;
		try {
			in = new BufferedReader(new InputStreamReader(new FileInputStream(arquivo), "UTF-8"));
			String linha;

			while ((linha = in.readLine()) != null) {
				xml.append(linha);

			}
			in.close();
		} catch (IOException e) {
			throw new EmissorException("Ler Xml: "+ e.getMessage());
		}
		return xml.toString();
	}

	/**
	 * Transforma o Objeto em XML(String)
	 * 
	 * @return String
	 * @throws EmissorException
	 */
	public static <T> String objectCteToXml(Object obj) throws JAXBException, EmissorException {

		JAXBContext context = null;
		JAXBElement<?> element = null;

		String versao = ConfiguracoesIniciais.getInstance().getVersao();

		switch (obj.getClass().getSimpleName()) {

		case ConstantesCte.XML.STATUS_SERVICO:
			if (versao.equals(ConstantesCte.VERSAO.V3_00)) {
				context = JAXBContext
						.newInstance(br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ.class);
				element = new br.inf.portalfiscal.cte.schema_300.consStatServCTe.ObjectFactory()
						.createConsStatServCte((br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ) obj);
			} else {
				context = JAXBContext
						.newInstance(br.inf.portalfiscal.cte.schema_200.consStatServCTe.TConsStatServ.class);
				element = new br.inf.portalfiscal.cte.schema_200.consStatServCTe.ObjectFactory()
						.createConsStatServCte((br.inf.portalfiscal.cte.schema_200.consStatServCTe.TConsStatServ) obj);
			}
			break;

		case ConstantesCte.XML.ENVIO_CTE:
			if (versao.equals(ConstantesCte.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.enviCTe.ObjectFactory()
						.createEnviCTe((br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.enviCTe.ObjectFactory()
						.createTEnviCTe((br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe) obj);
			}
			break;

		case ConstantesCte.XML.CONSULTA_RECIBO:
			if (versao.equals(ConstantesCte.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.consReciCTe.TConsReciCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.consReciCTe.ObjectFactory()
						.createConsReciCTe((br.inf.portalfiscal.cte.schema_300.consReciCTe.TConsReciCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.consReciCTe.TConsReciCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.consReciCTe.ObjectFactory()
						.createConsReciCTe((br.inf.portalfiscal.cte.schema_200.consReciCTe.TConsReciCTe) obj);
			}
			break;

		case ConstantesCte.XML.INUTILIZACAO:
			if (versao.equals(ConstantesCte.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.inutCTe.ObjectFactory()
						.createInutCTe((br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.inutCTe.TInutCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.inutCTe.ObjectFactory()
						.createInutCTe((br.inf.portalfiscal.cte.schema_200.inutCTe.TInutCTe) obj);
			}
			break;

		case ConstantesCte.XML.CONSULTA_PROTOCOLO:
			if (versao.equals(ConstantesCte.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.consSitCTe.ObjectFactory()
						.createConsSitCTe((br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.consSitCTe.TConsSitCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.consSitCTe.ObjectFactory()
						.createConsSitCTe((br.inf.portalfiscal.cte.schema_200.consSitCTe.TConsSitCTe) obj);
			}
			
			break;

		case ConstantesCte.XML.DISTRIBUICAO_DFE:
			context = JAXBContext.newInstance(DistDFeInt.class);
			element = new br.inf.portalfiscal.cte.schema_300.distdfeint.ObjectFactory()
					.createDistDFeInt((DistDFeInt) obj);
			break;

		case ConstantesCte.XML.PROC_EVENTO:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.PROC_CANCELAR_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCancCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCancCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evCancCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_CANCELAR_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCancCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_EPEC_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evEPECCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evEPECCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_EPEC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evEPECCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_MULTIMODAL_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evRegMultimodal.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_MULTIMODAL_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evRegMultimodal.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_CCE_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCCeCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCCeCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evCCeCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_CCE_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCCeCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_PRESTDESACORDO_V3:
				context = JAXBContext
						.newInstance(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TProcEvento) obj);
				break;
				
			case ConstantesCte.XML.PROC_GVT_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evGTV.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evGTV.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evGTV.TProcEvento) obj);
				break;
				
			default:
				throw new EmissorException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}		
			
			break;

		case ConstantesCte.XML.PROC_CTE:
			if (versao.equals(ConstantesCte.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc.class);
				element = new br.inf.portalfiscal.cte.schema_300.enviCTe.ObjectFactory()
						.createCteProc((br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc.class);
				element = new br.inf.portalfiscal.cte.schema_200.enviCTe.ObjectFactory()
						.createCteProc((br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc) obj);
			}
			break;

		case ConstantesCte.XML.PROC_CTEOS:
			context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.procCTeOS.CteOSProc.class);
			element = new br.inf.portalfiscal.cte.schema_300.procCTeOS.ObjectFactory()
					.createCteOSProc((br.inf.portalfiscal.cte.schema_300.procCTeOS.CteOSProc) obj);
			break;

		case ConstantesCte.XML.EVENTO:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.CANCELAR_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCancCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.CANCELAR_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCancCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.EPEC_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evEPECCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evEPECCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evEPECCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.EPEC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evEPECCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.MULTIMODAL_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evRegMultimodal.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TEvento) obj);
				break;

			case ConstantesCte.XML.MULTIMODAL_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evRegMultimodal.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento) obj);
				break;

			case ConstantesCte.XML.CCE_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCCeCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.CCE_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCCeCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.PRESTDESACORDO_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento) obj);
				break;

			case ConstantesCte.XML.GVT_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evGTV.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evGTV.TEvento) obj);
				break;

			default:
				throw new EmissorException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}
			
			break;

		case ConstantesCte.XML.PROT_CTE:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.PROT_CTE_CONSULTA_RECIBO_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.retConsReciCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.retConsReciCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_200.retConsReciCTe.TProtCTe) obj);
				break;

			case ConstantesCte.XML.PROT_CTE_CONSULTA_RECIBO_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.retConsReciCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TProtCTe) obj);
				break;

			case ConstantesCte.XML.PROT_CTE_PROC_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.procCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.procCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_200.procCTe.TProtCTe) obj);
				break;

			case ConstantesCte.XML.PROT_CTE_PROC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.procCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.procCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_300.procCTe.TProtCTe) obj);
				break;

			case ConstantesCte.XML.PROT_CTE_CONSULTA_SITUACAO_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.retConsSitCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.retConsSitCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_200.retConsSitCTe.TProtCTe) obj);
				break;

			default:
				throw new EmissorException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;
			
		case ConstantesCte.XML.PROT_CTEOS:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.PROT_CTEOS_PROC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.retEnviCTe.TProtCTeOS.class);
				element = new br.inf.portalfiscal.cte.schema_300.retEnviCTe.ObjectFactory()
						.createTProcCTeOS((br.inf.portalfiscal.cte.schema_300.retEnviCTe.TProtCTeOS) obj);
				break;
				
			default:
				throw new EmissorException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;
			
		case ConstantesCte.XML.MODAL_RODOVIARIO:
			
			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.MODAL_RODOVIARIO_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.cteModalRodoviario.Rodo.class);
				element = new br.inf.portalfiscal.cte.schema_200.cteModalRodoviario.ObjectFactory()
						.createRodo((br.inf.portalfiscal.cte.schema_200.cteModalRodoviario.Rodo) obj);
				break;
				
			case ConstantesCte.XML.MODAL_RODOVIARIO_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.cteModalRodoviario.Rodo.class);
				element = new br.inf.portalfiscal.cte.schema_300.cteModalRodoviario.ObjectFactory()
						.createRodo((br.inf.portalfiscal.cte.schema_300.cteModalRodoviario.Rodo) obj);
				break;
				
			default:
				throw new EmissorException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;

		default:
			throw new EmissorException("Objeto não mapeado no XmlUtil:" + obj.getClass().getSimpleName());
		}
		
		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty("jaxb.encoding", "Unicode");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

		StringWriter sw = new StringWriter();
		marshaller.marshal(element, sw);

		StringBuilder xml = new StringBuilder();
		xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append(sw.toString());

		return replacesCte(xml.toString());

	}
	
	 public static <T> String objectMdfeToXml(Object obj) throws JAXBException, EmissorException {
	        JAXBContext context = null;
	        JAXBElement<?> element = null;

	        switch (obj.getClass().getSimpleName()) {
	            case ConstantesMDFe.XML.ENVIO_MDFE:
	                context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.enviMDFe.TEnviMDFe.class);
	                element = new br.inf.portalfiscal.mdfe.schema_300.enviMDFe.ObjectFactory()
	                        .createEnviMDFe((br.inf.portalfiscal.mdfe.schema_300.enviMDFe.TEnviMDFe) obj);
	                break;

	            case ConstantesMDFe.XML.STATUS_SERVICO:
	                context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.TConsStatServ.class);
	                element = new br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.ObjectFactory()
	                        .createConsStatServMDFe((br.inf.portalfiscal.mdfe.schema_300.consStatServMDFe.TConsStatServ) obj);

	                break;
	            case ConstantesMDFe.XML.CONSULTA_PROTOCOLO:
	                context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.TConsSitMDFe.class);
	                element = new br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.ObjectFactory()
	                        .createConsSitMDFe((br.inf.portalfiscal.mdfe.schema_300.consSitMDFe.TConsSitMDFe) obj);
	                break;
	            case ConstantesMDFe.XML.CONSULTA_RECIBO:
	                context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.consReciMDFe.TConsReciMDFe.class);
	                element = new br.inf.portalfiscal.mdfe.schema_300.consReciMDFe.ObjectFactory()
	                        .createConsReciMDFe((br.inf.portalfiscal.mdfe.schema_300.consReciMDFe.TConsReciMDFe) obj);
	                break;
	            case ConstantesMDFe.XML.CONSULTA_NAO_ENCERRADO:
	                context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.TConsMDFeNaoEnc.class);
	                element = new br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.ObjectFactory()
	                        .createConsMDFeNaoEnc((br.inf.portalfiscal.mdfe.schema_300.consMDFeNaoEnc.TConsMDFeNaoEnc) obj);
	                break;
	            case ConstantesMDFe.XML.PROC_MDFE:
	                context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.procMDFe.MdfeProc.class);
	                element = new br.inf.portalfiscal.mdfe.schema_300.procMDFe.ObjectFactory()
	                             .createMdfeProc((br.inf.portalfiscal.mdfe.schema_300.procMDFe.MdfeProc) obj);  
	                break;

	            case ConstantesMDFe.XML.PROT_MDFE:
	                //Criar o  objeto procMDFe ou mdfeProc dentro do pacote env com o construtor
	                context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.retConsReciMDFe.TProtMDFe.class);
	                element = new br.inf.portalfiscal.mdfe.schema_300.retConsReciMDFe.ObjectFactory()
	                        .createTProtMDFe((br.inf.portalfiscal.mdfe.schema_300.retConsReciMDFe.TProtMDFe) obj);
	                break;

	            case ConstantesMDFe.XML.EVENTO:
	                switch (obj.getClass().getName()) {
	                    case ConstantesMDFe.XML.CANCELAR:

	                        context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TEvento.class);
	                        element = new br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.ObjectFactory()
	                                .createTEvento((br.inf.portalfiscal.mdfe.schema_300.evCancMDFe.TEvento) obj);
	                        break;
	                    case ConstantesMDFe.XML.ENCERRAR:

	                        context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TEvento.class);
	                        element = new br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.ObjectFactory()
	                                .createTEvento((br.inf.portalfiscal.mdfe.schema_300.evEncMDFe.TEvento) obj);
	                        break;
	                    case ConstantesMDFe.XML.INCLUIR_CONDUTOR:
	                        context = JAXBContext.newInstance(br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TEvento.class);
	                        element = new br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.ObjectFactory()
	                                .createTEvento((br.inf.portalfiscal.mdfe.schema_300.evIncCondutorMDF.TEvento) obj);
	                        break;
	                }

	                break;

	            default:
	                throw new EmissorException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
	        }
	        Marshaller marshaller = context.createMarshaller();

	        marshaller.setProperty("jaxb.encoding", "Unicode");
	        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
	        marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

	        StringWriter sw = new StringWriter();
	        marshaller.marshal(element, sw);

	        StringBuilder xml = new StringBuilder();
	        xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append(sw.toString());

	        return replacesMdfe(xml.toString());
	    }

	public static String gZipToXml(byte[] conteudo) throws EmissorException, IOException {
		if (conteudo == null || conteudo.length == 0) {
			return "";
		}
		GZIPInputStream gis;
		gis = new GZIPInputStream(new ByteArrayInputStream(conteudo));
		BufferedReader bf = new BufferedReader(new InputStreamReader(gis, "UTF-8"));
		String outStr = "";
		String line;
		while ((line = bf.readLine()) != null) {
			outStr += line;
		}

		return outStr;
	}

	public static String criaCteProc(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe enviCte, Object retorno)
			throws JAXBException, EmissorException {

		br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc cteProc = new br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc();
		cteProc.setVersao("2.00");
		cteProc.setCTe(enviCte.getCTe().get(0));

		cteProc.setProtCTe(XmlUtil.xmlToObject(XmlUtil.objectCteToXml(retorno),
				br.inf.portalfiscal.cte.schema_200.enviCTe.TProtCTe.class));

		return XmlUtil.objectCteToXml(cteProc);
	}

	public static String criaCteProc(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCte, Object retorno)
			throws JAXBException, EmissorException {

		br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc cteProc = new br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc();
		cteProc.setVersao("3.00");
		cteProc.setCTe(enviCte.getCTe().get(0));

		cteProc.setProtCTe(XmlUtil.xmlToObject(XmlUtil.objectCteToXml(retorno),
				br.inf.portalfiscal.cte.schema_300.enviCTe.TProtCTe.class));

		return XmlUtil.objectCteToXml(cteProc);
	}
	
	public static String criaMdfeProc(br.inf.portalfiscal.mdfe.schema_300.procMDFe.TEnviMDFe enviMdfe, Object retorno) throws JAXBException, EmissorException {
		MdfeProc mdfeProc = new MdfeProc();
        
        mdfeProc.setVersao("3.00");
        mdfeProc.setMDFe(enviMdfe.getMDFe());
        String xml = objectMdfeToXml(retorno);
        mdfeProc.setProtMDFe(xmlToObject(xml, br.inf.portalfiscal.mdfe.schema_300.procMDFe.TProtMDFe.class));

        String xmlFinal = objectMdfeToXml(mdfeProc);

        return xmlFinal;
    }

	public static String removeAcentos(String str) {
		str = str.replaceAll("\r", "");
		str = str.replaceAll("\t", "");
		str = str.replaceAll("\n", "");
		str = str.replaceAll("&", "E");
		str = str.replaceAll(">\\s+<", "><");
		CharSequence cs = new StringBuilder(str == null ? "" : str);
		return Normalizer.normalize(cs, Normalizer.Form.NFKD).replaceAll("\\p{InCombiningDiacriticalMarks}+", "");
	}

	public static String replacesCte(String xml) {
		xml = xml.replaceAll("ns2:", "");
		xml = xml.replaceAll("ns3:", "");
		xml = xml.replaceAll("&lt;", "<");
		xml = xml.replaceAll("&amp;", "&");
		xml = xml.replaceAll("&gt;", ">");
		xml = xml.replaceAll("<Signature>", "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">");
		xml = xml.replaceAll(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");
		xml = xml.replaceAll(" xmlns:ns3=\"http://www.portalfiscal.inf.br/cte\"", "");
		xml = xml.replaceAll(" xmlns:ns2=\"http://www.portalfiscal.inf.br/cte\"", "");
		xml = xml.replaceAll(" xmlns=\"\"", "");
		return xml;
	}
	
    public static String replacesMdfe(String xml) {
        xml = xml.replaceAll("ns2:", "");
        xml = xml.replaceAll("ns3:", "");
        xml = xml.replaceAll("&lt;", "<");
        xml = xml.replaceAll("&amp;", "&");
        xml = xml.replaceAll("&gt;", ">");
        xml = xml.replaceAll("<Signature>", "<Signature xmlns=\"http://www.w3.org/2000/09/xmldsig#\">");
        xml = xml.replaceAll(" xmlns:ns2=\"http://www.w3.org/2000/09/xmldsig#\"", "");
        xml = xml.replaceAll(" xmlns:ns3=\"http://www.portalfiscal.inf.br/mdfe\"", "");
        xml = xml.replaceAll(" xmlns:ns2=\"http://www.portalfiscal.inf.br/mdfe\"", "");
        xml = xml.replaceAll(" xmlns=\"\"", "");
        return xml;
    }

}
