/**
 *
 */
package br.com.samuelweb.cte.dom;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.cte.util.Estados;
import br.com.samuelweb.cte.util.ProxyUtil;

/**
 * @author Samuel Oliveira
 *         <p>
 *         Inicia Configurações Nfe.
 */
public interface Configuracoes {

	/**
	 * @return the pastaSchemas
	 */
	public String getPastaSchemas();

	/**
	 * @return the versao
	 */
	public String getVersao();

	/**
	 * @return the ambiente
	 */
	public String getAmbiente();

	/**
	 * @return the certificado
	 */
	public Certificado getCertificado();

	/**
	 * @return configuracao do proxy
	 */
	public ProxyUtil getProxy();

	/**
	 * @return the contigenciaSCAN
	 */
	public boolean isContigenciaSCAN();

	/**
	 * @return the estado
	 */
	public Estados getEstado();

	public boolean isLog();

}
