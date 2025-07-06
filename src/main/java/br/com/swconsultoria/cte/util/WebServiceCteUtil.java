/**
 *
 */
package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import lombok.extern.java.Log;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @author Samuel Oliveira
 */
@Log
public class WebServiceCteUtil {

    private static final Pattern sectionPattern = Pattern.compile("^\\[(.+)]$");

    private WebServiceCteUtil() {}

    /**
     * Obtém um valor de um Mapa que representa uma seção de um arquivo INI,
     * buscando pela {@code targetKey} de forma case-insensitive.
     * Este método também normaliza as chaves lidas do mapa (que vêm do arquivo INI)
     * que contêm "..", substituindo por ".", antes de realizar a comparação case-insensitive.
     *
     * @param sectionMap O Mapa ({@code Map<String, String>}) contendo os pares de chave-valor da seção específica.
     *                   Pode ser nulo ou vazio.
     * @param targetKey  A chave alvo (geralmente esperada em lowercase, vinda de {@code ServicosEnum}, ou "Usar" em PascalCase)
     *                   a ser buscada dentro da seção.
     * @param logger     O logger para registrar informações de depuração (ex: qual chave está sendo comparada).
     * @return O valor da propriedade como String, se uma correspondência case-insensitive for encontrada;
     * {@code null} caso contrário, ou se {@code sectionMap} for nulo/vazio, ou se {@code targetKey} for nula.
     */
    private static String getIniValueIgnoreCase(Map<String, String> sectionMap, String targetKey) {
        if (sectionMap == null || sectionMap.isEmpty() || targetKey == null) {
            return null;
        }
        for (Map.Entry<String, String> entry : sectionMap.entrySet()) {
            String keyFromIni = entry.getKey();
            String normalizedKeyFromIni = keyFromIni.replace("..", ".");
            String normalizedTargetKey = targetKey.replace("..", ".");
            if (normalizedTargetKey.equalsIgnoreCase(normalizedKeyFromIni)) {
                return entry.getValue();
            }
        }
        return null;
    }

