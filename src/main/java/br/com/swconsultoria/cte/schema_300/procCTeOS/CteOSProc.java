
package br.com.swconsultoria.cte.schema_300.procCTeOS;

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
 *         &lt;element name="CTeOS" type="{http://www.portalfiscal.inf.br/cte}TCTeOS"/>
 *         &lt;element name="protCTe" type="{http://www.portalfiscal.inf.br/cte}TProtCTeOS"/>
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
        "cTeOS",
        "protCTe"
})
@XmlRootElement(name = "cteOSProc")
public class CteOSProc {

    @XmlElement(name = "CTeOS", required = true)
    protected TCTeOS cTeOS;
    @XmlElement(required = true)
    protected TProtCTeOS protCTe;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;
    @XmlAttribute(name = "ipTransmissor")
    protected String ipTransmissor;

    /**
     * Obtém o valor da propriedade cTeOS.
     *
     * @return possible object is
     * {@link TCTeOS }
     */
    public TCTeOS getCTeOS() {
        return cTeOS;
    }

    /**
     * Define o valor da propriedade cTeOS.
     *
     * @param value allowed object is
     *              {@link TCTeOS }
     */
    public void setCTeOS(TCTeOS value) {
        this.cTeOS = value;
    }

    /**
     * Obtém o valor da propriedade protCTe.
     *
     * @return possible object is
     * {@link TProtCTeOS }
     */
    public TProtCTeOS getProtCTe() {
        return protCTe;
    }

    /**
     * Define o valor da propriedade protCTe.
     *
     * @param value allowed object is
     *              {@link TProtCTeOS }
     */
    public void setProtCTe(TProtCTeOS value) {
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
