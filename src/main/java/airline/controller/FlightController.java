package airline.controller;

import java.util.*;

import airline.Services.CityRepository;
import airline.Services.FlightRepository;
import airline.Services.FlightSearch;
import airline.model.SearchCriteria;
import org.springframework.ui.Model;
import airline.model.City;
import airline.model.Flight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by rajashrk on 8/8/17.
 */
@Controller
@SpringBootApplication
public class FlightController {

    CityRepository cityRepository = new CityRepository();
    SearchCriteria searchCriteria = new SearchCriteria("BLR","HYD",1);

    public static void main(String[] args) {
        SpringApplication.run(FlightController.class, args);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCities(Model model) {
        List<City> cityList = cityRepository.getCityList();
        model.addAttribute("cityList", cityList);
        model.addAttribute("searchCriteria",searchCriteria);
        return "flightSearch";
    }

    FlightSearch flightSearch = new FlightSearch();
    FlightRepository flightRepository = new FlightRepository();
    List<Flight> flightList = flightRepository.getFlights();


    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String getFlights(@ModelAttribute(value = "searchCriteria") SearchCriteria searchCriteria, Model model) {
        System.out.println("Source "+searchCriteria.getSourceCode());
        System.out.println("Destination "+searchCriteria.getDestinationCode());
        List<Flight> availableFlights = flightSearch.search(flightList,searchCriteria);
        model.addAttribute("searchResults",availableFlights);
       return "flightsView";
    }


}
