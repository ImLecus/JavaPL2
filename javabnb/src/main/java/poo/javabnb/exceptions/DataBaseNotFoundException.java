package poo.javabnb.exceptions;

public class DataBaseNotFoundException extends Exception {
    public DataBaseNotFoundException(){
        super("The DataBase does not exist anymore or it has not been created.");
    }
}
