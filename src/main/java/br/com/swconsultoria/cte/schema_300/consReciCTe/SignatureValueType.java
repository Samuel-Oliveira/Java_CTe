
package br.com.swconsultoria.cte.schema_300.consReciCTe;

import javax.xml.bind.annotation.*;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Classe Java de SignatureValueType complex type.
 *
 * <p>O seguinte fragmento do esquema especifica o conteúdo esperado contido dentro desta classe.
 *
 * <pre>
 * <complexType name="SignatureValueType">
 *   <simpleContent>
 *     <extension base="http://www.w3.org/2001/XMLSchema>base64Binary">
 *       <attribute name="Id" type="{http://www.w3.org/2001/XMLSchema}ID" />
 *     </extension>
 *   </simpleContent>
 * </complexType>
 * </pre>
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SignatureValueType", propOrder = {
        "value"
})
public class SignatureValueType {

    @XmlValue
    protected byte[] value;
    @XmlAttribute(name = "Id")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlID
    @XmlSchemaType(name = "ID")
    protected String id;

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
