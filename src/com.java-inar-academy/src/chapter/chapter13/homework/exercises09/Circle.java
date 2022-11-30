package chapter.chapter13.homework.exercises09;

import chapter.chapter13.listing.GeometricObjects;
import org.jetbrains.annotations.NotNull;

public class Circle extends GeometricObjects implements Comparable<Circle> {
    /*(Enable Circle comparable) Rewrite the Circle class in Listing 13.2 to extend
GeometricObject and implement the Comparable interface. Override the
equals method in the Object class. Two Circle objects are equal if their radii
are the same. Draw the UML diagram that involves Circle, GeometricObject,
and Comparable.*/

    private double radius;

    public Circle() {

    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius * radius * Math.PI;
    }

    @Override
    public double getPerimeter() {
        return radius * 2 * Math.PI;
    }


    @Override
    public boolean equals(Object o) {
        return this.compareTo((Circle)o) == 0;
    }

    @Override
    public int compareTo(@NotNull Circle o) {
        if (this.radius > o.radius) {
            return 1;
        } else if (this.radius < o.radius) {
            return -1;
        } else
            return 0;
    }


}



