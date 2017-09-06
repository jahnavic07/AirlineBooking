package airline.model;

import java.text.SimpleDateFormat;


public class SearchCriteria {
    private String sourceCode;
    private String destinationCode;
    private int seatsRequested = 1; /*Default seat criteria is '1'*/
    private String typeOfSeat;
    private String departureDate;

    public SearchCriteria(String sourceCode, String destinationCode, int seatsRequested, String typeOfSeat) {
        this.sourceCode = sourceCode;
        this.destinationCode = destinationCode;
        this.seatsRequested = seatsRequested;
        this.typeOfSeat = typeOfSeat;
    }

    public SearchCriteria() {

    }

    public String getTypeOfSeat() {
        return this.typeOfSeat;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }

    public String getSourceCode() {
        return this.sourceCode;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public String getDestinationCode() {
        return this.destinationCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public int getSeatsRequested() {
        return this.seatsRequested;
    }

    public void setSeatsRequested(int seatsRequested) {
        this.seatsRequested = seatsRequested;
    }

    public String getDepartureDate() {
        return this.departureDate;
    }

    public void setDepartureDate(String departureDate) {
         this.departureDate = departureDate;

    }

}


