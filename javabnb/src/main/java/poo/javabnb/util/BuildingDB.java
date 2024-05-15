package poo.javabnb.util;

import java.io.*;
import java.util.ArrayList;
import poo.javabnb.Building;
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
    try {
        FileInputStream fis = new FileInputStream(path);
        ObjectInputStream ois = new ObjectInputStream(fis);
        BuildingDB result = (BuildingDB) ois.readObject();
        fis.close();
        return result;
    } 
    catch (Exception e) {
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
 