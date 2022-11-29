package chapter.chapter13.lisitng;


public class Comperablerectangle extends Rectangle implements Comparable<Comperablerectangle> {

    public Comperablerectangle(double width, double height) {
        super(width, height);
    }

    @Override
    public int compareTo(Comperablerectangle o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else
            return 0;
    }

    public String toString() {
        return super.toString() + " Area: " + getArea();

    }
}

