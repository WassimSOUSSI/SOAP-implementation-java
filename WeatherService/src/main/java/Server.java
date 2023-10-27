import jakarta.xml.ws.Endpoint;
import ws.WeatherService;

public class Server {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:9999/",new WeatherService());
        System.out.println("Sever launched");
    }

}
