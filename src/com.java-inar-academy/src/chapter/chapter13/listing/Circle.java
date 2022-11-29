package chapter.chapter13.listing;

public class Circle extends GeometricObjects {
    private double radius;


    public Circle() {
        super();
        this.radius = 2.5;
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }


    @Override
    public double getArea() {
        return Math.PI * radius *radius;
    }

    @Override
    public double getPerimeter() {
        return 2 * Math.PI * radius;
    }
    @Override
    public  String toString(){
        return super.toString()+"\n radius is "+radius;
    }
}
