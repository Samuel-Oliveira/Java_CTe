package br.com.swconsultoria.cte;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.exception.CteValidacaoException;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXParseException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.StringReader;

public class Validar implements ErrorHandler {

    private String listaComErrosDeValidacao = "";

    public void validaXml(ConfiguracoesCte config, String xml, ServicosEnum servico) throws CteException {

        System.setProperty("jdk.xml.maxOccurLimit", "99999");
        String errosValidacao;
        String xsd = config.getPastaSchemas() + "/" + servico.getXsd();
        if (!new File(xsd).exists()) {
            throw new CteException("Schema Cte não Localizado: " + xsd);
        }

        errosValidacao = validateXml(xml, xsd);
        if(ObjetoCTeUtil.verifica(errosValidacao).isPresent())
            throw  new CteValidacaoException("Erro na validação: " + errosValidacao);

    }

    private String validateXml(String xml, String xsd) throws CteException {

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
            throw new CteException(ex);
        }

        try {
            builder.parse(new InputSource(new StringReader(xml)));
        } catch (Exception ex) {
            throw new CteException(ex);
        }

        return this.getListaComErrosDeValidacao();
    }

    public void error(SAXParseException exception) {

        if (isError(exception)) {
            listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
        }
    }

    public void fatalError(SAXParseException exception) {

        listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
    }

    public void warning(SAXParseException exception) {

        listaComErrosDeValidacao += tratamentoRetorno(exception.getMessage());
    }

    private String tratamentoRetorno(String message) {

        message = message.replace("cvc-type.3.1.3:", "-")
        .replace("cvc-attribute.3:", "-")
        .replace("cvc-complex-type.2.4.a:", "-")
        .replace("cvc-complex-type.2.4.b:", "-")
        .replace("cvc-complex-type.2.4.c:", "-")
        .replace("cvc-complex-type.2.4.d:", "-")
        .replace("cvc-complex-type.4:", "-")
        .replace("cvc-minLength-valid:", "-")
        .replace("The value", "O valor")
        .replace("Value", "Valor")
        .replace("with length", "com tamanho")
        .replace("is not facet-valid with respect to minLength", "não equivale ao tamanho mínimo")
        .replace("for type", "para o tipo")
        .replace("The content", "O conteúdo")
        .replace("of element", "do campo")
        .replace("is not complete", "não está completo")
        .replace("is not valid", "não é válido")
        .replace("Attribute", "Campo")
        .replace("must appear on element", "precisa estar em")
        .replace("Invalid content was found starting with element", "Conteúdo inválido encontrado iniciando com o campo")
        .replace("One of", "Um dos Campos")
        .replace("is expected", "é esperado")
        .replace("\\{", "")
        .replace("\\}", "")
        .replace("\"", "")
        .replace("http://www.portalfiscal.inf.br/cte:", "");
        return System.lineSeparator() + message.trim();
    }

    private String getListaComErrosDeValidacao() {

        return listaComErrosDeValidacao;
    }

    private boolean isError(SAXParseException exception) {

        return !exception.getMessage().startsWith("cvc-enumeration-valid")
                && !exception.getMessage().startsWith("cvc-pattern-valid")
                && !exception.getMessage().startsWith("cvc-maxLength-valid")
                && !exception.getMessage().startsWith("cvc-datatype");
    }

}
