package poo.javabnb;

import java.util.Date;

public class Reservation {
    Building building;
    Particular client;
    Date[] dateBounds;
    Date reservationDate;

    // Constructor
    public Reservation(Building building, Particular client, Date[] dateBounds, Date reservationDate) {
        this.building = building;
        this.client = client;
        this.dateBounds = dateBounds;
        this.reservationDate = reservationDate;
    }

    // Getters
    public Building getBuilding() {
        return building;
    }

    public Particular getClient() {
        return client;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public Date[] getDateBounds() {
        return dateBounds;
    }

    // Setter
    public void setDateBounds(Date[] dateBounds) {
        this.dateBounds = dateBounds;
    }
}
