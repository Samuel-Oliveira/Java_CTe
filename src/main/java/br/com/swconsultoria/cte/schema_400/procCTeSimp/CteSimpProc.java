
package br.com.swconsultoria.cte.schema_400.procCTeSimp;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
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
 *         &lt;element name="CTeSimp" type="{http://www.portalfiscal.inf.br/cte}TCTeSimp"/>
 *         &lt;element name="protCTe" type="{http://www.portalfiscal.inf.br/cte}TProtCTe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/cte}TIPv4" />
 *       &lt;attribute name="nPortaCon">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,5}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="dhConexao" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "cTeSimp",
    "protCTe"
})
@XmlRootElement(name = "cteSimpProc", namespace = "http://www.portalfiscal.inf.br/cte")
public class CteSimpProc {

    @XmlElement(name = "CTeSimp", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected TCTeSimp cTeSimp;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected TProtCTe protCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;
    @XmlAttribute(name = "nPortaCon")
    protected String nPortaCon;
    @XmlAttribute(name = "dhConexao")
    protected String dhConexao;

    /**
     * Obtém o valor da propriedade cTeSimp.
     * 
     * @return
     *     possible object is
     *     {@link TCTeSimp }
     *     
     */
    public TCTeSimp getCTeSimp() {
        return cTeSimp;
    }

    /**
     * Define o valor da propriedade cTeSimp.
     * 
     * @param value
     *     allowed object is
     *     {@link TCTeSimp }
     *     
     */
    public void setCTeSimp(TCTeSimp value) {
        this.cTeSimp = value;
    }

    /**
     * Obtém o valor da propriedade protCTe.
     * 
     * @return
     *     possible object is
     *     {@link TProtCTe }
     *     
     */
    public TProtCTe getProtCTe() {
        return protCTe;
    }

    /**
     * Define o valor da propriedade protCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link TProtCTe }
     *     
     */
    public void setProtCTe(TProtCTe value) {
        this.protCTe = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade ipTransmissor.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIpTransmissor() {
        return ipTransmissor;
    }

    /**
     * Define o valor da propriedade ipTransmissor.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIpTransmissor(String value) {
        this.ipTransmissor = value;
    }

    /**
     * Obtém o valor da propriedade nPortaCon.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNPortaCon() {
        return nPortaCon;
    }

    /**
     * Define o valor da propriedade nPortaCon.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNPortaCon(String value) {
        this.nPortaCon = value;
    }

    /**
     * Obtém o valor da propriedade dhConexao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDhConexao() {
        return dhConexao;
    }

    /**
     * Define o valor da propriedade dhConexao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDhConexao(String value) {
        this.dhConexao = value;
    }

}
