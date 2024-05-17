package poo.javabnb.util;

import java.util.ArrayList;
import java.util.Date;
import poo.javabnb.Reservation;

public class ReservationChecker {
    public boolean isOverlapping(Date dateEntrada, Date dateSalida, ArrayList<Reservation> reservations) {
        for (Reservation r : reservations) {
            if (dateEntrada.before(r.getDateBounds().getEnd()) && dateSalida.after(r.getDateBounds().getStart())) {
                return true;
            }
        }
        return false;
    }

    public boolean notPastDate(Date dateEntrada, Date dateSalida) {
        Date currentDate = new Date();
        return (dateEntrada.after(currentDate) || dateEntrada.equals(currentDate)) &&
                (dateSalida.after(currentDate) || dateSalida.equals(currentDate));
    }
}