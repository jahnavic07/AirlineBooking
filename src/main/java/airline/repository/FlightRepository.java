package airline.repository;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;

import airline.model.Flight;
import airline.model.Seat;

public class FlightRepository {

    public List<Flight>  getFlights() {

       List<Flight> flightList = new ArrayList<Flight>();
       List<Seat> seats = new ArrayList<Seat>();

       Seat economySeat = new Seat(Seat.travelType.ECONOMY,100,80);
       Seat firstClassSeat = new Seat(Seat.travelType.FIRST,50,20);
       Seat businessSeat = new Seat(Seat.travelType.BUSINESS,25,24);
       seats.add(economySeat);
       seats.add(firstClassSeat);
       seats.add(businessSeat);



        Flight flight1 = new Flight("AI123", "HYD", "BLR",LocalDate.of(2017, 9,6),seats );
        Flight flight2 = new Flight("ET456", "CHN", "DEL",LocalDate.of(2017, 9,6),seats);
        Flight flight3 = new Flight("QA789", "HYD", "BLR",LocalDate.of(2017, 10,10),seats);;
        Flight flight4 = new Flight("BI999", "HYD", "BLR",LocalDate.of(2017, 9,6),seats);

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        return flightList;

    }

}