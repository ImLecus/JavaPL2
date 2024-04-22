package poo.javabnb;

import java.util.Date;

public class Host extends Client {
    public final Date date;
    public boolean superhost;

    // Constructor
    public Host(String DNI, String name, String mail, String password, String number, Date date, boolean superhost) {
        super(DNI, name, mail, password, number);
        this.date = date;
        this.superhost = superhost;
    }
}
