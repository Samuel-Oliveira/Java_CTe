package br.com.samuelweb.cte.util;

import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.dom.ConfiguracoesIniciais;
import br.com.samuelweb.cte.exception.CteException;

/**
 * Classe Responsavel Por Conter metodos de Certificado
 * 
 * @author SaMuK
 * 
 */
public class CertificadoUtil {

	public static void iniciaConfiguracoes() throws CteException {

		try {
			CertificadoService.inicializaCertificado(ConfiguracoesIniciais.getInstance().getCertificado(),CertificadoUtil.class.getResourceAsStream("/Cacert"));

		} catch (CertificadoException e) {
			throw new CteException(e.getMessage());
		}
	}
}