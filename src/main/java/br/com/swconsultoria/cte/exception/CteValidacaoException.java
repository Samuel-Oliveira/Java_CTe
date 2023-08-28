package br.com.swconsultoria.cte.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes da validação do COnhecimento de Transporte Eletronico.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
public class CteValidacaoException extends CteException {

    public CteValidacaoException(String message) {
        super(message);
    }

    public CteValidacaoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CteValidacaoException(Throwable cause) {
        super(cause);
    }
}