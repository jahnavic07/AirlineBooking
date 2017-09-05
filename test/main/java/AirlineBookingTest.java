import org.junit.Test;
import airline.Services.FlightRepository;

public class AirlineBookingTest {
    @Test
    public void shouldSearchBySource() {
        FlightSearch flightSearch = new FlightSearch();
        List<Flight> flightList = new ArrayList<Flight>;
        FlightRepository flightRepository = new FlightRepository();
        List<Flight> flightList = flightRepository.getFlights();

        List<Flight> availableFlights = new ArrayList<Flight>;

    }
}
