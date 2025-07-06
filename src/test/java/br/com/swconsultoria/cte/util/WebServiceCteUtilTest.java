package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class WebServiceCteUtilTest {

    private static final String TEMP_WS_FILE = "temp_WebServicesCte.ini";

    @BeforeAll
    static void setup() throws IOException {
        // Cria uma cópia temporária do arquivo INI para testes
        try (InputStream is = WebServiceCteUtil.class.getResourceAsStream("/WebServicesCte.ini")) {
            assertNotNull(is);
            Files.copy(is, Paths.get(TEMP_WS_FILE), StandardCopyOption.REPLACE_EXISTING);
        }
    }

    @AfterAll
    static void cleanup() throws IOException {
        // Remove o arquivo temporário após os testes
        Files.deleteIfExists(Paths.get(TEMP_WS_FILE));
    }

    private static Stream<Object[]> provideStateAndServiceCombinations() {
        return Stream.of(
                EstadosEnum.values()
        ).flatMap(estado ->
                Stream.of(ServicosEnum.values())
                        .filter(servico -> servico != ServicosEnum.EVENTO && !servico.getServico().isEmpty())
                        .flatMap(servico ->
                                Stream.of(AmbienteEnum.values())
                                        .map(ambiente -> new Object[]{estado, servico, ambiente})
                        )
        );
    }

    @Test
    void testGetUrlWithCustomFile() throws CteException {
        ConfiguracoesCte config = new ConfiguracoesCte();
        config.setEstado(EstadosEnum.SP);
        config.setAmbiente(AmbienteEnum.PRODUCAO);
        config.setArquivoWebService(TEMP_WS_FILE);

        String url = WebServiceCteUtil.getUrl(config, ServicosEnum.STATUS_SERVICO);
        assertNotNull(url);
    }

    @Test
    void testGetUrlWithFileNotFound() {
        ConfiguracoesCte config = new ConfiguracoesCte();
        config.setEstado(EstadosEnum.SP);
        config.setAmbiente(AmbienteEnum.PRODUCAO);
        config.setArquivoWebService("nonexistent_file.ini");

        assertThrows(CteException.class, () -> WebServiceCteUtil.getUrl(config, ServicosEnum.STATUS_SERVICO));
    }

    @ParameterizedTest
    @MethodSource("provideStateAndServiceCombinations")
    void testGetUrlForStateServiceCombinations(EstadosEnum estado, ServicosEnum servico, AmbienteEnum ambienteEnum) throws CteException {
        ConfiguracoesCte config = new ConfiguracoesCte();
        config.setEstado(estado);
        config.setAmbiente(ambienteEnum);

        String url = WebServiceCteUtil.getUrl(config, servico);
        assertNotNull(url);
        assertTrue(url.startsWith("http"));
    }

    @Test
    void testGetUrlForDistribuicaoDFe() throws CteException {
        ConfiguracoesCte config = new ConfiguracoesCte();
        config.setEstado(EstadosEnum.SP); // Qualquer estado serve para AN
        config.setAmbiente(AmbienteEnum.PRODUCAO);
        config.setArquivoWebService(TEMP_WS_FILE);

        String url = WebServiceCteUtil.getUrl(config, ServicosEnum.DISTRIBUICAO_DFE);
        assertNotNull(url);
        assertTrue(url.startsWith("https://www1.cte.fazenda.gov.br/CTeDistribuicaoDFe/CTeDistribuicaoDFe.asmx"));
    }

    @Test
    void testGetUrlForContingenciaSVC() throws CteException {
        ConfiguracoesCte config = new ConfiguracoesCte();
        config.setEstado(EstadosEnum.SP);
        config.setAmbiente(AmbienteEnum.PRODUCAO);
        config.setArquivoWebService(TEMP_WS_FILE);
        config.setContigenciaSVC(true);

        // SP no SVC deve usar SVRS
        String url = WebServiceCteUtil.getUrl(config, ServicosEnum.STATUS_SERVICO);
        assertNotNull(url);
        assertTrue(url.contains("svrs.rs.gov.br"));
    }

    @Test
    void testGetUrlForContingenciaSVC_OtherStates() throws CteException {
        ConfiguracoesCte config = new ConfiguracoesCte();
        config.setEstado(EstadosEnum.RJ); // Estado que não é SP, AP, PE, RR, MT ou MS
        config.setAmbiente(AmbienteEnum.PRODUCAO);
        config.setArquivoWebService(TEMP_WS_FILE);
        config.setContigenciaSVC(true);

        // RJ no SVC deve usar SVC-SP
        String url = WebServiceCteUtil.getUrl(config, ServicosEnum.STATUS_SERVICO);
        assertNotNull(url);
        assertTrue(url.contains("nfe.fazenda.sp.gov.br"));
    }
}