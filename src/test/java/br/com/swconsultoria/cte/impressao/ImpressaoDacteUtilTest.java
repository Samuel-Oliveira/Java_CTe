package br.com.swconsultoria.cte.impressao;

import br.com.swconsultoria.cte.exception.DacteException;
import br.com.swconsultoria.cte.util.XmlCteUtil;
import com.google.zxing.BinaryBitmap;
import com.google.zxing.DecodeHintType;
import com.google.zxing.client.j2se.BufferedImageLuminanceSource;
import com.google.zxing.common.HybridBinarizer;
import com.google.zxing.oned.Code128Reader;
import com.google.zxing.qrcode.QRCodeReader;
import com.openhtmltopdf.util.XRLog;
import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.pdmodel.PDPage;
import org.apache.pdfbox.pdmodel.common.PDRectangle;
import org.apache.pdfbox.text.PDFTextStripper;
import org.apache.pdfbox.text.PDFTextStripperByArea;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.io.TempDir;
import org.thymeleaf.util.PatternSpec;

import javax.imageio.ImageIO;
import java.awt.geom.Rectangle2D;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Base64;
import java.util.EnumMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static org.junit.jupiter.api.Assertions.*;

/**
 * DACTE (Thymeleaf) com os CT-e fictícios de homologação de src/test/resources/dacte:
 * DacteRodoviario.xml (NF-e como documentos originários, os quatro participantes, IBS/CBS e protocolo),
 * DacteNotaFiscalVeiculos.xml (notas fiscais em papel, veículos novos, tomador "outros" e ICMS com redução de base) e
 * DacteOutrosDocumentos.xml (outros documentos, Simples Nacional, CT-e globalizado e só o expedidor).
 * Os casos de quebra de página, complemento, cancelamento e contingência derivam desses XMLs.
 */
class ImpressaoDacteUtilTest {

    private static final float PONTOS_POR_MM = 72f / 25.4f;
    private static final String CHAVE = "52261112345678000195570010000012341000123456";
    private static final String QR_CODE = "https://dfe-portal.svrs.rs.gov.br/cte/qrCode?chCTe=" + CHAVE + "&tpAmb=2";
    private static final String UMA_NFE = "<infNFe>\n                        <chave>52261198765432000198550010000045611000456712</chave>\n                    </infNFe>";

    private static String rodoviario;
    private static String notaFiscal;
    private static String outros;

    @BeforeAll
    static void leXmls() throws IOException {
        // A biblioteca não mexe no log do openhtmltopdf; aqui só para não poluir a saída do build
        for (String logger : XRLog.listRegisteredLoggers()) {
            XRLog.setLevel(logger, Level.WARNING);
        }
        rodoviario = XmlCteUtil.leXml("src/test/resources/dacte/DacteRodoviario.xml");
        notaFiscal = XmlCteUtil.leXml("src/test/resources/dacte/DacteNotaFiscalVeiculos.xml");
        outros = XmlCteUtil.leXml("src/test/resources/dacte/DacteOutrosDocumentos.xml");
    }

    @Test
    void cnpjAlfanumericoSaiComAsLetras() {
        // CNPJ alfanumérico do emitente na tag e dentro da chave (Id e protocolo); o DV não é conferido na impressão
        String alfanumerico = rodoviario.replace("12345678000195", "12ABC345000195");
        assertNotEquals(rodoviario, alfanumerico);

        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(alfanumerico));

