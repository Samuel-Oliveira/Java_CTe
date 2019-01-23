
package br.com.swconsultoria.cte.schema_300.inutCTe;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Tipo Pedido de Inutilização de Numeração do Conhecimento de Transporte eletrônico
 *
 * <p>Classe Java de TInutCTe complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * &lt;complexType name="TInutCTe">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infInut">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *                   &lt;element name="xServ" type="{http://www.portalfiscal.inf.br/cte}TServ"/>
 *                   &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
 *                   &lt;element name="ano">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
 *                         &lt;pattern value="[0-9]{1,2}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                   &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT_Carga_OS"/>
 *                   &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
 *                   &lt;element name="nCTIni" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
 *                   &lt;element name="nCTFin" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
 *                   &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/cte}TJust"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="ID[0-9]{39}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TVerInutCTe">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TInutCTe", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
        "infInut",
        "signature"
})
public class TInutCTe {

    @XmlElement(required = true)
    protected InfInut infInut;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade infInut.
     *
     * @return possible object is
     * {@link InfInut }
     */
    public InfInut getInfInut() {
        return infInut;
    }

    /**
     * Define o valor da propriedade infInut.
     *
     * @param value allowed object is
     *              {@link InfInut }
     */
    public void setInfInut(InfInut value) {
        this.infInut = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     *
     * @return possible object is
     * {@link SignatureType }
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     *
     * @param value allowed object is
     *              {@link SignatureType }
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     *       &lt;sequence>
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
     *         &lt;element name="xServ" type="{http://www.portalfiscal.inf.br/cte}TServ"/>
     *         &lt;element name="cUF" type="{http://www.portalfiscal.inf.br/cte}TCodUfIBGE"/>
     *         &lt;element name="ano">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}short">
     *               &lt;pattern value="[0-9]{1,2}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *         &lt;element name="mod" type="{http://www.portalfiscal.inf.br/cte}TModCT_Carga_OS"/>
     *         &lt;element name="serie" type="{http://www.portalfiscal.inf.br/cte}TSerie"/>
     *         &lt;element name="nCTIni" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
     *         &lt;element name="nCTFin" type="{http://www.portalfiscal.inf.br/cte}TNF"/>
     *         &lt;element name="xJust" type="{http://www.portalfiscal.inf.br/cte}TJust"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="ID[0-9]{39}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
            "tpAmb",
            "xServ",
            "cuf",
            "ano",
            "cnpj",
            "mod",
            "serie",
            "nctIni",
            "nctFin",
            "xJust"
    })
    public static class InfInut {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String tpAmb;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String xServ;
        @XmlElement(name = "cUF", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cuf;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected short ano;
        @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cnpj;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String mod;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String serie;
        @XmlElement(name = "nCTIni", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String nctIni;
        @XmlElement(name = "nCTFin", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String nctFin;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String xJust;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

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
         * Obtém o valor da propriedade xServ.
         *
         * @return possible object is
         * {@link String }
         */
        public String getXServ() {
            return xServ;
        }

        /**
         * Define o valor da propriedade xServ.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setXServ(String value) {
            this.xServ = value;
        }

        /**
         * Obtém o valor da propriedade cuf.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCUF() {
            return cuf;
        }

        /**
         * Define o valor da propriedade cuf.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCUF(String value) {
            this.cuf = value;
        }

        /**
         * Obtém o valor da propriedade ano.
         */
        public short getAno() {
            return ano;
        }

        /**
         * Define o valor da propriedade ano.
         */
        public void setAno(short value) {
            this.ano = value;
        }

        /**
         * Obtém o valor da propriedade cnpj.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Obtém o valor da propriedade mod.
         *
         * @return possible object is
         * {@link String }
         */
        public String getMod() {
            return mod;
        }

        /**
         * Define o valor da propriedade mod.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setMod(String value) {
            this.mod = value;
        }

        /**
         * Obtém o valor da propriedade serie.
         *
         * @return possible object is
         * {@link String }
         */
        public String getSerie() {
            return serie;
        }

        /**
         * Define o valor da propriedade serie.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setSerie(String value) {
            this.serie = value;
        }

        /**
         * Obtém o valor da propriedade nctIni.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNCTIni() {
            return nctIni;
        }

        /**
         * Define o valor da propriedade nctIni.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNCTIni(String value) {
            this.nctIni = value;
        }

        /**
         * Obtém o valor da propriedade nctFin.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNCTFin() {
            return nctFin;
        }

        /**
         * Define o valor da propriedade nctFin.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNCTFin(String value) {
            this.nctFin = value;
        }

        /**
         * Obtém o valor da propriedade xJust.
         *
         * @return possible object is
         * {@link String }
         */
        public String getXJust() {
            return xJust;
        }

        /**
         * Define o valor da propriedade xJust.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setXJust(String value) {
            this.xJust = value;
        }

        /**
         * Obtém o valor da propriedade id.
         *
         * @return possible object is
         * {@link String }
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setId(String value) {
            this.id = value;
        }

    }

}
