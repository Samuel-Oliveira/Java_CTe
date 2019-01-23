
package br.com.swconsultoria.cte.schema_300.evCCeCTe;

import javax.xml.bind.annotation.*;
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
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Carta de Correção"/>
 *               &lt;enumeration value="Carta de Correcao"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="infCorrecao" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="grupoAlterado">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="campoAlterado">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="20"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="valorAlterado">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;minLength value="1"/>
 *                         &lt;maxLength value="500"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="nroItemAlterado" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;whiteSpace value="preserve"/>
 *                         &lt;pattern value="[1-9][0-9]|0?[1-9]"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="xCondUso">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="A Carta de Correção é disciplinada pelo Art. 58-B do CONVÊNIO/SINIEF 06/89: Fica permitida a utilização de carta de correção, para regularização de erro ocorrido na emissão de documentos fiscais relativos à prestação de serviço de transporte, desde que o erro não esteja relacionado com: I - as variáveis que determinam o valor do imposto tais como: base de cálculo, alíquota, diferença de preço, quantidade, valor da prestação;II - a correção de dados cadastrais que implique mudança do emitente, tomador, remetente ou do destinatário;III - a data de emissão ou de saída."/>
 *               &lt;enumeration value="A Carta de Correcao e disciplinada pelo Art. 58-B do CONVENIO/SINIEF 06/89: Fica permitida a utilizacao de carta de correcao, para regularizacao de erro ocorrido na emissao de documentos fiscais relativos a prestacao de servico de transporte, desde que o erro nao esteja relacionado com: I - as variaveis que determinam o valor do imposto tais como: base de calculo, aliquota, diferenca de preco, quantidade, valor da prestacao;II - a correcao de dados cadastrais que implique mudanca do emitente, tomador, remetente ou do destinatario;III - a data de emissao ou de saida."/>
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
        "infCorrecao",
        "xCondUso"
})
@XmlRootElement(name = "evCCeCTe", namespace = "http://www.portalfiscal.inf.br/cte")
public class EvCCeCTe {

    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String descEvento;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected List<InfCorrecao> infCorrecao;
    @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
    protected String xCondUso;

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
     * Gets the value of the infCorrecao property.
     *
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the infCorrecao property.
     *
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInfCorrecao().add(newItem);
     * </pre>
     *
     *
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link InfCorrecao }
     */
    public List<InfCorrecao> getInfCorrecao() {
        if (infCorrecao == null) {
            infCorrecao = new ArrayList<InfCorrecao>();
        }
        return this.infCorrecao;
    }

    /**
     * Obtém o valor da propriedade xCondUso.
     *
     * @return possible object is
     * {@link String }
     */
    public String getXCondUso() {
        return xCondUso;
    }

    /**
     * Define o valor da propriedade xCondUso.
     *
     * @param value allowed object is
     *              {@link String }
     */
    public void setXCondUso(String value) {
        this.xCondUso = value;
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
     *         &lt;element name="grupoAlterado">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="campoAlterado">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="20"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="valorAlterado">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;minLength value="1"/>
     *               &lt;maxLength value="500"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="nroItemAlterado" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;whiteSpace value="preserve"/>
     *               &lt;pattern value="[1-9][0-9]|0?[1-9]"/>
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
            "grupoAlterado",
            "campoAlterado",
            "valorAlterado",
            "nroItemAlterado"
    })
    public static class InfCorrecao {

        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String grupoAlterado;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String campoAlterado;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte", required = true)
        protected String valorAlterado;
        @XmlElement(namespace = "http://www.portalfiscal.inf.br/cte")
        protected String nroItemAlterado;

        /**
         * Obtém o valor da propriedade grupoAlterado.
         *
         * @return possible object is
         * {@link String }
         */
        public String getGrupoAlterado() {
            return grupoAlterado;
        }

        /**
         * Define o valor da propriedade grupoAlterado.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setGrupoAlterado(String value) {
            this.grupoAlterado = value;
        }

        /**
         * Obtém o valor da propriedade campoAlterado.
         *
         * @return possible object is
         * {@link String }
         */
        public String getCampoAlterado() {
            return campoAlterado;
        }

        /**
         * Define o valor da propriedade campoAlterado.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setCampoAlterado(String value) {
            this.campoAlterado = value;
        }

        /**
         * Obtém o valor da propriedade valorAlterado.
         *
         * @return possible object is
         * {@link String }
         */
        public String getValorAlterado() {
            return valorAlterado;
        }

        /**
         * Define o valor da propriedade valorAlterado.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setValorAlterado(String value) {
            this.valorAlterado = value;
        }

        /**
         * Obtém o valor da propriedade nroItemAlterado.
         *
         * @return possible object is
         * {@link String }
         */
        public String getNroItemAlterado() {
            return nroItemAlterado;
        }

        /**
         * Define o valor da propriedade nroItemAlterado.
         *
         * @param value allowed object is
         *              {@link String }
         */
        public void setNroItemAlterado(String value) {
            this.nroItemAlterado = value;
        }

    }

}
