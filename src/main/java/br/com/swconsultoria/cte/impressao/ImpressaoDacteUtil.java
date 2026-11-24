package br.com.swconsultoria.cte.impressao;

import br.com.swconsultoria.cte.exception.DacteException;
import com.openhtmltopdf.pdfboxout.PdfBoxRenderer;
import com.openhtmltopdf.pdfboxout.PdfRendererBuilder;
import com.openhtmltopdf.render.BlockBox;
import com.openhtmltopdf.render.Box;
import com.openhtmltopdf.render.PageBox;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.printing.PDFPageable;
import org.thymeleaf.TemplateEngine;
import org.thymeleaf.context.Context;
import org.thymeleaf.exceptions.TemplateEngineException;
import org.thymeleaf.templatemode.TemplateMode;
import org.thymeleaf.templateresolver.ClassLoaderTemplateResolver;
import org.thymeleaf.templateresolver.FileTemplateResolver;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import javax.print.PrintService;
import javax.print.PrintServiceLookup;
import java.awt.print.PrinterException;
import java.awt.print.PrinterJob;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.InvalidPathException;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;

/**
 * Impressão do DACTE (Documento Auxiliar do Conhecimento de Transporte Eletrônico): XML, template Thymeleaf (HTML)
 * e PDF (openhtmltopdf). O template padrão é o do CT-e modelo 57 em A4 retrato; CT-e OS (modelo 67), CT-e
 * Simplificado e GT-V-e só saem com template próprio.
 * Todos os erros são lançados como {@link DacteException}.
 * <p>
 * O openhtmltopdf registra várias linhas INFO (java.util.logging) a cada PDF. Esta classe não altera essa
 * configuração, que é da aplicação; para silenciar, use {@code com.openhtmltopdf.util.XRLog.setLevel} ou
 * {@code XRLog.setLoggingEnabled(false)} na inicialização da aplicação.
 */
public final class ImpressaoDacteUtil {

    /** Template padrão do DACTE (classpath: /dacte/dacte.html). */
    public static final String TEMPLATE_PADRAO = "dacte";
    /** Logo padrão do DACTE (classpath), usado por {@link #impressaoPadraoCTe(String)}. */
    public static final String PATH_LOGO_CTE = "/img/cte.png";
    /** id (no HTML) do bloco do rodapé (modal, uso do emissor e fisco), encostado no pé da última folha em {@link #htmlParaPdf}. */
    public static final String ID_RODAPE = "rodape";
    /** id (no HTML) do espaçador vazio logo antes do bloco do rodapé; a altura dele é calculada em {@link #htmlParaPdf}. */
    public static final String ID_ESPACO_RODAPE = "espaco-rodape";
    /** Classe (no HTML) dos elementos que recebem o total de folhas em {@link #htmlParaPdf}. */
    public static final String CLASSE_TOTAL_FOLHAS = "folha-total";
    /** Folga entre o fim do bloco do rodapé e o fim da área útil da folha, em mm. */
    private static final float FOLGA_RODAPE_MM = 1f;
    /** Padrões de nome que o resolver de arquivo aceita: um template próprio é um caminho de arquivo HTML. */
    private static final String[] EXTENSOES_TEMPLATE_PROPRIO = {"*.html", "*.htm", "*.xhtml"};
    /** Lado da imagem do QR Code gerada pelo zxing, em pixels; o CSS do template define o tamanho impresso. */
    private static final int TAMANHO_QRCODE_PX = 400;

    private static final TemplateEngine TEMPLATE_ENGINE = criaTemplateEngine();
    private static final FormatadorDacte FORMATADOR = new FormatadorDacte();

    private ImpressaoDacteUtil() {
    }

    /**
     * Gera Objeto padrão para impressão do DACTE: logo padrão de CT-e e canhoto.
     *
     * @param xml XML autorizado (cteProc) ou CTe sem protocolo
     */
    public static ImpressaoDacteDTO impressaoPadraoCTe(String xml) {
        ImpressaoDacteDTO impressao = new ImpressaoDacteDTO();
        impressao.setXml(xml);
        impressao.setLogo(ImpressaoDacteUtil.class.getResourceAsStream(PATH_LOGO_CTE));
        return impressao;
    }

