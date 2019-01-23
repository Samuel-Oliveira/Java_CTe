/**
 * 
 */
package br.com.swconsultoria.cte.dom;

import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.util.ConstantesCte;
import br.com.swconsultoria.cte.util.Estados;
import br.com.swconsultoria.cte.util.ProxyUtil;

import java.lang.reflect.Field;
import java.nio.charset.Charset;

/**
 * @author Samuel Oliveira
 *
 *         Inicia Configurações Cte.
 */
public final class ConfiguracoesIniciaisCte implements ConfiguracoesCte {

    private static ConfiguracoesIniciaisCte instance;

	private Estados estado;
	private String ambiente;
	private Certificado certificado;
	private String pastaSchemas;
	private ProxyUtil proxyUtil;
	private boolean contigenciaSCAN;
	private boolean log = true;

	// Construtor Singleton
    private ConfiguracoesIniciaisCte() {
	}

	// Construtor Privado
    private ConfiguracoesIniciaisCte(Estados estado, String ambiente, Certificado certificado, String pastaSchemas) {

        instance = new ConfiguracoesIniciaisCte();
		instance.setEstado(estado);
		instance.setAmbiente(ambiente);
		instance.setCertificado(certificado);
		instance.setPastaSchemas(pastaSchemas);

	}

    public static ConfiguracoesIniciaisCte iniciaConfiguracoes(Estados estado, String ambiente, Certificado certificado,
                                                               String pastaSchemas) throws CertificadoException {
        new ConfiguracoesIniciaisCte(estado, ambiente, certificado, pastaSchemas);

        //Setando Encoding.
        try {
            System.setProperty("file.encoding", "UTF-8");
            Field charset = Charset.class.getDeclaredField("defaultCharset");
            charset.setAccessible(true);
            charset.set(null, null);
        } catch (Exception e) {
            e.printStackTrace();
        }

		if (instance.log) {
            System.out.println("Api Java Cte Versão 3.00.4 - Samuel Olivera - samuel@swconsultoria.com.br");
			System.out.println("Certificado: " + certificado.getTipo().toUpperCase() + " - "
					+ certificado.getNome().toUpperCase() + " - Vencimento: " + certificado.getVencimento());
			System.out.println("Ambiente: " + (ambiente.equals("1") ? "Produção" : "Homologação") + " - Estado: "
                    + estado.getNome() + " - Versão: " + ConstantesCte.VERSAO.CTE);
        }

        if (!certificado.isValido()) {
            throw new CertificadoException("Certificado Vencido");
        }
		return instance;
	}

    public static ConfiguracoesIniciaisCte getInstance() throws CteException {
		if (instance == null) {
			throw new CteException("Configurações Não Foram Inicializadas.");
		}

		return instance;
	}

	public void setProxy(String ip, int porta, String usuario, String senha) {
		proxyUtil = new ProxyUtil(ip, porta, usuario, senha);
	}

	/**
	 * @return the pastaSchemas
	 */
	public String getPastaSchemas() {
		return pastaSchemas;
	}

	/**
	 * @param pastaSchemas
	 *            the pastaSchemas to set
	 */
	public void setPastaSchemas(String pastaSchemas) {
		this.pastaSchemas = pastaSchemas;
	}

	/**
	 * @return the ambiente
	 */
	public String getAmbiente() {
		return ambiente;
	}

	/**
	 * @param ambiente
	 *            the ambiente to set
	 */
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	/**
	 * @return the certificado
	 */
	public Certificado getCertificado() {
		return certificado;
	}

	/**
	 * @param certificado
	 *            the certificado to set
	 */
	public void setCertificado(Certificado certificado) {
		this.certificado = certificado;
	}

	/**
	 * 
	 * @return configuracao do proxy
	 */
	public ProxyUtil getProxy() {
		return proxyUtil;
	}

	/**
	 * @return the contigencia
	 */
	public boolean isContigenciaSCAN() {
		return contigenciaSCAN;
	}

	/**
	 * @param contigencia
	 *            the contigencia to set
	 */
	public void setContigenciaSCAN(boolean contigenciaSCAN) {
		this.contigenciaSCAN = contigenciaSCAN;
	}

	/**
	 * @return the estado
	 */
	public Estados getEstado() {
		return estado;
	}

	/**
	 * @param estado
	 *            the estado to set
	 */
	public void setEstado(Estados estado) {
		this.estado = estado;
	}

	public boolean isLog() {
		return log;
	}

	public void setLog(boolean log) {
		this.log = log;
	}

}
