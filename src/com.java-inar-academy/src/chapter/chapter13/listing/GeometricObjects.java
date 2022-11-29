package chapter.chapter13.listing;


import java.util.Date;

public abstract class GeometricObjects {
    private String color = "White";
    private boolean filled;
    private java.util.Date dateCreated;


    protected GeometricObjects() {
        this("white", false);
        dateCreated = new java.util.Date();
    }

    protected GeometricObjects(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
        dateCreated = new java.util.Date();
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public Date getDateCreated() {
        return this.dateCreated;
    }

    @Override
    public String toString() {
        return "created on " + this.dateCreated + "\ncolor: " + this.color + " and filled " + this.filled;

    }

    public abstract double getArea();

    public abstract double getPerimeter();


}

