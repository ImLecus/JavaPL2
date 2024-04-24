package poo.javabnb.util;
import java.io.*;
import java.util.ArrayList;
import poo.javabnb.Client;
import poo.javabnb.exceptions.DataBaseNotFoundException;

public class DataBase implements Serializable {

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
            if(mails.get(i).equals(mail) && passwords.get(i).equals(Hashing.hashPassword(password))){
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
        passwords.add(Hashing.hashPassword(client.getPassword()));
        users.add(client);
    }
    
    
    /**
     * Updates a Client in a specific index
     * @param index the index to be replaced
     * @param client the client new information
     */
    public void update(int index, Client client){
        users.set(index, client);
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
    
    public ArrayList<Client> getAllUsers(){
        return users;
    }
    
    /**
     * Searches if the mail already exists in the database.
     * @param mail the mail to be searched
     * @return true if the mail already exists, false otherwise
     */
    public boolean contains(String mail){
        return mails.contains(mail);
    }
    
    /**
     * Imports an existing serialized DataBase.
     * @param path the file path
     * @exception throws DataBaseNotFoundException if the DataBase does not exist.
     * @return the existing DataBase
     */
    public static DataBase from(String path) throws DataBaseNotFoundException {
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            DataBase result = (DataBase) ois.readObject();
            fis.close();
            return result;
        }
        catch(Exception e){
            throw new DataBaseNotFoundException();
        }
    }
    
    /**
     * Saves the data in the specified path.
     * @param path the path of the data file, relative
     * to the project directory.
     */
    public void saveData(String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            fos.close();
        }
        catch(Exception e){
            e.fillInStackTrace();
        }
    }

}
