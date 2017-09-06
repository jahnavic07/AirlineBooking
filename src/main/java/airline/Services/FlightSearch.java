package airline.Services;

import java.util.*;
import java.util.stream.Collectors;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import airline.model.Flight;
import airline.model.Seat;
import airline.model.SearchCriteria;
import org.springframework.stereotype.Service;

import java.util.function.Predicate;

@Service
public class FlightSearch {


    public List<Flight> search(List<Flight> flightList, SearchCriteria searchCriteria) {

        List<Flight> filteredFlights =  flightList.stream()
                .filter(searchByRoute(flightList, searchCriteria)) //mandatory
                .filter(searchByTravelType(flightList, searchCriteria))
                .collect(Collectors.toList());


        if(searchCriteria.getDepartureDate()!="") { //optional
            filteredFlights = filteredFlights.stream()
                    .filter(searchByDepartureDate(flightList, searchCriteria))
                    .collect(Collectors.toList());
        }

        return filteredFlights;

    }

    private Predicate<Flight> searchByRoute(List<Flight> flightList, SearchCriteria searchCriteria) {
        return (flight -> (flight.startsFrom(searchCriteria.getSourceCode()) && flight.goesTo(searchCriteria.getDestinationCode())));
    }

    private Predicate<Flight> searchByDepartureDate(List<Flight> flightList, SearchCriteria searchCriteria) {
        return (flight -> ((searchCriteria.getDepartureDate() == "") || flight.getDepartureDate().equals(LocalDate.parse(searchCriteria.getDepartureDate()))));
    }

    private Predicate<Flight> searchByTravelType(List<Flight> flightList, SearchCriteria searchCriteria) {
        return (flight -> (flight.seatsAvailable(searchCriteria.getTypeOfSeat())>= searchCriteria.getSeatsRequested()));
    }
}