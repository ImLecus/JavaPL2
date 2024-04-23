package poo.javabnb;

public class Comment {
    public final Client client;
    public final float rating;
    public final String message;
    
    public Comment(Client c, float r, String m){
        this.client = c;
        this.rating = r;
        this.message = m;
    }
}
