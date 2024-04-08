package poo.javabnb;

public class Session {
    private Client user;
    private String ID;
    public boolean isHost;

    // Constructor
    public Session(Client user, String ID, boolean isHost) {
        this.user = user;
        this.ID = ID;
        this.isHost = isHost;
    }

    // End session method  No utility
    public void endSession() {
        this.user = null;
        this.ID = "";
        this.isHost = false;
    }

    // Getter
    public boolean getIsHost() {
        return isHost;
    }

    // Update method No utility
    public void updateSession(Client user, String ID, boolean isHost) {
        this.user = user;
        this.ID = ID;
        this.isHost = isHost;
    }
}
