
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
 *         &lt;element name="classDuto" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *               &lt;enumeration value="3"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="tpContratacao" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *               &lt;enumeration value="2"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codPontoEntrada" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="codPontoSaida" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nContrato" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *               &lt;minLength value="2"/>
 *               &lt;maxLength value="20"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
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
    "dFim",
    "classDuto",
    "tpContratacao",
    "codPontoEntrada",
    "codPontoSaida",
    "nContrato"
})
@XmlRootElement(name = "duto", namespace = "http://www.portalfiscal.inf.br/cte")
public class Duto {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String vTar;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String dIni;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String dFim;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String classDuto;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String tpContratacao;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String codPontoEntrada;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String codPontoSaida;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
    protected String nContrato;

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

    /**
     * Obtém o valor da propriedade classDuto.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClassDuto() {
        return classDuto;
    }

    /**
     * Define o valor da propriedade classDuto.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClassDuto(String value) {
        this.classDuto = value;
    }

    /**
     * Obtém o valor da propriedade tpContratacao.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTpContratacao() {
        return tpContratacao;
    }

    /**
     * Define o valor da propriedade tpContratacao.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTpContratacao(String value) {
        this.tpContratacao = value;
    }

    /**
     * Obtém o valor da propriedade codPontoEntrada.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPontoEntrada() {
        return codPontoEntrada;
    }

    /**
     * Define o valor da propriedade codPontoEntrada.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPontoEntrada(String value) {
        this.codPontoEntrada = value;
    }

    /**
     * Obtém o valor da propriedade codPontoSaida.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodPontoSaida() {
        return codPontoSaida;
    }

    /**
     * Define o valor da propriedade codPontoSaida.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodPontoSaida(String value) {
        this.codPontoSaida = value;
    }

    /**
     * Obtém o valor da propriedade nContrato.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNContrato() {
        return nContrato;
    }

    /**
     * Define o valor da propriedade nContrato.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNContrato(String value) {
        this.nContrato = value;
    }

}
