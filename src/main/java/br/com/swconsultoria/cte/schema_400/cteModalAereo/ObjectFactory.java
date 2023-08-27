
package br.com.swconsultoria.cte.schema_400.cteModalAereo;

import javax.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the br.com.swconsultoria.cte.schema_400.cteModalAereo package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {


    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.swconsultoria.cte.schema_400.cteModalAereo
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Aereo }
     * 
     */
    public Aereo createAereo() {
        return new Aereo();
    }

    /**
     * Create an instance of {@link Aereo.Peri }
     * 
     */
    public Aereo.Peri createAereoPeri() {
        return new Aereo.Peri();
    }

    /**
     * Create an instance of {@link Aereo.NatCarga }
     * 
     */
    public Aereo.NatCarga createAereoNatCarga() {
        return new Aereo.NatCarga();
    }

    /**
     * Create an instance of {@link Aereo.Tarifa }
     * 
     */
    public Aereo.Tarifa createAereoTarifa() {
        return new Aereo.Tarifa();
    }

    /**
     * Create an instance of {@link TRSAKeyValueType }
     * 
     */
    public TRSAKeyValueType createTRSAKeyValueType() {
        return new TRSAKeyValueType();
    }

    /**
     * Create an instance of {@link Aereo.Peri.InfTotAP }
     * 
     */
    public Aereo.Peri.InfTotAP createAereoPeriInfTotAP() {
        return new Aereo.Peri.InfTotAP();
    }

}
