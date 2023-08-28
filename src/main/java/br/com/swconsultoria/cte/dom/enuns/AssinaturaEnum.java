package br.com.swconsultoria.cte.dom.enuns;

import lombok.Getter;

/**
 * @author Samuel Oliveira - samuk.exe@hotmail.com
 * Data: 02/03/2019 - 19:55
 */
@Getter
public enum AssinaturaEnum {

    CTE("CTe","infCte"),
    CTE_OS ("CTeOS","infCte"),
    EVENTO("eventoCTe","infEvento");

    private final String tipo;
    private final String tag;

    AssinaturaEnum(String tipo,String tag) {
        this.tipo = tipo;
        this.tag = tag;
    }

}
