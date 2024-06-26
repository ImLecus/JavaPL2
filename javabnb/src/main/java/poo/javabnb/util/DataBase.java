package poo.javabnb.util;
import gui.App;
import java.io.*;
import java.util.ArrayList;
import poo.javabnb.Client;
import poo.javabnb.exceptions.DataBaseNotFoundException;
import poo.javabnb.Building;
import poo.javabnb.Reservation;

public class DataBase implements Serializable {

    private final ArrayList<String> mails;
    private final ArrayList<String> passwords;
    private final ArrayList<Client> users;
    /**
     * A DataBase consists in three columns: two String columns that contain the mail and password
     * and a third column that contains the user related to that information.
     * Each property has an entry number to access it.
     */
    public DataBase() {
        this.mails = new ArrayList<>();
        this.passwords = new ArrayList<>();
        this.users = new ArrayList<>();
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

    public void add(Client client){
        mails.add(client.getMail());
        passwords.add(client.getPassword());
        users.add(client);
    }
    
    public void update(int index, Client client){
        users.set(index, client);
        mails.set(index, client.getMail());
        passwords.set(index, client.getPassword());
    }
    
    /**
     * Removes an entry based on the index, moves
     * the last entry to the free index and removes
     * the duplicated entry.
     * @param index the entry index
     */
    public void remove(int index){
        for (Building b : App.buildings.entries) {
        ArrayList<Reservation> reservationsCopy = new ArrayList<>(b.reservations);
        for (Reservation r : reservationsCopy) {
            if (users.get(index).getDNI().equals(r.getClient().getDNI())) {
                b.reservations.remove(r);
            }
        }
    }
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
        try {
            System.out.println("Intentando cargar la base de datos desde: " + path); // Agrega esta línea
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            DataBase result = (DataBase) ois.readObject();
            fis.close();
            return result;
        }
        catch (Exception e) {
            System.err.println("Error: No se pudo cargar la base de datos desde " + path);
            throw new DataBaseNotFoundException();
        } 
    }


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
