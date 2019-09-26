/**
 *
 */
package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import org.ini4j.Wini;

import java.io.*;

/**
 * @author Samuel Oliveira
 *
 */
public class WebServiceCteUtil {

    public static String getUrl(ConfiguracoesCte config, ServicosEnum servico) throws CteException {

        try {

            String secao = "CTe_" + config.getEstado() + "_"
                    + (config.getAmbiente().equals(AmbienteEnum.HOMOLOGACAO) ? "H" : "P");

            InputStream is;
            if (ObjetoCTeUtil.verifica(config.getArquivoWebService()).isPresent()) {
                File arquivo = new File(config.getArquivoWebService());
                if (!arquivo.exists())
                    throw new FileNotFoundException("Arquivo WebService" + config.getArquivoWebService() + " não encontrado");
                is = new FileInputStream(arquivo);
            } else {
                is = WebServiceCteUtil.class.getResourceAsStream("/WebServicesCte.ini");
            }

            Wini ini = new Wini();
            ini.getConfig().setLowerCaseOption(true);
            ini.load(is);
            is.close();
            String url = ini.get(secao, "usar");

            if (!config.getEstado().equals(EstadosEnum.MG) || !config.getEstado().equals(EstadosEnum.MS)
                    || !config.getEstado().equals(EstadosEnum.MT) || !config.getEstado().equals(EstadosEnum.SP) || !config.getEstado().equals(EstadosEnum.PR)) {
                secao = url;
            }

            if (servico.equals(ServicosEnum.DISTRIBUICAO_DFE)) {
                secao = "CTe_AN_" + (config.getAmbiente().equals(AmbienteEnum.HOMOLOGACAO) ? "H" : "P");
            }

            url = ini.get(secao, servico.getServico().toLowerCase());

            ObjetoCTeUtil.verifica(url).orElseThrow(() -> new CteException(
                    "WebService de " + servico + " não encontrado para " + config.getEstado().getNome()));

            LoggerUtil.log(WebServiceCteUtil.class, "[URL]: " + servico + ": " + url);

            return url;

        } catch (IOException e) {
            throw new CteException(e.getMessage());
        }
    }
}
