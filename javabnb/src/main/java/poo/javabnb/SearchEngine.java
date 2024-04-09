package poo.javabnb;

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
    public void search() {
        // Implement the search logic here
    }

    // Sort search method
    public void sortSearch() {
        // Implement the sort logic here
    }
}
