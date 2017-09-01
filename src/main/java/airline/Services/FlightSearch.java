package airline.Services;

import java.util.*;
import airline.model.Flight;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FlightSearch {

    public List<String> search(String source, String destination) {

        System.out.println("source: "+source);
        System.out.println("destn: "+destination);

         List<String> flightList = new ArrayList<String>();
         FlightInformation flightInformation = new FlightInformation();

        for (Map.Entry<Integer,Flight> entry : (flightInformation.getFlights()).entrySet() ){
            int key = entry.getKey();
            Flight myFlight = entry.getValue();
            System.out.println("Myflightsource: "+myFlight.getSourceCode());
            System.out.println("Myflight destination: "+myFlight.getDestinationCode());
            if ((source.equals(myFlight.getSourceCode())) && (destination.equals(myFlight.getDestinationCode()))) {
                System.out.println("Flight number: "+myFlight.getFlightNumber());
                flightList.add(myFlight.getFlightNumber());
            }
        }
        return flightList;
    }
}