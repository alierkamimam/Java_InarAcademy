package chapter.chapter13.homework.exercises01;

public abstract class GeometricObject {
    private String color;
    private boolean isFilled;


    public GeometricObject() {
        this("White", false);
    }


    public GeometricObject(String color, boolean isFilled) {
        this.color = color;
        this.isFilled = isFilled;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return this.isFilled;
    }

    public void setFilled(boolean filled) {
        isFilled = filled;
    }

    public String toString() {
        return "Color: " + this.color + "\nFilled: " + this.isFilled;
    }

    public abstract double getArea();

    public abstract double getPerimeter();
}
