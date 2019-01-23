package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.certificado.CertificadoService;
import br.com.swconsultoria.certificado.exception.CertificadoException;
import br.com.swconsultoria.cte.dom.ConfiguracoesIniciaisCte;
import br.com.swconsultoria.cte.dom.ConfiguracoesWebCte;
import br.com.swconsultoria.cte.exception.CteException;

/**
 * Classe Responsavel Por Conter metodos de Certificado
 * 
 * @author SaMuK
 * 
 */
public class CertificadoUtil {

    public static ConfiguracoesIniciaisCte iniciaConfiguracoes() throws CteException {

		try {
            CertificadoService.inicializaCertificado(ConfiguracoesIniciaisCte.getInstance().getCertificado(),
					CertificadoUtil.class.getResourceAsStream("/Cacert"));

		} catch (CertificadoException e) {
			throw new CteException(e.getMessage());
		}

        return ConfiguracoesIniciaisCte.getInstance();
	}

	public static ConfiguracoesWebCte iniciaConfiguracoes(ConfiguracoesWebCte config) throws CteException {

		try {
			CertificadoService.inicializaCertificado(config.getCertificado(),
					CertificadoUtil.class.getResourceAsStream("/Cacert"));

		} catch (CertificadoException e) {
			throw new CteException(e.getMessage());
		}

		return config;
	}
}