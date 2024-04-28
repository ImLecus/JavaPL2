package poo.javabnb;
public class Particular extends Client {
    private final Card card;
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