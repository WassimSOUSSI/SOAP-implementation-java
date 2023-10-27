import proxy.City;
import proxy.WeatherServiceService;
import proxy.WeatherWS;

public class Consumer {
    public static void main(String[] args) {
        WeatherWS stub=new WeatherServiceService().getWeatherWSPort();
        System.out.println("Temp is : "+stub.convert(35L));
        System.out.println("********************");
        City city=stub.getCity(3);
        System.out.println("Id : "+city.getId());
        System.out.println("Name : "+city.getName());
        System.out.println("Temp : "+city.getTemp());
    }
}
