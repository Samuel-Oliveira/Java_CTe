//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.03.21 às 07:12:45 PM BRT 
//


package br.com.swconsultoria.cte.schema_400;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Tipo Ajuste de Competência
 * 
 * <p>Classe Java de TAjusteCompet complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TAjusteCompet">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="competApur" type="{http://www.portalfiscal.inf.br/cte}TCompetApur"/>
 *         &lt;element name="vIBS" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/>
 *         &lt;element name="vCBS" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TAjusteCompet", propOrder = {
    "competApur",
    "vibs",
    "vcbs"
})
public class TAjusteCompet {

    @XmlElement(required = true)
    @XmlSchemaType(name = "gYearMonth")
    protected XMLGregorianCalendar competApur;
    @XmlElement(name = "vIBS", required = true)
    protected String vibs;
    @XmlElement(name = "vCBS", required = true)
    protected String vcbs;

    /**
     * Obtém o valor da propriedade competApur.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCompetApur() {
        return competApur;
    }

    /**
     * Define o valor da propriedade competApur.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCompetApur(XMLGregorianCalendar value) {
        this.competApur = value;
    }

    /**
     * Obtém o valor da propriedade vibs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIBS() {
        return vibs;
    }

    /**
     * Define o valor da propriedade vibs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIBS(String value) {
        this.vibs = value;
    }

    /**
     * Obtém o valor da propriedade vcbs.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVCBS() {
        return vcbs;
    }

    /**
     * Define o valor da propriedade vcbs.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVCBS(String value) {
        this.vcbs = value;
    }

}
