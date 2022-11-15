package chapter.chapter11.listing.GeometricObject;

public class RectangleFromSimpleGeometricObject extends SimpleGeometricObject {
    private double width;
    private double height;

    RectangleFromSimpleGeometricObject() {
        super();

    }

    RectangleFromSimpleGeometricObject(double width, double height) {
        this.width = width;
        this.height = height;
    }

    RectangleFromSimpleGeometricObject(double width, double height, String color, boolean filled) {
        super(color, filled);
        this.width = width;
        this.height = height;

    }

    public double getWidth() {
        return this.width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return this.height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getArea() {
        return this.height * this.width;
    }

    public double perimeter() {
        return (this.width + this.height) * 2;
    }

}
