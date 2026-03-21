//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.03.21 às 07:12:02 PM BRT 
//


package br.com.swconsultoria.cte.schema_400_eventos;

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
 * &lt;complexType name="TDevTrib">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vDevTrib" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TDevTrib", propOrder = {
    "vDevTrib"
})
public class TDevTrib {

    @XmlElement(required = true)
    protected String vDevTrib;

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
