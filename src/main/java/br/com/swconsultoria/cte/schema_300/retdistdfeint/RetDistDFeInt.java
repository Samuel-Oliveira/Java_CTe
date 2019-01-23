
package br.com.swconsultoria.cte.schema_300.retdistdfeint;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import java.util.ArrayList;
import java.util.List;


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
 *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *         &lt;element name="verAplic" type="{http://www.portalfiscal.inf.br/cte}TVerAplic"/>
 *         &lt;element name="cStat" type="{http://www.portalfiscal.inf.br/cte}TStat"/>
 *         &lt;element name="xMotivo" type="{http://www.portalfiscal.inf.br/cte}TMotivo"/>
 *         &lt;element name="dhResp">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;pattern value="(((20(([02468][048])|([13579][26]))-02-29))|(20[0-9][0-9])-((((0[1-9])|(1[0-2]))-((0[1-9])|(1\d)|(2[0-8])))|((((0[13578])|(1[02]))-31)|(((0[1,3-9])|(1[0-2]))-(29|30)))))T(20|21|22|23|[0-1]\d):[0-5]\d:[0-5]\d"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="ultNSU" type="{http://www.portalfiscal.inf.br/cte}TNSU"/>
 *         &lt;element name="maxNSU" type="{http://www.portalfiscal.inf.br/cte}TNSU"/>
 *         &lt;element name="loteDistDFeInt" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="50">
 *                   &lt;element name="docZip">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
 *                           &lt;attribute name="NSU" use="required" type="{http://www.portalfiscal.inf.br/cte}TNSU" />
 *                           &lt;attribute name="schema" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerDistDFe" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "tpAmb",
        "verAplic",
        "cStat",
        "xMotivo",
        "dhResp",
        "ultNSU",
        "maxNSU",
        "loteDistDFeInt"
})
@XmlRootElement(name = "retDistDFeInt")
public class RetDistDFeInt {

    @XmlElement(required = true)
    protected String tpAmb;
    @XmlElement(required = true)
    protected String verAplic;
    @XmlElement(required = true)
    protected String cStat;
    @XmlElement(required = true)
    protected String xMotivo;
    @XmlElement(required = true)
    protected String dhResp;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ultNSU;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String maxNSU;
    protected LoteDistDFeInt loteDistDFeInt;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade tpAmb.
     *
     * @return possible object is
     * {@link String }
     */
    public String getTpAmb() {
        return tpAmb;
    }

    /**
     * Define o valor da propriedade tpAmb.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setTpAmb(String value) {
        this.tpAmb = value;
    }

    /**
     * Obtém o valor da propriedade verAplic.
     *
     * @return possible object is
     * {@link String }
     */
    public String getVerAplic() {
        return verAplic;
    }

    /**
     * Define o valor da propriedade verAplic.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setVerAplic(String value) {
        this.verAplic = value;
    }

    /**
     * Obtém o valor da propriedade cStat.
     *
     * @return possible object is
     * {@link String }
     */
    public String getCStat() {
        return cStat;
    }

    /**
     * Define o valor da propriedade cStat.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setCStat(String value) {
        this.cStat = value;
    }

    /**
     * Obtém o valor da propriedade xMotivo.
     *
     * @return possible object is
     * {@link String }
     */
    public String getXMotivo() {
        return xMotivo;
    }

    /**
     * Define o valor da propriedade xMotivo.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXMotivo(String value) {
        this.xMotivo = value;
    }

    /**
     * Obtém o valor da propriedade dhResp.
     *
     * @return possible object is
     * {@link String }
     */
    public String getDhResp() {
        return dhResp;
    }

    /**
     * Define o valor da propriedade dhResp.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setDhResp(String value) {
        this.dhResp = value;
    }

    /**
     * Obtém o valor da propriedade ultNSU.
     *
     * @return possible object is
     * {@link String }
     */
    public String getUltNSU() {
        return ultNSU;
    }

    /**
     * Define o valor da propriedade ultNSU.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setUltNSU(String value) {
        this.ultNSU = value;
    }

    /**
     * Obtém o valor da propriedade maxNSU.
     *
     * @return possible object is
     * {@link String }
     */
    public String getMaxNSU() {
        return maxNSU;
    }

    /**
     * Define o valor da propriedade maxNSU.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setMaxNSU(String value) {
        this.maxNSU = value;
    }

    /**
     * Obtém o valor da propriedade loteDistDFeInt.
     *
     * @return possible object is
     * {@link LoteDistDFeInt }
     */
    public LoteDistDFeInt getLoteDistDFeInt() {
        return loteDistDFeInt;
    }

    /**
     * Define o valor da propriedade loteDistDFeInt.
     *
     * @param value allowed object is
     *              {@link LoteDistDFeInt }
     */
    public void setLoteDistDFeInt(LoteDistDFeInt value) {
        this.loteDistDFeInt = value;
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
     * <p>Classe Java de anonymous complex type.
     *
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     *
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence maxOccurs="50">
     *         &lt;element name="docZip">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
     *                 &lt;attribute name="NSU" use="required" type="{http://www.portalfiscal.inf.br/cte}TNSU" />
     *                 &lt;attribute name="schema" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "docZip"
    })
    public static class LoteDistDFeInt {

        @XmlElement(required = true)
        protected List<DocZip> docZip;

        /**
         * Gets the value of the docZip property.
         *
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docZip property.
         *
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocZip().add(newItem);
         * </pre>
         *
         *
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link DocZip }
         */
        public List<DocZip> getDocZip() {
            if (docZip == null) {
                docZip = new ArrayList<DocZip>();
            }
            return this.docZip;
        }


        /**
         * <p>Classe Java de anonymous complex type.
         *
         * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
         *
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>base64Binary">
         *       &lt;attribute name="NSU" use="required" type="{http://www.portalfiscal.inf.br/cte}TNSU" />
         *       &lt;attribute name="schema" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
                "value"
        })
        public static class DocZip {

            @XmlValue
            protected byte[] value;
            @XmlAttribute(name = "NSU", required = true)
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String nsu;
            @XmlAttribute(name = "schema", required = true)
            protected String schema;

            /**
             * Obtém o valor da propriedade value.
             *
             * @return possible object is
             * byte[]
             */
            public byte[] getValue() {
                return value;
            }

            /**
             * Define o valor da propriedade value.
             *
             * @param value allowed object is
             *              byte[]
             */
            public void setValue(byte[] value) {
                this.value = value;
            }

            /**
             * Obtém o valor da propriedade nsu.
             *
             * @return possible object is
             * {@link String }
             */
            public String getNSU() {
                return nsu;
            }

            /**
             * Define o valor da propriedade nsu.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setNSU(String value) {
                this.nsu = value;
            }

            /**
             * Obtém o valor da propriedade schema.
             *
             * @return possible object is
             * {@link String }
             */
            public String getSchema() {
                return schema;
            }

            /**
             * Define o valor da propriedade schema.
             *
             * @param value allowed object is
             *              {@link String }
             */
            public void setSchema(String value) {
                this.schema = value;
            }

        }

    }

}
