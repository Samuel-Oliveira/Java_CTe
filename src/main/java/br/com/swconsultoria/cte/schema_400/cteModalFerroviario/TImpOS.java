
package br.com.swconsultoria.cte.schema_400.cteModalFerroviario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Dados do Imposto para CT-e OS
 *
 * <p>Classe Java de TImpOS complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TImpOS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;choice&gt;
 *         &lt;element name="ICMS00"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="00"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMS20"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/&gt;
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                     &lt;element name="cBenef"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                           &lt;whiteSpace value="preserve"/&gt;
 *                           &lt;maxLength value="10"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMS45"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="40"/&gt;
 *                         &lt;enumeration value="41"/&gt;
 *                         &lt;enumeration value="51"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                     &lt;element name="cBenef"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                           &lt;whiteSpace value="preserve"/&gt;
 *                           &lt;maxLength value="10"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMS90"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="90"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                     &lt;element name="cBenef"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                           &lt;whiteSpace value="preserve"/&gt;
 *                           &lt;maxLength value="10"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMSOutraUF"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="90"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
 *                   &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
 *                   &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                   &lt;sequence minOccurs="0"&gt;
 *                     &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
 *                     &lt;element name="cBenef"&gt;
 *                       &lt;simpleType&gt;
 *                         &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                           &lt;whiteSpace value="preserve"/&gt;
 *                           &lt;maxLength value="10"/&gt;
 *                         &lt;/restriction&gt;
 *                       &lt;/simpleType&gt;
 *                     &lt;/element&gt;
 *                   &lt;/sequence&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="ICMSSN"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="CST"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="90"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                   &lt;element name="indSN"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *                         &lt;whiteSpace value="preserve"/&gt;
 *                         &lt;enumeration value="1"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/choice&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 *
 *
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImpOS", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
        "icms00",
        "icms20",
        "icms45",
        "icms90",
        "icmsOutraUF",
        "icmssn"
})
public class TImpOS {

    @XmlElement(name = "ICMS00", namespace = "http://www.portalfiscal.inf.br/cte")
    protected ICMS00 icms00;
    @XmlElement(name = "ICMS20", namespace = "http://www.portalfiscal.inf.br/cte")
    protected ICMS20 icms20;
    @XmlElement(name = "ICMS45", namespace = "http://www.portalfiscal.inf.br/cte")
    protected ICMS45 icms45;
    @XmlElement(name = "ICMS90", namespace = "http://www.portalfiscal.inf.br/cte")
    protected ICMS90 icms90;
    @XmlElement(name = "ICMSOutraUF", namespace = "http://www.portalfiscal.inf.br/cte")
    protected ICMSOutraUF icmsOutraUF;
    @XmlElement(name = "ICMSSN", namespace = "http://www.portalfiscal.inf.br/cte")
    protected ICMSSN icmssn;

    /**
     * Obtém o valor da propriedade icms00.
     *
     * @return
     *     possible object is
     *     {@link ICMS00 }
     *
     */
    public ICMS00 getICMS00() {
        return icms00;
    }

    /**
     * Define o valor da propriedade icms00.
     *
     * @param value
     *     allowed object is
     *     {@link ICMS00 }
     *
     */
    public void setICMS00(ICMS00 value) {
        this.icms00 = value;
    }

    /**
     * Obtém o valor da propriedade icms20.
     *
     * @return
     *     possible object is
     *     {@link ICMS20 }
     *
     */
    public ICMS20 getICMS20() {
        return icms20;
    }

    /**
     * Define o valor da propriedade icms20.
     *
     * @param value
     *     allowed object is
     *     {@link ICMS20 }
     *
     */
    public void setICMS20(ICMS20 value) {
        this.icms20 = value;
    }

    /**
     * Obtém o valor da propriedade icms45.
     *
     * @return
     *     possible object is
     *     {@link ICMS45 }
     *
     */
    public ICMS45 getICMS45() {
        return icms45;
    }

    /**
     * Define o valor da propriedade icms45.
     *
     * @param value
     *     allowed object is
     *     {@link ICMS45 }
     *
     */
    public void setICMS45(ICMS45 value) {
        this.icms45 = value;
    }

    /**
     * Obtém o valor da propriedade icms90.
     *
     * @return
     *     possible object is
     *     {@link ICMS90 }
     *
     */
    public ICMS90 getICMS90() {
        return icms90;
    }

