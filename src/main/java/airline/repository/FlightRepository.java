package airline.repository;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;

import airline.model.Flight;

public class FlightRepository {

    public List<Flight>  getFlights() {

       List<Flight> flightList = new ArrayList<Flight>();

        Flight flight1 = new Flight("AI123", "HYD", "BLR",100,99,LocalDate.of(2017, 9,4));
        Flight flight2 = new Flight("ET456", "CHN", "DEL",80,70,LocalDate.of(2017, 9,4));
        Flight flight3 = new Flight("QA789", "HYD", "BLR",120,119,LocalDate.of(2017, 9,4));
        Flight flight4 = new Flight("BI999", "HYD", "BLR",100,90,LocalDate.of(2017, 9,5));

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        return flightList;

    }

}