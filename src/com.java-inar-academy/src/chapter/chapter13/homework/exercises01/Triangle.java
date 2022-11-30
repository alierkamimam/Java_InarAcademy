package chapter.chapter13.homework.exercises01;

public class Triangle extends GeometricObject {

    private double side1, side2, side3;


    public Triangle() {
        super();

    }

    public Triangle(String color, boolean isFilled, double side1, double side2, double side3) {
        super(color, isFilled);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;

    }

    public double getSide1() {
        return this.side1;
    }

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public double getSide2() {
        return this.side2;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public double getSide3() {
        return this.side3;
    }

    public void setSide3(double side3) {
        this.side3 = side3;
    }

    public boolean isValidSide(double side1, double side2, double side3) {
        if ((side1 + side2 > side3) || (side1 + side3 > side2) || (side2 + side3 > side1)) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString() + "\nArea of triangle: " +this.getArea() + "\nPerimeter of triangle: " + this.getPerimeter();

    }

    @Override
    public double getArea() {
        if (isValidSide(side1, side2, side3)) {
            double s = getPerimeter() / 2;
            double area= Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
            return area;
        }else
            return 0;
    }

    @Override
    public double getPerimeter() {
        return (this.side1 + this.side2 + this.side3);
    }
}
