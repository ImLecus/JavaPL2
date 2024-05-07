package poo.javabnb.util;

import java.io.Serializable;

public class Range<T extends Comparable<T>> implements Serializable{
    private final T min;
    private final T max;

    public Range(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public boolean isInRange(T value) {
        return value.compareTo(min) > -1 && value.compareTo(max) < 1;
    }
    
    @Override
    public String toString(){
        return String.valueOf(min) + " to " + String.valueOf(max);
    }
}