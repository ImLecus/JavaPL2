package poo.javabnb.exceptions;

public class NullBuildingException extends Exception {
    public NullBuildingException(){
        super("The building does not exist.");
    }
}
