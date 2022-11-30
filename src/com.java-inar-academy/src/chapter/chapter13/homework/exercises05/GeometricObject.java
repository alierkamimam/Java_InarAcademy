package chapter.chapter13.homework.exercises05;


public abstract class GeometricObject implements Comparable<GeometricObject> {
    private String color;
    private boolean isFilled;


    public GeometricObject() {
        this("White", false);
    }


    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {

        return this.color;
    }

    public void setColor(String color) {

        this.color = color;
    }

    public boolean isFilled() {

        return this.isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String toString() {
        return "Color: " + this.color + "\nFilled: " + this.isFilled;
    }

    public static GeometricObject max(GeometricObject o1, GeometricObject o2) {
        return o1.compareTo(o2) == 1 ? o1 : o2;
    }

    @Override
    public int compareTo(GeometricObject o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        } else
            return 0;
    }

    public abstract double getArea();


    public abstract double getPerimeter();

}
