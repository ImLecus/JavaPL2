package poo.javabnb;
import gui.App;
import java.util.Calendar;

public class Session {
    private final int entry;
    public final Client user;
    public final String ID;
    public final boolean isHost;

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
        this.entry = key;
    }

    /**
     * Finishes the actual session.
     */
    public void endSession() {
        App.db.saveData("./src/main/resources/data/data.dat");
    }
    
    /**
     * Updates the client information in the database and saves the data
     */
    public void updateSession(){
        App.db.update(entry, user);
        App.db.saveData("./src/main/resources/data/data.dat");
    }
    
    /**
     * Adds a new ID in the client pinned posts.
     * @param id the ID to be added.
     */
    public void addPinnedPost(int id){
        user.pinnedPosts.add(id);
        updateSession();
    }

    /**
     * Deletes a pinned post, without deleting the original.
     * @param id the ID to be deleted.
     */
    public void deletePinnedPost(int id){
        user.pinnedPosts.remove(user.pinnedPosts.indexOf(id));
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
    
    public int getKey(){
        return entry;
    }
}
