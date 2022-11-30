package chapter.chapter13.homework.exercises06;

public class Circle extends GeometricObject {
    private double radius;


    public Circle() {
        this("White", false, 1);
    }

    public Circle(String color, boolean isFilled, double radius) {
        super(color, isFilled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String toString() {
        return super.toString() + "\nradius: " + this.radius + "\nArea: " + getArea() +
                "\nPerimeter: " + getPerimeter();

    }


    @Override
    public double getArea() {
        return (int) (this.radius * this.radius * Math.PI);
    }

    @Override
    public double getPerimeter() {
        return (int) (this.radius * 2 * Math.PI);
    }
}
