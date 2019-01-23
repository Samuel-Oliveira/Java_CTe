
package br.com.swconsultoria.cte.schema_300.cteOS;

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
 * &lt;complexType name="TImpOS">
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
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TImpOS", propOrder = {
        "icms00",
        "icms45",
        "icms90",
        "icmsOutraUF",
        "icmssn"
})
public class TImpOS {

    @XmlElement(name = "ICMS00")
    protected ICMS00 icms00;
    @XmlElement(name = "ICMS45")
    protected ICMS45 icms45;
    @XmlElement(name = "ICMS90")
    protected ICMS90 icms90;
    @XmlElement(name = "ICMSOutraUF")
    protected ICMSOutraUF icmsOutraUF;
    @XmlElement(name = "ICMSSN")
    protected ICMSSN icmssn;

    /**
     * Obtém o valor da propriedade icms00.
     *
     * @return possible object is
     * {@link ICMS00 }
     */
    public ICMS00 getICMS00() {
        return icms00;
    }

    /**
     * Define o valor da propriedade icms00.
     *
     * @param value allowed object is
     *              {@link ICMS00 }
     */
    public void setICMS00(ICMS00 value) {
        this.icms00 = value;
    }

    /**
     * Obtém o valor da propriedade icms45.
     *
     * @return possible object is
     * {@link ICMS45 }
     */
    public ICMS45 getICMS45() {
        return icms45;
    }

    /**
     * Define o valor da propriedade icms45.
     *
     * @param value allowed object is
     *              {@link ICMS45 }
     */
    public void setICMS45(ICMS45 value) {
        this.icms45 = value;
    }

    /**
     * Obtém o valor da propriedade icms90.
     *
     * @return possible object is
     * {@link ICMS90 }
     */
    public ICMS90 getICMS90() {
        return icms90;
    }

    /**
     * Define o valor da propriedade icms90.
     *
     * @param value allowed object is
     *              {@link ICMS90 }
     */
    public void setICMS90(ICMS90 value) {
        this.icms90 = value;
    }

    /**
     * Obtém o valor da propriedade icmsOutraUF.
     *
     * @return possible object is
     * {@link ICMSOutraUF }
     */
    public ICMSOutraUF getICMSOutraUF() {
        return icmsOutraUF;
    }

    /**
     * Define o valor da propriedade icmsOutraUF.
     *
     * @param value allowed object is
     *              {@link ICMSOutraUF }
     */
    public void setICMSOutraUF(ICMSOutraUF value) {
        this.icmsOutraUF = value;
    }

    /**
     * Obtém o valor da propriedade icmssn.
     *
     * @return possible object is
     * {@link ICMSSN }
     */
    public ICMSSN getICMSSN() {
        return icmssn;
    }

    /**
     * Define o valor da propriedade icmssn.
     *
     * @param value allowed object is
     *              {@link ICMSSN }
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
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "cst",
            "vbc",
            "picms",
            "vicms"
    })
    public static class ICMS00 {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade vbc.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Obtém o valor da propriedade picms.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * Obtém o valor da propriedade vicms.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         *
         * @param value allowed object is
         *              {@link String }
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
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "cst"
    })
    public static class ICMS45 {

        @XmlElement(name = "CST", required = true)
        protected String cst;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value allowed object is
         *              {@link String }
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

        @XmlElement(name = "CST", required = true)
        protected String cst;
        protected String pRedBC;
        @XmlElement(name = "vBC", required = true)
        protected String vbc;
        @XmlElement(name = "pICMS", required = true)
        protected String picms;
        @XmlElement(name = "vICMS", required = true)
        protected String vicms;
        protected String vCred;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade pRedBC.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPRedBC() {
            return pRedBC;
        }

        /**
         * Define o valor da propriedade pRedBC.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPRedBC(String value) {
            this.pRedBC = value;
        }

        /**
         * Obtém o valor da propriedade vbc.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVBC() {
            return vbc;
        }

        /**
         * Define o valor da propriedade vbc.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVBC(String value) {
            this.vbc = value;
        }

        /**
         * Obtém o valor da propriedade picms.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPICMS() {
            return picms;
        }

        /**
         * Define o valor da propriedade picms.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPICMS(String value) {
            this.picms = value;
        }

        /**
         * Obtém o valor da propriedade vicms.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVICMS() {
            return vicms;
        }

        /**
         * Define o valor da propriedade vicms.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVICMS(String value) {
            this.vicms = value;
        }

        /**
         * Obtém o valor da propriedade vCred.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVCred() {
            return vCred;
        }

        /**
         * Define o valor da propriedade vCred.
         *
         * @param value allowed object is
         *              {@link String }
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

        @XmlElement(name = "CST", required = true)
        protected String cst;
        protected String pRedBCOutraUF;
        @XmlElement(name = "vBCOutraUF", required = true)
        protected String vbcOutraUF;
        @XmlElement(name = "pICMSOutraUF", required = true)
        protected String picmsOutraUF;
        @XmlElement(name = "vICMSOutraUF", required = true)
        protected String vicmsOutraUF;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade pRedBCOutraUF.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPRedBCOutraUF() {
            return pRedBCOutraUF;
        }

        /**
         * Define o valor da propriedade pRedBCOutraUF.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPRedBCOutraUF(String value) {
            this.pRedBCOutraUF = value;
        }

        /**
         * Obtém o valor da propriedade vbcOutraUF.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVBCOutraUF() {
            return vbcOutraUF;
        }

        /**
         * Define o valor da propriedade vbcOutraUF.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVBCOutraUF(String value) {
            this.vbcOutraUF = value;
        }

        /**
         * Obtém o valor da propriedade picmsOutraUF.
         *
         * @return possible object is
         * {@link String }
         */
        public String getPICMSOutraUF() {
            return picmsOutraUF;
        }

        /**
         * Define o valor da propriedade picmsOutraUF.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setPICMSOutraUF(String value) {
            this.picmsOutraUF = value;
        }

        /**
         * Obtém o valor da propriedade vicmsOutraUF.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVICMSOutraUF() {
            return vicmsOutraUF;
        }

        /**
         * Define o valor da propriedade vicmsOutraUF.
         *
         * @param value allowed object is
         *              {@link String }
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
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "cst",
            "indSN"
    })
    public static class ICMSSN {

        @XmlElement(name = "CST", required = true)
        protected String cst;
        @XmlElement(required = true)
        protected String indSN;

        /**
         * Obtém o valor da propriedade cst.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCST() {
            return cst;
        }

        /**
         * Define o valor da propriedade cst.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCST(String value) {
            this.cst = value;
        }

        /**
         * Obtém o valor da propriedade indSN.
         *
         * @return possible object is
         * {@link String }
         */
        public String getIndSN() {
            return indSN;
        }

        /**
         * Define o valor da propriedade indSN.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setIndSN(String value) {
            this.indSN = value;
        }

    }

}
