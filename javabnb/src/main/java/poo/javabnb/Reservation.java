package poo.javabnb;

import poo.javabnb.util.Range;
import java.util.Date;

public class Reservation {
    Particular client;
    Range<Date> dateBounds;
    Date reservationDate;

    // Constructor
    public Reservation(Particular client, Range<Date> dateBounds, Date reservationDate) {
        this.client = client;
        this.dateBounds = dateBounds;
        this.reservationDate = reservationDate;
    }

    // Getters
    
    public Particular getClient() {
        return client;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public Range<Date> getDateBounds() {
        return dateBounds;
    }

    // Setter
    public void setDateBounds(Range<Date> dateBounds) {
        this.dateBounds = dateBounds;
    }
}
