package poo.javabnb;

import java.util.Date;

class Client {
    private String DNI;
    public String name;
    private String mail;
    private String password;
    private String number;

    // Constructor
    public Client(String DNI, String name, String mail, String password, String number) {
        this.DNI = DNI;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.number = number;
    }

    // Getters
    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getNumber() {
        return number;
    }

    public String getDNI() {
        return DNI;
    }

    // Setters
    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}

class Particular extends Client {
    private Card card;
    public boolean VIP;
    public PreferencesManager preferences;

    // Constructor
    public Particular(String DNI, String name, String mail, String password, String number, Card card, boolean VIP, PreferencesManager preferences) {
        super(DNI, name, mail, password, number);
        this.card = card;
        this.VIP = VIP;
        this.preferences = preferences;
    }

    // Getters
    public boolean isVIP() {
        return VIP;
    }

    public PreferencesManager getPreferences() {
        return preferences;
    }

    // Setters
    public void setVIP(boolean VIP) {
        this.VIP = VIP;
    }

    public void setPreferences(PreferencesManager preferences) {
        this.preferences = preferences;
    }
}

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
