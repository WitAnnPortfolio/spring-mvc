package application.airport.models;

import org.springframework.util.Assert;

import java.math.BigDecimal;
import java.util.Date;


public class SpecialDeal {

    private Airport departureCity;
    private Airport arrivalCity;
    private BigDecimal cost;
    private Date beginOn;
    private Date endOn;

    public SpecialDeal(Airport departureCity,
                       Airport arrivalCity,
                       BigDecimal cost,
                       Date beginOn,
                       Date endOn) {
        this.departureCity = departureCity;
        this.arrivalCity = arrivalCity;
        this.cost = cost;
        this.beginOn = new Date(beginOn.getTime());
        this.endOn = new Date(endOn.getTime());
    }

    public Airport getDepartureCity() {
        return departureCity;
    }

    public void setDepartureCity(Airport departureCity) {
        this.departureCity = departureCity;
    }

    public Airport getArrivalCity() {
        return arrivalCity;
    }

    public void setArrivalCity(Airport arrivalCity) {
        this.arrivalCity = arrivalCity;
    }

    public BigDecimal getCost() {
        return cost;
    }

    public void setCost(BigDecimal cost) {
        this.cost = cost;
    }

    public Date getBeginOn() {
        return beginOn;
    }

    public void setBeginOn(Date beginOn) {
        this.beginOn = beginOn;
    }

    public Date getEndOn() {
        return endOn;
    }

    public void setEndOn(Date endOn) {
        this.endOn = endOn;
    }

    public boolean isValidNow()  {
        return isValidOn(new Date());
    }

    public boolean isValidOn(Date date) {
        Assert.notNull(date, "Date must not be null");
        // kopia dla zachowania prawidłowej wartości
        Date dateCopy = new Date(date.getTime());
        return ((dateCopy.equals(endOn)) || dateCopy.before(endOn));
    }
}
