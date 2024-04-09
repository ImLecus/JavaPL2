package gui;
import poo.javabnb.Client;
import poo.javabnb.DataBase;
import poo.javabnb.Session;

public class App {

    public static DataBase db = new DataBase();
    public static Session session = null;

    public static void main(String[] args){
        Client juan = new Client("003333030E", "Juan", "juan@gmail.com", "juanito123", "696696696");
        Client dani = new Client("003333030E", "Dani", "dani@gmail.com", "jdd123", "696696696");
        db.add(juan);
        db.add(dani);
        Login.main(null);
    }
}
