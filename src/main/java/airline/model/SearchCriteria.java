package airline.model;

import java.text.SimpleDateFormat;
import java.time.LocalDate;

public class SearchCriteria {
    private String sourceCode;
    private String destinationCode;
    private int seatsRequested = 1; /*Default seat criteria is '1'*/
    private LocalDate departureDate;

    public SearchCriteria(String sourceCode, String destinationCode, int seatsRequested, LocalDate departureDate) {
        this.sourceCode = sourceCode;
        this.destinationCode = destinationCode;
        this.seatsRequested = seatsRequested;
        this.departureDate = departureDate;
    }

    public SearchCriteria() {

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
        if (departureDate==null)
            return null;
        else
            return this.departureDate.toString();
    }

    public void setDepartureDate(String departureDate) {
        if (departureDate.equals("") ){
            System.out.println("Departure="+departureDate);
            this.departureDate = null;}
        else
            this.departureDate = LocalDate.parse(departureDate);

    }

}


