package chapter.chapter09.homework;

public class Exercises01Rectangle {
    private double widht;
    private double height;

    Exercises01Rectangle() {
        this(1.0, 1.0);
    }

    Exercises01Rectangle(double newwidht, double newheight) {
        this.widht = newwidht;
        this.height = newheight;

    }


    public double getArea() {
        double area = this.widht * this.height;
        return area;
    }

    public double getPerimeter() {
        double perimeter = (this.widht * 2) + (this.height * 2);
        return perimeter;
    }

    public double getwidht() {
        return this.widht;
    }

    public double getHeight() {
        return this.height;
    }

}