    /**
     * Gera o HTML do DACTE, com o template informado ou o padrão.
     */
    public static String gerarHtml(ImpressaoDacteDTO impressao) {
        XmlDacte xml = new XmlDacte(impressao.getXml());
        if (impressao.getTemplate() == null && xml.no("//CTe/infCte") == null) {
            throw new DacteException("O XML não é de um CT-e modelo 57 (cteProc ou CTe): CT-e OS, CT-e Simplificado"
                    + " e GT-V-e não têm leiaute de impressão padrão; informe um template próprio.");
        }
        DacteDTO dacte = LeitorDacte.ler(xml);

        Context contexto = new Context();
        contexto.setVariable("xml", xml);
        contexto.setVariable("fmt", FORMATADOR);
        contexto.setVariable("dacte", dacte);
        contexto.setVariable("logo", ImagemDacteUtil.dataUri(impressao.getLogo()));
        contexto.setVariable("codigoBarras", dacte.getChave() == null ? null
                : ImagemDacteUtil.dataUri(ImagemDacteUtil.codigoBarras128(dacte.getChave())));
        contexto.setVariable("qrCode", dacte.isExibirQrCode()
                ? ImagemDacteUtil.dataUri(ImagemDacteUtil.qrCode(dacte.getSupl().get("qrCodCTe"), TAMANHO_QRCODE_PX)) : null);
        contexto.setVariable("exibirCanhoto", impressao.isExibirCanhoto());
        contexto.setVariable("parametros", impressao.getParametros());

        String template = impressao.getTemplate() == null ? TEMPLATE_PADRAO : impressao.getTemplate();
        try {
            return TEMPLATE_ENGINE.process(template, contexto);
        } catch (TemplateEngineException e) {
            // Template inexistente, HTML inválido ou erro numa expressão: mantém o contrato de só lançar DacteException
            throw new DacteException("Erro ao processar o template " + template + ": " + e.getMessage(), e);
        }
    }

    /**
     * Cria a impressão no caminho definido e no formato HTML.
     */
    public static void impressaoHtml(ImpressaoDacteDTO impressao, String destinoHtml) {
        try {
            Files.write(Paths.get(destinoHtml), gerarHtml(impressao).getBytes(StandardCharsets.UTF_8));
        } catch (IOException | InvalidPathException e) {
            throw new DacteException("Erro ao gravar HTML " + destinoHtml, e);
        }
    }

    /**
     * Cria a impressão Retornando o byte[] do PDF.
     */
    public static byte[] impressaoPdfByte(ImpressaoDacteDTO impressao) {
        return htmlParaPdf(gerarHtml(impressao));
    }

    /**
     * Cria a impressão no caminho definido e no formato PDF.
     */
    public static void impressaoPdfArquivo(ImpressaoDacteDTO impressao, String destinoPdf) {
        try {
            Files.write(Paths.get(destinoPdf), impressaoPdfByte(impressao));
        } catch (IOException | InvalidPathException e) {
            throw new DacteException("Erro ao gravar PDF " + destinoPdf, e);
        }
    }

    /**
     * Cria a impressão direta na impressora padrão.
     */
    public static void impressaoDireta(ImpressaoDacteDTO impressao) {
        impressaoDireta(impressao, PrintServiceLookup.lookupDefaultPrintService());
    }

    /**
     * Cria a impressão direta na impressora informada.
     */
    public static void impressaoDireta(ImpressaoDacteDTO impressao, PrintService impressora) {
        if (impressora == null) {
            throw new DacteException("Impressora não encontrada");
        }
        byte[] pdf = impressaoPdfByte(impressao);
        try (PDDocument documento = PDDocument.load(pdf)) {
            PrinterJob printerJob = PrinterJob.getPrinterJob();
            printerJob.setPrintService(impressora);
            printerJob.setPageable(new PDFPageable(documento));
            printerJob.print();
        } catch (IOException | PrinterException e) {
            throw new DacteException("Erro ao imprimir DACTE", e);
        }
    }

