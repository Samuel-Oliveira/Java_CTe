package br.com.swconsultoria.cte.dom.enuns;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 19:55
 */
public enum AssinaturaEnum {

    CTE("CTe","infCte"),
    CTE_OS ("CTeOS","infCte"),
    INUTILIZACAO("infInut","infInut"),
    EVENTO("eventoCTe","infEvento");

    private final String tipo;
    private final String tag;

    AssinaturaEnum(String tipo,String tag) {
        this.tipo = tipo;
        this.tag = tag;
    }

    public String getTipo() {
        return tipo;
    }
    public String getTag() {
        return tag;
    }
}