    /**
     * Define o valor da propriedade icms90.
     *
     * @param value
     *     allowed object is
     *     {@link ICMS90 }
     *
     */
    public void setICMS90(ICMS90 value) {
        this.icms90 = value;
    }

    /**
     * Obtém o valor da propriedade icmsOutraUF.
     *
     * @return
     *     possible object is
     *     {@link ICMSOutraUF }
     *
     */
    public ICMSOutraUF getICMSOutraUF() {
        return icmsOutraUF;
    }

    /**
     * Define o valor da propriedade icmsOutraUF.
     *
     * @param value
     *     allowed object is
     *     {@link ICMSOutraUF }
     *
     */
    public void setICMSOutraUF(ICMSOutraUF value) {
        this.icmsOutraUF = value;
    }

    /**
     * Obtém o valor da propriedade icmssn.
     *
     * @return
     *     possible object is
     *     {@link ICMSSN }
     *
     */
    public ICMSSN getICMSSN() {
        return icmssn;
    }

    /**
     * Define o valor da propriedade icmssn.
     *
     * @param value
     *     allowed object is
     *     {@link ICMSSN }
     *
     */
    public void setICMSSN(ICMSSN value) {
        this.icmssn = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="00"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
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
            "cst",
            "vbc",
            "picms",
            "vicms"
    })
    public static class ICMS00 {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;
        @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vicms;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade vbc.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Obtém o valor da propriedade picms.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * Obtém o valor da propriedade vicms.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMS(String value) {
            this.vicms = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="20"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/&gt;
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;sequence minOccurs="0"&gt;
     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *           &lt;element name="cBenef"&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                 &lt;whiteSpace value="preserve"/&gt;
     *                 &lt;maxLength value="10"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
            "cst",
            "pRedBC",
            "vbc",
            "picms",
            "vicms",
            "vicmsDeson",
            "cBenef"
    })
    public static class ICMS20 {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String pRedBC;
        @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vicms;
        @XmlElement(name = "vICMSDeson", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String vicmsDeson;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cBenef;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade pRedBC.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Define o valor da propriedade pRedBC.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * Obtém o valor da propriedade vbc.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Obtém o valor da propriedade picms.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * Obtém o valor da propriedade vicms.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMS(String value) {
            this.vicms = value;
        }

        /**
         * Obtém o valor da propriedade vicmsDeson.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMSDeson() {
            return vicmsDeson;
        }

        /**
         * Define o valor da propriedade vicmsDeson.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMSDeson(String value) {
            this.vicmsDeson = value;
        }

        /**
         * Obtém o valor da propriedade cBenef.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCBenef() {
            return cBenef;
        }

        /**
         * Define o valor da propriedade cBenef.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCBenef(String value) {
            this.cBenef = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="40"/&gt;
     *               &lt;enumeration value="41"/&gt;
     *               &lt;enumeration value="51"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;sequence minOccurs="0"&gt;
     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *           &lt;element name="cBenef"&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                 &lt;whiteSpace value="preserve"/&gt;
     *                 &lt;maxLength value="10"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
            "cst",
            "vicmsDeson",
            "cBenef"
    })
    public static class ICMS45 {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;
        @XmlElement(name = "vICMSDeson", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String vicmsDeson;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cBenef;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade vicmsDeson.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMSDeson() {
            return vicmsDeson;
        }

        /**
         * Define o valor da propriedade vicmsDeson.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMSDeson(String value) {
            this.vicmsDeson = value;
        }

        /**
         * Obtém o valor da propriedade cBenef.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCBenef() {
            return cBenef;
        }

        /**
         * Define o valor da propriedade cBenef.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCBenef(String value) {
            this.cBenef = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="90"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/&gt;
     *         &lt;sequence minOccurs="0"&gt;
     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *           &lt;element name="cBenef"&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                 &lt;whiteSpace value="preserve"/&gt;
     *                 &lt;maxLength value="10"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
            "cst",
            "pRedBC",
            "vbc",
            "picms",
            "vicms",
            "vCred",
            "vicmsDeson",
            "cBenef"
    })
    public static class ICMS90 {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String pRedBC;
        @XmlElement(name = "vBC", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vicms;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String vCred;
        @XmlElement(name = "vICMSDeson", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String vicmsDeson;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cBenef;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade pRedBC.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Define o valor da propriedade pRedBC.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * Obtém o valor da propriedade vbc.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Obtém o valor da propriedade picms.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * Obtém o valor da propriedade vicms.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMS(String value) {
            this.vicms = value;
        }

        /**
         * Obtém o valor da propriedade vCred.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVCred() {
            return vCred;
        }

        /**
         * Define o valor da propriedade vCred.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVCred(String value) {
            this.vCred = value;
        }

        /**
         * Obtém o valor da propriedade vicmsDeson.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMSDeson() {
            return vicmsDeson;
        }

        /**
         * Define o valor da propriedade vicmsDeson.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMSDeson(String value) {
            this.vicmsDeson = value;
        }

        /**
         * Obtém o valor da propriedade cBenef.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCBenef() {
            return cBenef;
        }

        /**
         * Define o valor da propriedade cBenef.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCBenef(String value) {
            this.cBenef = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="90"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/&gt;
     *         &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/&gt;
     *         &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *         &lt;sequence minOccurs="0"&gt;
     *           &lt;element name="vICMSDeson" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/&gt;
     *           &lt;element name="cBenef"&gt;
     *             &lt;simpleType&gt;
     *               &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *                 &lt;whiteSpace value="preserve"/&gt;
     *                 &lt;maxLength value="10"/&gt;
     *               &lt;/restriction&gt;
     *             &lt;/simpleType&gt;
     *           &lt;/element&gt;
     *         &lt;/sequence&gt;
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
            "cst",
            "pRedBCOutraUF",
            "vbcOutraUF",
            "picmsOutraUF",
            "vicmsOutraUF",
            "vicmsDeson",
            "cBenef"
    })
    public static class ICMSOutraUF {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String pRedBCOutraUF;
        @XmlElement(name = "vBCOutraUF", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vbcOutraUF;
        @XmlElement(name = "pICMSOutraUF", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String picmsOutraUF;
        @XmlElement(name = "vICMSOutraUF", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vicmsOutraUF;
        @XmlElement(name = "vICMSDeson", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String vicmsDeson;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cBenef;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade pRedBCOutraUF.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPRedBCOutraUF() {
            return pRedBCOutraUF;
        }

        /**
         * Define o valor da propriedade pRedBCOutraUF.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPRedBCOutraUF(String value) {
            this.pRedBCOutraUF = value;
        }

        /**
         * Obtém o valor da propriedade vbcOutraUF.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVBCOutraUF() {
            return vbcOutraUF;
        }

        /**
         * Define o valor da propriedade vbcOutraUF.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVBCOutraUF(String value) {
            this.vbcOutraUF = value;
        }

        /**
         * Obtém o valor da propriedade picmsOutraUF.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getPICMSOutraUF() {
            return picmsOutraUF;
        }

        /**
         * Define o valor da propriedade picmsOutraUF.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setPICMSOutraUF(String value) {
            this.picmsOutraUF = value;
        }

        /**
         * Obtém o valor da propriedade vicmsOutraUF.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMSOutraUF() {
            return vicmsOutraUF;
        }

        /**
         * Define o valor da propriedade vicmsOutraUF.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMSOutraUF(String value) {
            this.vicmsOutraUF = value;
        }

        /**
         * Obtém o valor da propriedade vicmsDeson.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getVICMSDeson() {
            return vicmsDeson;
        }

        /**
         * Define o valor da propriedade vicmsDeson.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setVICMSDeson(String value) {
            this.vicmsDeson = value;
        }

        /**
         * Obtém o valor da propriedade cBenef.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCBenef() {
            return cBenef;
        }

        /**
         * Define o valor da propriedade cBenef.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCBenef(String value) {
            this.cBenef = value;
        }

    }


    /**
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="CST"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="90"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
     *         &lt;element name="indSN"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
     *               &lt;whiteSpace value="preserve"/&gt;
     *               &lt;enumeration value="1"/&gt;
     *             &lt;/restriction&gt;
     *           &lt;/simpleType&gt;
     *         &lt;/element&gt;
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
            "cst",
            "indSN"
    })
    public static class ICMSSN {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String indSN;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade indSN.
         *
         * @return
         *     possible object is
         *     {@link String }
         *
         */
        public String getIndSN() {
            return indSN;
        }

        /**
         * Define o valor da propriedade indSN.
         *
         * @param value
         *     allowed object is
         *     {@link String }
         *
         */
        public void setIndSN(String value) {
            this.indSN = value;
        }

    }

}
