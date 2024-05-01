package poo.javabnb.util;

public class Range<T extends Comparable<T>> {
    private T min;
    private T max;

    public Range(T min, T max) {
        this.min = min;
        this.max = max;
    }

    public boolean isInRange(T value) {
        return value.compareTo(min) > -1 && value.compareTo(max) < 1;
    }

    public T getStart() {
        return min;
    }

    public T getEnd() {
        return max;
    }
}

