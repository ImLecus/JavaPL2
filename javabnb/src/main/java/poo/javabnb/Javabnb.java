package poo.javabnb;
import java.util.Scanner;

public class Javabnb {
    public static void main(String[] args) {
        DataBase db = new DataBase();
        Client juan = new Client("003333030E", "Juan", "juan@gmail.com", "juanito123", "696696696");
        Client dani = new Particular("91726312W",
                                    "Dani" ,
                                     "dani@gmail.com",
                                 "dani321",
                                  "655445544",
                                          new Card("Dani", "0000000000000000","11/31","111"),
                                     false,
                                          new PreferencesManager(null));
        db.add(juan);
        db.add(dani);
        int entry = db.getUserInDataBase("dani@gmail.com", "dani321");
        if(entry >= 0){
            Client result = db.getClientData(entry);
            System.out.println(result.getDNI());
        }
        else {
            System.out.println("User not found or incorrect password!");
        }
    }
}
