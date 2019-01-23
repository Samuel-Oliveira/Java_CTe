/**
 *
 */
package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.exception.CteException;
import org.ini4j.Wini;

import java.io.IOException;
import java.io.InputStream;

/**
 * @author Samuel Oliveira
 *
 */
public class WebServiceUtil {

    public static String getUrl(ConfiguracoesCte config, String tipo, String servico) throws CteException {

		try {

			String secao = tipo + "_" + config.getEstado() + "_"
					+ (config.getAmbiente().equals(ConstantesCte.AMBIENTE.HOMOLOGACAO) ? "H" : "P");

			InputStream is = WebServiceUtil.class.getResourceAsStream("/WebServicesCte.ini");

			Wini ini = new Wini(is);
			String url = ini.get(secao, "Usar");
			if (url == null) {
				url = secao;
			}

			if (!config.getEstado().equals(Estados.MG) || !config.getEstado().equals(Estados.MS)
					|| !config.getEstado().equals(Estados.MT) || !config.getEstado().equals(Estados.RS)
					|| !config.getEstado().equals(Estados.SP) || !config.getEstado().equals(Estados.PR)) {
				secao = url;
			}

			if (servico.equals(ConstantesCte.SERVICOS.DISTRIBUICAO_DFE)) {
				url = ini.get("CTe_AN_" + (config.getAmbiente().equals(ConstantesCte.AMBIENTE.HOMOLOGACAO) ? "H" : "P"),
						servico);
			} else {
                url = ini.get(secao, servico + "_" + ConstantesCte.VERSAO.CTE);
			}

            if (config.isLog()) {
                System.out.println("Versão Cte: " + ConstantesCte.VERSAO.CTE + " - WebService: " + url);
            }
			return url;

		} catch (IOException e) {
			throw new CteException(e.getMessage());
		}

	}

}
