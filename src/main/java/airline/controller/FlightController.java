package airline.controller;

import java.util.*;
import java.time.LocalDate;

import airline.repository.CityRepository;
import airline.repository.FlightRepository;
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
    SearchCriteria searchCriteria = new SearchCriteria();

    public static void main(String[] args) {
        SpringApplication.run(FlightController.class, args);
    }

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCities(Model model) {
        List<City> cityList = cityRepository.getCityList();
        model.addAttribute("cityList", cityList);
        model.addAttribute("searchCriteria",searchCriteria);
        model.addAttribute("searchResults",null);
        model.addAttribute("today",LocalDate.now().toString());
        return "flightSearch";
    }

    FlightSearch flightSearch = new FlightSearch();
    FlightRepository flightRepository = new FlightRepository();
    List<Flight> flightList = flightRepository.getFlights();

    @RequestMapping(value = "/search", method = RequestMethod.POST)
    public String getFlights(@ModelAttribute(value = "searchCriteria") SearchCriteria searchCriteria, Model model) {
        List<City> cityList = cityRepository.getCityList();
        List<Flight> availableFlights = flightSearch.search(flightList,searchCriteria);
        model.addAttribute("cityList", cityList);
        model.addAttribute("searchResults",availableFlights);
        model.addAttribute("searchCriteria",searchCriteria);
        model.addAttribute("today",LocalDate.now().toString());
        return "flightSearch";
    }


}
