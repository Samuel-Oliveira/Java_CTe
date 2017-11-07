/**
 * 
 */
package br.com.samuelweb.cte.dom;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.Estados;
import br.com.samuelweb.cte.util.ProxyUtil;

/**
 * @author Samuel Oliveira
 *
 * Inicia Configurações Cte. 
 */
public final class ConfiguracoesIniciais {
	
	private static ConfiguracoesIniciais instance;
	
	private Estados estado;
	private String ambiente;
	private Certificado certificado;
	private String pastaSchemas;
	private String versao;
	private ProxyUtil proxyUtil; 
	private boolean contigenciaSCAN;
	private boolean log = true;
	
	//Construtor Singleton
	private ConfiguracoesIniciais(){}
	
	//Construtor Privado
	private ConfiguracoesIniciais(Estados estado,String ambiente, Certificado certificado, String pastaSchemas, String versaoCte){
		
		instance = new ConfiguracoesIniciais();
		instance.setEstado(estado);
		instance.setAmbiente(ambiente);
		instance.setCertificado(certificado);
		instance.setPastaSchemas(pastaSchemas);
		instance.setVersao(versaoCte);
		
	}
	
	public static ConfiguracoesIniciais iniciaConfiguracoes(Estados estado,String ambiente, Certificado certificado, String pastaSchemas, String versaoCte){
		new ConfiguracoesIniciais(estado,ambiente,certificado,pastaSchemas,versaoCte);
		if(instance.log) {
			System.out.println("Api Java Cte Versão 3.00.1 - Samuel Olivera - samuk.exe@hotmail.com");
			System.out.println("Certificado: " + certificado.getTipo().toUpperCase() + " - " + certificado.getNome().toUpperCase() + " - Vencimento: " + certificado.getVencimento());
			System.out.println("Ambiente: " + (ambiente.equals("1") ? "Produção" : "Homologação") + " - Estado: " + estado.getNome() + " - Versão: " + versaoCte);
		}
		return instance;
	}
	
	public static ConfiguracoesIniciais getInstance() throws CteException {
		if(instance == null){
			throw new CteException("Configurações Não Foram Inicializadas.");
		}
		
		return instance;
	}
	
	public void setProxy(String ip, int porta, String usuario,String senha){
		proxyUtil = new ProxyUtil(ip, porta, usuario, senha);
	}

	/**
	 * @return the pastaSchemas
	 */
	public String getPastaSchemas() {
		return pastaSchemas;
	}

	/**
	 * @param pastaSchemas the pastaSchemas to set
	 */
	public void setPastaSchemas(String pastaSchemas) {
		this.pastaSchemas = pastaSchemas;
	}

	/**
	 * @return the versaoCte
	 */
	public String getVersao() {
		return versao;
	}

	/**
	 * @param versaoCte the versaoCte to set
	 */
	public void setVersao(String versaoCte) {
		this.versao = versaoCte;
	}

	/**
	 * @return the ambiente
	 */
	public String getAmbiente() {
		return ambiente;
	}

	/**
	 * @param ambiente the ambiente to set
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
	 * @param certificado the certificado to set
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
	 * @param contigencia the contigencia to set
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
	 * @param estado the estado to set
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
