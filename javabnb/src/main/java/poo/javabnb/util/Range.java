package poo.javabnb.util;

import java.io.Serializable;
import poo.javabnb.util.DateFormatter;

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
        String reformattedDateStrMin = DateFormatter.reformatDate(String.valueOf(min));
        String reformattedDateStrMax = DateFormatter.reformatDate(String.valueOf(max));
        return reformattedDateStrMin + " to " + reformattedDateStrMax;
    }
}