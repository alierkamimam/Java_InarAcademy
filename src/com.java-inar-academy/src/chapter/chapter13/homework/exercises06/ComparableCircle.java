package chapter.chapter13.homework.exercises06;

import org.jetbrains.annotations.NotNull;

public class ComparableCircle extends Circle implements Comparable<ComparableCircle> {


    public ComparableCircle() {

    }

    public ComparableCircle(String color, boolean isFilled, double radius) {
        super(color, isFilled, radius);
    }

    @Override
    public String toString() {
        return super.toString() ;
    }

    @Override
    public int compareTo(@NotNull ComparableCircle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else
            return 0;
    }
}
