
package br.com.swconsultoria.cte.schema_400.procGTVe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Dados do Imposto CT-e
 * 
 * <p>Classe Java de TImp complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TImp">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="ICMS00">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="00"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMS20">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMS45">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="40"/>
 *                         &lt;enumeration value="41"/>
 *                         &lt;enumeration value="51"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMS60">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="60"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMS90">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="90"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
 *                   &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMSOutraUF">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="90"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
 *                   &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                   &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
 *                   &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ICMSSN">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CST">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="90"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="indSN">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="1"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImp", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
    "icms00",
    "icms20",
    "icms45",
    "icms60",
    "icms90",
    "icmsOutraUF",
    "icmssn"
})
public class TImp {

    @XmlElement(name = "ICMS00", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TImp.ICMS00 icms00;
    @XmlElement(name = "ICMS20", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TImp.ICMS20 icms20;
    @XmlElement(name = "ICMS45", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TImp.ICMS45 icms45;
    @XmlElement(name = "ICMS60", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TImp.ICMS60 icms60;
    @XmlElement(name = "ICMS90", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TImp.ICMS90 icms90;
    @XmlElement(name = "ICMSOutraUF", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TImp.ICMSOutraUF icmsOutraUF;
    @XmlElement(name = "ICMSSN", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TImp.ICMSSN icmssn;

    /**
     * Obtém o valor da propriedade icms00.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS00 }
     *     
     */
    public TImp.ICMS00 getICMS00() {
        return icms00;
    }

    /**
     * Define o valor da propriedade icms00.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS00 }
     *     
     */
    public void setICMS00(TImp.ICMS00 value) {
        this.icms00 = value;
    }

    /**
     * Obtém o valor da propriedade icms20.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS20 }
     *     
     */
    public TImp.ICMS20 getICMS20() {
        return icms20;
    }

    /**
     * Define o valor da propriedade icms20.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS20 }
     *     
     */
    public void setICMS20(TImp.ICMS20 value) {
        this.icms20 = value;
    }

    /**
     * Obtém o valor da propriedade icms45.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS45 }
     *     
     */
    public TImp.ICMS45 getICMS45() {
        return icms45;
    }

    /**
     * Define o valor da propriedade icms45.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS45 }
     *     
     */
    public void setICMS45(TImp.ICMS45 value) {
        this.icms45 = value;
    }

    /**
     * Obtém o valor da propriedade icms60.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS60 }
     *     
     */
    public TImp.ICMS60 getICMS60() {
        return icms60;
    }

    /**
     * Define o valor da propriedade icms60.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS60 }
     *     
     */
    public void setICMS60(TImp.ICMS60 value) {
        this.icms60 = value;
    }

    /**
     * Obtém o valor da propriedade icms90.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMS90 }
     *     
     */
    public TImp.ICMS90 getICMS90() {
        return icms90;
    }

    /**
     * Define o valor da propriedade icms90.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMS90 }
     *     
     */
    public void setICMS90(TImp.ICMS90 value) {
        this.icms90 = value;
    }

    /**
     * Obtém o valor da propriedade icmsOutraUF.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMSOutraUF }
     *     
     */
    public TImp.ICMSOutraUF getICMSOutraUF() {
        return icmsOutraUF;
    }

    /**
     * Define o valor da propriedade icmsOutraUF.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMSOutraUF }
     *     
     */
    public void setICMSOutraUF(TImp.ICMSOutraUF value) {
        this.icmsOutraUF = value;
    }

    /**
     * Obtém o valor da propriedade icmssn.
     * 
     * @return
     *     possible object is
     *     {@link TImp.ICMSSN }
     *     
     */
    public TImp.ICMSSN getICMSSN() {
        return icmssn;
    }

    /**
     * Define o valor da propriedade icmssn.
     * 
     * @param value
     *     allowed object is
     *     {@link TImp.ICMSSN }
     *     
     */
    public void setICMSSN(TImp.ICMSSN value) {
        this.icmssn = value;
    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="00"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc"/>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
        "vicms"
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

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="40"/>
     *               &lt;enumeration value="41"/>
     *               &lt;enumeration value="51"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst"
    })
    public static class ICMS45 {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;

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

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="60"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vBCSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="vICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMSSTRet" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cst",
        "vbcstRet",
        "vicmsstRet",
        "picmsstRet",
        "vCred"
    })
    public static class ICMS60 {

        @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cst;
        @XmlElement(name = "vBCSTRet", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vbcstRet;
        @XmlElement(name = "vICMSSTRet", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String vicmsstRet;
        @XmlElement(name = "pICMSSTRet", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String picmsstRet;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String vCred;

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
         * Obtém o valor da propriedade vbcstRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVBCSTRet() {
            return vbcstRet;
        }

        /**
         * Define o valor da propriedade vbcstRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVBCSTRet(String value) {
            this.vbcstRet = value;
        }

        /**
         * Obtém o valor da propriedade vicmsstRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVICMSSTRet() {
            return vicmsstRet;
        }

        /**
         * Define o valor da propriedade vicmsstRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVICMSSTRet(String value) {
            this.vicmsstRet = value;
        }

        /**
         * Obtém o valor da propriedade picmsstRet.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPICMSSTRet() {
            return picmsstRet;
        }

        /**
         * Define o valor da propriedade picmsstRet.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPICMSSTRet(String value) {
            this.picmsstRet = value;
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

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="90"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pRedBC" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
     *         &lt;element name="vBC" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="vCred" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
        "vCred"
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

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="90"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="pRedBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302Opc" minOccurs="0"/>
     *         &lt;element name="vBCOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *         &lt;element name="pICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_0302"/>
     *         &lt;element name="vICMSOutraUF" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
        "vicmsOutraUF"
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

    }


    /**
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CST">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="90"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="indSN">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="1"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
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
