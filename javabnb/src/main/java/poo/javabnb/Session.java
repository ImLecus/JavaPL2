package poo.javabnb;

public class Session {
    private Client user;
    private String ID;
    public boolean isHost;

    /**
     * A session manages the current user data, and it's assigned to an ID.
     * @param user the current client, which can be a particular or a host.
     * @param ID the session ID, which contains information about the session.
     * @param isHost unlocks some content that is only for hosts.
     */
    public Session(Client user, String ID, boolean isHost) {
        this.user = user;
        this.ID = ID;
        this.isHost = isHost;
    }

    public boolean getIsHost() {
        return isHost;
    }

    /**
     * Finishes the actual session and saves the data.
     */
    public void endSession() {
        this.user = null;
        this.ID = "";
        this.isHost = false;
    }

    /**
     * Updates the current session and saves the data.
     */
    public void updateSession() {

    }
}
