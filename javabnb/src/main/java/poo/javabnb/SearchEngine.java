package poo.javabnb;

import gui.App;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import poo.javabnb.util.ReservationChecker;

public class SearchEngine {
    public String search;
    PropertyType type;
    public static SortType sortBy;
    public String[] dateBounds;
    public String[] location;
    public String[] host;
    
    public static ArrayList<Building> results;

    // Constructor
    public SearchEngine(String search,
                        String[] hashtags,
                        PropertyType type,
                        SortType sortBy,
                        String[] services,
                        String[] dateBounds,
                        String[] location,
                        String[] host) {
        this.search = search;
        this.type = type;
        this.sortBy = sortBy;
        this.dateBounds = dateBounds;
        this.location = location;
        this.host = host;
    }

    // Search method. TO-DO: reservation bounds
    public static ArrayList<Building> getSearch(ArrayList<Building> array,String location, int people, Date inDate, Date outDate) {
        ArrayList<Building> result = new ArrayList<>();
        
        for(Building b: array){
            String addressL = b.getAddress().toLowerCase();
            String locationL = location.toLowerCase();
            System.out.println(addressL);
            System.out.println(locationL);
            
            if((addressL.contains(locationL) || b.info.title.toLowerCase().contains(locationL)) &&
                b.visitors >= people ){
                if(inDate == null || outDate == null){
                    result.add(b);
                    continue;
                }
                ReservationChecker rc = new ReservationChecker();
                if(!rc.isOverlapping(inDate, outDate, b.reservations)){
                    result.add(b);
                }
            }
        }
        return result;
    }

    // Sort search method
    public static ArrayList<Building> sortSearch(ArrayList<Building> array) {
        Collections.sort(array);
        return array;
    }
    
    public static void search(ArrayList<Building> array,String location, int people,String inDate,String outDate, SortType sortType){
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date inD;
        Date outD;
        try{
            inD = sdf.parse(inDate);
            outD = sdf.parse(outDate);
        }
        catch(Exception e){
            inD = null;
            outD = null;
        }
        SearchEngine.sortBy = sortType;
        SearchEngine.results = SearchEngine.sortSearch(SearchEngine.getSearch(array, location, people, inD, outD));
        App.redirect("SEARCH");
    }
}
