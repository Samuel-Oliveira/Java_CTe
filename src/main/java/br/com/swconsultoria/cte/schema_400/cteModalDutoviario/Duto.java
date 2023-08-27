
package br.com.swconsultoria.cte.schema_400.cteModalDutoviario;

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
 *         &lt;element name="vTar" type="{http://www.portalfiscal.inf.br/cte}TDec_0906Opc" minOccurs="0"/>
 *         &lt;element name="dIni" type="{http://www.portalfiscal.inf.br/cte}TData"/>
 *         &lt;element name="dFim" type="{http://www.portalfiscal.inf.br/cte}TData"/>
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
    "vTar",
    "dIni",
    "dFim"
})
@XmlRootElement(name = "duto", namespace = "http://www.portalfiscal.inf.br/cte")
public class Duto {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String vTar;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String dIni;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String dFim;

    /**
     * Obtém o valor da propriedade vTar.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVTar() {
        return vTar;
    }

    /**
     * Define o valor da propriedade vTar.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVTar(String value) {
        this.vTar = value;
    }

    /**
     * Obtém o valor da propriedade dIni.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDIni() {
        return dIni;
    }

    /**
     * Define o valor da propriedade dIni.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDIni(String value) {
        this.dIni = value;
    }

    /**
     * Obtém o valor da propriedade dFim.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDFim() {
        return dFim;
    }

    /**
     * Define o valor da propriedade dFim.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDFim(String value) {
        this.dFim = value;
    }

}
