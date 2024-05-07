package poo.javabnb;

import java.io.Serializable;

public class PreferencesManager implements Serializable{
    private String[] preferences;

    // Constructor
    public PreferencesManager(String[] preferences) {
        this.preferences = preferences;
    }

    // Getters
    public String[] getPreferences() {
        return preferences;
    }

    // Setters
    public void setPreferences(String[] preferences) {
        this.preferences = preferences;
    }
}
