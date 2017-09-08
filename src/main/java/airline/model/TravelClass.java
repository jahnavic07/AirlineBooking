package airline.model;

public class TravelClass {
    String flightModel;
    TravelType typeOfSeat;
    private int totalSeats;
    private int seatsBooked;
    double price;

    public TravelClass() {
    }

    public TravelClass(String flightModel, TravelType typeOfSeat, int totalSeats, int seatsBooked, double price) {
        this.flightModel = flightModel;
        this.typeOfSeat = typeOfSeat;
        this.totalSeats = totalSeats;
        this.seatsBooked = seatsBooked;
        this.price = price;
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

    public void setTypeOfSeat(TravelType typeOfSeat) {
        this.typeOfSeat = typeOfSeat;
    }

    public int getAvailableSeats() {
        return (totalSeats - seatsBooked);
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
