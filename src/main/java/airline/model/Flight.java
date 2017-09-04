package airline.model;

import java.awt.datatransfer.FlavorListener;

public class Flight {
    private String flightNumber;
    private String sourceCode;
    private String destinationCode;
    private int totalSeats;
    private int seatsBooked;

    public Flight(String flightNumber, String sourceCode, String destinationCode, int totalSeats, int seatsBooked) {
        this.flightNumber = flightNumber;
        this.sourceCode = sourceCode;
        this.destinationCode = destinationCode;
        this.totalSeats = totalSeats;
        this.seatsBooked = seatsBooked;
    }

    public int getTotalSeats() {
        return totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatsBooked() {
        return seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
    }


    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getSourceCode() {
        return sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getDestinationCode() {
        return destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }
    public int getAvailableSeats(){
        return (totalSeats-seatsBooked);
    }
}
