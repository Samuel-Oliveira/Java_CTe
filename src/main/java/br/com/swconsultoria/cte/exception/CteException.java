package br.com.swconsultoria.cte.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes do Conhecimento de Transporte Eletronico.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
public class CteException extends Exception {

	private static final long serialVersionUID = -5054900660251852366L;
	
	String message;
	
	public CteException(Throwable e) {
		super(e);
	}

	
	public CteException(String message) {
		this((Throwable) null);
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	
}