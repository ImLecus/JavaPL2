package poo.javabnb;
import java.util.ArrayList;

public class DataBase {

    private final ArrayList<String> mails;
    private final ArrayList<String> passwords;
    private final ArrayList<Client> users;
    public int sessionNumber;

    /**
     * A DataBase consists in three columns: two String columns that contain the mail and password
     * and a third column that contains the user related to that information.
     * Each property has an entry number to access it.
     */
    public DataBase() {
        this.mails = new ArrayList<>();
        this.passwords = new ArrayList<>();
        this.users = new ArrayList<>();
        sessionNumber = 0;
    }

    /**
     * Fetch the database and return the entry number if the fetch matches.
     * @param mail the user's mail.
     * @param password the user's password.
     * @return an integer that represents the entry number.
     */
    public int getUserInDataBase(String mail, String password) {
        for(int i = 0; i < mails.size(); ++i){
            if(mails.get(i).equals(mail) && passwords.get(i).equals(password)){
                return i;
            }
        }
        return -1;
    }

    /**
     * Must check that the entry exists first.
     * @param entry the entry number.
     * @return the user registered with the entry number.
     */
    public Client getClientData(int entry) {
        return users.get(entry);
    }

    /**
     * Adds a new entry in the database.
     * @param client the new Client entry.
     */
    public void add(Client client){
        mails.add(client.getMail());
        passwords.add(client.getPassword());
        users.add(client);
    }
    
    /**
     * Removes an entry based on the index, moves
     * the last entry to the free index and removes
     * the duplicated entry.
     * @param index the entry index
     */
    public void remove(int index){
        mails.set(index, mails.getLast());
        passwords.set(index, passwords.getLast());
        users.set(index, users.getLast());
        
        mails.removeLast();
        passwords.removeLast();
        users.removeLast();
    }
    
    public boolean contains(String mail){
        return mails.contains(mail);
    }
}
