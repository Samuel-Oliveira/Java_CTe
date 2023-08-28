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

        return ConfiguracoesCte.criarConfiguracoes(estado, ambiente,
                certificado, "schemas");

    }

}