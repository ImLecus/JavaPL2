package poo.javabnb;

import java.io.Serializable;

public class Comment implements Serializable{
    private final Client client;
    private final int rating;
    private final String message;
    
    public Comment(Client c, int r, String m){
        this.client = c;
        this.rating = r;
        this.message = m;
    }
    
    public Client getClient(){
        return client;
    }
    
    public int getRating(){
        return rating;
    }
    
    public String getMessage(){
        return message;
    } 
    
}
