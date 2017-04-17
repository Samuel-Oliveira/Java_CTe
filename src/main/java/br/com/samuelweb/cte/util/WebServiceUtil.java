/**
 * 
 */
package br.com.samuelweb.cte.util;

import java.io.IOException;
import java.io.InputStream;

import org.ini4j.Wini;

import br.com.samuelweb.cte.ConfiguracoesIniciaisCte;
import br.com.samuelweb.cte.exception.CteException;

/**
 * @author Samuel Oliveira
 *
 */
public class WebServiceUtil {

	public static String getUrl(String tipo, String servico) throws CteException {

		try {

			ConfiguracoesIniciaisCte config = ConfiguracoesIniciaisCte.getInstance();
			String secao = tipo + "_" + config.getEstado() + "_"
					+ (config.getAmbiente().equals(ConstantesUtil.AMBIENTE.HOMOLOGACAO) ? "H" : "P");

			InputStream is = WebServiceUtil.class.getResourceAsStream("/WebServices.ini");

			Wini ini = new Wini(is);
			String url = ini.get(secao, "Usar");
			if(url == null){
				url = secao;
			}

			if(!config.getEstado().equals(Estados.MG)
					|| !config.getEstado().equals(Estados.MS)
					|| !config.getEstado().equals(Estados.MT)
					|| !config.getEstado().equals(Estados.RS)
					|| !config.getEstado().equals(Estados.SP)
					|| !config.getEstado().equals(Estados.PR)){
				secao = url;
			}
			
			if(servico.equals(ConstantesUtil.SERVICOS.DISTRIBUICAO_DFE)){
				secao = "CTe_AN_" + (config.getAmbiente().equals(ConstantesUtil.AMBIENTE.HOMOLOGACAO) ? "H" : "P");
				url = ini.get(secao, servico);
			}else{
				url = ini.get(secao, servico + "_" + config.getVersaoCte());
			}

			System.out.println("Versão Cte: "+config.getVersaoCte()+" - WebService: " + url);
			return url;

		} catch (IOException e) {
			throw new CteException(e.getMessage());
		}

	}

}
