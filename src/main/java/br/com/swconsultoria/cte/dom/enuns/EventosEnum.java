package br.com.swconsultoria.cte.dom.enuns;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 22:31
 */
public enum EventosEnum {

    CANCELAMENTO("110111"),
    CCE("110110"),
    EPEC("110140");

    private final String codigo;

    EventosEnum(String codigo) {
        this.codigo = codigo;
    }

    public String getCodigo() {
        return codigo;
    }
}
