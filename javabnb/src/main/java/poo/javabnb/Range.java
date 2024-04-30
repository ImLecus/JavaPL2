package poo.javabnb;

public record Range<T>(T min, T max) {
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
    public boolean isInRange(T value) {
        if(value instanceof Comparable){
            return ((Comparable)value).compareTo(min) > -1 &&  ((Comparable)value).compareTo(max) < 1;
        }
        return false;
    }

}
