package airline.model;

public class Seat {
    public enum travelType{BUSINESS,ECONOMY,FIRST};
    travelType typeOfSeat;
    private int totalSeats;
    private int seatsBooked;

    public Seat(travelType typeOfSeat, int totalSeats, int seatsBooked) {
        this.typeOfSeat =  typeOfSeat;
        this.totalSeats = totalSeats;
        this.seatsBooked = seatsBooked;
    }

    public Seat() {
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

    public String getTypeOfSeat() {
        return this.typeOfSeat.toString();
    }

    public void setTypeOfSeat(travelType typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }

    public int getAvailableSeats() {
        return (totalSeats - seatsBooked);
    }

}
