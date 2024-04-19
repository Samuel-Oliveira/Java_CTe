package br.com.swconsultoria.cte.dom;

import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;
import lombok.Getter;
import lombok.Setter;
import lombok.extern.java.Log;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;

/**
 * @author Samuel Oliveira
 * Responsável por iniciar as configurações das operações CT-e.
 * Para iniciar as configurações chame o método estático iniciaConfiguracoes:<br>
 * {@code
 * ConfiguracoesIniciaisCte.iniciaConfiguracoes(estado, ambiente, certificado, schemas);
 * }
 * @see ConfiguracoesCte
 * @see ConfiguracoesCte
 */
@Getter
@Setter
@Log
@SuppressWarnings("java:S3011")
public class ConfiguracoesCte {

    /**
     * -- GETTER --
     * Retorna um objeto Estado que representa o UF do emissor da CT-e.
     * @return estado
     * <p>
     * -- SETTER --
     * Atribui um valor para o atribuito Estado.
     * @param estado estado
     */
    private EstadosEnum estado;
    /**
     * -- GETTER --
     * Retorna um enuns que representa o ambiente de operações da CT-e.<br>
     * @return ambiente
     * <p>
     * -- SETTER --
     * Atribui uma String que representa o ambiente de operação da CT-e.<br>
     * Ex.:<br>
     * @param ambiente
     */
    private AmbienteEnum ambiente;
    /**
     * -- GETTER --
     * Retorna o objeto Certificado.
     *
     * @return certificado
     * -- SETTER --
     * Atribui um objeto Certificado.
     * @param certificado
     */
    private Certificado certificado;
    /**
     * -- GETTER --
     * Retorna o local da pasta dos schemas da CT-e(.xsd)
     *
     * @return pastaSchemas
     * -- SETTER --
     * Atribui uma string que representa o local da pasta dos schemas da CT-e
     * (.xsd)
     *
      * @param pastaSchemas
     */
    private String pastaSchemas;
    /**
     * -- GETTER --
     * Retorna o valor do atributo timeout.
     * <p>
     * <p>
     * -- SETTER --
     * Atribui o valor de timeout.<br>
     * O timeout é o limite de tempo(em milisegundos) de comunicação com
     * WebServie. Sugerido pelo manual do contribuinte: 30000.
     *
     * @return timeout
     * @param timeout
     */
    private Integer timeout;
    /**
     * -- GETTER --
     * Retorna o valor da validacaoDocumento.
     * <p>
     * <p>
     * -- SETTER --
     * Atribui um valor para validacaoDocumento. Caso True, irá
     * validar o documento do emitente com o documento do certificado.
     * <br>
     *
     * @return validacaoDocumento
     * @param validacaoDocumento
     */
    private boolean validacaoDocumento = true;

    private String arquivoWebService;

    private InputStream cacert;
    /**
     * -- GETTER --
     * Retorna um valor booleano que representa se as operações de CT-e estão,
     * ou, não operando no modo de Contingência.
     * <p>
     * <p>
     * -- SETTER --
     * Atribui um valor para contigenciaSVC. Caso True, as operações da CT-e
     * funcionarão no modo de Contingência. <br>
     * Usar para situações em que não for possível estabelecer conexão com o
     * WebService SEFAZ Origem.
     *
     * @return contigenciaSVC
     * @param contigenciaSVC
     */
    private boolean contigenciaSVC;

    /**
     * Este método recebe como parâmetro os dados necessários para iniciar a
     * comunicação de operações dos eventos da CT-e. Retorna uma instância dela
     * mesma.
     *
     * @param estado       enumeration Estados, UF do emitente.
     * @param ambiente     Enumeration AmbienteEnum
     * @param certificado  objeto Certificado
     * @param pastaSchemas local dos arquivo de schemas da CT-e.
     * @return ConfiguracoesIniciaisCte
     * @see Certificado
     * @see EstadosEnum
     */
    public static ConfiguracoesCte criarConfiguracoes(EstadosEnum estado, AmbienteEnum ambiente, Certificado certificado,
                                                      String pastaSchemas) throws CertificadoException {

        ConfiguracoesCte configuracoesCte = new ConfiguracoesCte();
        configuracoesCte.setEstado(ObjetoCTeUtil.verifica(estado)
                .orElseThrow(() -> new IllegalArgumentException("Estado não pode ser Nulo.")));
        configuracoesCte.setAmbiente(ObjetoCTeUtil.verifica(ambiente)
                .orElseThrow(() -> new IllegalArgumentException("Ambiente não pode ser Nulo.")));
        configuracoesCte.setCertificado(ObjetoCTeUtil.verifica(certificado)
                .orElseThrow(() -> new IllegalArgumentException("Certificado não pode ser Nulo.")));
        configuracoesCte.setPastaSchemas(pastaSchemas);

        /**
         * Para as versões Java até 11, Eu ainda seto o Encoding por que é permitido.
         * Para quem trabalha com Java 12+, Aconselhasse setar o Encoding :
         * -Dfile.encoding="UTF-8"
         * -Dsun.jnu.encoding="UTF-8"
         *
         */
        if (Integer.parseInt(System.getProperty("java.class.version").substring(0, 2)) < 56) {
            try {
                //Setando Encoding.
                System.setProperty("file.encoding", "UTF-8");
                Field charset = Charset.class.getDeclaredField("defaultCharset");
                charset.setAccessible(true);
                charset.set(null, null);
            } catch (NoSuchFieldException | IllegalAccessException e) {
                throw new CertificadoException("Erro ao setar Encoding.");
            }
        }

        log.info(String.format("JAVA-CTE | Samuel Oliveira | samuel@swconsultoria.com.br " +
                        "| VERSAO=%s | DATA_VERSAO=%s | PASTA_SCHEMAS=%s | AMBIENTE=%s | ESTADO=%s",
                "4.00.8",
                "19/04/2024",
                pastaSchemas,
                ambiente,
                estado.getNome().toUpperCase()));

        if (!certificado.isValido()) {
            throw new CertificadoException("Certificado Vencido/Inválido");
        }

        return configuracoesCte;
    }

}
