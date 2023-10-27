
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour convert complex type.
 * 
 * <p>Le fragment de schéma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="convert">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="temp" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "convert", propOrder = {
    "temp"
})
public class Convert {

    protected Long temp;

    /**
     * Obtient la valeur de la propriété temp.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getTemp() {
        return temp;
    }

    /**
     * Définit la valeur de la propriété temp.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setTemp(Long value) {
        this.temp = value;
    }

}
