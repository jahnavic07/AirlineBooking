package model;

import airline.model.*;
import airline.repository.*;
import org.junit.*;

import java.time.LocalDate;
import java.util.*;

public class FlightTest {

    private FlightRepository flightRepository;
    private Flight testFlight;

    @Before
    public void setUp() {

        List<TravelClass> seatList = Arrays.asList(new TravelClass("Boeing 777", TravelType.ECONOMY, 150, 120, 6000),
                new TravelClass("Boeing 777", TravelType.FIRST, 60, 58, 13000),
                new TravelClass("Boeing 777", TravelType.BUSINESS, 50, 24, 20000));


        testFlight = new Flight("AI123", "HYD", "BLR", LocalDate.of(2017, 9, 16), seatList);
    }

    @Test
    public void shouldReturnPriceForEconomyClass() {
        Assert.assertEquals(6000, testFlight.getPrice("ECONOMY"),0.0);
    }

    @Test
    public void shouldGetTheCountOfSeatsAvailableForEconomyClass() {
        Assert.assertEquals(30, testFlight.availableSeats("ECONOMY"));
    }



}
