package br.com.samuelweb.util;

import java.util.List;

import br.com.samuelweb.certificado.Certificado;
import br.com.samuelweb.certificado.CertificadoService;
import br.com.samuelweb.certificado.exception.CertificadoException;
import br.com.samuelweb.cte.ConfiguracoesIniciais;
import br.com.samuelweb.exception.EmissorException;

/**
 * Classe Responsavel Por Carregar os Certificados Do Repositorio do Windows
 * 
 * @author SaMuK
 * 
 */
public class CertificadoUtil {

	private ConfiguracoesIniciais configuracoesCte;

	// Construtor
	public CertificadoUtil() throws EmissorException {
		configuracoesCte = ConfiguracoesIniciais.getInstance();
	}

	public void iniciaConfiguracoes() throws EmissorException {

		try {

			Certificado certificado = configuracoesCte.getCertificado();
			CertificadoService.inicializaCertificado(certificado, getClass().getResourceAsStream("/Cacert"));

		} catch (CertificadoException e) {
			throw new EmissorException(e.getMessage());
		}

	}
	
	public static List<Certificado> listaCertificadosWindows() throws EmissorException {
		try {
			return CertificadoService.listaCertificadosWindows();
		} catch (CertificadoException e) {
			throw new EmissorException(e);
		}
	}

	public static Certificado certificadoPfx(String caminhoCertificado, String senha) throws EmissorException {
		try {
			return CertificadoService.certificadoPfx(caminhoCertificado, senha);
		} catch (CertificadoException e) {
			throw new EmissorException(e);
		}
	}
	
	public static Certificado certificadoA3(String marca, String dll, String senha) throws EmissorException {
		try {
			return CertificadoService.certificadoA3(marca, dll, senha);
		} catch (CertificadoException e) {
			throw new EmissorException(e);
		}
	}
}