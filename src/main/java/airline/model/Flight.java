package airline.model;

import java.awt.datatransfer.FlavorListener;
import java.time.LocalDate;

public class Flight {
    private String flightNumber;
    private String sourceCode;
    private String destinationCode;
    private int totalSeats;
    private int seatsBooked;
    private LocalDate departureDate;

    public Flight(String flightNumber, String sourceCode, String destinationCode, int totalSeats, int seatsBooked, LocalDate departureDate) {
        this.flightNumber = flightNumber;
        this.sourceCode = sourceCode;
        this.destinationCode = destinationCode;
        this.totalSeats = totalSeats;
        this.seatsBooked = seatsBooked;
        this.departureDate = departureDate;
    }

    public int getTotalSeats() {
        return this.totalSeats;
    }

    public void setTotalSeats(int totalSeats) {
        this.totalSeats = totalSeats;
    }

    public int getSeatsBooked() {
        return this.seatsBooked;
    }

    public void setSeatsBooked(int seatsBooked) {
        this.seatsBooked = seatsBooked;
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
    public int getAvailableSeats() {
        return (totalSeats - seatsBooked);
    }

    }
