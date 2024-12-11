


package br.com.swconsultoria.cte.schema_400.procCTeSimp;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo Protocolo de status resultado do processamento do CT-e OS (Modelo 67)
 * 
 * <p>Java class for TProtCTeOS complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TProtCTeOS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="infProt"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/&gt;
 *                   &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/cte}TVerAplic"/&gt;
 *                   &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
 *                   &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/&gt;
 *                   &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/cte}TProt" minOccurs="0"/&gt;
 *                   &lt;element name="digVal" type="{http://www.w3.org/2000/09/xmldsig#}DigestValueType" minOccurs="0"/&gt;
 *                   &lt;element name="cStat"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TStat"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/cte}TMotivo"/&gt;
 *                 &lt;/sequence&gt;
 *                 &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="infFisco" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="cMsg"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TStat"&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="xMsg" type="{http://www.portalfiscal.inf.br/cte}TMotivo"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *       &lt;attribute name="versao" use="required"&gt;
 *         &lt;simpleType&gt;
 *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerCTe"&gt;
 *           &lt;/restriction&gt;
 *         &lt;/simpleType&gt;
 *       &lt;/attribute&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TProtCTeOS", propOrder = {
    "infProt",
    "infFisco",
    "signature"
})
public class TProtCTeOS {

    @XmlElement(required = true)
    protected TProtCTeOS.InfProt infProt;
    protected InfFisco infFisco;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#")
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Gets the value of the infProt property.
     * 
     * @return
     *     possible object is
     *     {@link InfProt }
     *     
     */
    public InfProt getInfProt() {
        return infProt;
    }

    /**
     * Sets the value of the infProt property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfProt }
     *     
     */
    public void setInfProt(InfProt value) {
        this.infProt = value;
    }

    /**
     * Gets the value of the infFisco property.
     * 
     * @return
     *     possible object is
     *     {@link InfFisco }
     *     
     */
    public InfFisco getInfFisco() {
        return infFisco;
    }

    /**
     * Sets the value of the infFisco property.
     * 
     * @param value
     *     allowed object is
     *     {@link InfFisco }
     *     
     */
    public void setInfFisco(InfFisco value) {
        this.infFisco = value;
    }

    /**
     * Gets the value of the signature property.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Sets the value of the signature property.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
    }

    /**
     * Gets the value of the versao property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Sets the value of the versao property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="cMsg"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TStat"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="xMsg" type="{http://www.portalfiscal.inf.br/cte}TMotivo"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cMsg",
        "xMsg"
    })
    public static class InfFisco {

        @XmlElement(required = true)
        protected String cMsg;
        @XmlElement(required = true)
        protected String xMsg;

        /**
         * Gets the value of the cMsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCMsg() {
            return cMsg;
        }

        /**
         * Sets the value of the cMsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCMsg(String value) {
            this.cMsg = value;
        }

        /**
         * Gets the value of the xMsg property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXMsg() {
            return xMsg;
        }

        /**
         * Sets the value of the xMsg property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXMsg(String value) {
            this.xMsg = value;
        }

    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/&gt;
     *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/cte}TVerAplic"/&gt;
     *         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/&gt;
     *         &lt;element name="dhRecbto" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/&gt;
     *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/cte}TProt" minOccurs="0"/&gt;
     *         &lt;element name="digVal" type="{http://www.w3.org/2000/09/xmldsig#}DigestValueType" minOccurs="0"/&gt;
     *         &lt;element name="cStat"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TStat"&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/cte}TMotivo"/&gt;
     *       &lt;/sequence&gt;
     *       &lt;attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" /&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpAmb",
        "verAplic",
        "chCTe",
        "dhRecbto",
        "nProt",
        "digVal",
        "cStat",
        "xMotivo"
    })
    public static class InfProt {

        @XmlElement(required = true)
        protected String tpAmb;
        @XmlElement(required = true)
        protected String verAplic;
        @XmlElement(required = true)
        protected String chCTe;
        @XmlElement(required = true)
        protected String dhRecbto;
        protected String nProt;
        protected byte[] digVal;
        @XmlElement(required = true)
        protected String cStat;
        @XmlElement(required = true)
        protected String xMotivo;
        @XmlAttribute(name = "Id")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        @XmlSchemaType(name = "ID")
        protected String id;

        /**
         * Gets the value of the tpAmb property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpAmb() {
            return tpAmb;
        }

        /**
         * Sets the value of the tpAmb property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpAmb(String value) {
            this.tpAmb = value;
        }

        /**
         * Gets the value of the verAplic property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVerAplic() {
            return verAplic;
        }

        /**
         * Sets the value of the verAplic property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVerAplic(String value) {
            this.verAplic = value;
        }

        /**
         * Gets the value of the chCTe property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChCTe() {
            return chCTe;
        }

        /**
         * Sets the value of the chCTe property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChCTe(String value) {
            this.chCTe = value;
        }

        /**
         * Gets the value of the dhRecbto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhRecbto() {
            return dhRecbto;
        }

        /**
         * Sets the value of the dhRecbto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhRecbto(String value) {
            this.dhRecbto = value;
        }

        /**
         * Gets the value of the nProt property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNProt() {
            return nProt;
        }

        /**
         * Sets the value of the nProt property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNProt(String value) {
            this.nProt = value;
        }

        /**
         * Gets the value of the digVal property.
         * 
         * @return
         *     possible object is
         *     byte[]
         */
        public byte[] getDigVal() {
            return digVal;
        }

        /**
         * Sets the value of the digVal property.
         * 
         * @param value
         *     allowed object is
         *     byte[]
         */
        public void setDigVal(byte[] value) {
            this.digVal = value;
        }

        /**
         * Gets the value of the cStat property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCStat() {
            return cStat;
        }

        /**
         * Sets the value of the cStat property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCStat(String value) {
            this.cStat = value;
        }

        /**
         * Gets the value of the xMotivo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXMotivo() {
            return xMotivo;
        }

        /**
         * Sets the value of the xMotivo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXMotivo(String value) {
            this.xMotivo = value;
        }

        /**
         * Gets the value of the id property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Sets the value of the id property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
