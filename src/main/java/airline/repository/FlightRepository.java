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
       List<TravelClass> seatList1 = Arrays.asList(new TravelClass("Boeing 777",TravelType.Economy,100,80,6000),
                                                   new TravelClass("Boeing 777",TravelType.First,50,20,13000),
                                                   new TravelClass("Boeing 777",TravelType.Business,25,24,20000));


        List<TravelClass> seatList2 = Arrays.asList(new TravelClass("AirBus 319",TravelType.Economy,120,80,7000),
                                                    new TravelClass("AirBus 319",TravelType.First,60,20,14000),
                                                    new TravelClass("AirBus 319",TravelType.Business,40,24,21000));

        List<TravelClass> seatList3 = Arrays.asList(new TravelClass("Boeing 777",TravelType.Economy,150,120,6000),
                                                    new TravelClass("Boeing 777",TravelType.First,60,58,13000),
                                                    new TravelClass("Boeing 777",TravelType.Business,50,24,20000));

        List<TravelClass> seatList4 = Arrays.asList(new TravelClass("AirBus 321",TravelType.Economy,150,120,5000),
                                                     new TravelClass("AirBus 321",TravelType.First,60,58,10000));

        Flight flight1 = new Flight("AI123", "HYD", "BLR",LocalDate.of(2017, 9,16),seatList1 );
        Flight flight2 = new Flight("ET456", "CHN", "DEL",LocalDate.of(2017, 9,15),seatList2);
        Flight flight3 = new Flight("QA789", "HYD", "BLR",LocalDate.of(2017, 10,10),seatList3);;
        Flight flight4 = new Flight("BI999", "HYD", "BLR",LocalDate.of(2017, 9,16),seatList4);

        flightList.add(flight1);
        flightList.add(flight2);
        flightList.add(flight3);
        flightList.add(flight4);

        return flightList;

    }

}