    /**
     * Analisa (parse) um arquivo INI a partir de um {@link InputStream} e o carrega em uma estrutura de dados aninhada de Mapas.
     * O método lê o stream linha por linha, identificando seções (ex: {@code [NomeDaSecao]}),
     * pares de chave-valor (ex: {@code chave=valor} ou {@code chave:valor}), e linhas de comentário (iniciadas com ';' ou '#').
     * Espaços em branco ao redor de nomes de seção, chaves e valores são removidos (trim).
     * As seções e chaves são armazenadas preservando o case original do arquivo.
     *
     * @param inputStream O {@link InputStream} do arquivo INI a ser analisado. O stream é fechado ao final do parsing.
     * @return Um {@code Map<String, Map<String, String>>} representando os dados do INI.
     * A chave do mapa externo é o nome da seção. O valor é outro mapa contendo
     * os pares de chave-valor daquela seção.
     * @throws IOException  Se ocorrer um erro de I/O durante a leitura do stream.
     * @throws CteException Se forem encontradas linhas malformadas que não se encaixam no padrão esperado
     *                      de seção ou chave-valor (ex: nome de seção vazio em {@code []}, ou uma chave-valor fora de uma seção).
     */
    private static Map<String, Map<String, String>> parseIniFile(InputStream inputStream) throws IOException, CteException {
        Map<String, Map<String, String>> iniData = new HashMap<>();
        String currentSectionName = null;
        Map<String, String> currentSectionMap = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream, StandardCharsets.UTF_8))) {
            String line;
            while ((line = reader.readLine()) != null) {
                line = line.trim();

                if (line.isEmpty() || line.startsWith(";") || line.startsWith("#")) {
                    continue;
                }

                Matcher sectionMatcher = sectionPattern.matcher(line);
                if (sectionMatcher.matches()) {
                    currentSectionName = sectionMatcher.group(1).trim();
                    if (currentSectionName.isEmpty()) {
                        throw new CteException("Nome da seção inválido (vazio) no arquivo INI.");
                    }
                    currentSectionMap = new HashMap<>();
                    iniData.put(currentSectionName, currentSectionMap);
                } else {
                    if (currentSectionName == null) {
                        throw new CteException("Propriedade encontrada fora de uma seção: " + line);
                    }

                    int separatorPos;
                    separatorPos = line.indexOf('=');

                    if (separatorPos != -1) {
                        String key = line.substring(0, separatorPos).trim();
                        String value = line.substring(separatorPos + 1).trim();
                        if (!key.isEmpty()) {
                            currentSectionMap.put(key, value);
                        } else {
                            log.warning("Linha malformada (chave vazia): " + line);
                        }
                    } else {
                        log.warning("Linha malformada ignorada: " + line);
                    }
                }
            }
        }
        return iniData;
    }

    public static String getUrl(ConfiguracoesCte config, ServicosEnum servico) throws CteException {

        InputStream is = null;
        Map<String, Map<String, String>> iniData;

        try {
            if (ObjetoCTeUtil.verifica(config.getArquivoWebService()).isPresent()) {
                File arquivo = new File(config.getArquivoWebService());
                if (!arquivo.exists()) {
                    throw new FileNotFoundException("Arquivo WebService " + config.getArquivoWebService() + " não encontrado");
                }
                is = Files.newInputStream(arquivo.toPath());
                log.info("[ARQUIVO INI CUSTOMIZADO]: " + config.getArquivoWebService());
            } else {
                is = WebServiceCteUtil.class.getResourceAsStream("/WebServicesCte.ini");
                if (is == null) {
                    throw new CteException("Arquivo WebServicesCte.ini não encontrado no classpath.");
                }
            }
            iniData = parseIniFile(is);
        } catch (IOException e) {
            throw new CteException("Erro ao carregar arquivo de configuração WebService: " + e.getMessage(), e);
        } finally {
            if (is != null) {
                try {
                    is.close();
                } catch (IOException e) {
                    log.fine("Erro ao fechar InputStream: " + e.getMessage());
                }
            }
        }

        String sufixoAmbiente = config.getAmbiente().equals(AmbienteEnum.HOMOLOGACAO) ? "H" : "P";
        String initialSecaoKey = "CTe_" + config.getEstado() + "_" + sufixoAmbiente;

        String lookupSectionKey = initialSecaoKey;
        Map<String, String> initialSectionMap = iniData.get(initialSecaoKey);
        String usarValue = getIniValueIgnoreCase(initialSectionMap, "Usar");

        if (!config.getEstado().equals(EstadosEnum.MG) && !config.getEstado().equals(EstadosEnum.MS)
            && !config.getEstado().equals(EstadosEnum.MT) && !config.getEstado().equals(EstadosEnum.SP) && !config.getEstado().equals(EstadosEnum.PR)) {
            lookupSectionKey = usarValue;
        }

        if (servico.equals(ServicosEnum.DISTRIBUICAO_DFE)) {
            lookupSectionKey = "CTe_AN_" + sufixoAmbiente;
        }

        if (!servico.equals(ServicosEnum.QRCODE) && config.isContigenciaSVC()) {
            //Estados x SVC conforme NT2012.003
            // inverte quem usa SVRS no normal vira SVSP no SVC e vice versa + alguns estados.
            if (EstadosEnum.AP.equals(config.getEstado()) || EstadosEnum.PE.equals(config.getEstado())
                || EstadosEnum.RR.equals(config.getEstado()) || EstadosEnum.SP.equals(config.getEstado())
                || EstadosEnum.MT.equals(config.getEstado()) || EstadosEnum.MS.equals(config.getEstado())) {
                //SVC SP
                lookupSectionKey = "CTe_SVRS_" + sufixoAmbiente;
            } else {
                //SVC RS
                lookupSectionKey = "CTe_SVC-SP_" + sufixoAmbiente;
            }
        }

        Map<String, String> nationalSectionMap = iniData.get(lookupSectionKey);
        String url = getIniValueIgnoreCase(nationalSectionMap, servico.getServico());

        log.info("[URL]: " + servico + ": " + ObjetoCTeUtil.verifica(url)
                .orElseThrow(() -> new CteException(
                        "WebService de " + servico + " não encontrado para " + config.getEstado().getNome())));

        return url;

    }
}
