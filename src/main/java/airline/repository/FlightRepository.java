package airline.repository;
import java.text.SimpleDateFormat;
import java.util.*;
import java.time.LocalDate;

import airline.model.Flight;
import airline.model.Seat;

public class FlightRepository {

    public List<Flight>  getFlights() {

       List<Flight> flightList = new ArrayList<Flight>();
       List<Seat> seatList1 = new ArrayList<Seat>();

       Seat economySeat1 = new Seat(Seat.travelType.Economy,100,80);
       Seat firstClassSeat1 = new Seat(Seat.travelType.First,50,20);
       Seat businessSeat1 = new Seat(Seat.travelType.Business,25,24);
        seatList1.add(economySeat1);
        seatList1.add(firstClassSeat1);
        seatList1.add(businessSeat1);

        List<Seat> seatList2 = new ArrayList<Seat>();

        Seat economySeat2 = new Seat(Seat.travelType.Economy,120,80);
        Seat firstClassSeat2 = new Seat(Seat.travelType.First,60,20);
        Seat businessSeat2 = new Seat(Seat.travelType.Business,40,24);
        seatList2.add(economySeat2);
        seatList2.add(firstClassSeat2);
        seatList2.add(businessSeat2);

        List<Seat> seatList3 = new ArrayList<Seat>();

        Seat economySeat3 = new Seat(Seat.travelType.Economy,150,120);
        Seat firstClassSeat3 = new Seat(Seat.travelType.First,60,58);
        Seat businessSeat3 = new Seat(Seat.travelType.Business,50,24);
        seatList3.add(economySeat3);
        seatList3.add(firstClassSeat3);
        seatList3.add(businessSeat3);

        List<Seat> seatList4 = new ArrayList<Seat>();

        Seat economySeat4 = new Seat(Seat.travelType.Economy,125,120);
        Seat firstClassSeat4 = new Seat(Seat.travelType.First,60,30);
        Seat businessSeat4 = new Seat(Seat.travelType.Business,30,20);
        seatList4.add(economySeat4);
        seatList4.add(firstClassSeat4);
        seatList4.add(businessSeat4);



        Flight flight1 = new Flight("AI123", "HYD", "BLR",LocalDate.of(2017, 9,6),seatList1 );
        Flight flight2 = new Flight("ET456", "CHN", "DEL",LocalDate.of(2017, 9,6),seatList2);
        Flight flight3 = new Flight("QA789", "HYD", "BLR",LocalDate.of(2017, 10,10),seatList3);;
        Flight flight4 = new Flight("BI999", "HYD", "BLR",LocalDate.of(2017, 9,6),seatList4);

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        return flightList;

    }

}