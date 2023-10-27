
package proxy;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Classe Java pour getCity complex type.
 * 
 * <p>Le fragment de sch�ma suivant indique le contenu attendu figurant dans cette classe.
 * 
 * <pre>{@code
 * <complexType name="getCity">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="cityId" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getCity", propOrder = {
    "cityId"
})
public class GetCity {

    protected int cityId;

    /**
     * Obtient la valeur de la propri�t� cityId.
     * 
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * D�finit la valeur de la propri�t� cityId.
     * 
     */
    public void setCityId(int value) {
        this.cityId = value;
    }

}
