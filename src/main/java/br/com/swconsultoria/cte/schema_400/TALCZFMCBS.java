//
// Este arquivo foi gerado pela Eclipse Implementation of JAXB, v2.3.7 
// Consulte https://eclipse-ee4j.github.io/jaxb-ri 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.09.23 às 05:08:20 PM BRT 
//


package br.com.swconsultoria.cte.schema_400;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Operações em areas incentivadas com CBS Zero
 * 
 * <p>Classe Java de TALCZFMCBS complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TALCZFMCBS"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pAliqEfetRegCBS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_04RTC"/&gt;
 *         &lt;element name="vTribRegCBS" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TALCZFMCBS", propOrder = {
    "pAliqEfetRegCBS",
    "vTribRegCBS"
})
public class TALCZFMCBS {

    @XmlElement(required = true)
    protected String pAliqEfetRegCBS;
    @XmlElement(required = true)
    protected String vTribRegCBS;

    /**
     * Obtém o valor da propriedade pAliqEfetRegCBS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPAliqEfetRegCBS() {
        return pAliqEfetRegCBS;
    }

    /**
     * Define o valor da propriedade pAliqEfetRegCBS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPAliqEfetRegCBS(String value) {
        this.pAliqEfetRegCBS = value;
    }

    /**
     * Obtém o valor da propriedade vTribRegCBS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTribRegCBS() {
        return vTribRegCBS;
    }

    /**
     * Define o valor da propriedade vTribRegCBS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTribRegCBS(String value) {
        this.vTribRegCBS = value;
    }

}
