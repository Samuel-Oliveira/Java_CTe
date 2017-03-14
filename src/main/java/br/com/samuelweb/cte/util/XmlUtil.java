/**
 * 
 */
package br.com.samuelweb.cte.util;

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

import br.com.samuelweb.cte.ConfiguracoesIniciaisCte;
import br.com.samuelweb.cte.exception.CteException;
import br.inf.portalfiscal.cte.schema_300.distDFeInt.DistDFeInt;

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
	 * @throws CteException
	 */
	public static String leXml(String arquivo) throws CteException {

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
			throw new CteException("Ler Xml: "+ e.getMessage());
		}
		return xml.toString();
	}

	/**
	 * Transforma o Objeto em XML(String)
	 * 
	 * @return String
	 * @throws CteException
	 */
	public static <T> String objectToXml(Object obj) throws JAXBException, CteException {

		JAXBContext context = null;
		JAXBElement<?> element = null;

		String versao = ConfiguracoesIniciaisCte.getInstance().getVersaoCte();

		switch (obj.getClass().getSimpleName()) {

		case ConstantesUtil.XML.STATUS_SERVICO:
			if (versao.equals(ConstantesUtil.VERSAO.V3_00)) {
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

		case ConstantesUtil.XML.ENVIO_CTE:
			if (versao.equals(ConstantesUtil.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.enviCTe.ObjectFactory()
						.createEnviCTe((br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.enviCTe.ObjectFactory()
						.createTEnviCTe((br.inf.portalfiscal.cte.schema_200.enviCTe.TEnviCTe) obj);
			}
			break;

		case ConstantesUtil.XML.CONSULTA_RECIBO:
			if (versao.equals(ConstantesUtil.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.consReciCTe.TConsReciCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.consReciCTe.ObjectFactory()
						.createConsReciCTe((br.inf.portalfiscal.cte.schema_300.consReciCTe.TConsReciCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.consReciCTe.TConsReciCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.consReciCTe.ObjectFactory()
						.createConsReciCTe((br.inf.portalfiscal.cte.schema_200.consReciCTe.TConsReciCTe) obj);
			}
			break;

		case ConstantesUtil.XML.INUTILIZACAO:
			if (versao.equals(ConstantesUtil.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.inutCTe.ObjectFactory()
						.createInutCTe((br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.inutCTe.TInutCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.inutCTe.ObjectFactory()
						.createInutCTe((br.inf.portalfiscal.cte.schema_200.inutCTe.TInutCTe) obj);
			}
			break;

		case ConstantesUtil.XML.CONSULTA_PROTOCOLO:
			if (versao.equals(ConstantesUtil.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.consSitCTe.ObjectFactory()
						.createConsSitCTe((br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.consSitCTe.TConsSitCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.consSitCTe.ObjectFactory()
						.createConsSitCTe((br.inf.portalfiscal.cte.schema_200.consSitCTe.TConsSitCTe) obj);
			}
			
			break;

		case ConstantesUtil.XML.DISTRIBUICAO_DFE:
			context = JAXBContext.newInstance(DistDFeInt.class);
			element = new br.inf.portalfiscal.cte.schema_300.distDFeInt.ObjectFactory()
					.createDistDFeInt((DistDFeInt) obj);
			break;

		case ConstantesUtil.XML.PROC_EVENTO:

			switch (obj.getClass().getName()) {

			case ConstantesUtil.XML.PROC_CANCELAR_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCancCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCancCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evCancCTe.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_CANCELAR_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCancCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_EPEC_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evEPECCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evEPECCTe.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_EPEC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evEPECCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_MULTIMODAL_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evRegMultimodal.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_MULTIMODAL_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evRegMultimodal.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_CCE_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCCeCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCCeCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_200.evCCeCTe.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_CCE_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCCeCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento) obj);
				break;

			case ConstantesUtil.XML.PROC_PRESTDESACORDO_V3:
				context = JAXBContext
						.newInstance(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TProcEvento) obj);
				break;
				
			case ConstantesUtil.XML.PROC_GVT_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evGTV.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evGTV.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evGTV.TProcEvento) obj);
				break;
				
			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}		
			
			break;

		case ConstantesUtil.XML.PROC_CTE:
			if (versao.equals(ConstantesUtil.VERSAO.V3_00)) {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc.class);
				element = new br.inf.portalfiscal.cte.schema_300.enviCTe.ObjectFactory()
						.createCteProc((br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc) obj);
			} else {
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc.class);
				element = new br.inf.portalfiscal.cte.schema_200.enviCTe.ObjectFactory()
						.createCteProc((br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc) obj);
			}
			break;

		case ConstantesUtil.XML.PROC_CTEOS:
			context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.procCTeOS.CteOSProc.class);
			element = new br.inf.portalfiscal.cte.schema_300.procCTeOS.ObjectFactory()
					.createCteOSProc((br.inf.portalfiscal.cte.schema_300.procCTeOS.CteOSProc) obj);
			break;

		case ConstantesUtil.XML.EVENTO:

			switch (obj.getClass().getName()) {

			case ConstantesUtil.XML.CANCELAR_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCancCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evCancCTe.TEvento) obj);
				break;

			case ConstantesUtil.XML.CANCELAR_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCancCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento) obj);
				break;

			case ConstantesUtil.XML.EPEC_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evEPECCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evEPECCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evEPECCTe.TEvento) obj);
				break;

			case ConstantesUtil.XML.EPEC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evEPECCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento) obj);
				break;

			case ConstantesUtil.XML.MULTIMODAL_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evRegMultimodal.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evRegMultimodal.TEvento) obj);
				break;

			case ConstantesUtil.XML.MULTIMODAL_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evRegMultimodal.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento) obj);
				break;

			case ConstantesUtil.XML.CCE_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_200.evCCeCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_200.evCCeCTe.TEvento) obj);
				break;

			case ConstantesUtil.XML.CCE_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCCeCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento) obj);
				break;

			case ConstantesUtil.XML.PRESTDESACORDO_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento) obj);
				break;

			case ConstantesUtil.XML.GVT_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evGTV.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evGTV.TEvento) obj);
				break;

			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}
			
			break;

		case ConstantesUtil.XML.PROT_CTE:

			switch (obj.getClass().getName()) {

			case ConstantesUtil.XML.PROT_CTE_CONSULTA_RECIBO_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.retConsReciCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.retConsReciCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_200.retConsReciCTe.TProtCTe) obj);
				break;

			case ConstantesUtil.XML.PROT_CTE_CONSULTA_RECIBO_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.retConsReciCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TProtCTe) obj);
				break;

			case ConstantesUtil.XML.PROT_CTE_PROC_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.procCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.procCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_200.procCTe.TProtCTe) obj);
				break;

			case ConstantesUtil.XML.PROT_CTE_PROC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.procCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.procCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_300.procCTe.TProtCTe) obj);
				break;

			case ConstantesUtil.XML.PROT_CTE_CONSULTA_SITUACAO_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.retConsSitCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_200.retConsSitCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_200.retConsSitCTe.TProtCTe) obj);
				break;

			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;
			
		case ConstantesUtil.XML.PROT_CTEOS:

			switch (obj.getClass().getName()) {

			case ConstantesUtil.XML.PROT_CTEOS_PROC_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.retEnviCTe.TProtCTeOS.class);
				element = new br.inf.portalfiscal.cte.schema_300.retEnviCTe.ObjectFactory()
						.createTProcCTeOS((br.inf.portalfiscal.cte.schema_300.retEnviCTe.TProtCTeOS) obj);
				break;
				
			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;
			
		case ConstantesUtil.XML.MODAL_RODOVIARIO:
			
			switch (obj.getClass().getName()) {

			case ConstantesUtil.XML.MODAL_RODOVIARIO_V2:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_200.cteModalRodoviario.Rodo.class);
				element = new br.inf.portalfiscal.cte.schema_200.cteModalRodoviario.ObjectFactory()
						.createRodo((br.inf.portalfiscal.cte.schema_200.cteModalRodoviario.Rodo) obj);
				break;
				
			case ConstantesUtil.XML.MODAL_RODOVIARIO_V3:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.cteModalRodoviario.Rodo.class);
				element = new br.inf.portalfiscal.cte.schema_300.cteModalRodoviario.ObjectFactory()
						.createRodo((br.inf.portalfiscal.cte.schema_300.cteModalRodoviario.Rodo) obj);
				break;
				
			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;

		default:
			throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getSimpleName());
		}
		
		Marshaller marshaller = context.createMarshaller();

		marshaller.setProperty("jaxb.encoding", "Unicode");
		marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.FALSE);
		marshaller.setProperty(Marshaller.JAXB_FRAGMENT, Boolean.TRUE);

		StringWriter sw = new StringWriter();
		marshaller.marshal(element, sw);

		StringBuilder xml = new StringBuilder();
		xml.append("<?xml version=\"1.0\" encoding=\"UTF-8\"?>").append(sw.toString());

		// if((obj.getClass().getSimpleName().equals(PROC_EVENTO))){
		// return replacesNfe(xml.toString().replaceAll("procEvento",
		// "procEventoCTe"));
		// }
		return replacesCte(xml.toString());

	}

	public static String gZipToXml(byte[] conteudo) throws CteException, IOException {
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
			throws JAXBException, CteException {

		br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc cteProc = new br.inf.portalfiscal.cte.schema_200.enviCTe.CteProc();
		cteProc.setVersao("2.00");
		cteProc.setCTe(enviCte.getCTe().get(0));

		cteProc.setProtCTe(XmlUtil.xmlToObject(XmlUtil.objectToXml(retorno),
				br.inf.portalfiscal.cte.schema_200.enviCTe.TProtCTe.class));

		return XmlUtil.objectToXml(cteProc);
	}

	public static String criaCteProc(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCte, Object retorno)
			throws JAXBException, CteException {

		br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc cteProc = new br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc();
		cteProc.setVersao("3.00");
		cteProc.setCTe(enviCte.getCTe().get(0));

		cteProc.setProtCTe(XmlUtil.xmlToObject(XmlUtil.objectToXml(retorno),
				br.inf.portalfiscal.cte.schema_300.enviCTe.TProtCTe.class));

		return XmlUtil.objectToXml(cteProc);
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

}
