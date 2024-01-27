/**
 *
 */
package br.com.swconsultoria.cte.dom;

import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.util.ObjetoCTeUtil;

import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.charset.Charset;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * @author Samuel Oliveira
 *
 * Responsável por iniciar as configurações das operações CT-e.
 *
 * Para iniciar as configurações chame o método estático iniciaConfiguracoes:<br>
 * {@code
 * ConfiguracoesIniciaisCte.iniciaConfiguracoes(estado, ambiente, certificado, schemas);
 * }
 *
 * @see ConfiguracoesCte
 * @see ConfiguracoesCte
 */
public class ConfiguracoesCte {

    private EstadosEnum estado;
    private AmbienteEnum ambiente;
    private Certificado certificado;
    private String pastaSchemas;
    private Integer timeout;
    private boolean validacaoDocumento = true;
    private String arquivoWebService;
    private InputStream cacert;
    private boolean contigenciaSVC;

    /**
     * Este método recebe como parâmetro os dados necessários para iniciar a 
     * comunicação de operações dos eventos da CT-e. Retorna uma instância dela
     * mesma.
     * @param estado enumeration Estados, UF do emitente.
     * @param ambiente Enumeration AmbienteEnum
     * @param certificado objeto Certificado
     * @param pastaSchemas local dos arquivo de schemas da CT-e.
     * @return ConfiguracoesIniciaisCte
     * @see Certificado
     * @see EstadosEnum
     */
    public static ConfiguracoesCte criarConfiguracoes(EstadosEnum estado, AmbienteEnum ambiente, Certificado certificado,
                                                      String pastaSchemas) throws CertificadoException {

        ObjetoCTeUtil.verifica(estado).orElseThrow( () -> new IllegalArgumentException("Estado não pode ser Nulo."));
        ObjetoCTeUtil.verifica(ambiente).orElseThrow( () -> new IllegalArgumentException("Ambiente não pode ser Nulo."));
        ObjetoCTeUtil.verifica(certificado).orElseThrow( () -> new IllegalArgumentException("Certificado não pode ser Nulo."));

        ConfiguracoesCte configuracoesCte = new ConfiguracoesCte();
        configuracoesCte.setEstado(estado);
        configuracoesCte.setAmbiente(ambiente);
        configuracoesCte.setCertificado(certificado);
        configuracoesCte.setPastaSchemas(pastaSchemas);

        /**
         * Para as versões Java até 11, Eu ainda seto o Encoding por que é permitido.
         * Para quem trabalha com Java 12+, Aconselhasse setar o Encoding :
         * -Dfile.encoding="UTF-8"
         * -Dsun.jnu.encoding="UTF-8"
         *
         */
        if(Integer.parseInt(System.getProperty("java.class.version").substring(0,2)) < 56){
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

        if (Logger.getLogger("").isLoggable(Level.SEVERE)) {
            System.err.println("####################################################################");
            System.err.println("              Api Java Cte - Versão 4.00.4 - 27/01/2024         ");
            if (Logger.getLogger("").isLoggable(Level.WARNING)) {
                System.err.println(" Samuel Olivera - samuel@swconsultoria.com.br ");
            }
            System.err.println(" Pasta Schemas: " + pastaSchemas);
            System.err.println(" Ambiente: " + (ambiente.equals(AmbienteEnum.PRODUCAO) ? "Produção" : "Homologação") + " - Estado: "
                    + estado.getNome());
            System.err.println("####################################################################");
        }
        if (!certificado.isValido()) {
            throw new CertificadoException("Certificado Vencido/Inválido");
        }
        return configuracoesCte;
    }

    /**
     * Retorna o local da pasta dos schemas da CT-e(.xsd)
     * @return pastaSchemas
     */
    public String getPastaSchemas() {
        return pastaSchemas;
    }

    /**Atribui uma string que representa o local da pasta dos schemas da CT-e
     * (.xsd)
     * @param pastaSchemas
     */
    private void setPastaSchemas(String pastaSchemas) {
        this.pastaSchemas = pastaSchemas;
    }

    /**
     * Retorna um enuns que representa o ambiente de operações da CT-e.<br>
     * @return ambiente
     */
    public AmbienteEnum getAmbiente() {
        return ambiente;
    }

    /**
     * Atribui uma String que representa o ambiente de operação da CT-e.<br>
     * Ex.:<br>
     * {@code
     * ConfiguracoesIniciaisCte.iniciaConfiguracoes(
    estado,
    AmbienteEnum.HOMOLOGACAO,
    certificado,
    schemas);
     * }
     * @param ambiente
     * @see ConstantesUtil
     */
    public void setAmbiente(AmbienteEnum ambiente) {
        this.ambiente = ambiente;
    }

    /**
     * Retorna o objeto Certificado.
     * @return certificado
     * @see br.com.swconsultoria.certificado
     */
    public Certificado getCertificado() {
        return certificado;
    }

    /**
     * Atribui um objeto Certificado.
     * @param certificado
     */
    private void setCertificado(Certificado certificado) {
        this.certificado = certificado;
    }

    /**
     * Retorna um valor booleano que representa se as operações de CT-e estão,
     * ou, não operando no modo de Contingência.
     *
     * @return contigenciaSVC
     */
    public boolean isContigenciaSVC() {
        return contigenciaSVC;
    }

    /**
     * Atribui um valor para contigenciaSVC. Caso True, as operações da CT-e
     * funcionarão no modo de Contingência. <br>
     * Usar para situações em que não for possível estabelecer conexão com o
     * WebService SEFAZ Origem.
     *
     * @param contigenciaSVC
     */
    public void setContigenciaSVC(boolean contigenciaSVC) {
        this.contigenciaSVC = contigenciaSVC;
    }

    /**
     * Retorna um objeto Estado que representa o UF do emissor da CT-e.
     * @return estado
     * @see EstadosEnum
     */
    public EstadosEnum getEstado() {
        return estado;
    }

    /**
     * Atribui um valor para o atribuito Estado.
     * @param estado estado
     * @see EstadosEnum
     */
    public void setEstado(EstadosEnum estado) {
        this.estado = estado;
    }

    /**
     * Retorna o valor do atributo timeout.
     * @return timeout
     */
    public Integer getTimeout() {
        return timeout;
    }

    /**
     * Atribui o valor de timeout.<br>
     * O timeout é o limite de tempo(em milisegundos) de comunicação com 
     * WebServie. Sugerido pelo manual do contribuinte: 30000.
     * @param timeout
     */
    public void setTimeout(Integer timeout) {
        this.timeout = timeout;
    }

    /**
     * Retorna o valor da validacaoDocumento.
     * @return validacaoDocumento
     */
    public boolean isValidacaoDocumento() {
        return validacaoDocumento;
    }

    /**
     * Atribui um valor para validacaoDocumento. Caso True, irá
     * validar o documento do emitente com o documento do certificado.
     * <br>
     * @param validacaoDocumento
     */
    public void setValidacaoDocumento(boolean validacaoDocumento) {
        this.validacaoDocumento = validacaoDocumento;
    }

    public String getArquivoWebService() {
        return arquivoWebService;
    }

    public void setArquivoWebService(String arquivoWebService) {
        this.arquivoWebService = arquivoWebService;
    }

    public InputStream getCacert() {
        return cacert;
    }

    public void setCacert(InputStream cacert) {
        this.cacert = cacert;
    }
}
