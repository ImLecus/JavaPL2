package poo.javabnb;
import java.util.Calendar;

public class Session {
    private final Client user;
    public final String ID;
    public final boolean isHost;

    /**
     * A session manages the current user data, and it's assigned to an ID.
     * @param user the current client, which can be a particular or a host.
     * @param ID the session ID, which contains information about the session.
     */
    public Session(Client user, String ID) {
        this.user = user;
        this.ID = ID;
        this.isHost = user instanceof Host;
    }

    /**
     * Finishes the actual session and saves the data.
     */
    public void endSession() {

    }

    /**
     * Updates the current session and saves the data.
     */
    public void updateSession() {

    }

    /**
     * Creates a new session and generates a session ID.
     * @param client the client who owns the session.
     * @return a new Session with the client as owner.
     */
    public static Session init(Client client){
        int sessionNumber = 1;
        String sessionID = "";
        Calendar date = Calendar.getInstance();
        sessionID += String.format("%02d",date.get(Calendar.DAY_OF_MONTH))+String.format("%02d",date.get(Calendar.MONTH))+String.format("%04d",date.get(Calendar.YEAR))+String.format("%04d",sessionNumber);
        return new Session(client, sessionID);
    }
}
