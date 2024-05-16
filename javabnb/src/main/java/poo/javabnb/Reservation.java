package poo.javabnb;

import java.io.Serializable;
import poo.javabnb.util.Range;
import java.util.Date;

public class Reservation implements Serializable{
    private Particular client;
    private Range<Date> dateBounds;
    private Date reservationDate;

    // Constructor
    public Reservation(Particular client, Range<Date> dateBounds, Date reservationDate) {
        this.client = client;
        this.dateBounds = dateBounds;
        this.reservationDate = reservationDate;
    }
    
    public Particular getClient() {
        return client;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public Range<Date> getDateBounds() {
        return dateBounds;
    }

    public void setDateBounds(Range<Date> dateBounds) {
        this.dateBounds = dateBounds;
    }
    
    public String toString() {
        return dateBounds.toString();
    }
}
