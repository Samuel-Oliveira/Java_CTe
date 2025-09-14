
package br.com.swconsultoria.cte.schema_400.cteModalAquaviario;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Grupo de informações da Tributação da NFCom
 * 
 * <p>Classe Java de TTribNFCom complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TTribNFCom">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CST" type="{http://www.portalfiscal.inf.br/cte}TCST"/>
 *         &lt;element name="cClassTrib" type="{http://www.portalfiscal.inf.br/cte}TcClassTrib"/>
 *         &lt;element name="gIBSCBS" type="{http://www.portalfiscal.inf.br/cte}TCIBS" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TTribNFCom", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
    "cst",
    "cClassTrib",
    "gibscbs"
})
public class TTribNFCom {

    @XmlElement(name = "CST", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String cst;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String cClassTrib;
    @XmlElement(name = "gIBSCBS", namespace = "http://www.portalfiscal.inf.br/cte")
    protected TCIBS gibscbs;

    /**
     * Obtém o valor da propriedade cst.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCST() {
        return cst;
    }

    /**
     * Define o valor da propriedade cst.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCST(String value) {
        this.cst = value;
    }

    /**
     * Obtém o valor da propriedade cClassTrib.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCClassTrib() {
        return cClassTrib;
    }

    /**
     * Define o valor da propriedade cClassTrib.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCClassTrib(String value) {
        this.cClassTrib = value;
    }

    /**
     * Obtém o valor da propriedade gibscbs.
     * 
     * @return
     *     possible object is
     *     {@link TCIBS }
     *     
     */
    public TCIBS getGIBSCBS() {
        return gibscbs;
    }

    /**
     * Define o valor da propriedade gibscbs.
     * 
     * @param value
     *     allowed object is
     *     {@link TCIBS }
     *     
     */
    public void setGIBSCBS(TCIBS value) {
        this.gibscbs = value;
    }

}
