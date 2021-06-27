package application.airport.models;

import java.io.Serializable;
import java.util.Date;

public class FlightLeg implements Serializable {

    private static final long serialVersionUID = 1L;

    private Airport departureCity;
    private Date departureDate;
    private Airport arrivalCity;
    private Date arrivalDate;

    public FlightLeg(Airport departureCity,
                     Date departureDate,
                     Airport arrivalCity,
                     Date arrivalDate) {
        this.departureCity = departureCity;
        this.departureDate = departureDate;
        this.arrivalCity = arrivalCity;
        this.arrivalDate = arrivalDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Airport getDepartureCity() {
        return departureCity;
    }

    public Airport getArrivalCity() {
        return arrivalCity;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }
}
