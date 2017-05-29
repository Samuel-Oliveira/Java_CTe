package br.com.samuelweb.cte.util;

import java.util.List;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.ConfiguracoesIniciaisCte;
import br.com.samuelweb.cte.exception.CteException;

/**
 * Classe Responsavel Por Carregar os Certificados Do Repositorio do Windows
 * 
 * @author SaMuK
 * 
 */
public class CertificadoUtil {

	private ConfiguracoesIniciaisCte configuracoesCte;

	// Construtor
	public CertificadoUtil() throws CteException {
		configuracoesCte = ConfiguracoesIniciaisCte.getInstance();
	}

	public void iniciaConfiguracoes() throws CteException {

		try {

			Certificado certificado = configuracoesCte.getCertificado();
			CertificadoService.inicializaCertificado(certificado, getClass().getResourceAsStream("/Cacert"));

		} catch (CertificadoException e) {
			throw new CteException(e.getMessage());
		}

	}
	
	public static List<Certificado> listaCertificadosWindows() throws CteException {
		try {
			return CertificadoService.listaCertificadosWindows();
		} catch (CertificadoException e) {
			throw new CteException(e);
		}
	}

	public static Certificado certificadoPfx(String caminhoCertificado, String senha) throws CteException {
		try {
			return CertificadoService.certificadoPfx(caminhoCertificado, senha);
		} catch (CertificadoException e) {
			throw new CteException(e);
		}
	}
	
	public static Certificado certificadoA3(String marca, String dll, String senha) throws CteException {
		try {
			return CertificadoService.certificadoA3(marca, dll, senha);
		} catch (CertificadoException e) {
			throw new CteException(e);
		}
	}
}