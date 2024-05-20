package poo.javabnb;

import java.io.Serializable;

public class Particular extends Client implements Serializable{
    private final Card card;
    private boolean VIP;

    // Constructor
    public Particular(String DNI, String name, String mail, String password, String number, Card card, boolean VIP) {
        super(DNI, name, mail, password, number);
        this.card = card;
        this.VIP = VIP;
    }

    // Getters
    public boolean isVIP() {
        return VIP;
    }

    // Setters
    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

}