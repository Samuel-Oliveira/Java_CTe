package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.exception.CteException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.ls.DOMImplementationLS;
import org.w3c.dom.ls.LSSerializer;

import javax.xml.bind.*;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMResult;
import java.util.Collection;

public final class ObjetoUtil {

	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static <T> Element objectToElement(Object objeto, Class<T> classe, String qName ) throws CteException {

		try {
			Document document = DocumentBuilderFactory.newInstance().newDocumentBuilder().newDocument();
			JAXB.marshal(new JAXBElement(new QName(qName), classe, objeto), new DOMResult(document));
	
			return document.getDocumentElement();

		} catch (ParserConfigurationException e) {
			throw new CteException("Erro Ao Converter Objeto em Elemento: "+e.getMessage());
		}
	}
	
	public static <T> T elementToObject(Element element, Class<T> classe) throws JAXBException {

		JAXBContext context = JAXBContext.newInstance(classe);
		Unmarshaller unmarshaller = context.createUnmarshaller();
		return unmarshaller.unmarshal(element, classe).getValue();
	}

	public static String elementToString(Element element){
		DOMImplementationLS lsImpl = (DOMImplementationLS)element.getOwnerDocument().getImplementation().getFeature("LS", "3.0");
		LSSerializer serializer = lsImpl.createLSSerializer();
		serializer.getDomConfig().setParameter("xml-declaration", false); //by default its true, so set it to false to get String without xml-declaration
		return serializer.writeToString(element);
	}

	private ObjetoUtil() {
		super();
	}

	public static Boolean equalsNull(Object object) {
		return object == null;
	}

	public static Boolean differentNull(Object object) {
		return object != null;
	}

	/**
	 * Verifica se um objeto &eacute; vazio.
	 * 
	 * @param obj
	 * @return <b>true</b> se o objeto for vazio(empty).
	 */
	public static boolean isEmpty(Object obj) {
		if (obj == null)
			return true;
		if (obj instanceof Collection)
			return ((Collection<?>) obj).size() == 0;

		final String s = String.valueOf(obj).trim();

		return s.length() == 0 || s.equalsIgnoreCase("null");
	}

	@SuppressWarnings("rawtypes")
	public static Boolean equalsNull(Collection collection) {
		return collection == null;
	}

	@SuppressWarnings("rawtypes")
	public static Boolean differentNull(Collection collection) {
		return collection != null;
	}

	@SuppressWarnings("rawtypes")
	public static Boolean isEmpty(Collection collection) {
		return collection.isEmpty();
	}

	@SuppressWarnings("rawtypes")
	public static Boolean isNotEmpty(Collection collection) {
		return !collection.isEmpty();
	}

}
