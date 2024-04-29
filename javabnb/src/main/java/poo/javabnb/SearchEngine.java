package poo.javabnb;

import gui.App;
import java.util.ArrayList;
import java.util.Collections;

public class SearchEngine {
    public String search;
    public String[] hashtags;
    PropertyType type;
    public static SortType sortBy;
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
    public static ArrayList<Building> getSearch(ArrayList<Building> array,String location, int people) {
        ArrayList<Building> result = new ArrayList<>();
        
        for(Building b: array){
            if((b.getAddress().contains(location) || b.info.title.contains(location)) &&
                b.visitors >= people ){
                result.add(b);
            }
        }
        return result;
    }

    // Sort search method
    public static ArrayList<Building> sortSearch(ArrayList<Building> array) {
        Collections.sort(array);
        return array;
    }
    
    public static void search(ArrayList<Building> array,String location, int people, SortType sortType){
        SearchEngine.sortBy = sortType;
        SearchEngine.results = SearchEngine.sortSearch(SearchEngine.getSearch(array, location, people));
        App.redirect("SEARCH");
    }
}
