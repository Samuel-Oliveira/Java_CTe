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
 * Tipo Operações em áreas incentivadas (ALC/ZFM) - CBS (alíquota zero)
 * 
 * <p>Classe Java de TALCZFMCBS_NFe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TALCZFMCBS_NFe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpALCZFMCBS">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nProcSuframa" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TStringRTC">
 *               &lt;minLength value="8"/>
 *               &lt;maxLength value="12"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="pAliqEfetRegCBS" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_04RTC"/>
 *         &lt;element name="vTribRegCBS" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TALCZFMCBS_NFe", propOrder = {
    "tpALCZFMCBS",
    "nProcSuframa",
    "pAliqEfetRegCBS",
    "vTribRegCBS"
})
public class TALCZFMCBSNFe {

    @XmlElement(required = true)
    protected String tpALCZFMCBS;
    protected String nProcSuframa;
    @XmlElement(required = true)
    protected String pAliqEfetRegCBS;
    @XmlElement(required = true)
    protected String vTribRegCBS;

    /**
     * Obtém o valor da propriedade tpALCZFMCBS.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpALCZFMCBS() {
        return tpALCZFMCBS;
    }

    /**
     * Define o valor da propriedade tpALCZFMCBS.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpALCZFMCBS(String value) {
        this.tpALCZFMCBS = value;
    }

    /**
     * Obtém o valor da propriedade nProcSuframa.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProcSuframa() {
        return nProcSuframa;
    }

    /**
     * Define o valor da propriedade nProcSuframa.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProcSuframa(String value) {
        this.nProcSuframa = value;
    }

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
