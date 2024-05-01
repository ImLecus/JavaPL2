package poo.javabnb.util;

import java.util.Date;
import java.util.List;
import poo.javabnb.Reservation;

public class ReservationChecker {
    public boolean isOverlapping(Date dateEntrada, Date dateSalida, List<Reservation> reservations) {
        
        for (Reservation r : reservations) {
            if (dateEntrada.before(r.getDateBounds().getEnd()) && dateSalida.after(r.getDateBounds().getStart())) {
                return true;
            }
        }

        return false;
    }
}