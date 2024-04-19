package poo.javabnb;

public class Building {
    public String title;
    private String address;
    public int rooms;
    public int baths;
    private PropertyType type;
    public int price;
    public String[] Hashtags;
    public String description;
    public String[] images;
    private Host host;
    public int visitors;
    public String[] services;
    public float rating;
    private int id;

    // Constructor
    public Building(String title, String address, int rooms, int baths, PropertyType type, int price, String[] Hashtags, String description, String[] images, Host host, int visitors, String[] services, float rating) {
        this.title = title;
        this.address = address;
        this.rooms = rooms;
        this.baths = baths;
        this.type = type;
        this.price = price;
        this.Hashtags = Hashtags;
        this.description = description;
        this.images = images;
        this.host = host;
        this.visitors = visitors;
        this.services = services;
        this.rating = rating;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }
    public PropertyType getType() {
        return type;
    }
    public Host getHost() {
        return host;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setType(PropertyType type) {
        this.type = type;
    }

}







