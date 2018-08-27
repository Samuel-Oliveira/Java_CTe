
package br.com.samuelweb.cte.dom;

/**
 * Enum com os codigo de status da Cte
 *
 * @author Samuel Oliveira
 */
public enum Status {

    AUTORIZADO("100"),
    INUTILIZADO("102"),
    LOTE_RECEBIDO("103"),
    LOTE_PROCESSAMENTO("105"),
    CANCELADO("101"),
    ERRO_XML("215"),
    NAO_CONSTA("217"),
    LOTE_PROCESSADO("104"),
    EVENTO_VINCULADO("135"),
    DOC_LOCALIZADO_PARA_DESTINATARIO("138"),
    NENHUM_DOC_LOCALIZADO_PARA_DESTINATARIO("137"),
    CONSUMO_INDEVIDO("656"),
    DUPLICIDADE_EVENTO("573"),
    FALHA_MODAL("580"),
    FALHA_SCHEMA("225");

    private final String code;

    Status(String descricao) {
        this.code = descricao;
    }

    /**
     * @return the descricao
     */
    public String getCode() {
        return this.code;
    }

}