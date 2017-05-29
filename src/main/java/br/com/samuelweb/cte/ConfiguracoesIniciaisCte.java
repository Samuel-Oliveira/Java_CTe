/**
 * 
 */
package br.com.samuelweb.cte;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.cte.exception.CteException;
import br.com.samuelweb.cte.util.Estados;
import br.com.samuelweb.cte.util.ProxyUtil;

/**
 * @author Samuel Oliveira
 *
 * Inicia Configurações Cte. 
 */
public final class ConfiguracoesIniciaisCte {
	
	private static ConfiguracoesIniciaisCte instance;
	
	private Estados estado;
	private String ambiente;
	private Certificado certificado;
	private String pastaSchemas;
	private String versaoCte;
	private ProxyUtil proxyUtil; 
	private boolean contigenciaSCAN;
	
	//Construtor Singleton
	private ConfiguracoesIniciaisCte(){}
	
	//Construtor Privado
	private ConfiguracoesIniciaisCte(Estados estado,String ambiente, Certificado certificado, String pastaSchemas, String versaoCte){
		
		instance = new ConfiguracoesIniciaisCte();
		instance.setEstado(estado);
		instance.setAmbiente(ambiente);
		instance.setCertificado(certificado);
		instance.setPastaSchemas(pastaSchemas);
		instance.setVersaoCte(versaoCte);
		
	}
	
	public static ConfiguracoesIniciaisCte iniciaConfiguracoes(Estados estado,String ambiente, Certificado certificado, String pastaSchemas, String versaoCte){
		new ConfiguracoesIniciaisCte(estado,ambiente,certificado,pastaSchemas,versaoCte);
		System.out.println("Certificado: "+certificado.getNome() +" - Vencimento: " + certificado.getVencimento());
		System.out.println("Ambiente: "+ (ambiente == "1" ? "Produção" : "Homologação") + " - Estado: "+estado.getNome() + " - Versão: "+versaoCte);
		return instance;
	}
	
	public static ConfiguracoesIniciaisCte getInstance() throws CteException{
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
	public String getVersaoCte() {
		return versaoCte;
	}

	/**
	 * @param versaoCte the versaoCte to set
	 */
	public void setVersaoCte(String versaoCte) {
		this.versaoCte = versaoCte;
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

}
