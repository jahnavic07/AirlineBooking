package airline.service;

import java.util.*;
import java.util.stream.Collectors;
import java.time.LocalDate;

import airline.model.Flight;
import airline.model.SearchCriteria;
import airline.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class FlightSearchService {

    @Autowired
    FlightRepository flightRepository;

    public List<Flight> search(SearchCriteria searchCriteria) {
        List<Flight> flightList = flightRepository.getFlights();
        List<Flight> filteredFlights =  flightList.stream()
                .filter(searchByRoute(searchCriteria)) //mandatory
                .filter(searchByTravelType(searchCriteria))
                .collect(Collectors.toList());

        if(searchCriteria.getDepartureDate()!="") { //optional
            filteredFlights = filteredFlights.stream()
                    .filter(searchByDepartureDate(searchCriteria))
                    .collect(Collectors.toList());
        }

        return filteredFlights;

    }

    private static Predicate<Flight> searchByRoute(SearchCriteria searchCriteria) {
        return (flight -> (flight.getSourceCode().equals(searchCriteria.getSourceCode()) && flight.getDestinationCode().equals(searchCriteria.getDestinationCode())));
    }

    private static Predicate<Flight> searchByDepartureDate(SearchCriteria searchCriteria) {
        return (flight -> ((searchCriteria.getDepartureDate() == "") || flight.getDepartureDate().equals(LocalDate.parse(searchCriteria.getDepartureDate()))));
    }

    private static Predicate<Flight> searchByTravelType(SearchCriteria searchCriteria) {
        return (flight -> (flight.availableSeats(searchCriteria.getTypeOfSeat())>= searchCriteria.getSeatsRequested()));
    }


}