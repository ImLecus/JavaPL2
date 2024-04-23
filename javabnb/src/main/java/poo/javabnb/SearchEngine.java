package poo.javabnb;

import java.util.ArrayList;
import gui.App;

public class SearchEngine {
    public String search;
    public String[] hashtags;
    PropertyType type;
    SortType sortBy;
    public Range price;
    public Range stars;
    public Range beds;
    public Range baths;
    public Range visitors;
    public String[] services;
    public String[] dateBounds;
    public String[] location;
    public String[] host;
    
    public static ArrayList<Building> results;

    // Constructor
    public SearchEngine(String search,
                        String[] hashtags,
                        PropertyType type,
                        SortType sortBy,
                        Range price,
                        Range stars,
                        Range beds,
                        Range baths,
                        Range visitors,
                        String[] services,
                        String[] dateBounds,
                        String[] location,
                        String[] host) {
        this.search = search;
        this.hashtags = hashtags;
        this.type = type;
        this.sortBy = sortBy;
        this.price = price;
        this.stars = stars;
        this.beds = beds;
        this.baths = baths;
        this.visitors = visitors;
        this.services = services;
        this.dateBounds = dateBounds;
        this.location = location;
        this.host = host;
    }

    // Search method
    public static ArrayList<Building> search(ArrayList<Building> array,String location) {
        ArrayList<Building> result = new ArrayList<>();
        
        for(Building b: array){
            if(b.getAddress().contains(location) || b.info.title.contains(location)){
                result.add(b);
            }
        }
        System.out.println(result.size());
        return result;
    }

    // Sort search method
    public void sortSearch() {
        // Implement the sort logic here
    }
}
