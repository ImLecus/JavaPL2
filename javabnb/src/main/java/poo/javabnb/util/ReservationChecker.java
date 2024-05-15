package poo.javabnb.util;

import java.util.ArrayList;
import java.util.Date;
import poo.javabnb.Reservation;


public class ReservationChecker {
    public boolean isOverlapping(Date dateEntrada, Date dateSalida, ArrayList<Reservation> reservations) {
        
        for (Reservation r : reservations) {
            if(r.getDateBounds().isInRange(dateEntrada) || r.getDateBounds().isInRange(dateSalida)){
                return true;
            }        
        }
        return false;  
    }
    public boolean notPastDate(Date dateEntrada, Date dateSalida) {
        Date currentDate = new Date();
        return (dateEntrada.compareTo(currentDate) >= 0 && dateSalida.compareTo(currentDate) >= 0);
    }
}
     