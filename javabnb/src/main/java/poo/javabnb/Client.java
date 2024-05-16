package poo.javabnb;

import java.io.Serializable;
import java.util.ArrayList;

public class Client implements Serializable {
    private final String DNI;
    private String name;
    private String mail;
    private String password;
    private String number;
    private final ArrayList<Integer> pinnedPosts;
    
    public Client(String DNI, String name, String mail, String password, String number) {
        this.DNI = DNI;
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.number = number;
        this.pinnedPosts = new ArrayList<>(); 
    }

    public String getName() {
        return name;
    }

    public String getMail() {
        return mail;
    }

    public String getNumber() {
        return number;
    }

    public String getDNI() {
        return DNI;
    }
    
    public String getPassword(){
        return password;
    }
    
    
    public ArrayList<Integer> getPinnedPosts(){
        return pinnedPosts;
    }

    public void setInfo(String name, String mail, String number, String password){
        this.name = name;
        this.mail = mail;
        this.number = number;
        this.password = password;
    }
}