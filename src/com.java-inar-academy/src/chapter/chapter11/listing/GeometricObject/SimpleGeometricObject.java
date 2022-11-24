package chapter.chapter11.listing.GeometricObject;


public class SimpleGeometricObject {
    protected String color;
    protected boolean filled;
    protected java.util.Date dateCreated;

    public SimpleGeometricObject() {
        this( "White",false);
        dateCreated = new java.util.Date();
    }

    public SimpleGeometricObject(String color, boolean filled) {
        dateCreated = new java.util.Date();
        this.color = color;
        this.filled = filled;

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

    public java.util.Date getDateCreated() {
        return dateCreated;
    }

    public String toString() {

        return "created on " + dateCreated + "\ncolor : " + color + "\nfilled: " + filled;
    }
}
