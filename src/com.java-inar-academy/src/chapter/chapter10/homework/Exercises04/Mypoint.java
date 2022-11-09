package chapter.chapter10.homework.Exercises04;

public class Mypoint {
    private double x;
    private double y;

    public Mypoint() {
        this(0, 0);

    }

    public Mypoint(double x, double y) {
        this.x = x;
        this.y = y;
    }


    public double getX() {
        return this.x;
    }

    public double getY() {
        return this.y;
    }

    public double distance(Mypoint mypoint) {
        int pX = (int) (Math.pow(getX() - mypoint.getX(), 2));
        int pY = (int) (Math.pow(getY() - mypoint.getY(), 2));

        return Math.sqrt(pX + pY);
    }
}

