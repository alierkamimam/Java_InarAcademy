package chapter.chapter13.homework.exercises11;

import chapter.chapter13.homework.exercises10.GeometricObjects;


public class Octagon extends GeometricObjects implements Comparable<Octagon>, Cloneable {
    private double side;

    public Octagon() {

    }

    public Octagon(double side) {
        this.side = side;
    }

    public Octagon(String color, boolean filled, double side) {
        super(color, filled);
        this.side = side;
    }

    public double getSide() {
        return this.side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    @Override
    public double getArea() {
        return (2 + 4 / Math.sqrt(2) * this.side * this.side);
    }

    @Override
    public double getPerimeter() {
        return this.side * 8;
    }

    @Override
    public int compareTo(Octagon o) {
        if (getArea() > o.getArea()) {
            return 1;
        } else if (getArea() < o.getArea()) {
            return -1;
        } else
            return 0;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Area: " + getArea() + "\nPerimeter: " + getPerimeter();
    }
}
