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
 * Cada DFe que utilizar deverá utilizar esses tipo no grupo ide
 * 
 * <p>Classe Java de TCompraGovReduzido complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TCompraGovReduzido">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpEnteGov" type="{http://www.portalfiscal.inf.br/cte}TEnteGov"/>
 *         &lt;element name="pRedutor" type="{http://www.portalfiscal.inf.br/cte}TDec_0302_04RTC"/>
 *         &lt;element name="tpOperGov" type="{http://www.portalfiscal.inf.br/cte}TOperCompraGov"/>
 *         &lt;element name="refDFeAnt" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TCompraGovReduzido", propOrder = {
    "tpEnteGov",
    "pRedutor",
    "tpOperGov",
    "refDFeAnt"
})
public class TCompraGovReduzido {

    @XmlElement(required = true)
    protected String tpEnteGov;
    @XmlElement(required = true)
    protected String pRedutor;
    @XmlElement(required = true)
    protected String tpOperGov;
    protected Object refDFeAnt;

    /**
     * Obtém o valor da propriedade tpEnteGov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpEnteGov() {
        return tpEnteGov;
    }

    /**
     * Define o valor da propriedade tpEnteGov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpEnteGov(String value) {
        this.tpEnteGov = value;
    }

    /**
     * Obtém o valor da propriedade pRedutor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPRedutor() {
        return pRedutor;
    }

    /**
     * Define o valor da propriedade pRedutor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPRedutor(String value) {
        this.pRedutor = value;
    }

    /**
     * Obtém o valor da propriedade tpOperGov.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpOperGov() {
        return tpOperGov;
    }

    /**
     * Define o valor da propriedade tpOperGov.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpOperGov(String value) {
        this.tpOperGov = value;
    }

    /**
     * Obtém o valor da propriedade refDFeAnt.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getRefDFeAnt() {
        return refDFeAnt;
    }

    /**
     * Define o valor da propriedade refDFeAnt.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setRefDFeAnt(Object value) {
        this.refDFeAnt = value;
    }

}
