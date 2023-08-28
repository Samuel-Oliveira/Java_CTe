package br.com.swconsultoria.cte.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes do Conhecimento de Transporte Eletronico.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
public class CteException extends Exception {

	public CteException(String message) {
		super(message);
	}

	public CteException(String message, Throwable cause) {
		super(message, cause);
	}

	public CteException(Throwable cause) {
		super(cause);
	}
}