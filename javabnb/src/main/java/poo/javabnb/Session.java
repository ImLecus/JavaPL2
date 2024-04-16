package poo.javabnb;
import java.util.Calendar;

public class Session {
    public final Client user;
    public final String ID;
    public final boolean isHost;
    private boolean finished;
    /**
     * A session manages the current user data, and it's assigned to an ID.
     * When a session finishes, it can't be reused, it requires to create a new one.
     * @param user the current client, which can be a particular or a host.
     * @param ID the session ID, which contains information about the session.
     */
    public Session(Client user, String ID) {
        this.user = user;
        this.ID = ID;
        this.isHost = user instanceof Host;
        this.finished = false;
    }

    /**
     * Finishes the actual session.
     */
    public void endSession() {
        finished = true;
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
        sessionID += String.format("%02d",date.get(Calendar.DAY_OF_MONTH))+String.format("%02d",date.get(Calendar.MONTH) + 1)+String.format("%04d",date.get(Calendar.YEAR))+String.format("%04d",sessionNumber);
        return new Session(client, sessionID);
    }
}
