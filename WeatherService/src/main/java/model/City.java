package model;

import java.util.ArrayList;
import java.util.List;

public class City {
    private int id;
    private String name;
    private Long temp;
    private static List<City> cities;

    public City(int id, String name, Long temp) {
        this.id = id;
        this.name = name;
        this.temp = temp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getTemp() {
        return temp;
    }

    public void setTemp(Long temp) {
        this.temp = temp;
    }

    public static List<City> getCities(){
        cities=new ArrayList<City>();
        cities.add(new City(1,"City_1", 35L));
        cities.add(new City(2,"City_2", 27L));
        cities.add(new City(3,"City_3", 37L));
        return cities;
    }


}
