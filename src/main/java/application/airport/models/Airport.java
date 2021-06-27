package application.airport.models;


public class Airport {

    private String airportName;
    private String airportCode;

    public Airport(String airportName, String airportCode) {
        this.airportName = airportName;
        this.airportCode = airportCode;
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
