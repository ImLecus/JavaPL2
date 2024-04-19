package poo.javabnb;

public class BuildingInfo {
    public String title;
    public final Host host;
    public int price;
    public float rating;
    
    public BuildingInfo(String title, Host host, int price, float rating){
        this.title = title;
        this.host = host;
        this.price = price;
        this.rating = rating;
    }
}
