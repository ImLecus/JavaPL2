package poo.javabnb;

public class Building {
    public String title;
    public String address;
    public int rooms;
    public int baths;
    PropertyType type;
    public int price;
    public String[] Hashtags;
    public String description;
    public String[] images;
    Host host;
    public String[] visitors;
    public String[] services;
    public float rating;

    // Constructor
    public Building(String title, String address, int rooms, int baths, PropertyType type, int price, String[] Hashtags, String description, String[] images, Host host, String[] visitors, String[] services, float rating) {
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
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAddress() {
        return address;
    }

    public int getRooms() {
        return rooms;
    }

    public int getBaths() {
        return baths;
    }

    public PropertyType getType() {
        return type;
    }

    public float getPrice() {
        return price;
    }

    public String[] getHashtags() {
        return Hashtags;
    }

    public String getDescription() {
        return description;
    }

    public String[] getImages() {
        return images;
    }

    public Host getHost() {
        return host;
    }

    public String[] getVisitors() {
        return visitors;
    }

    public String[] getServices() {
        return services;
    }

    // Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }

    public void setBaths(int baths) {
        this.baths = baths;
    }

    public void setType(PropertyType type) {
        this.type = type;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setHashtags(String[] Hashtags) {
        this.Hashtags = Hashtags;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setImages(String[] images) {
        this.images = images;
    }

    public void setVisitors(String[] visitors) {
        this.visitors = visitors;
    }

    public void setServices(String[] services) {
        this.services = services;
    }
}







