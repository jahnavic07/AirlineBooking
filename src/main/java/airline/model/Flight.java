package airline.model;

import java.time.LocalDate;
import java.util.*;

public class Flight {
    private String flightNumber;
    private String sourceCode;
    private String destinationCode;
    private LocalDate departureDate;
    public List<TravelClass> seats;

    public Flight(String flightNumber, String sourceCode, String destinationCode, LocalDate departureDate, List<TravelClass> seats) {
        this.flightNumber = flightNumber;
        this.sourceCode = sourceCode;
        this.destinationCode = destinationCode;
        this.departureDate = departureDate;
        this.seats = seats;
    }

    public List<TravelClass> getSeats() {
        return this.seats;
    }

    public void setSeats(List<TravelClass> seats) {
        this.seats = seats;
    }

    public LocalDate getDepartureDate() {
        return this.departureDate;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSourceCode() { return this.sourceCode; }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public int seatsAvailable(String travelType) {
        for (TravelClass mySeat : seats) {
            if (mySeat.getTypeOfSeat().equals(travelType))
                return (mySeat.getAvailableSeats());
        }
        return 0;
    }
    public double getPrice(String travelType) {
        for (TravelClass mySeat : seats) {
            if (mySeat.getTypeOfSeat().equals(travelType))
                return (mySeat.getPrice());
        }
        return 0;
    }

    public boolean startsFrom(String source){
        return sourceCode.equals(source);
    }

    public boolean goesTo(String destination){
        return  destinationCode.equals(destination);
    }
}




