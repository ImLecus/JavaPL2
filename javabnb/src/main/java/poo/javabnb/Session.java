package poo.javabnb;
import gui.App;
import java.util.Calendar;

public class Session {
    private final int entry;
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
    public Session(Client user, String ID, int key) {
        this.user = user;
        this.ID = ID;
        this.isHost = user instanceof Host;
        this.finished = false;
        this.entry = key;
    }

    /**
     * Finishes the actual session.
     */
    public void endSession() {
        finished = true;
    }
    
    public void updateSession(){
        App.db.update(entry, user);
        try{
            App.db.saveData();
        }
        catch(Exception e){
            e.fillInStackTrace();
        }
    }

    public void addPinnedPost(int id){
        this.user.pinnedPosts.add(id);
        updateSession();
    }

    public void deletePinnedPost(int id){
        this.user.pinnedPosts.remove(this.user.pinnedPosts.indexOf(id));
        updateSession();
    }
        

    /**
     * Creates a new session and generates a session ID.
     * @param client the client who owns the session.
     * @return a new Session with the client as owner.
     */
    public static Session init(Client client, int key){
        int sessionNumber = 1;
        String sessionID = "";
        Calendar date = Calendar.getInstance();
        sessionID += String.format("%02d",date.get(Calendar.DAY_OF_MONTH))+String.format("%02d",date.get(Calendar.MONTH) + 1)+String.format("%04d",date.get(Calendar.YEAR))+String.format("%04d",sessionNumber);
        return new Session(client, sessionID, key);
    }
}
