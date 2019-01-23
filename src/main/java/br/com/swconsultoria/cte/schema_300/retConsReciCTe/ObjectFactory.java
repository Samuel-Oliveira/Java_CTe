
package br.com.swconsultoria.cte.schema_300.retConsReciCTe;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;

/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the br.com.swconsultoria.cte.schema_300.retConsReciCTe package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Signature_QNAME = new QName("http://www.w3.org/2000/09/xmldsig#", "Signature");
    private final static QName _RetConsReciCTe_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "retConsReciCTe");
    private final static QName _ProtCTe_QNAME = new QName("http://www.portalfiscal.inf.br/cte", "protCTe");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: br.com.swconsultoria.cte.schema_300.retConsReciCTe
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SignedInfoType }
     */
    public SignedInfoType createSignedInfoType() {
        return new SignedInfoType();
    }

    /**
     * Create an instance of {@link ReferenceType }
     */
    public ReferenceType createReferenceType() {
        return new ReferenceType();
    }

    /**
     * Create an instance of {@link TProtCTe }
     */
    public TProtCTe createTProtCTe() {
        return new TProtCTe();
    }

    /**
     * Create an instance of {@link TRetConsReciCTe }
     */
    public TRetConsReciCTe createTRetConsReciCTe() {
        return new TRetConsReciCTe();
    }

    /**
     * Create an instance of {@link TConsReciCTe }
     */
    public TConsReciCTe createTConsReciCTe() {
        return new TConsReciCTe();
    }

    /**
     * Create an instance of {@link SignatureType }
     */
    public SignatureType createSignatureType() {
        return new SignatureType();
    }

    /**
     * Create an instance of {@link KeyInfoType }
     */
    public KeyInfoType createKeyInfoType() {
        return new KeyInfoType();
    }

    /**
     * Create an instance of {@link SignatureValueType }
     */
    public SignatureValueType createSignatureValueType() {
        return new SignatureValueType();
    }

    /**
     * Create an instance of {@link TransformType }
     */
    public TransformType createTransformType() {
        return new TransformType();
    }

    /**
     * Create an instance of {@link TransformsType }
     */
    public TransformsType createTransformsType() {
        return new TransformsType();
    }

    /**
     * Create an instance of {@link X509DataType }
     */
    public X509DataType createX509DataType() {
        return new X509DataType();
    }

    /**
     * Create an instance of {@link SignedInfoType.CanonicalizationMethod }
     */
    public SignedInfoType.CanonicalizationMethod createSignedInfoTypeCanonicalizationMethod() {
        return new SignedInfoType.CanonicalizationMethod();
    }

    /**
     * Create an instance of {@link SignedInfoType.SignatureMethod }
     */
    public SignedInfoType.SignatureMethod createSignedInfoTypeSignatureMethod() {
        return new SignedInfoType.SignatureMethod();
    }

    /**
     * Create an instance of {@link ReferenceType.DigestMethod }
     */
    public ReferenceType.DigestMethod createReferenceTypeDigestMethod() {
        return new ReferenceType.DigestMethod();
    }

    /**
     * Create an instance of {@link TProtCTe.InfProt }
     */
    public TProtCTe.InfProt createTProtCTeInfProt() {
        return new TProtCTe.InfProt();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link SignatureType }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.w3.org/2000/09/xmldsig#", name = "Signature")
    public JAXBElement<SignatureType> createSignature(SignatureType value) {
        return new JAXBElement<SignatureType>(_Signature_QNAME, SignatureType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TRetConsReciCTe }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "retConsReciCTe")
    public JAXBElement<TRetConsReciCTe> createRetConsReciCTe(TRetConsReciCTe value) {
        return new JAXBElement<TRetConsReciCTe>(_RetConsReciCTe_QNAME, TRetConsReciCTe.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TProtCTe }{@code >}}
     */
    @XmlElementDecl(namespace = "http://www.portalfiscal.inf.br/cte", name = "TProtCTe")
    public JAXBElement<TProtCTe> createTProcCTe(TProtCTe value) {
        return new JAXBElement<TProtCTe>(_ProtCTe_QNAME, TProtCTe.class, null, value);
    }


}
