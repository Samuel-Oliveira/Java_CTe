
package br.com.swconsultoria.cte.schema_400.evEPECCTe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="EPEC"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/cte}TJust"/>
 *         &lt;element name="vICMS" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="vICMSST" type="{http://www.portalfiscal.inf.br/cte}TDec_1302" minOccurs="0"/>
 *         &lt;element name="vTPrest" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="vCarga" type="{http://www.portalfiscal.inf.br/cte}TDec_1302"/>
 *         &lt;element name="toma4">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="toma">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;enumeration value="0"/>
 *                         &lt;enumeration value="1"/>
 *                         &lt;enumeration value="2"/>
 *                         &lt;enumeration value="3"/>
 *                         &lt;enumeration value="4"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *                   &lt;choice>
 *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
 *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                   &lt;/choice>
 *                   &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="modal" type="{http://www.portalfiscal.inf.br/cte}TModTransp"/>
 *         &lt;element name="UFIni" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *         &lt;element name="UFFim" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
 *         &lt;element name="tpCTe">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;length value="1"/>
 *               &lt;enumeration value="0"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhEmi">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
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
    "descEvento",
    "xJust",
    "vicms",
    "vicmsst",
    "vtPrest",
    "vCarga",
    "toma4",
    "modal",
    "ufIni",
    "ufFim",
    "tpCTe",
    "dhEmi"
})
@XmlRootElement(name = "evEPECCTe", namespace = "http://www.portalfiscal.inf.br/cte")
public class EvEPECCTe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String descEvento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String xJust;
    @XmlElement(name = "vICMS", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String vicms;
    @XmlElement(name = "vICMSST", namespace = "http://www.portalfiscal.inf.br/cte")
    protected String vicmsst;
    @XmlElement(name = "vTPrest", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String vtPrest;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String vCarga;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected EvEPECCTe.Toma4 toma4;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String modal;
    @XmlElement(name = "UFIni", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    @XmlSchemaType(name = "string")
    protected TUf ufIni;
    @XmlElement(name = "UFFim", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    @XmlSchemaType(name = "string")
    protected TUf ufFim;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String tpCTe;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String dhEmi;

    /**
     * Obtém o valor da propriedade descEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * Define o valor da propriedade descEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEvento(String value) {
        this.descEvento = value;
    }

    /**
     * Obtém o valor da propriedade xJust.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXJust() {
        return xJust;
    }

    /**
     * Define o valor da propriedade xJust.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXJust(String value) {
        this.xJust = value;
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
     * Obtém o valor da propriedade vicmsst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVICMSST() {
        return vicmsst;
    }

    /**
     * Define o valor da propriedade vicmsst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVICMSST(String value) {
        this.vicmsst = value;
    }

    /**
     * Obtém o valor da propriedade vtPrest.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTPrest() {
        return vtPrest;
    }

    /**
     * Define o valor da propriedade vtPrest.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTPrest(String value) {
        this.vtPrest = value;
    }

    /**
     * Obtém o valor da propriedade vCarga.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCarga() {
        return vCarga;
    }

    /**
     * Define o valor da propriedade vCarga.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCarga(String value) {
        this.vCarga = value;
    }

    /**
     * Obtém o valor da propriedade toma4.
     * 
     * @return
     *     possible object is
     *     {@link EvEPECCTe.Toma4 }
     *     
     */
    public EvEPECCTe.Toma4 getToma4() {
        return toma4;
    }

    /**
     * Define o valor da propriedade toma4.
     * 
     * @param value
     *     allowed object is
     *     {@link EvEPECCTe.Toma4 }
     *     
     */
    public void setToma4(EvEPECCTe.Toma4 value) {
        this.toma4 = value;
    }

    /**
     * Obtém o valor da propriedade modal.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getModal() {
        return modal;
    }

    /**
     * Define o valor da propriedade modal.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setModal(String value) {
        this.modal = value;
    }

    /**
     * Obtém o valor da propriedade ufIni.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUFIni() {
        return ufIni;
    }

    /**
     * Define o valor da propriedade ufIni.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUFIni(TUf value) {
        this.ufIni = value;
    }

    /**
     * Obtém o valor da propriedade ufFim.
     * 
     * @return
     *     possible object is
     *     {@link TUf }
     *     
     */
    public TUf getUFFim() {
        return ufFim;
    }

    /**
     * Define o valor da propriedade ufFim.
     * 
     * @param value
     *     allowed object is
     *     {@link TUf }
     *     
     */
    public void setUFFim(TUf value) {
        this.ufFim = value;
    }

    /**
     * Obtém o valor da propriedade tpCTe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpCTe() {
        return tpCTe;
    }

    /**
     * Define o valor da propriedade tpCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpCTe(String value) {
        this.tpCTe = value;
    }

    /**
     * Obtém o valor da propriedade dhEmi.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhEmi() {
        return dhEmi;
    }

    /**
     * Define o valor da propriedade dhEmi.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhEmi(String value) {
        this.dhEmi = value;
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
     *         &lt;element name="toma">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;enumeration value="0"/>
     *               &lt;enumeration value="1"/>
     *               &lt;enumeration value="2"/>
     *               &lt;enumeration value="3"/>
     *               &lt;enumeration value="4"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="UF" type="{http://www.portalfiscal.inf.br/cte}TUf"/>
     *         &lt;choice>
     *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpjOpc"/>
     *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *         &lt;/choice>
     *         &lt;element name="IE" type="{http://www.portalfiscal.inf.br/cte}TIeDest" minOccurs="0"/>
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
        "toma",
        "uf",
        "cnpj",
        "cpf",
        "ie"
    })
    public static class Toma4 {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String toma;
        @XmlElement(name = "UF", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        @XmlSchemaType(name = "string")
        protected TUf uf;
        @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cnpj;
        @XmlElement(name = "CPF", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cpf;
        @XmlElement(name = "IE", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String ie;

        /**
         * Obtém o valor da propriedade toma.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToma() {
            return toma;
        }

        /**
         * Define o valor da propriedade toma.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToma(String value) {
            this.toma = value;
        }

        /**
         * Obtém o valor da propriedade uf.
         * 
         * @return
         *     possible object is
         *     {@link TUf }
         *     
         */
        public TUf getUF() {
            return uf;
        }

        /**
         * Define o valor da propriedade uf.
         * 
         * @param value
         *     allowed object is
         *     {@link TUf }
         *     
         */
        public void setUF(TUf value) {
            this.uf = value;
        }

        /**
         * Obtém o valor da propriedade cnpj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Obtém o valor da propriedade cpf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPF() {
            return cpf;
        }

        /**
         * Define o valor da propriedade cpf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPF(String value) {
            this.cpf = value;
        }

        /**
         * Obtém o valor da propriedade ie.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIE() {
            return ie;
        }

        /**
         * Define o valor da propriedade ie.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIE(String value) {
            this.ie = value;
        }

    }

}
