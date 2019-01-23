/**
 *
 */
package br.com.swconsultoria.cte.dom;

import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.cte.util.Estados;
import br.com.swconsultoria.cte.util.ProxyUtil;

/**
 * @author Samuel Oliveira
 *         <p>
 *         Inicia Configurações Cte.
 */
public interface ConfiguracoesCte {

    /**
     * @return the pastaSchemas
     */
    String getPastaSchemas();

    /**
     * @return the ambiente
     */
    String getAmbiente();

    /**
     * @return the certificado
     */
    Certificado getCertificado();

    /**
     * @return configuracao do proxy
     */
    ProxyUtil getProxy();

    /**
     * @return the contigenciaSCAN
     */
    boolean isContigenciaSCAN();

    /**
     * @return the estado
     */
    Estados getEstado();

    boolean isLog();

}
