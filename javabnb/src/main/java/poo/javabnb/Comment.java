package poo.javabnb;

import java.io.Serializable;

public class Comment implements Serializable{
    public final Client client;
    public final int rating;
    public final String message;
    
    public Comment(Client c, int r, String m){
        this.client = c;
        this.rating = r;
        this.message = m;
    }
}
