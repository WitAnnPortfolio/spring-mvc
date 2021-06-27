package application.airport.models;

import java.io.Serializable;
import java.util.Date;

public class FlightSearchCriteria implements Serializable {

    private static final long serialVersionUID = 1L;

    private String departureCity;
    private Date departureDate;
    private String arrivalCity;
    private Date arrivalDate;

    public FlightSearchCriteria(String departureCity,
                                Date departureDate,
                                String arrivalCity,
                                Date arrivalDate) {
        this.departureCity = departureCity;
        this.departureDate = departureDate;
        this.arrivalCity = arrivalCity;
        this.arrivalDate = arrivalDate;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(String departureCity) {
        this.departureCity = departureCity;
    }

    public Date getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(Date departureDate) {
        this.departureDate = departureDate;
    }

    public String getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(String arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public Date getArrivalDate() {
        return arrivalDate;
    }

    public void setArrivalDate(Date arrivalDate) {
        this.arrivalDate = arrivalDate;
    }
}
