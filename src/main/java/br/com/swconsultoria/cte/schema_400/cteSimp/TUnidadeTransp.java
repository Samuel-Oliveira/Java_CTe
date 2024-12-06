


package br.com.swconsultoria.cte.schema_400.cteSimp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import java.util.ArrayList;
import java.util.List;


/**
 * Tipo Dados Unidade de Transporte
 * 
 * <p>Java class for TUnidadeTransp complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TUnidadeTransp"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="tpUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TtipoUnidTransp"/&gt;
 *         &lt;element name="idUnidTransp" type="{http://www.portalfiscal.inf.br/cte}TContainer"/&gt;
 *         &lt;element name="lacUnidTransp" maxOccurs="unbounded" minOccurs="0"&gt;
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
 *         &lt;element name="infUnidCarga" type="{http://www.portalfiscal.inf.br/cte}TUnidCarga" maxOccurs="unbounded" minOccurs="0"/&gt;
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
@XmlType(name = "TUnidadeTransp", propOrder = {
    "tpUnidTransp",
    "idUnidTransp",
    "lacUnidTransp",
    "infUnidCarga",
    "qtdRat"
})
public class TUnidadeTransp {

    @XmlElement(required = true)
    protected String tpUnidTransp;
    @XmlElement(required = true)
    protected String idUnidTransp;
    protected List<LacUnidTransp> lacUnidTransp;
    protected List<TUnidCarga> infUnidCarga;
    protected String qtdRat;

    /**
     * Gets the value of the tpUnidTransp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpUnidTransp() {
        return tpUnidTransp;
    }

    /**
     * Sets the value of the tpUnidTransp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpUnidTransp(String value) {
        this.tpUnidTransp = value;
    }

    /**
     * Gets the value of the idUnidTransp property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdUnidTransp() {
        return idUnidTransp;
    }

    /**
     * Sets the value of the idUnidTransp property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdUnidTransp(String value) {
        this.idUnidTransp = value;
    }

    /**
     * Gets the value of the lacUnidTransp property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the lacUnidTransp property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLacUnidTransp().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link LacUnidTransp }
     * 
     * 
     */
    public List<LacUnidTransp> getLacUnidTransp() {
        if (lacUnidTransp == null) {
            lacUnidTransp = new ArrayList<LacUnidTransp>();
        }
        return this.lacUnidTransp;
    }

    /**
     * Gets the value of the infUnidCarga property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infUnidCarga property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfUnidCarga().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TUnidCarga }
     * 
     * 
     */
    public List<TUnidCarga> getInfUnidCarga() {
        if (infUnidCarga == null) {
            infUnidCarga = new ArrayList<TUnidCarga>();
        }
        return this.infUnidCarga;
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
    public static class LacUnidTransp {

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
