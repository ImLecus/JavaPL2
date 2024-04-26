package poo.javabnb.util;

import gui.App;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import poo.javabnb.Building;
import poo.javabnb.Building;
import poo.javabnb.Comment;
import poo.javabnb.Host;
import poo.javabnb.PropertyType;
import poo.javabnb.exceptions.DataBaseNotFoundException;

public class BuildingDB implements Serializable{
    public ArrayList<Building> entries;
    
    /**
     * This class manages all the data about buildings. It's responsable
     * for adding and getting the information about the buildings and assigning
     * their ID.
     */
    public BuildingDB(){
        this.entries = new ArrayList<>();
   
    }
    public static BuildingDB from(String path) throws DataBaseNotFoundException {
        try{
            FileInputStream fis = new FileInputStream(path);
            ObjectInputStream ois = new ObjectInputStream(fis);
            BuildingDB result = (BuildingDB) ois.readObject();
            fis.close();
            return result;
        }
        catch(Exception e){
            throw new DataBaseNotFoundException();
        }
    }
    
    public void saveData(String path){
        try{
            FileOutputStream fos = new FileOutputStream(path);
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(this);
            fos.close();
        }
        catch(Exception e){
            e.fillInStackTrace();
        }
    }
    
    /**
     * Adds a new Building and assigns a new ID based on the order
     * of addition.
     * @param b the building to be added.
     */
    public void add(Building b){
        entries.add(b);
        entries.getLast().setID(entries.size());
    }
    public void remove(int index){
        entries.set(index, entries.getLast());

        entries.removeLast();
    }
    
    public void update(Building b, Building newBuilding){
        entries.set(entries.indexOf(b), newBuilding);
    }
    
    public Building get(int i){
        return entries.get(i);
    }
}
 