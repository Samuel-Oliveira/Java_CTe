/**
 *
 */
package br.com.samuelweb.util;

import java.io.IOException;
import java.io.InputStream;

import org.ini4j.Wini;

import br.com.samuelweb.cte.ConfiguracoesIniciais;
import br.com.samuelweb.exception.EmissorException;

/**
 * @author Samuel Oliveira
 *
 */
public class WebServiceUtil {

    public static String getUrl(String tipo, String servico) throws EmissorException {

        try {
        	
        	
            ConfiguracoesIniciais config = ConfiguracoesIniciais.getInstance();
            String secao = tipo + "_" + config.getEstado() + "_"
                    + (config.getAmbiente().equals(ConstantesCte.AMBIENTE.HOMOLOGACAO) ? "H" : "P");

            InputStream is = WebServiceUtil.class.getResourceAsStream("/WebServices.ini");

            Wini ini = new Wini(is);
            String url = ini.get(secao, "Usar");
            if (url == null) {
                url = secao;
            }
            
            if(tipo.equals(ConstantesMDFe.MDFE)){
            	secao = tipo + "_" + (config.getAmbiente().equals(ConstantesCte.AMBIENTE.HOMOLOGACAO) ? "H" : "P");
            	url = ini.get(secao , servico);
            	System.out.println("Versão MDfe: " + config.getVersao() + " - WebService: " + url);
            	return url;
            }

            if (!config.getEstado().equals(Estados.MG)
                    || !config.getEstado().equals(Estados.MS)
                    || !config.getEstado().equals(Estados.MT)
                    || !config.getEstado().equals(Estados.RS)
                    || !config.getEstado().equals(Estados.SP)
                    || !config.getEstado().equals(Estados.PR)) {
                secao = url;
            }

            if (servico.equals(ConstantesCte.SERVICOS.DISTRIBUICAO_DFE)) {
                url = ini.get("CTe_AN_"+(config.getAmbiente().equals(ConstantesCte.AMBIENTE.HOMOLOGACAO) ? "H" : "P"), servico);
            } else {
                url = ini.get(secao, servico + "_" + config.getVersao());
            }

            System.out.println("Versão Cte: " + config.getVersao() + " - WebService: " + url);
            return url;

        } catch (IOException e) {
            throw new EmissorException(e.getMessage());
        }

    }

}
