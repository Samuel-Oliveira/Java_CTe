package br.com.swconsultoria.cte.dom.enuns;

import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_400.*;
import br.com.swconsultoria.cte.schema_400_eventos.TEvento;
import br.com.swconsultoria.cte.schema_400_eventos.TRetEvento;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum XsdEnum {

    //DistDfe
    DIST_DFE_INT(DistDFeInt.class, "distDFeInt"),
    RET_DIST_DFE_INT(RetDistDFeInt.class, "retDistDFeInt"),

    //Consulta Status Serviço
    CONS_STAT_SERV(TConsStatServ.class, "consStatServCTe"),
    RET_STAT_SERV(TRetConsStatServ.class, "retConsStatServCTe"),

    //Consulta Situacao
    CONS_SIT_CTE(TConsSitCTe.class, "consSitCTe"),
    RET_CONS_SIT_CTE(TRetConsSitCTe.class, "retConsSitCTe"),

    // CTe Principal
    CTE(TCTe.class, "CTe"),
    RET_CTE(TRetCTe.class, "retCTe"),
    CTE_PROC(CteProc.class, "cteProc"),

    // CTe OS (Outros Serviços)
    CTE_OS(TCTeOS.class, "CTeOS"),
    RET_CTE_OS(TRetCTeOS.class, "retCTeOS"),
    CTE_OS_PROC(CteOSProc.class, "cteOSProc"),

    // CTe Simplificado
    CTE_SIMP(TCTeSimp.class, "CTeSimp"),
    RET_CTE_SIMP(TRetCTeSimp.class, "retCTeSimp"),
    CTE_SIMP_PROC(CteSimpProc.class, "cteSimpProc"),

    // Prot
    PROT_CTE(TProtCTe.class, "protCTe"),
    PROT_CTE_OS(TProtCTeOS.class, "protCTe"),

    //Evento
    EVENTO(TEvento.class, "eventoCTe"),

    //RET Evento
    RET_EVENTO(TRetEvento.class, "retEventoCTe"),

    //PROC Evento
    PROC_EVENTO(br.com.swconsultoria.cte.schema_400_eventos.TProcEvento.class, "procEventoCTe");

    private final Class<?> clazz;
    private final String name;

    public static XsdEnum getByClassName(String simpleClassName) throws CteException {
        for (XsdEnum e : values()) {
            if (e.clazz.getName().equals(simpleClassName)) return e;
        }
        throw new CteException("Xsd Não mapeado: " + simpleClassName);
    }
}