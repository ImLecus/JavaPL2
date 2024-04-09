package poo.javabnb;

public record Range(int min, int max) {
    /**
     * Simple representation of a range.
     *
     * @param min minimum value
     * @param max maximum value
     */
    public Range {}

    /**
     * @param value value to check
     * @return if the value is in the range bounds.
     */
    public boolean isInRange(int value) {
        return value >= min && value <= max;
    }

}
