package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.schema_300.cteModalRodoviario.Rodo;
import br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TEvento;
import br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TProcEvento;
import br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento;
import br.com.swconsultoria.cte.schema_300.inutCTe.TProcInutCTe;
import br.com.swconsultoria.cte.schema_300.procCTe.CteProc;
import br.com.swconsultoria.cte.schema_300.procCTe.TCTe;
import br.com.swconsultoria.cte.schema_300.procCTe.TProtCTe;
import br.com.swconsultoria.cte.schema_300.procCTeOS.CteOSProc;
import br.com.swconsultoria.cte.schema_300.retInutCTe.TRetInutCTe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * @author Samuel Oliveira - samuel@swconsultoria.com.br
 * Data: 26/01/2018 - 23:19
 */
@XmlRegistry
class XsdCteUtil {

    private final static QName _RetEvento_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "retEvento");
    private final static QName _CteProc_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "cteProc");
    private final static QName _Rodo_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "rodo");
    private final static QName _CteOSProc_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "cteOSProc");
    private final static QName _evento_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "eventoCTe");
    private final static QName _procEvento_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "procEvento");
    private final static QName _procInut_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "procInutCTe");
    private final static QName _RetInutilizacao_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "retInutCTe");
    private final static QName _TProtCTe_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "protCTe");
    private final static QName _CTe_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "TCTe");

    public interface retEvento {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento value) {
            return new JAXBElement<>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento value) {
            return new JAXBElement<>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento value) {
            return new JAXBElement<>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento value) {
            return new JAXBElement<>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = TRetEvento.class)
        static JAXBElement<TRetEvento> createTRetEvent(TRetEvento value) {
            return new JAXBElement<>(_RetEvento_QNAME, TRetEvento.class, TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento value) {
            return new JAXBElement<>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class, value);
        }

    }

    public interface procEvento {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TProcEvento", scope = br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento> createTProcEvento(br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento value) {
            return new JAXBElement<>(_procEvento_QNAME, br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento.class, br.com.swconsultoria.cte.schema_300.evCancCTe.TProcEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TProcEvento", scope = br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento> createTProcEvento(br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento value) {
            return new JAXBElement<>(_procEvento_QNAME, br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento.class, br.com.swconsultoria.cte.schema_300.evEPECCTe.TProcEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TProcEvento", scope = br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento> createTProcEvento(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento value) {
            return new JAXBElement<>(_procEvento_QNAME, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento.class, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TProcEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TProcEvento", scope = br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento> createTProcEvento(br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento value) {
            return new JAXBElement<>(_procEvento_QNAME, br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento.class, br.com.swconsultoria.cte.schema_300.evCCeCTe.TProcEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TProcEvento", scope = TProcEvento.class)
        static JAXBElement<TProcEvento> createTProcEvento(TProcEvento value) {
            return new JAXBElement<>(_procEvento_QNAME, TProcEvento.class, TProcEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TProcEvento", scope = br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento> createTProcEvento(br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento value) {
            return new JAXBElement<>(_procEvento_QNAME, br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento.class, br.com.swconsultoria.cte.schema_300.evGTV.TProcEvento.class, value);
        }

    }

    public interface evento {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TEvento", scope = br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento> createTEvento(br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento value) {
            return new JAXBElement<>(_evento_QNAME, br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento.class, br.com.swconsultoria.cte.schema_300.evCancCTe.TEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TEvento", scope = br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento> createTEvento(br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento value) {
            return new JAXBElement<>(_evento_QNAME, br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento.class, br.com.swconsultoria.cte.schema_300.evEPECCTe.TEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TEvento", scope = br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento> createTEvento(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento value) {
            return new JAXBElement<>(_evento_QNAME, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento.class, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TEvento", scope = br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento> createTEvento(br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento value) {
            return new JAXBElement<>(_evento_QNAME, br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.class, br.com.swconsultoria.cte.schema_300.evCCeCTe.TEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TEvento", scope = TEvento.class)
        static JAXBElement<TEvento> createTEvento(TEvento value) {
            return new JAXBElement<>(_evento_QNAME, TEvento.class, TEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TEvento", scope = br.com.swconsultoria.cte.schema_300.evGTV.TEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evGTV.TEvento> createTEvento(br.com.swconsultoria.cte.schema_300.evGTV.TEvento value) {
            return new JAXBElement<>(_evento_QNAME, br.com.swconsultoria.cte.schema_300.evGTV.TEvento.class, br.com.swconsultoria.cte.schema_300.evGTV.TEvento.class, value);
        }

    }

    public interface retInutilizacao {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetInutCTe", scope = TRetInutCTe.class)
        static JAXBElement<TRetInutCTe> createTRetInutCTe(TRetInutCTe value) {
            return new JAXBElement<>(_RetInutilizacao_QNAME, TRetInutCTe.class, TRetInutCTe.class, value);
        }
    }

    public interface cte {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "cte", scope = TCTe.class)
        static JAXBElement<TCTe> createTCTe(TCTe value) {
            return new JAXBElement<>(_CTe_QNAME, TCTe.class, TCTe.class, value);
        }
        static JAXBElement<br.com.swconsultoria.cte.schema_300.enviCTe.TCTe> createTCTe(br.com.swconsultoria.cte.schema_300.enviCTe.TCTe value) {
            return new JAXBElement<>(_CTe_QNAME, br.com.swconsultoria.cte.schema_300.enviCTe.TCTe.class, br.com.swconsultoria.cte.schema_300.enviCTe.TCTe.class, value);
        }
    }

    public interface cteProc {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "CteProc", scope = TRetInutCTe.class)
        static JAXBElement<CteProc> createCteProc(CteProc value) {
            return new JAXBElement<>(_CteProc_QNAME, CteProc.class, CteProc.class, value);
        }
    }

    public interface procInut {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "procInutCTe", scope = TProcInutCTe.class)
        static JAXBElement<TProcInutCTe> createProcInut(TProcInutCTe value) {
            return new JAXBElement<>(_procInut_QNAME, TProcInutCTe.class, TProcInutCTe.class, value);
        }
    }

    public interface cteOSProc {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "cteOSProc", scope = CteOSProc.class)
        static JAXBElement<CteOSProc> createCteOSProc(CteOSProc value) {
            return new JAXBElement<>(_CteProc_QNAME, CteOSProc.class, CteOSProc.class, value);
        }
    }

    public interface rodo {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "Rodo", scope = Rodo.class)
        static JAXBElement<Rodo> createRodo(Rodo value) {
            return new JAXBElement<>(_Rodo_QNAME, Rodo.class, Rodo.class, value);
        }
    }

    public interface protCTe {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "protCTe", scope = TProtCTe.class)
        static JAXBElement<TProtCTe> createProtCte(TProtCTe value) {
            return new JAXBElement<>(_CteProc_QNAME, TProtCTe.class, TProtCTe.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "protCTe", scope = br.com.swconsultoria.cte.schema_300.retCTeOS.TProtCTeOS.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.retCTeOS.TProtCTeOS> createProtCte(br.com.swconsultoria.cte.schema_300.retCTeOS.TProtCTeOS value) {
            return new JAXBElement<>(_CteProc_QNAME, br.com.swconsultoria.cte.schema_300.retCTeOS.TProtCTeOS.class, br.com.swconsultoria.cte.schema_300.retCTeOS.TProtCTeOS.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "protCTe", scope = TProtCTe.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe> createProtCte(br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe value) {
            return new JAXBElement<>(_CteProc_QNAME, br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe.class, br.com.swconsultoria.cte.schema_300.retConsReciCTe.TProtCTe.class, value);
        }
    }

}
