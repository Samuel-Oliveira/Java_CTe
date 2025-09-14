
package br.com.swconsultoria.cte.schema_400.evEPECCTe;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlID;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import org.w3c.dom.Element;


/**
 * Tipo Evento
 * 
 * <p>Classe Java de TEvento complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TEvento">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="infEvento">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/cte}TCOrgaoIBGE"/>
 *                   &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
 *                   &lt;choice>
 *                     &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                     &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
 *                   &lt;/choice>
 *                   &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
 *                   &lt;element name="dhEvento" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/>
 *                   &lt;element name="tpEvento">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{6}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nSeqEvento">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[0-9]{1,3}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="detEvento">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;any processContents='skip'/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="versaoEvento" use="required">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;whiteSpace value="preserve"/>
 *                                 &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infSolicNFF" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="xSolic">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
 *                                   &lt;minLength value="2"/>
 *                                   &lt;maxLength value="2000"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infPAA" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
 *                             &lt;element name="PAASignature">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
 *                                       &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Id" use="required">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
 *                       &lt;pattern value="ID[0-9]{12}[A-Z0-9]{12}[0-9]{29}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.w3.org/2000/09/xmldsig#}Signature"/>
 *       &lt;/sequence>
 *       &lt;attribute name="versao" use="required" type="{http://www.portalfiscal.inf.br/cte}TVerEvento" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TEvento", namespace = "http://www.portalfiscal.inf.br/cte", propOrder = {
    "infEvento",
    "signature"
})
public class TEvento {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected TEvento.InfEvento infEvento;
    @XmlElement(name = "Signature", namespace = "http://www.w3.org/2000/09/xmldsig#", required = true)
    protected SignatureType signature;
    @XmlAttribute(name = "versao", required = true)
    protected String versao;

    /**
     * Obtém o valor da propriedade infEvento.
     * 
     * @return
     *     possible object is
     *     {@link TEvento.InfEvento }
     *     
     */
    public TEvento.InfEvento getInfEvento() {
        return infEvento;
    }

    /**
     * Define o valor da propriedade infEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link TEvento.InfEvento }
     *     
     */
    public void setInfEvento(TEvento.InfEvento value) {
        this.infEvento = value;
    }

    /**
     * Obtém o valor da propriedade signature.
     * 
     * @return
     *     possible object is
     *     {@link SignatureType }
     *     
     */
    public SignatureType getSignature() {
        return signature;
    }

    /**
     * Define o valor da propriedade signature.
     * 
     * @param value
     *     allowed object is
     *     {@link SignatureType }
     *     
     */
    public void setSignature(SignatureType value) {
        this.signature = value;
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
     * <p>Classe Java de anonymous complex type.
     * 
     * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="cOrgao" type="{http://www.portalfiscal.inf.br/cte}TCOrgaoIBGE"/>
     *         &lt;element name="tpAmb" type="{http://www.portalfiscal.inf.br/cte}TAmb"/>
     *         &lt;choice>
     *           &lt;element name="CNPJ" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *           &lt;element name="CPF" type="{http://www.portalfiscal.inf.br/cte}TCpf"/>
     *         &lt;/choice>
     *         &lt;element name="chCTe" type="{http://www.portalfiscal.inf.br/cte}TChDFe"/>
     *         &lt;element name="dhEvento" type="{http://www.portalfiscal.inf.br/cte}TDateTimeUTC"/>
     *         &lt;element name="tpEvento">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[0-9]{6}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nSeqEvento">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[0-9]{1,3}"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="detEvento">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;any processContents='skip'/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="versaoEvento" use="required">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;whiteSpace value="preserve"/>
     *                       &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infSolicNFF" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="xSolic">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
     *                         &lt;minLength value="2"/>
     *                         &lt;maxLength value="2000"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infPAA" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
     *                   &lt;element name="PAASignature">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
     *                             &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Id" use="required">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}ID">
     *             &lt;pattern value="ID[0-9]{12}[A-Z0-9]{12}[0-9]{29}"/>
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
    @XmlType(name = "", propOrder = {
        "cOrgao",
        "tpAmb",
        "cnpj",
        "cpf",
        "chCTe",
        "dhEvento",
        "tpEvento",
        "nSeqEvento",
        "detEvento",
        "infSolicNFF",
        "infPAA"
    })
    public static class InfEvento {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String cOrgao;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String tpAmb;
        @XmlElement(name = "CNPJ", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cnpj;
        @XmlElement(name = "CPF", namespace = "http://www.portalfiscal.inf.br/cte")
        protected String cpf;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String chCTe;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String dhEvento;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String tpEvento;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String nSeqEvento;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected TEvento.InfEvento.DetEvento detEvento;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TEvento.InfEvento.InfSolicNFF infSolicNFF;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected TEvento.InfEvento.InfPAA infPAA;
        @XmlAttribute(name = "Id", required = true)
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlID
        protected String id;

        /**
         * Obtém o valor da propriedade cOrgao.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCOrgao() {
            return cOrgao;
        }

        /**
         * Define o valor da propriedade cOrgao.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCOrgao(String value) {
            this.cOrgao = value;
        }

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
         * Obtém o valor da propriedade cnpj.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCNPJ() {
            return cnpj;
        }

        /**
         * Define o valor da propriedade cnpj.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCNPJ(String value) {
            this.cnpj = value;
        }

        /**
         * Obtém o valor da propriedade cpf.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCPF() {
            return cpf;
        }

        /**
         * Define o valor da propriedade cpf.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCPF(String value) {
            this.cpf = value;
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
         * Obtém o valor da propriedade dhEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDhEvento() {
            return dhEvento;
        }

        /**
         * Define o valor da propriedade dhEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDhEvento(String value) {
            this.dhEvento = value;
        }

        /**
         * Obtém o valor da propriedade tpEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTpEvento() {
            return tpEvento;
        }

        /**
         * Define o valor da propriedade tpEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTpEvento(String value) {
            this.tpEvento = value;
        }

        /**
         * Obtém o valor da propriedade nSeqEvento.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNSeqEvento() {
            return nSeqEvento;
        }

        /**
         * Define o valor da propriedade nSeqEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNSeqEvento(String value) {
            this.nSeqEvento = value;
        }

        /**
         * Obtém o valor da propriedade detEvento.
         * 
         * @return
         *     possible object is
         *     {@link TEvento.InfEvento.DetEvento }
         *     
         */
        public TEvento.InfEvento.DetEvento getDetEvento() {
            return detEvento;
        }

        /**
         * Define o valor da propriedade detEvento.
         * 
         * @param value
         *     allowed object is
         *     {@link TEvento.InfEvento.DetEvento }
         *     
         */
        public void setDetEvento(TEvento.InfEvento.DetEvento value) {
            this.detEvento = value;
        }

        /**
         * Obtém o valor da propriedade infSolicNFF.
         * 
         * @return
         *     possible object is
         *     {@link TEvento.InfEvento.InfSolicNFF }
         *     
         */
        public TEvento.InfEvento.InfSolicNFF getInfSolicNFF() {
            return infSolicNFF;
        }

        /**
         * Define o valor da propriedade infSolicNFF.
         * 
         * @param value
         *     allowed object is
         *     {@link TEvento.InfEvento.InfSolicNFF }
         *     
         */
        public void setInfSolicNFF(TEvento.InfEvento.InfSolicNFF value) {
            this.infSolicNFF = value;
        }

        /**
         * Obtém o valor da propriedade infPAA.
         * 
         * @return
         *     possible object is
         *     {@link TEvento.InfEvento.InfPAA }
         *     
         */
        public TEvento.InfEvento.InfPAA getInfPAA() {
            return infPAA;
        }

        /**
         * Define o valor da propriedade infPAA.
         * 
         * @param value
         *     allowed object is
         *     {@link TEvento.InfEvento.InfPAA }
         *     
         */
        public void setInfPAA(TEvento.InfEvento.InfPAA value) {
            this.infPAA = value;
        }

        /**
         * Obtém o valor da propriedade id.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getId() {
            return id;
        }

        /**
         * Define o valor da propriedade id.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setId(String value) {
            this.id = value;
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
         *         &lt;any processContents='skip'/>
         *       &lt;/sequence>
         *       &lt;attribute name="versaoEvento" use="required">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;whiteSpace value="preserve"/>
         *             &lt;pattern value="4\.(0[0-9]|[1-9][0-9])"/>
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
        @XmlType(name = "", propOrder = {
            "any"
        })
        public static class DetEvento {

            @XmlAnyElement
            protected Element any;
            @XmlAttribute(name = "versaoEvento", required = true)
            protected String versaoEvento;

            /**
             * Obtém o valor da propriedade any.
             * 
             * @return
             *     possible object is
             *     {@link Element }
             *     
             */
            public Element getAny() {
                return any;
            }

            /**
             * Define o valor da propriedade any.
             * 
             * @param value
             *     allowed object is
             *     {@link Element }
             *     
             */
            public void setAny(Element value) {
                this.any = value;
            }

            /**
             * Obtém o valor da propriedade versaoEvento.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVersaoEvento() {
                return versaoEvento;
            }

            /**
             * Define o valor da propriedade versaoEvento.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVersaoEvento(String value) {
                this.versaoEvento = value;
            }

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
         *         &lt;element name="CNPJPAA" type="{http://www.portalfiscal.inf.br/cte}TCnpj"/>
         *         &lt;element name="PAASignature">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
         *                   &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
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
            "cnpjpaa",
            "paaSignature"
        })
        public static class InfPAA {

            @XmlElement(name = "CNPJPAA", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String cnpjpaa;
            @XmlElement(name = "PAASignature", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected TEvento.InfEvento.InfPAA.PAASignature paaSignature;

            /**
             * Obtém o valor da propriedade cnpjpaa.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCNPJPAA() {
                return cnpjpaa;
            }

            /**
             * Define o valor da propriedade cnpjpaa.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCNPJPAA(String value) {
                this.cnpjpaa = value;
            }

            /**
             * Obtém o valor da propriedade paaSignature.
             * 
             * @return
             *     possible object is
             *     {@link TEvento.InfEvento.InfPAA.PAASignature }
             *     
             */
            public TEvento.InfEvento.InfPAA.PAASignature getPAASignature() {
                return paaSignature;
            }

            /**
             * Define o valor da propriedade paaSignature.
             * 
             * @param value
             *     allowed object is
             *     {@link TEvento.InfEvento.InfPAA.PAASignature }
             *     
             */
            public void setPAASignature(TEvento.InfEvento.InfPAA.PAASignature value) {
                this.paaSignature = value;
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
             *         &lt;element name="SignatureValue" type="{http://www.w3.org/2001/XMLSchema}base64Binary"/>
             *         &lt;element name="RSAKeyValue" type="{http://www.portalfiscal.inf.br/cte}TRSAKeyValueType"/>
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
                "signatureValue",
                "rsaKeyValue"
            })
            public static class PAASignature {

                @XmlElement(name = "SignatureValue", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected byte[] signatureValue;
                @XmlElement(name = "RSAKeyValue", namespace = "http://www.portalfiscal.inf.br/cte", required = true)
                protected TRSAKeyValueType rsaKeyValue;

                /**
                 * Obtém o valor da propriedade signatureValue.
                 * 
                 * @return
                 *     possible object is
                 *     byte[]
                 */
                public byte[] getSignatureValue() {
                    return signatureValue;
                }

                /**
                 * Define o valor da propriedade signatureValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     byte[]
                 */
                public void setSignatureValue(byte[] value) {
                    this.signatureValue = value;
                }

                /**
                 * Obtém o valor da propriedade rsaKeyValue.
                 * 
                 * @return
                 *     possible object is
                 *     {@link TRSAKeyValueType }
                 *     
                 */
                public TRSAKeyValueType getRSAKeyValue() {
                    return rsaKeyValue;
                }

                /**
                 * Define o valor da propriedade rsaKeyValue.
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TRSAKeyValueType }
                 *     
                 */
                public void setRSAKeyValue(TRSAKeyValueType value) {
                    this.rsaKeyValue = value;
                }

            }

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
         *         &lt;element name="xSolic">
         *           &lt;simpleType>
         *             &lt;restriction base="{http://www.portalfiscal.inf.br/cte}TString">
         *               &lt;minLength value="2"/>
         *               &lt;maxLength value="2000"/>
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
            "xSolic"
        })
        public static class InfSolicNFF {

            @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
            protected String xSolic;

            /**
             * Obtém o valor da propriedade xSolic.
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXSolic() {
                return xSolic;
            }

            /**
             * Define o valor da propriedade xSolic.
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXSolic(String value) {
                this.xSolic = value;
            }

        }

    }

}
