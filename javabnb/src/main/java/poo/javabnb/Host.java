package poo.javabnb;

import gui.App;
import java.util.ArrayList;
import java.util.Date;

public class Host extends Client {
    public final Date date;
    public boolean superhost;

    // Constructor
    public Host(String DNI, String name, String mail, String password, String number, Date date, boolean superhost) {
        super(DNI, name, mail, password, number);
        this.date = date;
        this.superhost = superhost;
    }
    
    public ArrayList<Building> getAllBuildings(){
        ArrayList<Building> result = new ArrayList<>();
        for(Building b: App.buildings.entries){
            if(b.info.host.getDNI().equals(this.getDNI())){
                result.add(b);
            }
        }
        return result;
    }
}
