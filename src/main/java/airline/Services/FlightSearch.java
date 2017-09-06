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

        return flightList.stream()
                .filter(searchBySource(flightList, searchCriteria))
                .filter(searchByDestination(flightList, searchCriteria))
                .filter(searchByDepartureDate(flightList, searchCriteria))
                .filter(searchByTravelType(flightList, searchCriteria))
                .collect(Collectors.toList());

    }

    private Predicate<Flight> searchBySource(List<Flight> flightList, SearchCriteria searchCriteria) {
        return (x -> ((searchCriteria.getSourceCode() == "") || x.getSourceCode().equals(searchCriteria.getSourceCode())));
    }

    private Predicate<Flight> searchByDestination(List<Flight> flightList, SearchCriteria searchCriteria) {
        return (x -> ((searchCriteria.getDestinationCode() == "") || x.getDestinationCode().equals(searchCriteria.getDestinationCode())));
    }

    private Predicate<Flight> searchByDepartureDate(List<Flight> flightList, SearchCriteria searchCriteria) {
        return (x -> ((searchCriteria.getDepartureDate() == "") || x.getDepartureDate().equals(LocalDate.parse(searchCriteria.getDepartureDate()))));
    }

    private Predicate<Flight> searchByTravelType(List<Flight> flightList, SearchCriteria searchCriteria) {
        return (x -> (x.areSeatsAvailable(searchCriteria.getTypeOfSeat(), searchCriteria.getSeatsRequested())));
    }
}