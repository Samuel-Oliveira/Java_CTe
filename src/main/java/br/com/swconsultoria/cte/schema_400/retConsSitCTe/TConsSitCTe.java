
package br.com.swconsultoria.cte.schema_400.retConsSitCTe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Tipo Pedido de Consulta da Situação Atual do Conhecimento de Transporte eletrônico
 * 
 * <p>Classe Java de TConsSitCTe complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TConsSitCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *         &lt;element name="xServ" type="{http://www.portalfiscal.inf.br/cte}TServ"/>
 *         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerConsSitCTe">
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
@XmlType(name = "TConsSitCTe", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
    "tpAmb",
    "xServ",
    "chCTe"
})
public class TConsSitCTe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String tpAmb;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String xServ;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String chCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade tpAmb.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade xServ.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXServ() {
        return xServ;
    }

    /**
     * Define o valor da propriedade xServ.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXServ(String value) {
        this.xServ = value;
    }

    /**
     * Obtém o valor da propriedade chCTe.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChCTe() {
        return chCTe;
    }

    /**
     * Define o valor da propriedade chCTe.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChCTe(String value) {
        this.chCTe = value;
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

}
