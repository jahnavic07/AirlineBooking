package service;
import airline.model.*;
import airline.repository.FlightRepository;

import airline.service.FlightSearchService;
import org.junit.Assert;
import org.junit.Test;
import repository.MockFlightRepository;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FlightSearchServiceTest {

    SearchCriteria searchCriteria = new SearchCriteria();
    FlightSearchService flightSearch= new FlightSearchService();
    MockFlightRepository flightRepo = new MockFlightRepository();

    List<Flight> mockFlightList = flightRepo.getFlightList();


    @Test
    public void shouldReturnALLFlightsFromHydToBlr() {
        searchCriteria.setSourceCode("HYD");
        searchCriteria.setSourceCode("BLR");

        List<Flight> searchResults = flightSearch.search(searchCriteria);

    }
}
