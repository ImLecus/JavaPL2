package poo.javabnb;

public class Range {
    public final int min;
    public final int max;

    /**
     * Simple representation of a range.
     * @param min minimum value
     * @param max maximum value
     */
    public Range(int min, int max) {
        this.min = min;
        this.max = max;
    }

    /**
     * @return if the value is in the range bounds.
     * @param value value to check
     */
    public boolean isInRange(int value) {
        return value >= min && value <= max;
    }

}
