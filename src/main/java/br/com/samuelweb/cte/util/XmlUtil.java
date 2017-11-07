/**
 * 
 */
package br.com.samuelweb.cte.util;

import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;
import br.inf.portalfiscal.cte.schema_300.distdfeint.DistDFeInt;

import javax.xml.bind.*;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeConstants;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.transform.stream.StreamSource;
import java.io.*;
import java.text.Normalizer;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.GregorianCalendar;
import java.util.zip.GZIPInputStream;

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
	 * @param xml
	 * @param classe
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
	public static <T> String objectCteToXml(Object obj) throws JAXBException, CteException {

		JAXBContext context;
		JAXBElement<?> element;

		String versao = ConfiguracoesIniciais.getInstance().getVersao();

		switch (obj.getClass().getSimpleName()) {

		case ConstantesCte.XML.STATUS_SERVICO:
				context = JAXBContext
						.newInstance(br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ.class);
				element = new br.inf.portalfiscal.cte.schema_300.consStatServCTe.ObjectFactory()
						.createConsStatServCte((br.inf.portalfiscal.cte.schema_300.consStatServCTe.TConsStatServ) obj);
			break;

		case ConstantesCte.XML.ENVIO_CTE:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.enviCTe.ObjectFactory()
						.createEnviCTe((br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe) obj);
			break;

		case ConstantesCte.XML.CONSULTA_RECIBO:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.consReciCTe.TConsReciCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.consReciCTe.ObjectFactory()
						.createConsReciCTe((br.inf.portalfiscal.cte.schema_300.consReciCTe.TConsReciCTe) obj);
			break;

		case ConstantesCte.XML.INUTILIZACAO:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.inutCTe.ObjectFactory()
						.createInutCTe((br.inf.portalfiscal.cte.schema_300.inutCTe.TInutCTe) obj);
			break;

		case ConstantesCte.XML.CONSULTA_PROTOCOLO:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.consSitCTe.ObjectFactory()
						.createConsSitCTe((br.inf.portalfiscal.cte.schema_300.consSitCTe.TConsSitCTe) obj);

			break;

		case ConstantesCte.XML.DISTRIBUICAO_DFE:
			context = JAXBContext.newInstance(DistDFeInt.class);
			element = new br.inf.portalfiscal.cte.schema_300.distdfeint.ObjectFactory()
					.createDistDFeInt((DistDFeInt) obj);
			break;

		case ConstantesCte.XML.PROC_EVENTO:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.PROC_CANCELAR:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCancCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evCancCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_EPEC:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evEPECCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_MULTIMODAL:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evRegMultimodal.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_CCE:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCCeCTe.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evCCeCTe.TProcEvento) obj);
				break;

			case ConstantesCte.XML.PROC_PRESTDESACORDO:
				context = JAXBContext
						.newInstance(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TProcEvento) obj);
				break;
				
			case ConstantesCte.XML.PROC_GVT:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evGTV.TProcEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evGTV.ObjectFactory()
						.createTProcEvento((br.inf.portalfiscal.cte.schema_300.evGTV.TProcEvento) obj);
				break;
				
			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}		
			
			break;

		case ConstantesCte.XML.PROC_CTE:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc.class);
				element = new br.inf.portalfiscal.cte.schema_300.enviCTe.ObjectFactory()
						.createCteProc((br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc) obj);
			break;

		case ConstantesCte.XML.PROC_CTEOS:
			context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.procCTeOS.CteOSProc.class);
			element = new br.inf.portalfiscal.cte.schema_300.procCTeOS.ObjectFactory()
					.createCteOSProc((br.inf.portalfiscal.cte.schema_300.procCTeOS.CteOSProc) obj);
			break;

		case ConstantesCte.XML.EVENTO:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.CANCELAR:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCancCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evCancCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.EPEC:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evEPECCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evEPECCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.MULTIMODAL:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evRegMultimodal.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evRegMultimodal.TEvento) obj);
				break;

			case ConstantesCte.XML.CCE:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evCCeCTe.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evCCeCTe.TEvento) obj);
				break;

			case ConstantesCte.XML.PRESTDESACORDO:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evPrestDesacordo.TEvento) obj);
				break;

			case ConstantesCte.XML.GVT:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.evGTV.TEvento.class);
				element = new br.inf.portalfiscal.cte.schema_300.evGTV.ObjectFactory()
						.createTEvento((br.inf.portalfiscal.cte.schema_300.evGTV.TEvento) obj);
				break;

			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}
			
			break;

		case ConstantesCte.XML.PROT_CTE:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.PROT_CTE_CONSULTA_RECIBO:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.retConsReciCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_300.retConsReciCTe.TProtCTe) obj);
				break;

			case ConstantesCte.XML.PROT_CTE_PROC:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.procCTe.TProtCTe.class);
				element = new br.inf.portalfiscal.cte.schema_300.procCTe.ObjectFactory()
						.createTProcCTe((br.inf.portalfiscal.cte.schema_300.procCTe.TProtCTe) obj);
				break;

			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;
			
		case ConstantesCte.XML.PROT_CTEOS:

			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.PROT_CTEOS_PROC:
				context = JAXBContext.newInstance(br.inf.portalfiscal.cte.schema_300.retEnviCTe.TProtCTeOS.class);
				element = new br.inf.portalfiscal.cte.schema_300.retEnviCTe.ObjectFactory()
						.createTProcCTeOS((br.inf.portalfiscal.cte.schema_300.retEnviCTe.TProtCTeOS) obj);
				break;
				
			default:
				throw new CteException("Objeto não mapeado no XmlUtil:" + obj.getClass().getName());
			}

			break;
			
		case ConstantesCte.XML.MODAL_RODOVIARIO:
			
			switch (obj.getClass().getName()) {

			case ConstantesCte.XML.MODAL_RODOVIARIO:
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

		return replacesCte("<?xml version=\"1.0\" encoding=\"UTF-8\"?>" + sw.toString());

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

	public static String criaCteProc(br.inf.portalfiscal.cte.schema_300.enviCTe.TEnviCTe enviCte, Object retorno)
			throws JAXBException, CteException {

		br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc cteProc = new br.inf.portalfiscal.cte.schema_300.enviCTe.CteProc();
		cteProc.setVersao("3.00");
		cteProc.setCTe(enviCte.getCTe().get(0));
		cteProc.setProtCTe(xmlToObject(objectCteToXml(retorno),	br.inf.portalfiscal.cte.schema_300.enviCTe.TProtCTe.class));

		return XmlUtil.objectCteToXml(cteProc);
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

	private static String replacesCte(String xml) {
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
	
	public static String dataCte(LocalDateTime data) throws CteException {
		XMLGregorianCalendar xmlCalendar;
		try {
			GregorianCalendar calendar = GregorianCalendar.from(data.atZone(ZoneId.of("Brazil/East")));

			xmlCalendar = DatatypeFactory.newInstance().newXMLGregorianCalendar(calendar);
			xmlCalendar.setMillisecond(DatatypeConstants.FIELD_UNDEFINED);

		} catch (DatatypeConfigurationException e) {
			throw new CteException(e.getMessage());
		}

		return (xmlCalendar.toString());
	}

	public static int modulo11(String chave) {
		int total = 0;
		int peso = 2;

		for (int i = 0; i < chave.length(); i++) {
			total += (chave.charAt((chave.length() - 1) - i) - '0') * peso;
			peso++;
			if (peso == 10)
				peso = 2;
		}
		int resto = total % 11;
		return (resto == 0 || resto == 1) ? 0 : (11 - resto);
	}

}
