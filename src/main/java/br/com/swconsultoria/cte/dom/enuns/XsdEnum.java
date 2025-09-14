package br.com.swconsultoria.cte.dom.enuns;

import br.com.swconsultoria.cte.exception.CteException;
import br.com.swconsultoria.cte.schema_100.distdfeint.DistDFeInt;
import br.com.swconsultoria.cte.schema_100.retdistdfeint.RetDistDFeInt;
import br.com.swconsultoria.cte.schema_400.consSitCTe.TConsSitCTe;
import br.com.swconsultoria.cte.schema_400.consSitCTe.TRetConsSitCTe;
import br.com.swconsultoria.cte.schema_400.consStatServCTe.TConsStatServ;
import br.com.swconsultoria.cte.schema_400.consStatServCTe.TRetConsStatServ;
import br.com.swconsultoria.cte.schema_400.cte.*;
import br.com.swconsultoria.cte.schema_400.procCTe.CteProc;
import br.com.swconsultoria.cte.schema_400.procCTeOS.CteOSProc;
import br.com.swconsultoria.cte.schema_400.procCTeSimp.CteSimpProc;
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
    PROT_CTE(br.com.swconsultoria.cte.schema_400.procCTe.TProtCTe.class, Constants.CONST_PROT_CTE),
    PROT_CTE_OS(br.com.swconsultoria.cte.schema_400.procCTeOS.TProtCTeOS.class, Constants.CONST_PROT_CTE),
    PROT_CTE_SIMP(br.com.swconsultoria.cte.schema_400.procCTeSimp.TProtCTe.class, Constants.CONST_PROT_CTE),

    //Evento
    EVENTO_CANC(br.com.swconsultoria.cte.schema_400.evCancCTe.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_CANC_CE(br.com.swconsultoria.cte.schema_400.evCancCECTe.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_CANC_IE(br.com.swconsultoria.cte.schema_400.evCancIECTe.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_CANC_PREST(br.com.swconsultoria.cte.schema_400.evCancPrestDesacordo.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_CCE(br.com.swconsultoria.cte.schema_400.evCCeCTe.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_CE(br.com.swconsultoria.cte.schema_400.evCECTe.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_EPEC(br.com.swconsultoria.cte.schema_400.evEPECCTe.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_GTV(br.com.swconsultoria.cte.schema_400.evGTV.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_IE(br.com.swconsultoria.cte.schema_400.evIECTe.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_PREST(br.com.swconsultoria.cte.schema_400.evPrestDesacordo.TEvento.class, Constants.EVENTO_CTE),
    EVENTO_REG_MULTI(br.com.swconsultoria.cte.schema_400.evRegMultimodal.TEvento.class, Constants.EVENTO_CTE),

    //RET Evento
    RET_EVENTO_CANC(br.com.swconsultoria.cte.schema_400.evCancCTe.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_CANC_CE(br.com.swconsultoria.cte.schema_400.evCancCECTe.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_CANC_IE(br.com.swconsultoria.cte.schema_400.evCancIECTe.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_CANC_PREST(br.com.swconsultoria.cte.schema_400.evCancPrestDesacordo.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_CCE(br.com.swconsultoria.cte.schema_400.evCCeCTe.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_CE(br.com.swconsultoria.cte.schema_400.evCECTe.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_EPEC(br.com.swconsultoria.cte.schema_400.evEPECCTe.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_GTV(br.com.swconsultoria.cte.schema_400.evGTV.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_IE(br.com.swconsultoria.cte.schema_400.evIECTe.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_PREST(br.com.swconsultoria.cte.schema_400.evPrestDesacordo.TRetEvento.class, Constants.RET_EVENTO_CTE),
    RET_EVENTO_REG_MULTI(br.com.swconsultoria.cte.schema_400.evRegMultimodal.TRetEvento.class, Constants.RET_EVENTO_CTE),

    //PROC Evento
    PROC_EVENTO_CANC(br.com.swconsultoria.cte.schema_400.evCancCTe.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_CANC_CE(br.com.swconsultoria.cte.schema_400.evCancCECTe.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_CANC_IE(br.com.swconsultoria.cte.schema_400.evCancIECTe.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_CANC_PREST(br.com.swconsultoria.cte.schema_400.evCancPrestDesacordo.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_CCE(br.com.swconsultoria.cte.schema_400.evCCeCTe.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_CE(br.com.swconsultoria.cte.schema_400.evCECTe.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_EPEC(br.com.swconsultoria.cte.schema_400.evEPECCTe.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_GTV(br.com.swconsultoria.cte.schema_400.evGTV.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_IE(br.com.swconsultoria.cte.schema_400.evIECTe.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_PREST(br.com.swconsultoria.cte.schema_400.evPrestDesacordo.TProcEvento.class, Constants.PROC_EVENTO_CTE),
    PROC_EVENTO_REG_MULTI(br.com.swconsultoria.cte.schema_400.evRegMultimodal.TProcEvento.class, Constants.PROC_EVENTO_CTE);

    private final Class<?> clazz;
    private final String name;

    public static XsdEnum getByClassName(String simpleClassName) throws CteException {
        for (XsdEnum e : values()) {
            if (e.clazz.getName().equals(simpleClassName)) return e;
        }
        throw new CteException("Xsd Não mapeado: " + simpleClassName);
    }

    private static class Constants {
        protected static final String CONST_PROT_CTE = "protCTe";
        protected static final String EVENTO_CTE = "eventoCTe";
        protected static final String RET_EVENTO_CTE = "retEventoCTe";
        protected static final String PROC_EVENTO_CTE = "procEventoCTe";
    }
}