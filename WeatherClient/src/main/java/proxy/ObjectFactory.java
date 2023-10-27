
package proxy;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the proxy package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Convert_QNAME = new QName("http://ws/", "convert");
    private final static QName _ConvertResponse_QNAME = new QName("http://ws/", "convertResponse");
    private final static QName _GetCities_QNAME = new QName("http://ws/", "getCities");
    private final static QName _GetCitiesResponse_QNAME = new QName("http://ws/", "getCitiesResponse");
    private final static QName _GetCity_QNAME = new QName("http://ws/", "getCity");
    private final static QName _GetCityResponse_QNAME = new QName("http://ws/", "getCityResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: proxy
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Convert }
     * 
     * @return
     *     the new instance of {@link Convert }
     */
    public Convert createConvert() {
        return new Convert();
    }

    /**
     * Create an instance of {@link ConvertResponse }
     * 
     * @return
     *     the new instance of {@link ConvertResponse }
     */
    public ConvertResponse createConvertResponse() {
        return new ConvertResponse();
    }

    /**
     * Create an instance of {@link GetCities }
     * 
     * @return
     *     the new instance of {@link GetCities }
     */
    public GetCities createGetCities() {
        return new GetCities();
    }

    /**
     * Create an instance of {@link GetCitiesResponse }
     * 
     * @return
     *     the new instance of {@link GetCitiesResponse }
     */
    public GetCitiesResponse createGetCitiesResponse() {
        return new GetCitiesResponse();
    }

    /**
     * Create an instance of {@link GetCity }
     * 
     * @return
     *     the new instance of {@link GetCity }
     */
    public GetCity createGetCity() {
        return new GetCity();
    }

    /**
     * Create an instance of {@link GetCityResponse }
     * 
     * @return
     *     the new instance of {@link GetCityResponse }
     */
    public GetCityResponse createGetCityResponse() {
        return new GetCityResponse();
    }

    /**
     * Create an instance of {@link City }
     * 
     * @return
     *     the new instance of {@link City }
     */
    public City createCity() {
        return new City();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Convert }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convert")
    public JAXBElement<Convert> createConvert(Convert value) {
        return new JAXBElement<>(_Convert_QNAME, Convert.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ConvertResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "convertResponse")
    public JAXBElement<ConvertResponse> createConvertResponse(ConvertResponse value) {
        return new JAXBElement<>(_ConvertResponse_QNAME, ConvertResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCities }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCities }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCities")
    public JAXBElement<GetCities> createGetCities(GetCities value) {
        return new JAXBElement<>(_GetCities_QNAME, GetCities.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCitiesResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCitiesResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCitiesResponse")
    public JAXBElement<GetCitiesResponse> createGetCitiesResponse(GetCitiesResponse value) {
        return new JAXBElement<>(_GetCitiesResponse_QNAME, GetCitiesResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCity }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCity }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCity")
    public JAXBElement<GetCity> createGetCity(GetCity value) {
        return new JAXBElement<>(_GetCity_QNAME, GetCity.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetCityResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link GetCityResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://ws/", name = "getCityResponse")
    public JAXBElement<GetCityResponse> createGetCityResponse(GetCityResponse value) {
        return new JAXBElement<>(_GetCityResponse_QNAME, GetCityResponse.class, null, value);
    }

}
