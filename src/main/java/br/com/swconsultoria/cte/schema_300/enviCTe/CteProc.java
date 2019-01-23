
package br.com.swconsultoria.cte.schema_300.enviCTe;

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
 *         &lt;element name="CTe" type="{http://www.portalfiscal.inf.br/cte}TCTe"/>
 *         &lt;element name="protCTe" type="{http://www.portalfiscal.inf.br/cte}TProtCTe"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerCTe" />
 *       &lt;attribute name="ipTransmissor" type="{http://www.portalfiscal.inf.br/cte}TIPv4" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "cTe",
        "protCTe"
})
@XmlRootElement(name = "cteProc")
public class CteProc {

    @XmlElement(name = "CTe", required = true)
    protected TCTe cTe;
    @XmlElement(required = true)
    protected TProtCTe protCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;

    /**
     * Obtém o valor da propriedade cTe.
     *
     * @return possible object is
     * {@link TCTe }
     */
    public TCTe getCTe() {
        return cTe;
    }

    /**
     * Define o valor da propriedade cTe.
     *
     * @param value allowed object is
     *              {@link TCTe }
     */
    public void setCTe(TCTe value) {
        this.cTe = value;
    }

    /**
     * Obtém o valor da propriedade protCTe.
     *
     * @return possible object is
     * {@link TProtCTe }
     */
    public TProtCTe getProtCTe() {
        return protCTe;
    }

    /**
     * Define o valor da propriedade protCTe.
     *
     * @param value allowed object is
     *              {@link TProtCTe }
     */
    public void setProtCTe(TProtCTe value) {
        this.protCTe = value;
    }

    /**
     * Obtém o valor da propriedade versao.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVersao() {
        return versao;
    }

    /**
     * Define o valor da propriedade versao.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVersao(String value) {
        this.versao = value;
    }

    /**
     * Obtém o valor da propriedade ipTransmissor.
     *
     * @return possible object is
     * {@link String }
     */
    public String getIpTransmissor() {
        return ipTransmissor;
    }

    /**
     * Define o valor da propriedade ipTransmissor.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setIpTransmissor(String value) {
        this.ipTransmissor = value;
    }

}
