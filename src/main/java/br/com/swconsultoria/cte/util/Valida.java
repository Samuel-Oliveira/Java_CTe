package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.exception.CteException;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.StringReader;

public class Valida implements ErrorHandler {

	protected static String xsd;

	private String listaComErrosDeValidacao;

	/**
	 * Construtor privado
	 */
	protected Valida() {
		this.listaComErrosDeValidacao = "";
	}

	protected String validateXml(String xml, String xsd) throws CteException {
        DocumentBuilderFactory docBuilderFactory = DocumentBuilderFactory.newInstance();
        docBuilderFactory.setValidating(true);
        docBuilderFactory.setNamespaceAware(true);
        docBuilderFactory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage",
				"http://www.w3.org/2001/XMLSchema");
        docBuilderFactory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", xsd);
		DocumentBuilder builder;
		try {
            builder = docBuilderFactory.newDocumentBuilder();
			builder.setErrorHandler(this);
		} catch (ParserConfigurationException ex) {
			throw new CteException(ex.getMessage());
		}

		try {
            builder.parse(new InputSource(new StringReader(xml)));
		} catch (Exception ex) {
			throw new CteException(ex.toString());
		}

		return this.getListaComErrosDeValidacao();
	}

	@Override
	public void error(SAXParseException exception) throws SAXException {

		if (isError(exception)) {
			listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
		}
	}

	@Override
	public void fatalError(SAXParseException exception) throws SAXException {

		listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
	}

	@Override
	public void warning(SAXParseException exception) throws SAXException {

		listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
	}

	private String tratamentoRetorno(String message) {

		message = message.replaceAll("cvc-type.3.1.3:", "-");
		message = message.replaceAll("cvc-attribute.3:", "-");
		message = message.replaceAll("cvc-complex-type.2.4.a:", "-");
		message = message.replaceAll("cvc-complex-type.2.4.b:", "-");
		message = message.replaceAll("The value", "O valor");
		message = message.replaceAll("of element", "do campo");
		message = message.replaceAll("is not valid", "nao é valido");
		message = message.replaceAll("Invalid content was found starting with element", "Encontrado o campo");
		message = message.replaceAll("One of", "Campo(s)");
		message = message.replaceAll("is expected", "é obrigatorio");
		message = message.replaceAll("\\{", "");
		message = message.replaceAll("\\}", "");
		message = message.replaceAll("\"", "");
		message = message.replaceAll("http://www.portalfiscal.inf.br/nfe:", "");
		return System.getProperty("line.separator") + message.trim();
	}

	public String getListaComErrosDeValidacao() {

		return listaComErrosDeValidacao;
	}

	private boolean isError(SAXParseException exception) {

        return !exception.getMessage().startsWith("cvc-enumeration-valid")
                && !exception.getMessage().startsWith("cvc-pattern-valid")
                && !exception.getMessage().startsWith("cvc-maxLength-valid")
                && !exception.getMessage().startsWith("cvc-datatype");
    }

}
