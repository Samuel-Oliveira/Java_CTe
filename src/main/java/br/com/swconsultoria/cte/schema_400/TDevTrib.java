//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.3.0 
// Consulte <a href="https://javaee.github.io/jaxb-v2/">https://javaee.github.io/jaxb-v2/</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.09.16 às 08:55:59 AM BRT 
//


package br.com.swconsultoria.cte.schema_400;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Devolução Tributo
 * 
 * <p>Classe Java de TDevTrib complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TDevTrib"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pDevTrib" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_04RTC" minOccurs="0"/&gt;
 *         &lt;element name="vDevTrib" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDevTrib", propOrder = {
    "pDevTrib",
    "vDevTrib"
})
public class TDevTrib {

    protected String pDevTrib;
    @XmlElement(required = true)
    protected String vDevTrib;

    /**
     * Obtém o valor da propriedade pDevTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPDevTrib() {
        return pDevTrib;
    }

    /**
     * Define o valor da propriedade pDevTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPDevTrib(String value) {
        this.pDevTrib = value;
    }

    /**
     * Obtém o valor da propriedade vDevTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVDevTrib() {
        return vDevTrib;
    }

    /**
     * Define o valor da propriedade vDevTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVDevTrib(String value) {
        this.vDevTrib = value;
    }

}
