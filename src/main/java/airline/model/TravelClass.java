package airline.model;

public class TravelClass {
    String flightModel;
    TravelType typeOfSeat;
    private int totalSeats;
    private int seatsBooked;
    double basePrice;

    public TravelClass(String flightModel, TravelType typeOfSeat, int totalSeats, int seatsBooked, double price) {
        this.flightModel = flightModel;
        this.typeOfSeat = typeOfSeat;
        this.totalSeats = totalSeats;
        this.seatsBooked = seatsBooked;
        this.basePrice = price;
    }

    public String getTypeOfSeat() {
        return this.typeOfSeat.toString();
    }

    public int getTotalSeats() {
        return this.totalSeats;
    }

    public int getSeatsBooked() {
        return this.seatsBooked;
    }

    public double getBasePrice() {
        return this.basePrice;
    }

    }
