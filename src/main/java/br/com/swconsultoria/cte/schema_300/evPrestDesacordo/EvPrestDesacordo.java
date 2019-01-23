
package br.com.swconsultoria.cte.schema_300.evPrestDesacordo;

import javax.xml.bind.annotation.*;


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
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Prestação do Serviço em Desacordo"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="indDesacordoOper">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="xObs">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;minLength value="15"/>
 *               &lt;maxLength value="255"/>
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="[!-ÿ]{1}[ -ÿ]{0,}[!-ÿ]{1}|[!-ÿ]{1}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "descEvento",
        "indDesacordoOper",
        "xObs"
})
@XmlRootElement(name = "evPrestDesacordo", namespace = "http://www.portalfiscal.inf.br/cte")
public class EvPrestDesacordo {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String descEvento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String indDesacordoOper;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String xObs;

    /**
     * Obtém o valor da propriedade descEvento.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * Define o valor da propriedade descEvento.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDescEvento(String value) {
        this.descEvento = value;
    }

    /**
     * Obtém o valor da propriedade indDesacordoOper.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIndDesacordoOper() {
        return indDesacordoOper;
    }

    /**
     * Define o valor da propriedade indDesacordoOper.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIndDesacordoOper(String value) {
        this.indDesacordoOper = value;
    }

    /**
     * Obtém o valor da propriedade xObs.
     *
     * @return possible object is
     * {@link String }
     */
    public String getXObs() {
        return xObs;
    }

    /**
     * Define o valor da propriedade xObs.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXObs(String value) {
        this.xObs = value;
    }

}
