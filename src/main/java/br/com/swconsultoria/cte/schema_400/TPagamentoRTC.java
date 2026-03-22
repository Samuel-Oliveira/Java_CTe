//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.03.21 às 07:12:45 PM BRT 
//


package br.com.swconsultoria.cte.schema_400;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Cada DFe que utilizar deverá utilizar esses tipo no grupo ide
 * 
 * <p>Classe Java de TPagamentoRTC complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TPagamentoRTC">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpMeioPgto" type="{http://www.portalfiscal.inf.br/cte}TMeioPgto"/>
 *         &lt;element name="CNPJReceb" type="{http://www.portalfiscal.inf.br/cte}TCnpjRTC"/>
 *         &lt;element name="CNPJBasePSP" type="{http://www.portalfiscal.inf.br/cte}TCnpjBaseRTC"/>
 *       &lt;/sequence>
 *       &lt;attribute name="nPag" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;whiteSpace value="preserve"/>
 *             &lt;pattern value="[1-9]{1}[0-9]{0,1}|[1-8]{1}[0-9]{2}|[9]{1}[0-8]{1}[0-9]{1}|[9]{1}[9]{1}[0]{1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="idTransacao" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TStringRTC">
 *             &lt;minLength value="2"/>
 *             &lt;maxLength value="35"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TPagamentoRTC", propOrder = {
    "tpMeioPgto",
    "cnpjReceb",
    "cnpjBasePSP"
})
public class TPagamentoRTC {

    @XmlElement(required = true)
    protected String tpMeioPgto;
    @XmlElement(name = "CNPJReceb", required = true)
    protected String cnpjReceb;
    @XmlElement(name = "CNPJBasePSP", required = true)
    protected String cnpjBasePSP;
    @XmlAttribute(name = "nPag", required = true)
    protected String nPag;
    @XmlAttribute(name = "idTransacao", required = true)
    protected String idTransacao;

    /**
     * Obtém o valor da propriedade tpMeioPgto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpMeioPgto() {
        return tpMeioPgto;
    }

    /**
     * Define o valor da propriedade tpMeioPgto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpMeioPgto(String value) {
        this.tpMeioPgto = value;
    }

    /**
     * Obtém o valor da propriedade cnpjReceb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJReceb() {
        return cnpjReceb;
    }

    /**
     * Define o valor da propriedade cnpjReceb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJReceb(String value) {
        this.cnpjReceb = value;
    }

    /**
     * Obtém o valor da propriedade cnpjBasePSP.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCNPJBasePSP() {
        return cnpjBasePSP;
    }

    /**
     * Define o valor da propriedade cnpjBasePSP.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCNPJBasePSP(String value) {
        this.cnpjBasePSP = value;
    }

    /**
     * Obtém o valor da propriedade nPag.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPag() {
        return nPag;
    }

    /**
     * Define o valor da propriedade nPag.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPag(String value) {
        this.nPag = value;
    }

    /**
     * Obtém o valor da propriedade idTransacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIdTransacao() {
        return idTransacao;
    }

    /**
     * Define o valor da propriedade idTransacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIdTransacao(String value) {
        this.idTransacao = value;
    }

}
