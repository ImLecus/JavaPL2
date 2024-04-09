package poo.javabnb;

public class PreferencesManager {
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
