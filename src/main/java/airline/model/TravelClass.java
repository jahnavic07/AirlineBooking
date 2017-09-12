package airline.model;

public class TravelClass {
    String flightModel;
    TravelType typeOfSeat;
    private int totalSeats;
    private int seatsBooked;
    double price;

    public TravelClass(String flightModel, TravelType typeOfSeat, int totalSeats, int seatsBooked, double price) {
        this.flightModel = flightModel;
        this.typeOfSeat = typeOfSeat;
        this.totalSeats = totalSeats;
        this.seatsBooked = seatsBooked;
        this.price = price;
    }

    public String getTypeOfSeat() {
        return this.typeOfSeat.toString();
    }

    public int getAvailableSeats() {
        return (totalSeats - seatsBooked);
    }

    public double getPrice() {
        return this.price;
    }

    }
