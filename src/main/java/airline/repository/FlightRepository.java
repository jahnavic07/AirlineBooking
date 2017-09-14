package airline.repository;
import java.util.*;
import java.time.LocalDate;

import airline.model.Flight;
import airline.model.TravelClass;
import airline.model.TravelType;
import org.springframework.stereotype.Repository;

@Repository
public class FlightRepository {

    public List<Flight>  getFlights() {

       List<Flight> flightList = new ArrayList<Flight>();
       List<TravelClass> seatList1 = Arrays.asList(new TravelClass("Boeing 777",TravelType.ECONOMY,195,100,6000),
                                                   new TravelClass("Boeing 777",TravelType.FIRST,50,20,13000),
                                                   new TravelClass("Boeing 777",TravelType.BUSINESS,25,24,20000));


        List<TravelClass> seatList2 = Arrays.asList(new TravelClass("AirBus 319",TravelType.ECONOMY,120,80,7000),
                                                    new TravelClass("AirBus 319",TravelType.FIRST,60,20,14000),
                                                    new TravelClass("AirBus 319",TravelType.BUSINESS,40,24,21000));

        List<TravelClass> seatList3 = Arrays.asList(new TravelClass("AirBus 777",TravelType.ECONOMY,150,120,8000),
                                                    new TravelClass("AirBus 777",TravelType.FIRST,60,58,15000),
                                                    new TravelClass("AirBus 777",TravelType.BUSINESS,50,24,22000));

        List<TravelClass> seatList4 = Arrays.asList(new TravelClass("AirBus 321",TravelType.ECONOMY,150,120,5000),
                                                     new TravelClass("AirBus 321",TravelType.FIRST,60,58,10000));

        Flight flight1 = new Flight("AI123", "HYD", "BLR",LocalDate.of(2017, 9,15),seatList1 );
        Flight flight2 = new Flight("ET456", "CHN", "DEL",LocalDate.of(2017, 9,15),seatList2);
        Flight flight3 = new Flight("QA789", "HYD", "BLR",LocalDate.of(2017, 9,20),seatList3);;
        Flight flight4 = new Flight("BI999", "HYD", "BLR",LocalDate.of(2017, 9,23),seatList4);

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        return flightList;

    }

}