package br.com.swconsultoria.cte.util;

import br.com.swconsultoria.cte.schema_300.evPrestDesacordo.TRetEvento;
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
class XsdUtil {

    private final static QName _RetEvento_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "retEvento");
    private final static QName _RetInutilizacao_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "retInutCTe");

    public interface retEvento {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento value) {
            return new JAXBElement<br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evCancCTe.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento value) {
            return new JAXBElement<br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evEPECCTe.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento value) {
            return new JAXBElement<br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evRegMultimodal.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento value) {
            return new JAXBElement<br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evCCeCTe.TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = TRetEvento.class)
        static JAXBElement<TRetEvento> createTRetEvent(TRetEvento value) {
            return new JAXBElement<TRetEvento>(_RetEvento_QNAME, TRetEvento.class, TRetEvento.class, value);
        }

        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetEvento", scope = br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class)
        static JAXBElement<br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento> createTRetEvent(br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento value) {
            return new JAXBElement<br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento>(_RetEvento_QNAME, br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class, br.com.swconsultoria.cte.schema_300.evGTV.TRetEvento.class, value);
        }

    }

    public interface retInutilizacao {
        @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TRetInutCTe", scope = TRetInutCTe.class)
        static JAXBElement<TRetInutCTe> createTRetInutCTe(TRetInutCTe value) {
            return new JAXBElement<TRetInutCTe>(_RetInutilizacao_QNAME, TRetInutCTe.class, TRetInutCTe.class, value);
        }
    }

}
