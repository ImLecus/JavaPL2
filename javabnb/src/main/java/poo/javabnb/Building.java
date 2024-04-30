package poo.javabnb;

import java.util.ArrayList;
import static poo.javabnb.SortType.*;
import poo.javabnb.Reservation;

public class Building implements Comparable {
    public BuildingInfo info;
    private String address;
    public int rooms;
    public int baths;
    private PropertyType type;
    public String[] Hashtags;
    public String description;
    public String image;
    public int visitors;
    public String[] services;
    private int id;
    public ArrayList<Comment> comments;
    public ArrayList<Client> reportedBy;
    public ArrayList<Reservation> reservations;

    // Constructor
    public Building(String title, String address, int rooms, int baths, PropertyType type, int price, String[] Hashtags, String description, String image, Host host, int visitors, String[] services, ArrayList<Comment> comments) {
        this.info = new BuildingInfo(title, host, price, 0);
        this.address = address;
        this.rooms = rooms;
        this.baths = baths;
        this.type = type;
        this.Hashtags = Hashtags;
        this.description = description;
        this.image = image;
        this.visitors = visitors;
        this.services = services;
        this.comments = comments;
        for(Comment c: comments){
            recalculateRating(c.rating);
        }
        this.reportedBy = new ArrayList<>();
        this.reservations= new ArrayList<>();
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
    
    public void recalculateRating(int newValue){
        if(comments.size() == 0){
            info.rating = newValue;
            return;
        }
        info.rating = (info.rating * comments.size() + newValue)/(comments.size() + 1);
    }

    @Override
    public int compareTo(Object t){
        Building b = (Building) t;
        if(SearchEngine.sortBy == PRICE){
            if(b.info.price > this.info.price){
                return -1;
            }
            else if(b.info.price < this.info.price){
                return 1;
            }
            return 0;
        }
        else if(SearchEngine.sortBy == STARS){
            if(b.info.rating > this.info.rating){
                return -1;
            }
            else if(b.info.rating < this.info.rating){
                return 1;
            }
            return 0;
        }
        else{
            return 0;
        }
    }
    
    public void addComment(Comment c){
        this.recalculateRating(c.rating);
        this.comments.add(c);
    }
}







