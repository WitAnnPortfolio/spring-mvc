package application.airport.models;

import org.springframework.util.Assert;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class Flight implements Serializable {

    private static final long serialVersionUID = 1L;

    private List<FlightLeg> flightLegs;
    private BigDecimal totalCost;

    public Flight(List<FlightLeg> flightLegs,
                  BigDecimal totalCost) {
        Assert.notNull(flightLegs, "Value cannot be null.");
        Assert.isTrue(flightLegs.size() >= 1,
                "Flights must have at least one leg!");
        this.flightLegs = flightLegs;
        this.totalCost = totalCost;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public List<FlightLeg> getFlightLegs() {
        return flightLegs;
    }

    public void setFlightLegs(List<FlightLeg> flightLegs) {
        this.flightLegs = flightLegs;
    }

    public BigDecimal getTotalCost() {
        return totalCost;
    }

    public void setTotalCost(BigDecimal totalCost) {
        this.totalCost = totalCost;
    }


    public boolean isNonStop()  {
        return (flightLegs.size() == 1);
    }

    public Airport getDepartureCity()   {
        return getFirstFlightLeg().getDepartureCity();
    }

    private FlightLeg getFirstFlightLeg()  {
        return flightLegs.get(0);
    }

    private FlightLeg getLastFlightLeg()    {
        return flightLegs.get(flightLegs.size() - 1);
    }

    public Airport getArrivalCity() {
        return getLastFlightLeg().getArrivalCity();
    }

    public int getNumberOfFlightLegs()  {
        return flightLegs.size();
    }

    public long getTotalTravelTime()    {
        Date startDate = getFirstFlightLeg().getDepartureDate();
        Date endDate = getLastFlightLeg().getArrivalDate();
        Assert.isTrue(endDate.compareTo(startDate) > 0,
                "Start date must be before end date!");
        return (endDate.getTime() - startDate.getTime());
    }

}
