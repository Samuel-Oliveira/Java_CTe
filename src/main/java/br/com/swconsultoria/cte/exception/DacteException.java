package br.com.swconsultoria.cte.exception;

/**
 * Exceção (unchecked) da impressão do DACTE: XML inválido, template inexistente ou inválido, falha ao gerar o PDF,
 * ao gravar o arquivo ou ao imprimir. A causa original, quando existe, fica em {@link #getCause()}.
 *
 * @author Samuel Oliveira - samuel@swconsultoria.com.br - www.swconsultoria.com.br
 */
public class DacteException extends RuntimeException {

    public DacteException(String message) {
        super(message);
    }

    public DacteException(String message, Throwable cause) {
        super(message, cause);
    }

    public DacteException(Throwable cause) {
        super(cause);
    }
}
