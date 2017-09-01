package airline.Services;
import java.util.*;
import airline.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightInformation {

    public Map<Integer, Flight>  getFlights() {

        Map<Integer, Flight> flightMap = new HashMap<Integer, Flight>();

        Flight flight1 = new Flight("AI123", "HYD", "BLR");
        Flight flight2 = new Flight("ET456", "CHN", "DEL");
        Flight flight3 = new Flight("QA789", "HYD", "DEL");
        Flight flight4 = new Flight("BI999", "BLR", "CHN");

        flightMap.put(1, flight1);
        flightMap.put(2, flight2);
        flightMap.put(3, flight3);
        flightMap.put(4, flight4);

        return flightMap;

    }

}