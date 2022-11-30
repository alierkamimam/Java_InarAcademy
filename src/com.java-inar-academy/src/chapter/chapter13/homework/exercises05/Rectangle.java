package chapter.chapter13.homework.exercises05;

public class Rectangle extends GeometricObject {
    private double width;
    private double height;

    public Rectangle() {
        this("White", false, 1, 1);
    }

    public Rectangle(String color, boolean isFilled, double width, double height) {
        super(color, isFilled);
        this.width = width;
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String toString() {
        return super.toString() + "\nWidth: " + this.width + "\nHeight: " + this.height +
                "\nArea: " + getArea() + "\nPerimeter: " + getPerimeter();

    }

    @Override
    public double getArea() {
        return (this.height * this.width);
    }

    @Override
    public double getPerimeter() {
        return 2 * (this.width + this.height);
    }
}
