package poo.javabnb;

public class Range {
    private int min;
    private int max;

    // Constructor
    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    public boolean isInRange(int value) {
        return value >= min && value <= max;
    }

}
