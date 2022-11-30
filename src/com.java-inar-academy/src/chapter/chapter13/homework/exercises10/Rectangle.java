package chapter.chapter13.homework.exercises10;

import org.jetbrains.annotations.NotNull;

public class Rectangle extends GeometricObjects implements Comparable<Rectangle> {
    private double width;
    private double height;


    public Rectangle() {
        super();
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public Rectangle(String color, boolean filled, double width, double height) {
        super(color, filled);
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

    @Override
    public double getArea() {
        return this.height * this.width;

    }

    @Override
    public double getPerimeter() {
        return (this.height + this.width) * 2;
    }

    public String toString() {
        return "\n width: " + this.width + " height: " + this.height;

    }

    @Override
    public boolean equals(Object o) {
        return this.compareTo((Rectangle) o) == 0;

    }

    @Override
    public int compareTo(@NotNull Rectangle o) {
        if (this.getArea() > o.getArea()) {
            return 1;
        } else if (this.getArea() < o.getArea()) {
            return -1;

        } else
            return 0;

    }
}
