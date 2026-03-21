//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.03.21 às 07:12:02 PM BRT 
//


package br.com.swconsultoria.cte.schema_400_eventos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
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
 *               &lt;enumeration value="Insucesso na Entrega do CT-e"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nProt" type="{http://www.portalfiscal.inf.br/cte}TProt"/>
 *         &lt;element name="dhTentativaEntrega">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nTentativa" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[0-9]{3}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpMotivo">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *               &lt;enumeration value="4"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xJustMotivo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="15"/>
 *               &lt;maxLength value="256"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="latitude" type="{http://www.portalfiscal.inf.br/cte}TLatitude" minOccurs="0"/>
 *         &lt;element name="longitude" type="{http://www.portalfiscal.inf.br/cte}TLongitude" minOccurs="0"/>
 *         &lt;element name="hashTentativaEntrega" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}base64Binary">
 *               &lt;length value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="dhHashTentativaEntrega" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC">
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infEntrega" maxOccurs="2000" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
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
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "descEvento",
    "nProt",
    "dhTentativaEntrega",
    "nTentativa",
    "tpMotivo",
    "xJustMotivo",
    "latitude",
    "longitude",
    "hashTentativaEntrega",
    "dhHashTentativaEntrega",
    "infEntrega"
})
@XmlRootElement(name = "evIECTe")
public class EvIECTe {

    @XmlElement(required = true)
    protected String descEvento;
    @XmlElement(required = true)
    protected String nProt;
    @XmlElement(required = true)
    protected String dhTentativaEntrega;
    protected String nTentativa;
    @XmlElement(required = true)
    protected String tpMotivo;
    protected String xJustMotivo;
    protected String latitude;
    protected String longitude;
    protected byte[] hashTentativaEntrega;
    protected String dhHashTentativaEntrega;
    protected List<EvIECTe.InfEntrega> infEntrega;

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
     * Obtém o valor da propriedade nProt.
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
     * Define o valor da propriedade nProt.
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
     * Obtém o valor da propriedade dhTentativaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhTentativaEntrega() {
        return dhTentativaEntrega;
    }

    /**
     * Define o valor da propriedade dhTentativaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhTentativaEntrega(String value) {
        this.dhTentativaEntrega = value;
    }

    /**
     * Obtém o valor da propriedade nTentativa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNTentativa() {
        return nTentativa;
    }

    /**
     * Define o valor da propriedade nTentativa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNTentativa(String value) {
        this.nTentativa = value;
    }

    /**
     * Obtém o valor da propriedade tpMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpMotivo() {
        return tpMotivo;
    }

    /**
     * Define o valor da propriedade tpMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpMotivo(String value) {
        this.tpMotivo = value;
    }

    /**
     * Obtém o valor da propriedade xJustMotivo.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXJustMotivo() {
        return xJustMotivo;
    }

    /**
     * Define o valor da propriedade xJustMotivo.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXJustMotivo(String value) {
        this.xJustMotivo = value;
    }

    /**
     * Obtém o valor da propriedade latitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLatitude() {
        return latitude;
    }

    /**
     * Define o valor da propriedade latitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLatitude(String value) {
        this.latitude = value;
    }

    /**
     * Obtém o valor da propriedade longitude.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLongitude() {
        return longitude;
    }

    /**
     * Define o valor da propriedade longitude.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLongitude(String value) {
        this.longitude = value;
    }

    /**
     * Obtém o valor da propriedade hashTentativaEntrega.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getHashTentativaEntrega() {
        return hashTentativaEntrega;
    }

    /**
     * Define o valor da propriedade hashTentativaEntrega.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setHashTentativaEntrega(byte[] value) {
        this.hashTentativaEntrega = value;
    }

    /**
     * Obtém o valor da propriedade dhHashTentativaEntrega.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhHashTentativaEntrega() {
        return dhHashTentativaEntrega;
    }

    /**
     * Define o valor da propriedade dhHashTentativaEntrega.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhHashTentativaEntrega(String value) {
        this.dhHashTentativaEntrega = value;
    }

    /**
     * Gets the value of the infEntrega property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infEntrega property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfEntrega().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EvIECTe.InfEntrega }
     * 
     * 
     */
    public List<EvIECTe.InfEntrega> getInfEntrega() {
        if (infEntrega == null) {
            infEntrega = new ArrayList<EvIECTe.InfEntrega>();
        }
        return this.infEntrega;
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
     *         &lt;element name="chNFe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
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
        "chNFe"
    })
    public static class InfEntrega {

        @XmlElement(required = true)
        protected String chNFe;

        /**
         * Obtém o valor da propriedade chNFe.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChNFe() {
            return chNFe;
        }

        /**
         * Define o valor da propriedade chNFe.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChNFe(String value) {
            this.chNFe = value;
        }

    }

}
