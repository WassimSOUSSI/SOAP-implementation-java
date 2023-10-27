package ws;

import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;
import model.City;

import java.util.List;

@WebService(name = "WeatherWS")
public class WeatherService {

    @WebMethod(operationName = "convert")
    public double convertion(@WebParam(name = "temp") Long temp){
        return temp*33.8;
    }

    @WebMethod
    public City getCity(@WebParam(name = "cityId") int id){
        return City.getCities().get(id-1);
    }

    @WebMethod
    public List<City> getCities(){
        return City.getCities();
    }


}

