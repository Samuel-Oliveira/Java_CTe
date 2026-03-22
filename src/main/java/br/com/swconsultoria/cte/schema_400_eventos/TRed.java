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
 * Tipo Redução Base de Cálculo
 * 
 * <p>Classe Java de TRed complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TRed">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pRedAliq" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_04RTC"/>
 *         &lt;element name="pAliqEfet" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_04RTC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TRed", propOrder = {
    "pRedAliq",
    "pAliqEfet"
})
public class TRed {

    @XmlElement(required = true)
    protected String pRedAliq;
    @XmlElement(required = true)
    protected String pAliqEfet;

    /**
     * Obtém o valor da propriedade pRedAliq.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRedAliq() {
        return pRedAliq;
    }

    /**
     * Define o valor da propriedade pRedAliq.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRedAliq(String value) {
        this.pRedAliq = value;
    }

    /**
     * Obtém o valor da propriedade pAliqEfet.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAliqEfet() {
        return pAliqEfet;
    }

    /**
     * Define o valor da propriedade pAliqEfet.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAliqEfet(String value) {
        this.pAliqEfet = value;
    }

}
