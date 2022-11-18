package chapter.chapter11.homework.ex01;

import chapter.chapter11.listing.GeometricObject.SimpleGeometricObject;

public class Triangle extends SimpleGeometricObject {
    private double side1;
    private double side2;
    private double side3;

    public Triangle() {
        this(1.0, 1.0, 1.0);

    }

    public Triangle(double side1, double side2, double side3) {


        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return this.side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public double getArea() {
        double s = (this.side1 + this.side2 + this.side3);
        double area = Math.pow(s * (s - this.side1) * (s - this.side2) * (s - this.side3), 0.5);
        return area;
    }

    public double getPerimeter() {
        return side1 + side2 + side3;
    }

    @Override
    public String toString() {
        return "Triangle: side1-->" + this.side1 + " side2--> " + this.side2 + " side3--> " + this.side3;

    }

}
