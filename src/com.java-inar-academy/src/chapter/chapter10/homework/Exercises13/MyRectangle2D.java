package chapter.chapter10.homework.Exercises13;

public class MyRectangle2D {
    private double x;
    private double y;
    private double width;
    private double height;

    public MyRectangle2D(double x, double y, double width, double height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }


    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
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

    public double getArea() {
        return (this.width * this.height);
    }

    public double getPerimeter() {
        return (this.width + this.height) * 2;

    }

    public boolean contains(double x, double y) {
        return ((getX() - (width / 2)) < x && x < (getX() + (width / 2))) &&
                ((getY() - (height / 2)) < y && y < (getY() + (height / 2)));

    }

    public boolean contains(MyRectangle2D r) {

        if (this.getMinX() <= r.getMinX() &&
                r.getMaxX() <= this.getMaxX() &&
                this.getMinY() <= r.getMinY() &&
                r.getMaxY() <= this.getMaxY()) {
            return true;
        }
        return false;

    }

    public boolean overlaps(MyRectangle2D r) {
        if (r.getMinX() < this.getMinX() && this.getMinX() <= r.getMaxX() ||
                this.getMaxX() < r.getMaxX() && r.getMinX() <= this.getMaxX() ||
                r.getMinY() < this.getMinY() && this.getMinY() <= r.getMaxY() ||
                (r.getMinY() <= this.getMaxY() && r.getMaxY() > this.getMaxY())) {
            return true;
        }
        return false;


    }


    private double getMaxX() {
        return this.getX() + (this.getWidth() / 2);

    }

    private double getMinX() {
        return this.getX() - (this.getWidth() / 2);

    }

    private double getMaxY() {
        return this.getY() + (this.getHeight() / 2);
    }

    private double getMinY() {
        return this.getY() - (this.getHeight() / 2);
    }


}



