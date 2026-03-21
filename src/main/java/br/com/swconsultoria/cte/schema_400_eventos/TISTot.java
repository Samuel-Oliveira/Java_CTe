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
import javax.xml.bind.annotation.XmlType;


/**
 * Grupo de informações de totais do Imposto Seletivo
 * 
 * <p>Classe Java de TISTot complex type.
 * 
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 * 
 * <pre>
 * &lt;complexType name="TISTot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="vIS" type="{http://www.portalfiscal.inf.br/cte}TDec1302RTC"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TISTot", propOrder = {
    "vis"
})
public class TISTot {

    @XmlElement(name = "vIS", required = true)
    protected String vis;

    /**
     * Obtém o valor da propriedade vis.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVIS() {
        return vis;
    }

    /**
     * Define o valor da propriedade vis.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVIS(String value) {
        this.vis = value;
    }

}
