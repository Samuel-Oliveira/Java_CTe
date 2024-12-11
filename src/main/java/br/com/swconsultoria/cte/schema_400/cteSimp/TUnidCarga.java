


package br.com.swconsultoria.cte.schema_400.cteSimp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Tipo Dados Unidade de Carga
 * 
 * <p>Java class for TUnidCarga complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUnidCarga"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TtipoUnidCarga"/&gt;
 *         &lt;element name="idUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TContainer"/&gt;
 *         &lt;element name="lacUnidCarga" maxOccurs="unbounded" minOccurs="0"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="nLacre"&gt;
 *                     &lt;simpleType&gt;
 *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
 *                         &lt;minLength value="1"/&gt;
 *                         &lt;maxLength value="20"/&gt;
 *                       &lt;/restriction&gt;
 *                     &lt;/simpleType&gt;
 *                   &lt;/element&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *         &lt;element name="qtdRat" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_0303" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TUnidCarga", propOrder = {
    "tpUnidCarga",
    "idUnidCarga",
    "lacUnidCarga",
    "qtdRat"
})
public class TUnidCarga {

    @XmlElement(required = true)
    protected String tpUnidCarga;
    @XmlElement(required = true)
    protected String idUnidCarga;
    protected List<LacUnidCarga> lacUnidCarga;
    protected String qtdRat;

    /**
     * Gets the value of the tpUnidCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpUnidCarga() {
        return tpUnidCarga;
    }

    /**
     * Sets the value of the tpUnidCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpUnidCarga(String value) {
        this.tpUnidCarga = value;
    }

    /**
     * Gets the value of the idUnidCarga property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnidCarga() {
        return idUnidCarga;
    }

    /**
     * Sets the value of the idUnidCarga property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnidCarga(String value) {
        this.idUnidCarga = value;
    }

    /**
     * Gets the value of the lacUnidCarga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacUnidCarga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacUnidCarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LacUnidCarga }
     * 
     * 
     */
    public List<LacUnidCarga> getLacUnidCarga() {
        if (lacUnidCarga == null) {
            lacUnidCarga = new ArrayList<LacUnidCarga>();
        }
        return this.lacUnidCarga;
    }

    /**
     * Gets the value of the qtdRat property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQtdRat() {
        return qtdRat;
    }

    /**
     * Sets the value of the qtdRat property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQtdRat(String value) {
        this.qtdRat = value;
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
     *         &lt;element name="nLacre"&gt;
     *           &lt;simpleType&gt;
     *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString"&gt;
     *               &lt;minLength value="1"/&gt;
     *               &lt;maxLength value="20"/&gt;
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
        "nLacre"
    })
    public static class LacUnidCarga {

        @XmlElement(required = true)
        protected String nLacre;

        /**
         * Gets the value of the nLacre property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNLacre() {
            return nLacre;
        }

        /**
         * Sets the value of the nLacre property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNLacre(String value) {
            this.nLacre = value;
        }

    }

}
