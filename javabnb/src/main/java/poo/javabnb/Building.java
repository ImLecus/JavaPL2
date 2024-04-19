package poo.javabnb;

public class Building {
    public BuildingInfo info;
    private String address;
    public int rooms;
    public int baths;
    private PropertyType type;
    public String[] Hashtags;
    public String description;
    public String[] images;
    public int visitors;
    public String[] services;
    private int id;

    // Constructor
    public Building(String title, String address, int rooms, int baths, PropertyType type, int price, String[] Hashtags, String description, String[] images, Host host, int visitors, String[] services, float rating) {
        this.info = new BuildingInfo(title, host, price, rating);
        this.address = address;
        this.rooms = rooms;
        this.baths = baths;
        this.type = type;
        this.Hashtags = Hashtags;
        this.description = description;
        this.images = images;
        this.visitors = visitors;
        this.services = services;
    }
    
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }

    public String getAddress() {
        return address;
    }
    public PropertyType getType() {
        return type;
    }

    public void setAddress(String address) {
        this.address = address;
    }
    public void setType(PropertyType type) {
        this.type = type;
    }

}







