package airline.model;

public class SearchCriteria {
    private String sourceCode;
    private String destinationCode;
    private int seatsRequested=1; /*Default seat criteria is '1'*/

    public SearchCriteria(String sourceCode, String destinationCode, int seatsRequested) {
        this.sourceCode = sourceCode;
        this.destinationCode = destinationCode;
        this.seatsRequested = seatsRequested;
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
}