        assertTrue(html.contains("12.ABC.345/0001-95"), "CNPJ do emitente com a máscara de CNPJ");
        assertTrue(html.contains("5226 1112 ABC3 4500 0195 5700 1000 0012 3410 0012 3456"), "chave com as letras");
    }

    @Test
    void htmlComIdentificacaoEParticipantes() {
        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario));

        // Emitente e identificação do CT-e
        assertTrue(html.contains("TRANSPORTADORA EXEMPLO LTDA"));
        assertTrue(html.contains("EXEMPLO CARGAS"), "nome fantasia diferente da razão social");
        assertTrue(html.contains("CNPJ/CPF: 12.345.678/0001-95"));
        assertTrue(html.contains("INSCRIÇÃO ESTADUAL: 101234567"));
        assertTrue(html.contains("FONE: (62) 3210-0000"));
        assertTrue(html.contains("RODOVIÁRIO"));
        assertTrue(html.contains(">000.001.234<"), "número do CT-e");
        assertTrue(html.contains("20/11/2026 10:15:30"), "data e hora de emissão");
        assertTrue(html.contains("5226 1112 3456 7800 0195 5700 1000 0012 3410 0012 3456"), "chave em grupos de 4");
        assertEquals("152260000012345 - 20/11/2026 10:16:02", valorDoCampo(html, "PROTOCOLO DE AUTORIZAÇÃO DE USO"));
        assertEquals("6353 - PRESTACAO DE SERVICO DE TRANSPORTE A ESTABELECIMENTO COMERCIAL",
                valorDoCampo(html, "CFOP - NATUREZA DA OPERAÇÃO"));
        assertEquals("NORMAL", valorDoCampo(html, "TIPO DO CT-e"));
        assertEquals("NORMAL", valorDoCampo(html, "TIPO DO SERVIÇO"));
        assertEquals("REMETENTE", valorDoCampo(html, "TOMADOR DO SERVIÇO"));
        assertEquals("NÃO", valorDoCampo(html, "INDICADOR DO CT-e GLOBALIZADO"));
        assertEquals("123456789", valorDoCampo(html, "INSCRIÇÃO SUFRAMA DO DESTINATÁRIO"));
        assertEquals("GOIANIA - GO", valorDoCampo(html, "INÍCIO DA PRESTAÇÃO"));
        assertEquals("SAO PAULO - SP", valorDoCampo(html, "TÉRMINO DA PRESTAÇÃO"));

        // Participantes: nome ao lado do rótulo do quadro
        assertEquals("INDUSTRIA REMETENTE EXEMPLO LTDA", nomeDoParticipante(html, "REMETENTE"));
        assertEquals("COMERCIO DESTINATARIO EXEMPLO LTDA", nomeDoParticipante(html, "DESTINATÁRIO"));
        assertEquals("EXPEDIDOR EXEMPLO LOGISTICA LTDA", nomeDoParticipante(html, "EXPEDIDOR"));
        assertEquals("RECEBEDOR EXEMPLO ARMAZENS LTDA", nomeDoParticipante(html, "RECEBEDOR"));
        assertEquals("INDUSTRIA REMETENTE EXEMPLO LTDA", nomeDoParticipante(html, "TOMADOR DO SERVIÇO"), "toma3 = 0: o remetente");
        assertTrue(html.contains("98.765.432/0001-98") && html.contains("11.222.333/0001-81")
                && html.contains("77.888.999/0001-81") && html.contains("55.666.777/0001-81"), "CNPJ dos quatro participantes");
        assertTrue(html.contains("RUA DO COMERCIO, 45 - LOJA 3, CENTRO"), "endereço do destinatário");
        assertTrue(html.contains("AVENIDA DOS ARMAZENS, 3000, VILA LOGISTICA"), "endereço do recebedor");
        assertTrue(html.contains("RODOVIA BR-153, KM 5 - DOCA 7, ZONA RURAL"), "endereço do expedidor");
        assertTrue(html.contains("(11) 96666-0000"), "fone com 11 dígitos");
        assertTrue(html.contains("02000-000"), "CEP do recebedor");

        assertTrue(html.contains("EMITIDO EM AMBIENTE DE HOMOLOGAÇÃO - SEM VALOR FISCAL"), "tpAmb=2 imprime a marca d'água");
        assertFalse(html.contains("null"), "nenhuma concatenação imprime o literal null");
    }

    @Test
    void htmlComCargaValoresImpostosDocumentosEModal() {
        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario));

        assertEquals("ELETRODOMESTICOS", valorDoCampo(html, "PRODUTO PREDOMINANTE"));
        assertEquals("CAIXAS PALETIZADAS", valorDoCampo(html, "OUTRAS CARACTERÍSTICAS DA CARGA"));
        assertEquals("85.000,00", valorDoCampo(html, "VALOR TOTAL DA CARGA"));
        assertEquals("85.000,00", valorDoCampo(html, "VALOR DA CARGA AVERBADA"));
        assertEquals("1.250,5", valorDoCampo(html, "PESO BRUTO DA NF-E (KG)"));
        assertEquals("1.300", valorDoCampo(html, "PESO BASE DE CÁLCULO (KG)"));
        assertEquals("8,4", valorDoCampo(html, "CUBAGEM AFERIDA (M3)"));
        assertEquals("42", valorDoCampo(html, "CAIXAS (UNIDADE)"));

        // Componentes do valor da prestação e totais
        assertTrue(html.contains(">FRETE PESO<") && html.contains(">1.000,00<"));
        assertTrue(html.contains(">FRETE VALOR<") && html.contains(">300,00<"));
        assertTrue(html.contains(">PEDAGIO<") && html.contains(">GRIS<") && html.contains(">TAXA DE ENTREGA<"));
        assertEquals("1.500,00", valorDoCampo(html, "VALOR TOTAL DO SERVIÇO"));
        assertEquals("1.500,00", valorDoCampo(html, "VALOR A RECEBER"));

        // ICMS
        assertEquals("00 - TRIBUTAÇÃO NORMAL DO ICMS", valorDoCampo(html, "CLASSIFICAÇÃO TRIBUTÁRIA DO SERVIÇO"));
        assertEquals("1.500,00", valorDoCampo(html, "BASE DE CÁLCULO"));
        assertEquals("12,00", valorDoCampo(html, "ALÍQUOTA DO ICMS (%)"));
        assertEquals("180,00", valorDoCampo(html, "VALOR DO ICMS"));
        assertEquals("195,00", valorDoCampo(html, "VALOR TOTAL DOS TRIBUTOS"));

        // IBS e CBS
        assertTrue(html.contains("INFORMAÇÕES DO IBS E DA CBS"));
        assertEquals("000 / 000001", valorDoCampo(html, "CST / CLASSIF. TRIB."));
        assertEquals("0,10", valorDoCampo(html, "ALÍQ. IBS UF (%)"));
        assertEquals("1,50", valorDoCampo(html, "VALOR IBS UF"));
        assertEquals("0,90", valorDoCampo(html, "ALÍQ. CBS (%)"));
        assertEquals("13,50", valorDoCampo(html, "VALOR CBS"));
        assertEquals("1.515,00", valorDoCampo(html, "VALOR TOTAL DO DOCUMENTO"));

        // Documentos originários: modelo, série e número tirados da chave da NF-e
        assertTrue(html.contains("DOCUMENTOS ORIGINÁRIOS (NOTA FISCAL ELETRÔNICA)"));
        for (String chave : new String[]{"52261198765432000198550010000045611000456712",
                "52261198765432000198550010000045621000456728", "52261198765432000198550010000045631000456733"}) {
            assertTrue(html.contains(">" + chave + "<"), chave);
        }
        assertTrue(html.contains(">000004561<") && html.contains(">000004563<"));

        // Modal rodoviário e observações
        assertTrue(html.contains("INFORMAÇÕES ESPECÍFICAS DO MODAL RODOVIÁRIO"));
        assertEquals("12345678", valorDoCampo(html, "RNTRC DA EMPRESA"));
        assertTrue(html.contains("MERCADORIA COM SEGURO DA TRANSPORTADORA. CONFERIR OS LACRES NA ENTREGA."), "compl/xObs");
        assertTrue(html.contains("PEDIDO: PED-2026-0042"), "ObsCont com o xCampo");
        assertTrue(html.contains("REGIME: TERMO DE ACORDO DE REGIME ESPECIAL EXEMPLO 123/2026"), "ObsFisco");
        assertTrue(html.contains(">JAVA_CTE 4.00.15<"), "verProc");
        assertFalse(html.contains("INFORMAÇÕES SOBRE VEÍCULOS NOVOS"));
        assertFalse(html.contains("null"));
    }

    @Test
    void leitorNormalizaTomadorIcmsEDocumentos() {
        DacteDTO dacte = LeitorDacte.ler(new XmlDacte(rodoviario));

        assertEquals(CHAVE, dacte.getChave());
        assertEquals("0", dacte.getToma().get("toma"));
        assertEquals(dacte.getRem().get("xNome"), dacte.getToma().get("xNome"));
        assertEquals("APARECIDA DE GOIANIA", dacte.getRem().get("xMun"), "endereço no mesmo Map do participante");
        assertEquals("ICMS00", dacte.getIcms().get("grupo"));
        assertEquals("1500.00", dacte.getIcms().get("vBC"));
        assertEquals(5, dacte.getComponentes().size());
        assertEquals(4, dacte.getQuantidades().size());
        assertEquals(DacteDTO.DOCUMENTOS_NFE, dacte.getTipoDocumentos());
        Map<String, String> nfe = dacte.getDocumentos().get(0);
        assertEquals("55", nfe.get("mod"));
        assertEquals("001", nfe.get("serie"));
        assertEquals("000004561", nfe.get("nDoc"));
        assertEquals(2, dacte.getDocumentosLinhas().size(), "3 documentos em duas colunas");
        assertNull(dacte.getDocumentosLinhas().get(1).get(1), "a última linha é completada com null");
        assertEquals("12345678", dacte.getRodo().get("RNTRC"));
        assertEquals(QR_CODE, dacte.getSupl().get("qrCodCTe"));
        assertTrue(dacte.isRodoviario());
        assertTrue(dacte.isExibirExpedidorRecebedor());
        assertFalse(dacte.isGlobalizado());

        // ICMS60: os campos do ST retido entram nas mesmas chaves (como no DACTE Jasper)
        String icms60 = rodoviario.replaceAll("(?s)<ICMS00>.*</ICMS00>", "<ICMS60><CST>60</CST><vBCSTRet>1500.00</vBCSTRet>"
                + "<vICMSSTRet>105.00</vICMSSTRet><pICMSSTRet>7.00</pICMSSTRet><vICMSDeson>0.00</vICMSDeson><cBenef>X</cBenef></ICMS60>");
        assertNotEquals(rodoviario, icms60);
        DacteDTO st = LeitorDacte.ler(new XmlDacte(icms60));
        assertEquals("ICMS60", st.getIcms().get("grupo"));
        assertEquals("1500.00", st.getIcms().get("vBC"));
        assertEquals("7.00", st.getIcms().get("pICMS"));
        assertEquals("105.00", st.getIcms().get("vICMS"));
        assertEquals("60 - ICMS COBRADO POR SUBSTITUIÇÃO TRIBUTÁRIA", new FormatadorDacte().classificacaoIcms(st.getIcms()));
    }

    @Test
    void ibsCbsComReducaoImprimeAAliquotaEfetiva() {
        String comRed = rodoviario.replace("<pCBS>0.9000</pCBS>",
                "<pCBS>0.9000</pCBS><gRed><pRedAliq>60.0000</pRedAliq><pAliqEfet>0.3600</pAliqEfet></gRed>");
        assertNotEquals(rodoviario, comRed);

        DacteDTO dacte = LeitorDacte.ler(new XmlDacte(comRed));
        assertEquals("0.3600", dacte.getIbsCbs().get("pCBS"));
        assertEquals("0.9000", dacte.getIbsCbs().get("pCBSVigente"));
        assertEquals("0,36", valorDoCampo(ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(comRed)), "ALÍQ. CBS (%)"));

        String semIbsCbs = rodoviario.replaceAll("(?s)<IBSCBS>.*</IBSCBS>", "").replaceAll("<vTotDFe>[^<]*</vTotDFe>", "");
        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(semIbsCbs));
        assertFalse(html.contains("INFORMAÇÕES DO IBS E DA CBS"), "o quadro só sai com o grupo IBSCBS");
    }

    @Test
    void notasFiscaisEmPapelVeiculosNovosETomadorOutros() {
        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(notaFiscal));

        assertEquals("TOMADOR EXEMPLO SERVICOS LTDA", nomeDoParticipante(html, "TOMADOR DO SERVIÇO"), "toma4");
        assertEquals("OUTROS", valorDoCampo(html, "TOMADOR DO SERVIÇO"));
        assertTrue(html.contains("44.555.666/0001-81") && html.contains("RUA DO TOMADOR, 77 - SALA 12, SETOR CENTRAL"));
        assertEquals("SUBCONTRATAÇÃO", valorDoCampo(html, "TIPO DO SERVIÇO"));
        assertFalse(html.contains(">EXPEDIDOR<"), "sem expedidor nem recebedor a linha dos dois quadros não sai");

        assertEquals("20 - TRIBUTAÇÃO COM BC REDUZIDA DO ICMS", valorDoCampo(html, "CLASSIFICAÇÃO TRIBUTÁRIA DO SERVIÇO"));
        assertEquals("20,00", valorDoCampo(html, "% RED. BC. CALC."), "o Jasper imprimia sempre 0,00");
        assertEquals("230,40", valorDoCampo(html, "VALOR DO ICMS"));

        assertTrue(html.contains("DOCUMENTOS ORIGINÁRIOS (NOTA FISCAL)"));
        assertTrue(html.contains(">8801<") && html.contains(">8802<"), "número da NF (o Jasper imprimia a série)");
        assertTrue(html.contains(">19/11/2026<") && html.contains(">5101<") && html.contains(">160.000,00<"));

        assertTrue(html.contains("INFORMAÇÕES SOBRE VEÍCULOS NOVOS"));
        assertTrue(html.contains(">9BWZZZ377VT004251<") && html.contains(">9BWZZZ377VT004252<"));
        assertTrue(html.contains(">BRANCO<") && html.contains(">PRATA<"));
        assertTrue(html.contains(">001234<") && html.contains(">001235<"), "marca/modelo (o Jasper repetia a cor)");
        assertTrue(html.contains(">1.100,00<"), "frete unitário");
        assertFalse(html.contains("null"));
    }

    @Test
    void outrosDocumentosSimplesNacionalEGlobalizado() {
        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(outros));

        assertTrue(html.contains("DOCUMENTOS ORIGINÁRIOS (OUTROS DOCUMENTOS)"));
        assertTrue(html.contains(">00 - DECLARAÇÃO<") && html.contains(">59 - CF-E SAT<") && html.contains(">99 - OUTROS<"));
        assertTrue(html.contains(">DECLARACAO DE CONTEUDO<") && html.contains(">DC-77<") && html.contains(">530,00<"));
        assertEquals("90 - ICMS SIMPLES NACIONAL", valorDoCampo(html, "CLASSIFICAÇÃO TRIBUTÁRIA DO SERVIÇO"));
        assertEquals("SIM", valorDoCampo(html, "INDICADOR DO CT-e GLOBALIZADO"));
        assertEquals("PROCEDIMENTO EFETUADO CONFORME RESOLUCAO EXEMPLO", valorDoCampo(html, "INFORMAÇÕES DO CT-e GLOBALIZADO"));
        assertEquals("REDESPACHO", valorDoCampo(html, "TIPO DO SERVIÇO"));
        assertEquals("DESTINATÁRIO", valorDoCampo(html, "TOMADOR DO SERVIÇO"));
        assertEquals("CONSUMIDOR FICTICIO DE TESTE", nomeDoParticipante(html, "TOMADOR DO SERVIÇO"));
        assertTrue(html.contains("123.456.789-09"), "CPF do destinatário");
        assertEquals("EXPEDIDOR EXEMPLO LOGISTICA LTDA", nomeDoParticipante(html, "EXPEDIDOR"),
                "expedidor sem recebedor também sai (o Jasper exigia os dois)");
        assertTrue(html.contains("ROTA: ROTA 12 - ZONA SUL") && html.contains("MOTORISTA: MOTORISTA EXEMPLO"));
        assertTrue(html.contains("ICMS RECOLHIDO NO REGIME DO SIMPLES NACIONAL"), "imp/infAdFisco no quadro do fisco");
        assertFalse(html.contains("null"));
    }

    @Test
    void pdfEmUmaFolhaA4ComRodapeNoPe() throws IOException {
        byte[] pdf = ImpressaoDacteUtil.impressaoPdfByte(ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario));

        try (PDDocument documento = PDDocument.load(pdf)) {
            assertEquals(1, documento.getNumberOfPages());
            PDRectangle folha = documento.getPage(0).getMediaBox();
            assertEquals(210f, folha.getWidth() / PONTOS_POR_MM, 0.5f);
            assertEquals(297f, folha.getHeight() / PONTOS_POR_MM, 0.5f);

            // Espaços normalizados: o nome do emitente quebra a linha ao lado do logo
            String texto = new PDFTextStripper().getText(documento).replaceAll("\\s+", " ");
            assertTrue(texto.contains("DACTE"));
            assertTrue(texto.contains("TRANSPORTADORA EXEMPLO LTDA"));
            assertTrue(texto.contains("5226 1112 3456 7800 0195 5700 1000 0012 3410 0012 3456"));
            assertTrue(texto.contains("INDUSTRIA REMETENTE EXEMPLO LTDA"));
            assertTrue(texto.contains("RECEBEDOR EXEMPLO ARMAZENS LTDA"));
            assertTrue(texto.contains("1.500,00"));
            assertTrue(texto.contains("52261198765432000198550010000045611000456712"));
            assertTrue(texto.contains("1/1"), "FL: o total de folhas é escrito na segunda diagramação");
        }
        assertTrue(textoDaFolha(pdf, 0, 0.80f, 1f).contains("RESERVADO AO FISCO"), "rodapé nos últimos 20% da folha");
        assertFalse(textoDaFolha(pdf, 0, 0.25f, 0.75f).contains("RESERVADO AO FISCO"), "rodapé fora do meio da folha");
    }

    @Test
    void muitosDocumentosQuebramAFolhaERepetemOCabecalho() throws IOException {
        StringBuilder muitas = new StringBuilder();
        for (int i = 0; i < 160; i++) {
            muitas.append(UMA_NFE);
        }
        String xml = rodoviario.replace(UMA_NFE, muitas.toString());
        assertNotEquals(rodoviario, xml);

        byte[] pdf = ImpressaoDacteUtil.impressaoPdfByte(ImpressaoDacteUtil.impressaoPadraoCTe(xml));
        int folhas = folhas(pdf);
        assertTrue(folhas >= 2, "lista em mais de uma folha");
        int ultima = folhas - 1;
        String topo = textoDaFolha(pdf, ultima, 0f, 0.2f);
        assertTrue(topo.contains("DACTE") && topo.contains("5226 1112 3456 7800 0195 5700 1000 0012 3410 0012 3456"),
                "cabeçalho repetido na última folha");
        assertTrue(topo.contains(folhas + "/" + folhas), "FL da última folha");
        assertTrue(textoDaFolha(pdf, ultima, 0.15f, 0.3f).contains("DOCUMENTOS ORIGINÁRIOS (NOTA FISCAL ELETRÔNICA)"),
                "título da lista repetido logo abaixo do cabeçalho");
        assertTrue(textoDaFolha(pdf, ultima, 0f, 1f).contains("52261198765432000198550010000045631000456733"), "último documento na última folha");
        assertTrue(textoDaFolha(pdf, ultima, 0.80f, 1f).contains("RESERVADO AO FISCO"), "rodapé no pé da última folha");
        assertFalse(textoDaFolha(pdf, 0, 0f, 1f).contains("RESERVADO AO FISCO"), "o rodapé sai uma vez só");
    }

    @Test
    void codigoDeBarrasEQrCodeDoHtmlSaoLidosDeVolta() throws Exception {
        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario));

        BufferedImage barras = imagem(html, "código de barras");
        // Conjunto C: início + 22 pares de dígitos + verificador (11 módulos cada) + parada (13) = 277 módulos de 3 px
        assertEquals(277 * 3, barras.getWidth());
        assertEquals(CHAVE, new Code128Reader().decode(bitmap(barras)).getText());

        // Imagem gerada, sem perspectiva nem ruído: PURE_BARCODE dispensa a busca dos padrões de localização
        Map<DecodeHintType, Object> pura = new EnumMap<>(DecodeHintType.class);
        pura.put(DecodeHintType.PURE_BARCODE, Boolean.TRUE);
        assertEquals(QR_CODE, new QRCodeReader().decode(bitmap(imagem(html, "QR Code")), pura).getText());
    }

    @Test
    void semProtocoloAChaveVemDoIdEOProtocoloFicaEmBranco() {
        String semProtocolo = rodoviario.replaceAll("(?s)<protCTe.*</protCTe>", "");
        assertNotEquals(rodoviario, semProtocolo);

        DacteDTO dacte = LeitorDacte.ler(new XmlDacte(semProtocolo));
        assertEquals(CHAVE, dacte.getChave(), "sem protCTe a chave vem do infCte/@Id");
        assertTrue(dacte.getProt().isEmpty());

        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(semProtocolo));
        assertEquals("", valorDoCampo(html, "PROTOCOLO DE AUTORIZAÇÃO DE USO"));
        assertTrue(html.contains("5226 1112 3456 7800 0195 5700 1000 0012 3410 0012 3456"));
        assertFalse(html.contains("null"));

        String producaoSemProtocolo = semProtocolo.replace("<tpAmb>2</tpAmb>", "<tpAmb>1</tpAmb>");
        assertEquals("SEM VALOR FISCAL", LeitorDacte.ler(new XmlDacte(producaoSemProtocolo)).getMarcaDagua(), "pré-visualização");
    }

    @Test
    void marcaDagua() {
        String producao = rodoviario.replace("<tpAmb>2</tpAmb>", "<tpAmb>1</tpAmb>");
        assertNull(LeitorDacte.ler(new XmlDacte(producao)).getMarcaDagua(), "produção autorizada sai sem marca");
        assertFalse(ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(producao)).contains("marca-dagua\""));

        String cancelado = producao.replace("<cStat>100</cStat>", "<cStat>101</cStat>");
        assertTrue(ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(cancelado)).contains(">CT-e CANCELADO<"));

        String fsda = producao.replace("<tpEmis>1</tpEmis>", "<tpEmis>5</tpEmis>").replaceAll("(?s)<protCTe.*</protCTe>", "");
        assertEquals("DACTE EM CONTINGÊNCIA - IMPRESSO EM DECORRÊNCIA DE PROBLEMAS TÉCNICOS",
                LeitorDacte.ler(new XmlDacte(fsda)).getMarcaDagua());

        String epec = producao.replace("<tpEmis>1</tpEmis>", "<tpEmis>4</tpEmis>").replaceAll("(?s)<protCTe.*</protCTe>", "");
        assertNull(LeitorDacte.ler(new XmlDacte(epec)).getMarcaDagua(), "EPEC sai antes da autorização, sem a marca de pré-visualização");
    }

    @Test
    void complementoDeValoresImprimeAsChavesComplementadas() throws IOException {
        String complemento = rodoviario.replace("<tpCTe>0</tpCTe>", "<tpCTe>1</tpCTe>")
                .replaceAll("(?s)<infCTeNorm>.*</infCTeNorm>",
                        "<infCteComp><chCTe>52261012345678000195570010000011001000110004</chCTe></infCteComp>");
        assertNotEquals(rodoviario, complemento);

        ImpressaoDacteDTO impressao = ImpressaoDacteUtil.impressaoPadraoCTe(complemento);
        String html = ImpressaoDacteUtil.gerarHtml(impressao);
        assertEquals("COMPLEMENTO", valorDoCampo(html, "TIPO DO CT-e"));
        assertTrue(html.contains("DETALHAMENTO DO CT-e COMPLEMENTADO"));
        assertEquals("5226 1012 3456 7800 0195 5700 1000 0011 0010 0011 0004",
                valorDoCampo(html, "CHAVE DE ACESSO DO CT-e COMPLEMENTADO"));
        assertFalse(html.contains("PRODUTO PREDOMINANTE"), "sem infCTeNorm não há carga");
        assertFalse(html.contains("DOCUMENTOS ORIGINÁRIOS"));
        assertFalse(html.contains("MODAL RODOVIÁRIO"), "o modal fica no infCTeNorm");
        assertFalse(html.contains("null"));
        assertEquals(1, folhas(ImpressaoDacteUtil.impressaoPdfByte(impressao)));
    }

    @Test
    void outroModalNaoImprimeOQuadroDoRodoviario() {
        String aereo = rodoviario.replace("<modal>01</modal>", "<modal>02</modal>");
        assertNotEquals(rodoviario, aereo);

        String html = ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(aereo));
        assertTrue(html.contains(">AÉREO<"));
        assertFalse(html.contains("INFORMAÇÕES ESPECÍFICAS DO MODAL RODOVIÁRIO"));
        assertTrue(html.contains("USO EXCLUSIVO DO EMISSOR DO CT-e"));
    }

    @Test
    void canhotoOpcional() {
        ImpressaoDacteDTO impressao = ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario);
        assertTrue(ImpressaoDacteUtil.gerarHtml(impressao).contains("DECLARO QUE RECEBI OS VOLUMES DESTE CONHECIMENTO"));

        impressao.setExibirCanhoto(false);
        assertFalse(ImpressaoDacteUtil.gerarHtml(impressao).contains("DECLARO QUE RECEBI OS VOLUMES DESTE CONHECIMENTO"));
    }

    @Test
    void cteOsSoComTemplateProprio(@TempDir Path pasta) throws IOException {
        String cteOs = "<cteOSProc xmlns=\"http://www.portalfiscal.inf.br/cte\" versao=\"4.00\"><CTeOS versao=\"4.00\">"
                + "<infCte versao=\"4.00\" Id=\"CTe52261112345678000195670010000000011000000019\"><ide><mod>67</mod>"
                + "<nCT>1</nCT></ide></infCte></CTeOS></cteOSProc>";

        DacteException erro = assertThrows(DacteException.class,
                () -> ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(cteOs)));
        assertTrue(erro.getMessage().contains("modelo 57"), erro.getMessage());

        Path template = pasta.resolve("meu-dacte-os.html");
        Files.write(template, ("<html xmlns:th=\"http://www.thymeleaf.org\"><body>"
                + "<p th:text=\"'Modelo ' + ${xml.valor('//ide/mod')} + ' chave ' + ${dacte.chave}\">x</p></body></html>")
                .getBytes(StandardCharsets.UTF_8));
        ImpressaoDacteDTO impressao = ImpressaoDacteUtil.impressaoPadraoCTe(cteOs);
        impressao.setTemplate(template.toString());

        assertTrue(ImpressaoDacteUtil.gerarHtml(impressao).contains("Modelo 67 chave 52261112345678000195670010000000011000000019"));
    }

    @Test
    void nomesPadraoNaoSaoProcuradosNoDisco() {
        // Uma pasta "dacte" ou "fragmentos" no diretório de trabalho da aplicação não pode tomar o lugar do template padrão
        PatternSpec arquivo = ImpressaoDacteUtil.resolverDeArquivo().getResolvablePatternSpec();
        assertFalse(arquivo.matches(ImpressaoDacteUtil.TEMPLATE_PADRAO));
        assertFalse(arquivo.matches("fragmentos"));
        assertTrue(arquivo.matches("d:/templates/meu-dacte.html"));
        assertTrue(arquivo.matches("templates\\meu-dacte.xhtml"));
        assertTrue(arquivo.matches("meu-dacte.htm"));
    }

    @Test
    void xmlComBomEhAceito() {
        assertDoesNotThrow(() -> ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe("\uFEFF" + rodoviario)));
    }

    @Test
    void errosViramDacteException() {
        assertThrows(DacteException.class, () -> ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(null)));
        assertThrows(DacteException.class, () -> ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe("<cteProc>")));
        assertThrows(DacteException.class, () -> ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe("<cteProc/>")));
        assertThrows(DacteException.class, () -> ImpressaoDacteUtil.gerarHtml(ImpressaoDacteUtil.impressaoPadraoCTe(
                "<!DOCTYPE x [<!ENTITY e SYSTEM \"file:///c:/windows/win.ini\">]><cteProc>&e;</cteProc>")), "DOCTYPE recusado (XXE)");

        ImpressaoDacteDTO impressao = ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario);
        impressao.setTemplate("d:/nao/existe/dacte.html");
        DacteException erro = assertThrows(DacteException.class, () -> ImpressaoDacteUtil.gerarHtml(impressao));
        assertTrue(erro.getMessage().startsWith("Erro ao processar o template"));

        // Caminho inválido (InvalidPathException no Windows, NoSuchFileException nos demais): sempre DacteException
        ImpressaoDacteDTO valida = ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario);
        assertThrows(DacteException.class, () -> ImpressaoDacteUtil.impressaoHtml(valida, "nao/existe/da|cte\0.html"));
        assertThrows(DacteException.class, () -> ImpressaoDacteUtil.impressaoPdfArquivo(valida, "nao/existe/da|cte\0.pdf"));
        assertThrows(DacteException.class, () -> ImpressaoDacteUtil.impressaoDireta(valida, null));
    }

    @Test
    void arquivosHtmlEPdf(@TempDir Path pasta) throws IOException {
        ImpressaoDacteDTO impressao = ImpressaoDacteUtil.impressaoPadraoCTe(outros);
        Path html = pasta.resolve("dacte.html");
        Path pdf = pasta.resolve("dacte.pdf");

        ImpressaoDacteUtil.impressaoHtml(impressao, html.toString());
        ImpressaoDacteUtil.impressaoPdfArquivo(impressao, pdf.toString());

        assertTrue(new String(Files.readAllBytes(html), StandardCharsets.UTF_8).contains("CONSUMIDOR FICTICIO DE TESTE"));
        assertEquals(1, folhas(Files.readAllBytes(pdf)));
    }

    @Test
    void logo() {
        ImpressaoDacteDTO impressao = ImpressaoDacteUtil.impressaoPadraoCTe(rodoviario);
        assertNotNull(impressao.getLogo(), "logo padrão /img/cte.png");
        assertTrue(ImpressaoDacteUtil.gerarHtml(impressao).contains("class=\"logo\""));

        impressao.removerLogo();
        assertNull(impressao.getLogo());
        assertFalse(ImpressaoDacteUtil.gerarHtml(impressao).contains("class=\"logo\""), "sem logo o template não gera o bloco");

        impressao.setLogoArquivo("src/main/resources/img/cte.png");
        assertNotNull(impressao.getLogo());

        impressao.setLogoArquivo(null);
        assertNull(impressao.getLogo());

        assertThrows(DacteException.class, () -> impressao.setLogoArquivo("d:/nao/existe/logo.png"));
    }

    /** Valor impresso logo abaixo do rótulo de um campo do fragmento "campo" (rótulo + valor), ou null se o rótulo não existe. */
    private static String valorDoCampo(String html, String rotulo) {
        Matcher m = Pattern.compile(Pattern.quote(rotulo) + "</div>\\s*<div class=\"val[^\"]*\">([^<]*)</div>").matcher(html);
        return m.find() ? m.group(1) : null;
    }

    /** Nome impresso ao lado do rótulo de um quadro de participante (ou do tomador), ou null se o quadro não existe. */
    private static String nomeDoParticipante(String html, String rotulo) {
        Matcher m = Pattern.compile(">" + Pattern.quote(rotulo) + "</td>\\s*<td class=\"v forte\"[^>]*>([^<]*)</td>").matcher(html);
        return m.find() ? m.group(1) : null;
    }

    /** Imagem (data URI) de um img do HTML pelo texto do alt. */
    private static BufferedImage imagem(String html, String alt) throws IOException {
        Matcher m = Pattern.compile("<img src=\"data:image/png;base64,([^\"]+)\" alt=\"" + Pattern.quote(alt) + "\"").matcher(html);
        assertTrue(m.find(), "imagem " + alt);
        return ImageIO.read(new ByteArrayInputStream(Base64.getDecoder().decode(m.group(1))));
    }

    private static BinaryBitmap bitmap(BufferedImage imagem) {
        return new BinaryBitmap(new HybridBinarizer(new BufferedImageLuminanceSource(imagem)));
    }

    private static int folhas(byte[] pdf) throws IOException {
        try (PDDocument documento = PDDocument.load(pdf)) {
            return documento.getNumberOfPages();
        }
    }

    /** Texto da faixa horizontal da folha (índice a partir de 0) entre as duas frações da altura (0 = topo, 1 = pé). */
    private static String textoDaFolha(byte[] pdf, int indice, float de, float ate) throws IOException {
        try (PDDocument documento = PDDocument.load(pdf)) {
            PDPage pagina = documento.getPage(indice);
            PDRectangle folha = pagina.getMediaBox();
            PDFTextStripperByArea stripper = new PDFTextStripperByArea();
            stripper.addRegion("faixa", new Rectangle2D.Float(0, folha.getHeight() * de,
                    folha.getWidth(), folha.getHeight() * (ate - de)));
            stripper.extractRegions(pagina);
            return stripper.getTextForRegion("faixa");
        }
    }
}
