package poo.javabnb;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import static poo.javabnb.SortType.*;
import poo.javabnb.Reservation;


public class Building implements Comparable,Serializable{
    public BuildingInfo info;
    private String address;
    public int rooms;
    public int baths;
    private PropertyType type;
    private String description;
    public File image;
    public int visitors;
    public String[] services;
    private int id;
    public ArrayList<Comment> comments;
    public ArrayList<Client> reportedBy;
    public ArrayList<Reservation> reservations;

    public Building(String title, String address, int rooms, int baths, PropertyType type, int price, String description, File image, Host host, int visitors, String[] services) {
        this.info = new BuildingInfo(title, host, price, 0);
        this.address = address;
        this.rooms = rooms;
        this.baths = baths;
        this.type = type;
        this.description = description;
        this.image = image;
        this.visitors = visitors;
        this.services = services;
        this.comments = new ArrayList<>();
        for(Comment c: this.comments){
            recalculateRating(c.getRating());
        }
        this.reportedBy = new ArrayList<>();
        this.reservations= new ArrayList<>();
    }


    public ArrayList<Reservation> getReservations() {
    return reservations;
}
    
    public int getReservationIndex(Reservation r) {
        return reservations.indexOf(r);
    }
    
    public int getID(){
        return this.id;
    }
    public void setID(int id){
        this.id = id;
    }
    
    public String getDescription(){
        return description;
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
        this.recalculateRating(c.getRating());
        this.comments.add(c);
    }
    
    public void setInfo(String text, String title, String description, int price){
        
        int roomsEndIndex = text.indexOf(" habitaciones · ");
        int bathsStartIndex = roomsEndIndex + " habitaciones · ".length();
        int bathsEndIndex = text.indexOf(" baños · ");
        int visitorsStartIndex = bathsEndIndex + " baños · ".length();
        
        int rooms = Integer.parseInt(text.substring(0, roomsEndIndex));
        int baths = Integer.parseInt(text.substring(bathsStartIndex, bathsEndIndex));
        int visitors = Integer.parseInt(text.substring(visitorsStartIndex, text.length() - " huéspedes".length()));
        
        this.rooms = rooms;
        this.baths = baths;
        this.visitors = visitors;
        this.description = description;
        Host currentHost = this.info.getHost();
        this.info = new BuildingInfo(title, currentHost, price,this.info.rating);
    }
}







