package chapter.chapter12.homework.exercises05;

public class IllegalTriangleException extends Exception {
    private double side1;
    private double side2;
    private double side3;


    public IllegalTriangleException() {
        this(0, 0, 0);
    }

    public IllegalTriangleException(double side1, double side2, double side3) {
        super("Illegal triangle side --> " + side1 + " " + side2 + " " + side3);
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }
}
