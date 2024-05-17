package poo.javabnb;
import gui.App;
import java.util.Calendar;

public class Session {
    private final int entry;
    private final Client user;
    private final String ID;
    private final boolean isHost;

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

    public void endSession() {
        App.db.saveData("./src/main/resources/data/data.dat");
        App.buildings.saveData("./src/main/resources/data/b_data.dat");
    }
    
    public void updateSession(){
        App.db.update(entry, user);
    }
    
    public void addPinnedPost(int id){
        user.getPinnedPosts().add(id);
        updateSession();
    }

    public void deletePinnedPost(int id){
        user.getPinnedPosts().remove(user.getPinnedPosts().indexOf(id));
        updateSession();
    }
    
    public Client getUser(){
        return user;
    }
    
    public String getID(){
        return ID;
    }
        
    public boolean isHost(){
        return isHost;
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
    
    public int getEntry(){
        return entry;
    }
}
