/**
 *
 */
package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;
import br.com.swconsultoria.cte.dom.enuns.ServicosEnum;
import br.com.swconsultoria.cte.exception.CteException;
import lombok.extern.java.Log;
import org.ini4j.Wini;

import java.io.*;
import java.nio.file.Files;

/**
 * @author Samuel Oliveira
 */
@Log
public class WebServiceCteUtil {

    private WebServiceCteUtil() {}

    public static String getUrl(ConfiguracoesCte config, ServicosEnum servico) throws CteException {

        try {

            String sufixoAmbiente = (config.getAmbiente().equals(AmbienteEnum.HOMOLOGACAO) ? "H" : "P");
            String secao = "CTe_" + config.getEstado() + "_" + sufixoAmbiente;

            InputStream is;
            if (ObjetoCTeUtil.verifica(config.getArquivoWebService()).isPresent()) {
                File arquivo = new File(config.getArquivoWebService());
                if (!arquivo.exists())
                    throw new FileNotFoundException("Arquivo WebService" + config.getArquivoWebService() + " não encontrado");
                is = Files.newInputStream(arquivo.toPath());
            } else {
                is = WebServiceCteUtil.class.getResourceAsStream("/WebServicesCte.ini");
            }

            Wini ini = new Wini();
            ini.getConfig().setLowerCaseOption(true);
            ini.load(is);
            is.close();
            String url = ini.get(secao, "usar");

            if (!config.getEstado().equals(EstadosEnum.MG) && !config.getEstado().equals(EstadosEnum.MS)
                    && !config.getEstado().equals(EstadosEnum.MT) && !config.getEstado().equals(EstadosEnum.SP) && !config.getEstado().equals(EstadosEnum.PR)) {
                secao = url;
            }

            if (servico.equals(ServicosEnum.DISTRIBUICAO_DFE)) {
                secao = "CTe_AN_" + sufixoAmbiente;
            }

            if (!servico.equals(ServicosEnum.QRCODE) && config.isContigenciaSVC()) {
                //Estados x SVC conforme NT2012.003
                // inverte quem usa SVRS no normal vira SVSP no SVC e vice versa + alguns estados.
                if (EstadosEnum.AP.equals(config.getEstado()) || EstadosEnum.PE.equals(config.getEstado())
                        || EstadosEnum.RR.equals(config.getEstado()) || EstadosEnum.SP.equals(config.getEstado())
                        || EstadosEnum.MT.equals(config.getEstado()) || EstadosEnum.MS.equals(config.getEstado()) ) {
                    //SVC SP
                    secao = "CTe_SVRS_" + sufixoAmbiente;
                } else {
                    //SVC RS
                    secao = "CTe_SVSP_" + sufixoAmbiente;
                }
            }

            url = ini.get(secao, servico.getServico().toLowerCase());

            ObjetoCTeUtil.verifica(url).orElseThrow(() -> new CteException(
                    "WebService de " + servico + " não encontrado para " + config.getEstado().getNome()));

            log.info("[URL]: " + servico + ": " + url);

            return url;

        } catch (IOException e) {
            throw new CteException(e.getMessage());
        }
    }
}
