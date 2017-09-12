package airline.model;

import java.time.LocalDate;

public class SearchResult {
    private String flightNumber;
    private String sourceCode;
    private String destinationCode;
    private LocalDate departureDate;
    private String typeOfSeat;
    private int passengersCount;
    private double price;

    public SearchResult() {
    }

    public String getFlightNumber() {
        return this.flightNumber;
    }

    public String getSourceCode() {
        return this.sourceCode;
    }

    public String getDestinationCode() {
        return this.destinationCode;
    }

    public LocalDate getDepartureDate() {
        return this.departureDate;
    }

    public String getTypeOfSeat() {
        return this.typeOfSeat;
    }

    public int getPassengersCount() {
        return this.passengersCount;
    }

    public double getPrice() {
        return this.price;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public void setDepartureDate(LocalDate departureDate) {
        this.departureDate = departureDate;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }

    public void setPassengersCount(int passengersCount) {
        this.passengersCount = passengersCount;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
