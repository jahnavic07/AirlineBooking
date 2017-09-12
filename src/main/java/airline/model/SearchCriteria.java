package airline.model;

public class SearchCriteria {
    private String sourceCode;
    private String destinationCode;
    private int seatsRequested = 1; /*Default seat criteria is '1'*/
    private String typeOfSeat;
    private String departureDate;

    public SearchCriteria() {

    }

    public String getTypeOfSeat() {
        return this.typeOfSeat;
    }

    public String getSourceCode() {
        return this.sourceCode;
    }

    public String getDestinationCode() {
        return this.destinationCode;
    }

    public int getSeatsRequested() {
        return this.seatsRequested;
    }

    public void setSourceCode(String sourceCode) {
        this.sourceCode = sourceCode;
    }

    public void setDestinationCode(String destinationCode) {
        this.destinationCode = destinationCode;
    }

    public void setSeatsRequested(int seatsRequested) {
        this.seatsRequested = seatsRequested;
    }

    public void setTypeOfSeat(String typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getDepartureDate() {
        return this.departureDate;
    }


}


