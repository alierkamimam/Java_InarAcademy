package chapter.chapter10.homework.Exercises11;

public class Circle2D {

    private double x;
    private double y;
    private double radius;

    public Circle2D() {
        this(0, 0, 1);

    }

    public Circle2D(double x, double y, double radius) {
        this.x = x;
        this.y = y;
        this.radius = radius;
    }


    public double getRadius() {
        return this.radius;
    }

    public double getArea() {
        return this.radius * this.radius * Math.PI;

    }

    public double getPerimeter() {
        return (2 * Math.PI * this.radius);
    }

    public boolean contains(double x, double y) {
        return getDistance(x, y) <= getRadius();


    }

    public boolean contains(Circle2D circle) {
        double r = getRadius();
        double r1 = circle.getRadius();
        return getDistance(circle) <= (r - r1);
    }

    public boolean overlaps(Circle2D circle) {
        double r = getRadius();
        double r1 = circle.getRadius();

        return getDistance(circle) <= (r + r1);

    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getDistance(double x, double y) {
        return Math.sqrt(Math.pow(x - getX(), 2) + Math.pow(y - getY(), 2));
    }

    public double getDistance(Circle2D circle) {
        return Math.sqrt(Math.pow(circle.getX() - getX(), 2) + Math.pow(circle.getY() - getY(), 2));
    }

}
