package airline.Services;

import airline.model.Flight;
import airline.model.SearchResult;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PriceCalculationService {

    public List<SearchResult> calculatePrice(List<Flight> filteredFlights, int SeatsRequested, String typeOfSeat){
        List<SearchResult>  searchResults = new ArrayList();

        for (Flight flight:filteredFlights){

            SearchResult flightInfo = new SearchResult();
            flightInfo.setSourceCode(flight.getSourceCode());
            flightInfo.setDestinationCode(flight.getDestinationCode());
            flightInfo.setPrice(SeatsRequested*flight.getPrice(typeOfSeat));
            flightInfo.setFlightNumber(flight.getFlightNumber());
            flightInfo.setPassengersCount(SeatsRequested);
            flightInfo.setPrice(flight.getPrice(typeOfSeat)*SeatsRequested);
            flightInfo.setDepartureDate(flight.getDepartureDate());
            flightInfo.setTypeOfSeat(typeOfSeat);

            searchResults.add(flightInfo);
        }

        return searchResults;
    }

}
