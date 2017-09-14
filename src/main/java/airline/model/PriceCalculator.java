package airline.model;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class PriceCalculator {

    public static double getOneSeatRate(Flight myFlight, String travelType) {

        double basePrice = myFlight.getBasePrice(travelType);

        if (travelType.equals("ECONOMY"))
                return getEconomyClassRate(myFlight,basePrice);
        else if (travelType.equals("BUSINESS"))
                return getBusinessClassRate(myFlight,basePrice);
        else if (travelType.equals("FIRST"))
            return getFirstClassRate(myFlight,basePrice);
        return 0;

    }

    private static double getEconomyClassRate(Flight myFlight, double basePrice){

        double seatsFilledPercentage = ((double) myFlight.getSeatsBooked("ECONOMY")/myFlight.getTotalSeats("ECONOMY"))*100;

        if(seatsFilledPercentage < 40)
            return basePrice;
        else if(seatsFilledPercentage >=40 && seatsFilledPercentage< 90)
            return 1.3*basePrice;
        else if (seatsFilledPercentage >=90)
            return 1.6*basePrice;

        return 0;
    }

    private static double getBusinessClassRate(Flight myFlight, double basePrice){

        DayOfWeek day = DayOfWeek.from(myFlight.getDepartureDate());

        if (day.name().equals("MONDAY") || day.name().equals("FRIDAY") || day.name().equals("SUNDAY"))
            return 1.4*basePrice;
        else
            return basePrice;
    }

    private static double getFirstClassRate(Flight myFlight, double basePrice){

     /*  int daysBeforeDeparture = Period.between(LocalDate.now(),myFlight.getDepartureDate()).getDays();*/
      int daysBeforeDeparture = (int)ChronoUnit.DAYS.between(LocalDate.now(),myFlight.getDepartureDate());

       return basePrice*(1 + 0.1*(10-daysBeforeDeparture));
    }
}
