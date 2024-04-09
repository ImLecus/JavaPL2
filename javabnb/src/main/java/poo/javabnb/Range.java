package poo.javabnb;

public class Range {
    public final int min;
    public final int max;

    // Constructor
    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean isInRange(int value) {
        return value >= min && value <= max;
    }

}
