package airline.model;

import java.awt.datatransfer.FlavorListener;

public class Flight {
    private String flightNumber;
    private String sourceCode;

    public Flight() {
    }

    private String destinationCode;

    public Flight(String flightNumber, String sourceCode, String destinationCode) {
        this.flightNumber = flightNumber;
        this.sourceCode = sourceCode;
        this.destinationCode = destinationCode;
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
}
