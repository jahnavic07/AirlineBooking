package airline.controller;

import java.util.*;
import java.time.LocalDate;

import airline.service.PriceCalculationService;
import airline.model.SearchResult;
import airline.repository.CityRepository;
import airline.service.FlightSearchService;
import airline.model.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import airline.model.City;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * Created by rajashrk on 8/8/17.
 */

@Controller
public class FlightController {

    @Autowired
    CityRepository cityRepository;
    @Autowired
    FlightSearchService flightSearch;

    @Autowired
    PriceCalculationService priceCalculation;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String getCities(Model model) {
        List<City> cityList = cityRepository.getCityList();
        model.addAttribute("cityList", cityList);
        model.addAttribute("searchCriteria",new SearchCriteria());
        model.addAttribute("searchResults",null);
        model.addAttribute("today",LocalDate.now().toString());
        return "flightSearch";
    }

    @RequestMapping(value = "/", method = RequestMethod.POST)
    public String getFlights(@ModelAttribute(value = "searchCriteria") SearchCriteria searchCriteria, Model model) {
        List<City> cityList = cityRepository.getCityList();
        List<SearchResult> searchResults = new ArrayList<>();
        searchResults = priceCalculation.calculatePrice(flightSearch.search(searchCriteria),searchCriteria.getSeatsRequested(),searchCriteria.getTypeOfSeat());
        model.addAttribute("cityList", cityList);
        model.addAttribute("searchResults",searchResults);
        model.addAttribute("searchCriteria",searchCriteria);
        model.addAttribute("today",LocalDate.now().toString());
        return "flightSearch";
    }

}
