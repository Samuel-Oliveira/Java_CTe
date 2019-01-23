
package br.com.swconsultoria.cte.schema_300.cteModalAereo;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="nMinu" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{9}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nOCA" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{11}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dPrevAereo" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *         &lt;element name="natCarga">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="xDime" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="5"/>
 *                         &lt;maxLength value="14"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cInfManu" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="01"/>
 *                         &lt;enumeration value="02"/>
 *                         &lt;enumeration value="03"/>
 *                         &lt;enumeration value="04"/>
 *                         &lt;enumeration value="05"/>
 *                         &lt;enumeration value="06"/>
 *                         &lt;enumeration value="07"/>
 *                         &lt;enumeration value="08"/>
 *                         &lt;enumeration value="09"/>
 *                         &lt;enumeration value="10"/>
 *                         &lt;enumeration value="11"/>
 *                         &lt;enumeration value="12"/>
 *                         &lt;enumeration value="13"/>
 *                         &lt;enumeration value="14"/>
 *                         &lt;enumeration value="15"/>
 *                         &lt;enumeration value="99"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="tarifa">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CL">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;length value="1"/>
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="M"/>
 *                         &lt;pattern value="G"/>
 *                         &lt;pattern value="E"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="cTar" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="vTar" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="peri" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="nONU">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{4}|ND"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="qTotEmb">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="infTotAP">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="qTotProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
 *                             &lt;element name="uniAP">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="1"/>
 *                                   &lt;maxLength value="1"/>
 *                                   &lt;enumeration value="1"/>
 *                                   &lt;enumeration value="2"/>
 *                                   &lt;enumeration value="3"/>
 *                                   &lt;enumeration value="4"/>
 *                                   &lt;enumeration value="5"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "nMinu",
        "noca",
        "dPrevAereo",
        "natCarga",
        "tarifa",
        "peri"
})
@XmlRootElement(name = "aereo")
public class Aereo {

    protected String nMinu;
    @XmlElement(name = "nOCA")
    protected String noca;
    @XmlElement(required = true)
    protected String dPrevAereo;
    @XmlElement(required = true)
    protected NatCarga natCarga;
    @XmlElement(required = true)
    protected Tarifa tarifa;
    protected List<Peri> peri;

    /**
     * Obtém o valor da propriedade nMinu.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNMinu() {
        return nMinu;
    }

    /**
     * Define o valor da propriedade nMinu.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNMinu(String value) {
        this.nMinu = value;
    }

    /**
     * Obtém o valor da propriedade noca.
     *
     * @return possible object is
     * {@link String }
     */
    public String getNOCA() {
        return noca;
    }

    /**
     * Define o valor da propriedade noca.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setNOCA(String value) {
        this.noca = value;
    }

    /**
     * Obtém o valor da propriedade dPrevAereo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDPrevAereo() {
        return dPrevAereo;
    }

    /**
     * Define o valor da propriedade dPrevAereo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDPrevAereo(String value) {
        this.dPrevAereo = value;
    }

    /**
     * Obtém o valor da propriedade natCarga.
     *
     * @return possible object is
     * {@link NatCarga }
     */
    public NatCarga getNatCarga() {
        return natCarga;
    }

    /**
     * Define o valor da propriedade natCarga.
     *
     * @param value allowed object is
     *              {@link NatCarga }
     */
    public void setNatCarga(NatCarga value) {
        this.natCarga = value;
    }

    /**
     * Obtém o valor da propriedade tarifa.
     *
     * @return possible object is
     * {@link Tarifa }
     */
    public Tarifa getTarifa() {
        return tarifa;
    }

    /**
     * Define o valor da propriedade tarifa.
     *
     * @param value allowed object is
     *              {@link Tarifa }
     */
    public void setTarifa(Tarifa value) {
        this.tarifa = value;
    }

