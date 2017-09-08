package airline.repository;
import org.springframework.beans.factory.annotation.Autowired;
import airline.model.City;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class CityRepository {

    City city;

      public List<City> getCityList() {
        final City city1 = new City("BLR","Bangalore");
        final City city2 = new City("HYD","Hyderabad");
        final City city3 = new City("DEL","Delhi");
        final City city4 = new City("CHN","Chennai");
        final List<City> cityList = Arrays.asList(city1, city2, city3, city4);
        return cityList;
    }
}
