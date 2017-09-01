package airline.controller;

import java.util.*;

import airline.Services.CityInformation;
import airline.Services.FlightInformation;
import airline.Services.FlightSearch;
import org.springframework.ui.Model;
import airline.model.City;
import airline.model.Flight;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by rajashrk on 8/8/17.
 */
@Controller
@SpringBootApplication
public class FlightController {

    CityInformation cityInformation = new CityInformation();

    public static void main(String[] args) {
        SpringApplication.run(FlightController.class, args);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCities(Model model) {
        List<City> cityList = cityInformation.getCityList();
        model.addAttribute("cityList", cityList);
        model.addAttribute("flight", new Flight("AI123","HYD","BLR"));
        return "flightSearch";
    }

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String getFlights(@ModelAttribute(value = "flight") Flight flight, Model model) {
        FlightSearch flightSearch = new FlightSearch();
        List<String> availableFlights = flightSearch.search(flight.getSourceCode(), flight.getDestinationCode());
        System.out.println("results size: "+availableFlights.size());
        model.addAttribute("searchResults",availableFlights);
        return "FlightsView";
    }


}
