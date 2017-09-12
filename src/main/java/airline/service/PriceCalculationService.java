package airline.service;

import airline.model.Flight;
import airline.model.SearchResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceCalculationService {

    public List<SearchResult> calculatePrice(List<Flight> filteredFlights, int SeatsRequested, String typeOfSeat){
         List<SearchResult>  searchResults = new ArrayList<>();

        for (Flight flight:filteredFlights){

            SearchResult flightInfo = new SearchResult();

            flightInfo.setFlightNumber(flight.getFlightNumber());
            flightInfo.setSourceCode(flight.getSourceCode());
            flightInfo.setDestinationCode(flight.getDestinationCode());
            flightInfo.setDepartureDate(flight.getDepartureDate());
            flightInfo.setPrice(SeatsRequested*flight.getPrice(typeOfSeat));
            flightInfo.setPassengersCount(SeatsRequested);
            flightInfo.setTypeOfSeat(typeOfSeat);

            searchResults.add(flightInfo);
        }

        return searchResults;
    }

}
