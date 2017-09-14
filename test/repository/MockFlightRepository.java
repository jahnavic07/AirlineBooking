package repository;

import airline.model.Flight;
import airline.model.TravelClass;
import airline.model.TravelType;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockFlightRepository {

        List<Flight> flightList = new ArrayList<Flight>();
        List<TravelClass> seatList1 = Arrays.asList(new TravelClass("Boeing 777", TravelType.ECONOMY,100,80,6000),
                new TravelClass("Boeing 777",TravelType.FIRST,50,20,13000),
                new TravelClass("Boeing 777",TravelType.BUSINESS,25,24,20000));


        List<TravelClass> seatList2 = Arrays.asList(new TravelClass("AirBus 319",TravelType.ECONOMY,120,80,7000),
                new TravelClass("AirBus 319",TravelType.FIRST,60,20,14000),
                new TravelClass("AirBus 319",TravelType.BUSINESS,40,24,21000));

        List<TravelClass> seatList3 = Arrays.asList(new TravelClass("Boeing 777",TravelType.ECONOMY,150,120,6000),
                new TravelClass("Boeing 777",TravelType.FIRST,60,58,13000),
                new TravelClass("Boeing 777",TravelType.BUSINESS,50,24,20000));

        List<TravelClass> seatList4 = Arrays.asList(new TravelClass("AirBus 321",TravelType.ECONOMY,150,120,5000),
                new TravelClass("AirBus 321",TravelType.FIRST,60,58,10000));

        Flight HydToBlrAI123 = new Flight("AI123", "HYD", "BLR", LocalDate.of(2017, 9,16),seatList1 );
        Flight ChnToDelET456 = new Flight("ET456", "CHN", "DEL",LocalDate.of(2017, 9,15),seatList2);
        Flight HydToBlrQA789 = new Flight("QA789", "HYD", "BLR",LocalDate.of(2017, 10,10),seatList3);;
        Flight HydToBlrBI999 = new Flight("BI999", "HYD", "BLR",LocalDate.of(2017, 9,16),seatList4);

    public Flight getHydToBlrAI123() {
        return this.HydToBlrAI123;
    }

    public Flight getChnToDelET456(){
        return this.ChnToDelET456;

    }

    public Flight getHydToBlrQA789(){
        return this.HydToBlrQA789;
    }

    public Flight getHydToBlrBI999() {
        return this.HydToBlrBI999;
    }

    public List<Flight> getFlightList() {
        return Arrays.asList(HydToBlrAI123,ChnToDelET456,HydToBlrQA789,HydToBlrBI999);
    }
}