package br.com.swconsultoria.cte.exception;

/**
 * Exceção a ser lançada na ocorrência de falhas provenientes da validação do COnhecimento de Transporte Eletronico.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
public class CteValidacaoException extends CteException {

    private static final long serialVersionUID = 2224963351733125955L;
    String message;

    /**
     * Construtor da classe.
     *
     * @param e
     */
    public CteValidacaoException(Throwable e) {
        super(e);
    }

    /**
     * Construtor da classe.
     *
     * @param message
     */
    public CteValidacaoException(String message) {
        this((Throwable) null);
        this.message = message;
    }

    /**
     * @return the message
     */
    public String getMessage() {
        return message;
    }

    /**
     * @param message the message to set
     */
    public void setMessage(String message) {
        this.message = message;
    }

}