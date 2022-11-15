package chapter.chapter11.listing.GeometricObject;

public class CircleFromSimpleGeometricObject extends SimpleGeometricObject {

    private double radius;

    public CircleFromSimpleGeometricObject(double radius) {
        super();
        this.radius = radius;
    }

    public CircleFromSimpleGeometricObject(double radius, String color, boolean filled) {
        super(color, filled);
        this.radius = radius;

    }

    public double getRadius() {
        return this.radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;

    }

    public double getPerimeter() {
        return this.radius * 2 * Math.PI;
    }

    public double getDiameter() {
        return 2 * this.radius;
    }

    public void printCircle() {
        System.out.println("The circle is created " + getDateCreated() +
                " and the radius is " + radius);
    }
    public String toString(){
        return super.toString()+"\nradius is "+radius;
    }
}
