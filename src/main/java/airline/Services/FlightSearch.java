package airline.Services;

import java.util.*;
import java.util.stream.Collectors;

import airline.model.Flight;
import airline.model.SearchCriteria;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightSearch {

        public List<Flight> search(List<Flight> flightList, SearchCriteria searchCriteria) {
        /* Included cases where input value is not provided in the front end*/
        return flightList.stream()
                .filter(x -> ((searchCriteria.getSourceCode() == "") || x.getSourceCode().equals(searchCriteria.getSourceCode())))
                .filter(x -> ((searchCriteria.getDestinationCode() == "") || x.getDestinationCode().equals(searchCriteria.getDestinationCode())))
                .filter(x -> (x.getAvailableSeats() >= searchCriteria.getSeatsRequested())) //Seats requested will always have a default value of 1 if no value passed
                .collect(Collectors.toList());
    }
}