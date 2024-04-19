package poo.javabnb;

public class BuildingInfo {
    public String title;
    public final Host host;
    public int price;
    public float rating;
    
    /**
     * Basic information about the Building that uses BuildingWidget to
     * show some information in its content.
     * @param title the building's title
     * @param host the building's host name
     * @param price the price per night
     * @param rating the rating in stars (between 0 and 5)
     */
    public BuildingInfo(String title, Host host, int price, float rating){
        this.title = title;
        this.host = host;
        this.price = price;
        this.rating = rating;
    }
}
