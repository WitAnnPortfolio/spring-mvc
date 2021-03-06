package application.airport.models;


import java.io.Serializable;

public class Airport implements Serializable {

    private static final long serialVersionUID = 1L;

    private String airportName;
    private String airportCode;

    public Airport(String airportName, String airportCode) {
        this.airportName = airportName;
        this.airportCode = airportCode;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getAirportCode() {
        return airportCode;
    }

    public void setAirportCode(String airportCode) {
        this.airportCode = airportCode;
    }

    @Override
    public String toString() {
        return airportName + " (" + airportCode + ")";
    }
}
