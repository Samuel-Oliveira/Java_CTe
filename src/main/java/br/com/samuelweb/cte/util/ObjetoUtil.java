package br.com.samuelweb.cte.util;

import java.util.Collection;

import javax.xml.bind.JAXB;
import javax.xml.bind.JAXBElement;
import javax.xml.namespace.QName;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.dom.DOMResult;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import br.com.samuelweb.cte.exception.CteException;

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
