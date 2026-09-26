//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.09.26 às 07:36:19 PM BRT 
//


package br.com.swconsultoria.cte.schema_400_eventos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo dados de totais do SN
 * 
 * <p>Classe Java de TTotalSN complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TTotalSN">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vRBSNTot" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/>
 *         &lt;element name="vIBSSNTot" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC" minOccurs="0"/>
 *         &lt;element name="vIBSSNtotPendSusp" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC" minOccurs="0"/>
 *         &lt;element name="vCBSSNTot" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC" minOccurs="0"/>
 *         &lt;element name="vCBSSNtotPendSusp" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTotalSN", propOrder = {
    "vrbsnTot",
    "vibssnTot",
    "vibssNtotPendSusp",
    "vcbssnTot",
    "vcbssNtotPendSusp"
})
public class TTotalSN {

    @XmlElement(name = "vRBSNTot", required = true)
    protected String vrbsnTot;
    @XmlElement(name = "vIBSSNTot")
    protected String vibssnTot;
    @XmlElement(name = "vIBSSNtotPendSusp")
    protected String vibssNtotPendSusp;
    @XmlElement(name = "vCBSSNTot")
    protected String vcbssnTot;
    @XmlElement(name = "vCBSSNtotPendSusp")
    protected String vcbssNtotPendSusp;

    /**
     * Obtém o valor da propriedade vrbsnTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVRBSNTot() {
        return vrbsnTot;
    }

    /**
     * Define o valor da propriedade vrbsnTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVRBSNTot(String value) {
        this.vrbsnTot = value;
    }

    /**
     * Obtém o valor da propriedade vibssnTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIBSSNTot() {
        return vibssnTot;
    }

    /**
     * Define o valor da propriedade vibssnTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIBSSNTot(String value) {
        this.vibssnTot = value;
    }

    /**
     * Obtém o valor da propriedade vibssNtotPendSusp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIBSSNtotPendSusp() {
        return vibssNtotPendSusp;
    }

    /**
     * Define o valor da propriedade vibssNtotPendSusp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIBSSNtotPendSusp(String value) {
        this.vibssNtotPendSusp = value;
    }

    /**
     * Obtém o valor da propriedade vcbssnTot.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCBSSNTot() {
        return vcbssnTot;
    }

    /**
     * Define o valor da propriedade vcbssnTot.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCBSSNTot(String value) {
        this.vcbssnTot = value;
    }

    /**
     * Obtém o valor da propriedade vcbssNtotPendSusp.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCBSSNtotPendSusp() {
        return vcbssNtotPendSusp;
    }

    /**
     * Define o valor da propriedade vcbssNtotPendSusp.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCBSSNtotPendSusp(String value) {
        this.vcbssNtotPendSusp = value;
    }

}
