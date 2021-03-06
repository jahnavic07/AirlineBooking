package model;

import airline.model.Flight;
import airline.model.PriceCalculator;
import airline.model.TravelClass;
import airline.model.TravelType;
import airline.repository.FlightRepository;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;

public class PriceCalculatorTest {

        private FlightRepository mockFlightRepository;
        private Flight testFlight1,testFlight2;

        @Before
        public void setUp() {

            List<TravelClass> seatList1 = Arrays.asList(new TravelClass("Boeing 777", TravelType.ECONOMY, 100, 90, 6000),
                    new TravelClass("Boeing 777", TravelType.FIRST, 60, 58, 13000),
                    new TravelClass("Boeing 777", TravelType.BUSINESS, 50, 24, 20000));

            List<TravelClass> seatList2 = Arrays.asList(new TravelClass("Boeing 777", TravelType.ECONOMY, 100, 10, 6000),
                    new TravelClass("Boeing 777", TravelType.FIRST, 60, 58, 13000),
                    new TravelClass("Boeing 777", TravelType.BUSINESS, 50, 24, 20000));


            testFlight1 = new Flight("AI123", "HYD", "BLR", LocalDate.of(2017, 9, 24), seatList1);
            testFlight2 = new Flight("AI123", "HYD", "BLR", LocalDate.of(2017, 9, 14), seatList2);
        }

        @Test
        public void shouldGetEconomyClassRateWhenSeatsAre90PercentFilled() {
            Assert.assertEquals(9600, PriceCalculator.getOneSeatRate(testFlight1,"ECONOMY"),0.0);
        }

        @Test
        public void shouldGetEconomyClassRateWhenSeatsAre10PercentFilled() {
            Assert.assertEquals(6000, PriceCalculator.getOneSeatRate(testFlight2,"ECONOMY"),0.0);
        }

        @Test
        public void shouldGetFirstClassRateforTenDaysBeforeDepature() {
            Assert.assertEquals(13000, PriceCalculator.getOneSeatRate(testFlight1,"FIRST"),0.0);
        }
        @Test
        public void shouldGetFirstClassRateOnTheDayOfDepature() {
            Assert.assertEquals(26000, PriceCalculator.getOneSeatRate(testFlight2,"FIRST"),0.0);
        }

        @Test
        public void shouldGetBusinessClassRateForSunday() {
            Assert.assertEquals(28000, PriceCalculator.getOneSeatRate(testFlight1,"BUSINESS"),0.0);
        }

        @Test
        public void shouldGetBusinessClassRateForThursday() {
            Assert.assertEquals(20000, PriceCalculator.getOneSeatRate(testFlight2,"BUSINESS"),0.0);
        }
    }
