package br.com.swconsultoria.cte;
/**
 *
 */

import br.com.swconsultoria.certificado.Certificado;
import br.com.swconsultoria.certificado.CertificadoService;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.dom.ConfiguracoesCte;
import br.com.swconsultoria.cte.dom.enuns.AmbienteEnum;
import br.com.swconsultoria.cte.dom.enuns.EstadosEnum;

import java.io.FileNotFoundException;

/**
 * @author Samuel Oliveira
 */
public class TesteConfig {

    public static ConfiguracoesCte iniciaConfiguracoes(EstadosEnum estado, AmbienteEnum ambiente) throws CertificadoException, FileNotFoundException {

        Certificado certificado = CertificadoService.certificadoPfx("d:/teste/certificado.pfx", "123456");

        ConfiguracoesCte config = ConfiguracoesCte.criarConfiguracoes(estado, ambiente,
                certificado, "schemas");

        //Aqui seta a contingencia SVC, somente pode ser habilitada caso esteja ativa no portal.
//        config.setContigenciaSVC(true);
        return config;
    }
}