    /**
     * Converte um HTML (XHTML bem formado) em PDF.
     * <p>
     * O documento é diagramado duas vezes. A primeira mede:
     * <ul>
     *     <li>o total de folhas, escrito nos elementos de classe {@value #CLASSE_TOTAL_FOLHAS} (o "FL 1/2" do
     *     cabeçalho): com counter(pages) o openhtmltopdf diagrama o número com largura zero, porque o total ainda
     *     não existe, e numa célula com overflow: hidden (as do DACTE) ele é cortado;</li>
     *     <li>quanto sobra na folha em que caiu o bloco do rodapé (informações do modal, uso exclusivo do emissor e
     *     reservado ao fisco), altura dada ao espaçador {@value #ID_ESPACO_RODAPE} para o bloco {@value #ID_RODAPE}
     *     encostar no pé da folha, como no DACTE Jasper. Sem os dois marcadores (template próprio), o bloco sai
     *     logo após o conteúdo.</li>
     * </ul>
     */
    public static byte[] htmlParaPdf(String html) {
        try (ByteArrayOutputStream saida = new ByteArrayOutputStream();
             PdfBoxRenderer renderer = novoRenderer(html, null, saida)) {
            renderer.layout();

            Document documento = renderer.getDocument();
            int folhas = totalFolhas(renderer);
            boolean temTotalDeFolhas = escreveTotalDeFolhas(documento, folhas);

            Element espaco = elementoPorId(documento, ID_ESPACO_RODAPE);
            Element rodape = elementoPorId(documento, ID_RODAPE);
            int altura = alturaDoEspacoAteORodape(renderer, espaco, rodape);
            if (altura > 0) {
                float pixels = altura / (float) renderer.getSharedContext().getDotsPerPixel();
                // Preserva um estilo inline que um template próprio tenha dado ao espaçador
                String estilo = espaco.getAttribute("style");
                espaco.setAttribute("style", (estilo.isEmpty() ? "" : estilo + ";")
                        + "height:" + String.format(Locale.ROOT, "%.2f", pixels) + "px");
                byte[] ajustado = novaDiagramacao(documento, folhas, rodape, folhaDoElemento(renderer, rodape));
                if (ajustado != null) {
                    renderer.getPdfDocument().close(); // close() do renderer não fecha o PDDocument que não foi gravado
                    return ajustado;
                }
                // Algum arredondamento empurrou o bloco para outra folha: volta o espaçador ao original
                espaco.setAttribute("style", estilo);
            }
            if (temTotalDeFolhas) {
                byte[] comTotal = novaDiagramacao(documento, folhas, null, -1);
                if (comTotal != null) {
                    renderer.getPdfDocument().close();
                    return comTotal;
                }
            }
            renderer.createPDF();
            return saida.toByteArray();
        } catch (IOException | RuntimeException e) {
            // RuntimeException também: getRootBox()/getElementBoxes() são API interna do openhtmltopdf
            throw new DacteException("Erro ao gerar PDF do DACTE (" + e.getClass().getSimpleName() + ")", e);
        }
    }

    /**
     * Diagrama de novo o documento alterado e devolve o PDF, ou null se o resultado mudou o que a primeira
     * diagramação mediu: o total de folhas ou, com o rodapé informado, a folha em que ele termina.
     */
    private static byte[] novaDiagramacao(Document documento, int folhas, Element rodape, int folhaDoRodape) throws IOException {
        try (ByteArrayOutputStream saida = new ByteArrayOutputStream();
             PdfBoxRenderer renderer = novoRenderer(null, documento, saida)) {
            renderer.layout();
            if (totalFolhas(renderer) != folhas || (rodape != null && folhaDoElemento(renderer, rodape) != folhaDoRodape)) {
                renderer.getPdfDocument().close();
                return null;
            }
            renderer.createPDF();
            return saida.toByteArray();
        }
    }

    /** Escreve o total de folhas nos elementos de classe {@value #CLASSE_TOTAL_FOLHAS}; false se não há nenhum. */
    private static boolean escreveTotalDeFolhas(Document documento, int folhas) {
        boolean encontrou = false;
        NodeList elementos = documento.getElementsByTagName("*");
        for (int i = 0; i < elementos.getLength(); i++) {
            Element elemento = (Element) elementos.item(i);
            if (Arrays.asList(elemento.getAttribute("class").trim().split("\\s+")).contains(CLASSE_TOTAL_FOLHAS)) {
                elemento.setTextContent(String.valueOf(folhas));
                encontrou = true;
            }
        }
        return encontrou;
    }

    private static PdfBoxRenderer novoRenderer(String html, Document documento, ByteArrayOutputStream saida) {
        PdfRendererBuilder builder = new PdfRendererBuilder();
        builder.useFastMode();
        if (documento != null) {
            builder.withW3cDocument(documento, null);
        } else {
            builder.withHtmlContent(html, null);
        }
        builder.toStream(saida);
        return builder.buildPdfRenderer();
    }

