package poo.javabnb;

import java.util.Date;

class Host extends Client {
    public Date date;
    public boolean superhost;

    // Constructor
    public Host(String DNI, String name, String mail, String password, String number, Date date, boolean superhost) {
        super(DNI, name, mail, password, number);
        this.date = date;
        this.superhost = superhost;
    }

    // Getter
    public Date getDate() {
        return date;
    }

    public boolean isSuperhost() {
        return superhost;
    }

    // Setter
    public void setSuperhost(boolean superhost) {
        this.superhost = superhost;
    }
}
