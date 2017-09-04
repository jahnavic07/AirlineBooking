package airline.Services;
import java.util.*;
import airline.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightRepository {

    public List<Flight>  getFlights() {

       List<Flight> flightList = new ArrayList<Flight>();

        Flight flight1 = new Flight("AI123", "HYD", "BLR",100,0);
        Flight flight2 = new Flight("ET456", "CHN", "DEL",70,45);
        Flight flight3 = new Flight("QA789", "HYD", "DEL",80,30);
        Flight flight4 = new Flight("BI999", "BLR", "CHN",80,79);

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        return flightList;

    }

}