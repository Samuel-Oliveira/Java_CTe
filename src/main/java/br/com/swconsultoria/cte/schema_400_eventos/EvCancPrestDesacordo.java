//
// Este arquivo foi gerado pela Arquitetura JavaTM para Implementação de Referência (JAXB) de Bind XML, v2.2.8-b130911.1802 
// Consulte <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas as modificações neste arquivo serão perdidas após a recompilação do esquema de origem. 
// Gerado em: 2026.03.21 às 07:12:02 PM BRT 
//


package br.com.swconsultoria.cte.schema_400_eventos;

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
 *         &lt;element name="descEvento">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;whiteSpace value="preserve"/>
 *               &lt;enumeration value="Cancelamento Prestação do Serviço em Desacordo"/>
 *               &lt;enumeration value="Cancelamento Prestacao do Servico em Desacordo"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="nProtEvPrestDes" type="{http://www.portalfiscal.inf.br/cte}TProt"/>
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
    "descEvento",
    "nProtEvPrestDes"
})
@XmlRootElement(name = "evCancPrestDesacordo")
public class EvCancPrestDesacordo {

    @XmlElement(required = true)
    protected String descEvento;
    @XmlElement(required = true)
    protected String nProtEvPrestDes;

    /**
     * Obtém o valor da propriedade descEvento.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescEvento() {
        return descEvento;
    }

    /**
     * Define o valor da propriedade descEvento.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescEvento(String value) {
        this.descEvento = value;
    }

    /**
     * Obtém o valor da propriedade nProtEvPrestDes.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNProtEvPrestDes() {
        return nProtEvPrestDes;
    }

    /**
     * Define o valor da propriedade nProtEvPrestDes.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNProtEvPrestDes(String value) {
        this.nProtEvPrestDes = value;
    }

}