    /**
     * Altura que o espaçador precisa ter para o bloco do rodapé terminar no fim da área útil da folha em que ele
     * caiu (menos a folga), em unidades de layout do openhtmltopdf. 0 quando não há o que ajustar: marcadores
     * ausentes, bloco maior que a folha ou ganho menor que a folga.
     */
    private static int alturaDoEspacoAteORodape(PdfBoxRenderer renderer, Element espaco, Element rodape) {
        if (espaco == null || rodape == null) {
            return 0;
        }
        BlockBox raiz = renderer.getRootBox();
        Box caixaEspaco = caixaDoElemento(raiz, espaco);
        Box caixaBloco = caixaDoElemento(raiz, rodape);
        if (caixaEspaco == null || caixaBloco == null) {
            return 0;
        }
        PageBox folha = folhaEm(raiz, caixaBloco.getAbsY() + caixaBloco.getHeight() - 1);
        if (folha == null || caixaBloco.getHeight() > folha.getBottom() - folha.getTop()) {
            return 0;
        }
        int folga = Math.round(renderer.getSharedContext().getDPI() / 25.4f * FOLGA_RODAPE_MM);
        int altura = folha.getBottom() - folga - caixaBloco.getHeight() - caixaEspaco.getAbsY();
        return altura - caixaEspaco.getHeight() > folga ? altura : 0;
    }

    /** Índice da folha em que o elemento termina, ou -1 se ele não foi diagramado. */
    private static int folhaDoElemento(PdfBoxRenderer renderer, Element elemento) {
        BlockBox raiz = renderer.getRootBox();
        Box caixa = caixaDoElemento(raiz, elemento);
        if (caixa == null) {
            return -1;
        }
        List<PageBox> folhas = raiz.getLayer().getPages();
        return folhas.indexOf(folhaEm(raiz, caixa.getAbsY() + caixa.getHeight() - 1));
    }

    private static int totalFolhas(PdfBoxRenderer renderer) {
        return renderer.getRootBox().getLayer().getPages().size();
    }

    private static Box caixaDoElemento(BlockBox raiz, Element elemento) {
        List<Box> caixas = raiz.getElementBoxes(elemento);
        return caixas.isEmpty() ? null : caixas.get(0);
    }

    /** Folha cuja área útil contém a coordenada vertical absoluta informada. */
    private static PageBox folhaEm(BlockBox raiz, int y) {
        for (PageBox folha : raiz.getLayer().getPages()) {
            if (y >= folha.getTop() && y < folha.getBottom()) {
                return folha;
            }
        }
        return null;
    }

    /** O DOM do openhtmltopdf não conhece atributos ID (sem DTD), por isso getElementById não serve. */
    private static Element elementoPorId(Document documento, String id) {
        NodeList elementos = documento.getElementsByTagName("*");
        for (int i = 0; i < elementos.getLength(); i++) {
            Element elemento = (Element) elementos.item(i);
            if (id.equals(elemento.getAttribute("id"))) {
                return elemento;
            }
        }
        return null;
    }

    /**
     * Templates próprios (caminho de arquivo terminado em .html, .htm ou .xhtml) são buscados primeiro no disco;
     * os nomes padrão, sem extensão ("dacte", "fragmentos"), só no classpath /dacte/.
     */
    private static TemplateEngine criaTemplateEngine() {
        ClassLoaderTemplateResolver classpath = new ClassLoaderTemplateResolver(ImpressaoDacteUtil.class.getClassLoader());
        classpath.setOrder(2);
        classpath.setCheckExistence(true);
        classpath.setPrefix("dacte/");
        classpath.setSuffix(".html");
        classpath.setTemplateMode(TemplateMode.HTML);
        classpath.setCharacterEncoding(StandardCharsets.UTF_8.name());

        TemplateEngine engine = new TemplateEngine();
        engine.addTemplateResolver(resolverDeArquivo());
        engine.addTemplateResolver(classpath);
        return engine;
    }

    /**
     * Resolver dos templates próprios no disco. Só aceita nomes com extensão de HTML: sem esse filtro, um arquivo ou
     * uma pasta chamada "dacte" ou "fragmentos" no diretório de trabalho da aplicação tomaria o lugar do template
     * padrão (o Thymeleaf testa a existência com File.exists(), verdadeiro também para pasta).
     */
    static FileTemplateResolver resolverDeArquivo() {
        FileTemplateResolver arquivo = new FileTemplateResolver();
        arquivo.setOrder(1);
        arquivo.setResolvablePatterns(new HashSet<>(Arrays.asList(EXTENSOES_TEMPLATE_PROPRIO)));
        arquivo.setCheckExistence(true);
        arquivo.setCacheable(false);
        arquivo.setTemplateMode(TemplateMode.HTML);
        arquivo.setCharacterEncoding(StandardCharsets.UTF_8.name());
        return arquivo;
    }
}
