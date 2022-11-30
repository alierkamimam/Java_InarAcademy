package chapter.chapter13.homework.exercises07;

import chapter.chapter13.homework.exercises06.GeometricObject;
/*(The Colorable interface) Design an interface named Colorable with a void
        method named howToColor(). Every class of a colorable object must implement
        the Colorable interface. Design a class named Square that extends
        GeometricObject and implements Colorable. Implement howToColor to
        display the message Color all four sides.
        Draw a UML diagram that involves Colorable, Square, and GeometricObject.
        Write a test program that creates an array of five GeometricObjects. For each
        object in the array, display its area and invoke its howToColor method if it is
        colorable.*/

public class Square extends GeometricObject implements Colarable {
    private double side;

    public Square() {

    }


    public Square(double side) {
        super();
        this.side = side;
    }

    public Square(String color, boolean isFilled, double side) {
        super(color, isFilled);
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
        return Math.pow(this.side, 2);
    }

    @Override
    public double getPerimeter() {
        return (4 * this.side);
    }

    @Override
    public void howToColor() {
        System.out.print(" Color all four sides");

    }

    @Override
    public String toString() {
        return super.toString() + "\nSide: " + this.side + "\nArea: " + this.getArea();
    }
}
