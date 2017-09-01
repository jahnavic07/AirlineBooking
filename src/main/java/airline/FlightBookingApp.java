package airline;

import java.util.*;
import java.util.Map;

public class FlightBookingApp {/*

    Flight flight;

    public ArrayList<String> searchFlights(Map<Integer,FlightInformation> flightMap, String sourceCity, String destinationCity){
        ArrayList<String> flightList = new ArrayList<String>();
        for (Map.Entry<Integer, FlightInformation> entry : flightMap.entrySet()) {
            int key = entry.getKey();
            FlightInformation myFlight = entry.getValue();
            if((myFlight.sourceCity==sourceCity) && (myFlight.destinationCity==destinationCity)) {
                flightList.add(myFlight.flightName);
            }

        }
        return flightList;
    }

    /*To populate Source cities*/
   /* public TreeSet<String> populateSource(Map<Integer,FlightInformation> flightMap){
        TreeSet<String> sourceCityList=new TreeSet<String>();
        Iterator itr=sourceCityList.iterator();
        for (Map.Entry<Integer, FlightInformation> entry : flightMap.entrySet()) {
            int key = entry.getKey();
            FlightInformation myFlight = entry.getValue();
            sourceCityList.add(myFlight.sourceCity);
        }
        return sourceCityList;

    }*/
}
