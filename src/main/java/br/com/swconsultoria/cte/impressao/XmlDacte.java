package br.com.swconsultoria.cte.impressao;

import br.com.swconsultoria.cte.exception.DacteException;
import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.ErrorHandler;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.SAXParseException;

import javax.xml.XMLConstants;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;
import javax.xml.xpath.XPathFactoryConfigurationException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Acesso ao XML do CT-e via XPath, para o DACTE.
 * O parse é feito sem namespace, então as expressões não usam prefixo (ex.: "//infCte/ide/nCT").
 * Também é exposto ao template Thymeleaf como "xml", permitindo que templates próprios
 * leiam qualquer campo do XML: ${xml.valor('//infCte/ide/tpEmis')}
 */
public class XmlDacte {

    /** Marca de ordem de bytes (BOM) do UTF-8 lida como caractere. */
    private static final String BOM = "﻿";
    /**
     * O handler padrão do JDK escreve "[Fatal Error] ..." no System.err antes de lançar a exceção; aqui o erro fatal
     * só vira exceção (que chega como DacteException) e os demais seguem ignorados, como no padrão.
     */
    private static final ErrorHandler ERROS_SEM_LOG = new ErrorHandler() {
        @Override
        public void warning(SAXParseException e) {
            // ignorado, como no handler padrão
        }

        @Override
        public void error(SAXParseException e) {
            // erro recuperável: ignorado, como no handler padrão
        }

        @Override
        public void fatalError(SAXParseException e) throws SAXException {
            throw e;
        }
    };

    private final Document documento;
    private final XPath xpath;
    private final Map<String, XPathExpression> expressoes = new HashMap<>();

    public XmlDacte(String xml) {
        if (xml == null || xml.trim().isEmpty()) {
            throw new DacteException("XML não pode ser nulo/vazio.");
        }
        // Arquivos UTF-8 com BOM: XmlCteUtil.leXml preserva o BOM e o parser o rejeita ("conteúdo não permitido no prólogo")
        String conteudo = xml.trim();
        if (conteudo.startsWith(BOM)) {
            conteudo = conteudo.substring(1).trim();
        }
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setNamespaceAware(false);
            factory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            factory.setFeature("http://apache.org/xml/features/disallow-doctype-decl", true);
            factory.setXIncludeAware(false);
            factory.setExpandEntityReferences(false);
            DocumentBuilder builder = factory.newDocumentBuilder();
            builder.setErrorHandler(ERROS_SEM_LOG);
            this.documento = builder.parse(new InputSource(new StringReader(conteudo)));
        } catch (Exception e) {
            throw new DacteException("Erro ao ler o XML do CT-e: " + e.getMessage(), e);
        }

        // As expressões são internas (ou de templates próprios, que são confiáveis); defesa em profundidade barata.
        // Falha aqui é da JVM, não do XML, por isso a mensagem é outra.
        try {
            XPathFactory xpathFactory = XPathFactory.newInstance();
            xpathFactory.setFeature(XMLConstants.FEATURE_SECURE_PROCESSING, true);
            this.xpath = xpathFactory.newXPath();
        } catch (XPathFactoryConfigurationException e) {
            throw new DacteException("Erro ao configurar o XPath do DACTE", e);
        }
    }

    public Document getDocumento() {
        return documento;
    }

    /**
     * Retorna o texto do primeiro nó da expressão (a partir da raiz) ou null se inexistente/vazio.
     */
    public String valor(String expressao) {
        return valor(documento, expressao);
    }

    /**
     * Retorna o texto do primeiro nó da expressão (relativa ao contexto) ou null se inexistente/vazio.
     */
    public String valor(Object contexto, String expressao) {
        Node no = no(contexto, expressao);
        if (no == null) {
            return null;
        }
        String texto = no.getTextContent();
        return texto == null || texto.trim().isEmpty() ? null : texto.trim();
    }

    public boolean existe(String expressao) {
        return no(documento, expressao) != null;
    }

    public boolean existe(Object contexto, String expressao) {
        return no(contexto, expressao) != null;
    }

    public Node no(String expressao) {
        return no(documento, expressao);
    }

    public Node no(Object contexto, String expressao) {
        try {
            return (Node) compila(expressao).evaluate(contexto, XPathConstants.NODE);
        } catch (XPathExpressionException e) {
            throw new DacteException("Expressão XPath inválida: " + expressao, e);
        }
    }

    public List<Node> nos(String expressao) {
        return nos(documento, expressao);
    }

    public List<Node> nos(Object contexto, String expressao) {
        try {
            NodeList lista = (NodeList) compila(expressao).evaluate(contexto, XPathConstants.NODESET);
            List<Node> nos = new ArrayList<>(lista.getLength());
            for (int i = 0; i < lista.getLength(); i++) {
                nos.add(lista.item(i));
            }
            return nos;
        } catch (XPathExpressionException e) {
            throw new DacteException("Expressão XPath inválida: " + expressao, e);
        }
    }

    private XPathExpression compila(String expressao) throws XPathExpressionException {
        XPathExpression compilada = expressoes.get(expressao);
        if (compilada == null) {
            compilada = xpath.compile(expressao);
            expressoes.put(expressao, compilada);
        }
        return compilada;
    }
}