    /**
     * Gets the value of the peri property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the peri property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPeri().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Peri }
     */
    public List<Peri> getPeri() {
        if (peri == null) {
            peri = new ArrayList<Peri>();
        }
        return this.peri;
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
     *         &lt;element name="xDime" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="5"/>
     *               &lt;maxLength value="14"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cInfManu" maxOccurs="unbounded" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="01"/>
     *               &lt;enumeration value="02"/>
     *               &lt;enumeration value="03"/>
     *               &lt;enumeration value="04"/>
     *               &lt;enumeration value="05"/>
     *               &lt;enumeration value="06"/>
     *               &lt;enumeration value="07"/>
     *               &lt;enumeration value="08"/>
     *               &lt;enumeration value="09"/>
     *               &lt;enumeration value="10"/>
     *               &lt;enumeration value="11"/>
     *               &lt;enumeration value="12"/>
     *               &lt;enumeration value="13"/>
     *               &lt;enumeration value="14"/>
     *               &lt;enumeration value="15"/>
     *               &lt;enumeration value="99"/>
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
            "xDime",
            "cInfManu"
    })
    public static class NatCarga {

        protected String xDime;
        protected List<String> cInfManu;

        /**
         * Obtém o valor da propriedade xDime.
         *
         * @return possible object is
         * {@link String }
         */
        public String getXDime() {
            return xDime;
        }

        /**
         * Define o valor da propriedade xDime.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setXDime(String value) {
            this.xDime = value;
        }

        /**
         * Gets the value of the cInfManu property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cInfManu property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCInfManu().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         */
        public List<String> getCInfManu() {
            if (cInfManu == null) {
                cInfManu = new ArrayList<String>();
            }
            return this.cInfManu;
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
     *         &lt;element name="nONU">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[0-9]{4}|ND"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="qTotEmb">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="infTotAP">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="qTotProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
     *                   &lt;element name="uniAP">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="1"/>
     *                         &lt;maxLength value="1"/>
     *                         &lt;enumeration value="1"/>
     *                         &lt;enumeration value="2"/>
     *                         &lt;enumeration value="3"/>
     *                         &lt;enumeration value="4"/>
     *                         &lt;enumeration value="5"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "nonu",
            "qTotEmb",
            "infTotAP"
    })
    public static class Peri {

        @XmlElement(name = "nONU", required = true)
        protected String nonu;
        @XmlElement(required = true)
        protected String qTotEmb;
        @XmlElement(required = true)
        protected InfTotAP infTotAP;

        /**
         * Obtém o valor da propriedade nonu.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNONU() {
            return nonu;
        }

        /**
         * Define o valor da propriedade nonu.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNONU(String value) {
            this.nonu = value;
        }

        /**
         * Obtém o valor da propriedade qTotEmb.
         *
         * @return possible object is
         * {@link String }
         */
        public String getQTotEmb() {
            return qTotEmb;
        }

        /**
         * Define o valor da propriedade qTotEmb.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setQTotEmb(String value) {
            this.qTotEmb = value;
        }

        /**
         * Obtém o valor da propriedade infTotAP.
         *
         * @return possible object is
         * {@link InfTotAP }
         */
        public InfTotAP getInfTotAP() {
            return infTotAP;
        }

        /**
         * Define o valor da propriedade infTotAP.
         *
         * @param value allowed object is
         *              {@link InfTotAP }
         */
        public void setInfTotAP(InfTotAP value) {
            this.infTotAP = value;
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
         *         &lt;element name="qTotProd" type="{http://www.portalfiscal.inf.br/cte}TDec_1104"/>
         *         &lt;element name="uniAP">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="1"/>
         *               &lt;maxLength value="1"/>
         *               &lt;enumeration value="1"/>
         *               &lt;enumeration value="2"/>
         *               &lt;enumeration value="3"/>
         *               &lt;enumeration value="4"/>
         *               &lt;enumeration value="5"/>
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
                "qTotProd",
                "uniAP"
        })
        public static class InfTotAP {

            @XmlElement(required = true)
            protected String qTotProd;
            @XmlElement(required = true)
            protected String uniAP;

            /**
             * Obtém o valor da propriedade qTotProd.
             *
             * @return possible object is
             * {@link String }
             */
            public String getQTotProd() {
                return qTotProd;
            }

            /**
             * Define o valor da propriedade qTotProd.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setQTotProd(String value) {
                this.qTotProd = value;
            }

            /**
             * Obtém o valor da propriedade uniAP.
             *
             * @return possible object is
             * {@link String }
             */
            public String getUniAP() {
                return uniAP;
            }

            /**
             * Define o valor da propriedade uniAP.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setUniAP(String value) {
                this.uniAP = value;
            }

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
     *         &lt;element name="CL">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;length value="1"/>
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="M"/>
     *               &lt;pattern value="G"/>
     *               &lt;pattern value="E"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="cTar" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="vTar" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "cl",
            "cTar",
            "vTar"
    })
    public static class Tarifa {

        @XmlElement(name = "CL", required = true)
        protected String cl;
        protected String cTar;
        @XmlElement(required = true)
        protected String vTar;

        /**
         * Obtém o valor da propriedade cl.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCL() {
            return cl;
        }

        /**
         * Define o valor da propriedade cl.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCL(String value) {
            this.cl = value;
        }

        /**
         * Obtém o valor da propriedade cTar.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCTar() {
            return cTar;
        }

        /**
         * Define o valor da propriedade cTar.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCTar(String value) {
            this.cTar = value;
        }

        /**
         * Obtém o valor da propriedade vTar.
         *
         * @return possible object is
         * {@link String }
         */
        public String getVTar() {
            return vTar;
        }

        /**
         * Define o valor da propriedade vTar.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setVTar(String value) {
            this.vTar = value;
        }

    }

}
