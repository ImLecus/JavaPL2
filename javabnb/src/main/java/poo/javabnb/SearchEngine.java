package poo.javabnb;

public class SearchEngine {
    public String search;
    public String[] hashtags;
    PropertyType type;
    SortType sortBy;
    public int[] priceBounds;
    public int minStars;
    public int minBeds;
    public int minBaths;
    public int minVisitors;
    public String[] services;
    public String[] dateBounds;
    public String[] location;
    public String[] host;

    // Constructor
    public SearchEngine(String search, String[] hashtags, PropertyType type, SortType sortBy, int[] priceBounds, int minStars, int minBeds, int minBaths, int minVisitors, String[] services, String[] dateBounds, String[] location, String[] host) {
        this.search = search;
        this.hashtags = hashtags;
        this.type = type;
        this.sortBy = sortBy;
        this.priceBounds = priceBounds;
        this.minStars = minStars;
        this.minBeds = minBeds;
        this.minBaths = minBaths;
        this.minVisitors = minVisitors;
        this.services = services;
        this.dateBounds = dateBounds;
        this.location = location;
        this.host = host;
    }

    // Search method
    public void search() {
        // Implement the search logic here
    }

    // Sort search method
    public void sortSearch() {
        // Implement the sort logic here
    }
}
