package br.com.samuelweb.cte;

import java.io.ByteArrayInputStream;
import java.io.File;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.xml.sax.ErrorHandler;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.ConstantesUtil;

public class Validar implements ErrorHandler {

	private static String xsd;

	private String listaComErrosDeValidacao;
	
	private static ConfiguracoesIniciaisCte configuracoesCte;

	/**
	 * Construtor privado
	 */
	private Validar() {
		 this.listaComErrosDeValidacao = "";  
	}

	public static String validaXml(String xml, String tipo) throws CteException {

		String errosValidacao = null;

		configuracoesCte = ConfiguracoesIniciaisCte.getInstance();
		
		switch (tipo) {
		case ConstantesUtil.SERVICOS.STATUS_SERVICO:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.STATUS_SERVICO + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.ENVIO_CTE:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.ENVIO_CTE + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.CONSULTA_RECIBO:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.CONSULTA_RECIBO + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.CONSULTA_PROTOCOLO:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.CONSULTA_PROTOCOLO + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.DISTRIBUICAO_DFE:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.DISTRIBUICAO_DFE;
			break;
		case ConstantesUtil.SERVICOS.INUTILIZACAO:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.INUTILIZACAO + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.EVENTO:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.EVENTO + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.CANCELAR:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.CANCELAR + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.EPEC:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.EPEC + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.MULTIMODAL:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.MULTIMODAL + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.CCE:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.CCE + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.PRESTACAO_DESACORDO:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.PRESTACAO_DESACORDO + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.GVT:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.GVT + "_v" + configuracoesCte.getVersaoCte();
			break;
		case ConstantesUtil.SERVICOS.MODAL_RODOVIARIO:
			xsd = configuracoesCte.getPastaSchemas()+ "/" + ConstantesUtil.XSD.MODAL_RODOVIARIO + "_v" + configuracoesCte.getVersaoCte();
			break;
		default:
			throw new CteException("Não Encontrado XSD para:" + tipo);
		}
		
		xsd += ".xsd";
		
		if(!new File(xsd).exists()){
			throw new CteException("Schema Nfe não Localizado: "+xsd);
		}
		
		Validar validar= new Validar();
		
		 errosValidacao = validar.validateXml(xml, xsd);
			
		return errosValidacao;
	}

	public String validateXml(String xml, String xsd) throws CteException {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		factory.setNamespaceAware(true);
		factory.setValidating(true);
		factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaLanguage", "http://www.w3.org/2001/XMLSchema");
		factory.setAttribute("http://java.sun.com/xml/jaxp/properties/schemaSource", xsd);
		DocumentBuilder builder = null;
		try {
			builder = factory.newDocumentBuilder();
			builder.setErrorHandler(this);
		} catch (ParserConfigurationException ex) {
			throw new CteException(ex.getMessage());
		}
		
		try {
			builder.parse(new ByteArrayInputStream(xml.getBytes()));
		} catch (Exception ex) {
			throw new CteException(ex.toString());
		}

		return this.getListaComErrosDeValidacao();
	}

	public void error(SAXParseException exception) throws SAXException {

		if (isError(exception)) {
			listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
		}
	}

	public void fatalError(SAXParseException exception) throws SAXException {

		listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
	}

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

		if (exception.getMessage().startsWith("cvc-enumeration-valid") || exception.getMessage().startsWith("cvc-pattern-valid") || exception.getMessage().startsWith("cvc-maxLength-valid") || exception.getMessage().startsWith("cvc-datatype")) {
			return false;
		}
		return true;
	}

}
