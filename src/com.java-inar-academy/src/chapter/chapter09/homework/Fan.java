package chapter.chapter09.homework;

public class Fan {
    private final int SLOW = 1;
    private final int MEDIUM = 2;
    private final int FAST = 3;

    private int speed;
    private boolean on;
    private double radius;
    private String color;

    public Fan() {
        this(1,false,5,"Blue");

    }

    public Fan(int speed, boolean on, double radius, String color) {
        switch (speed) {
            case 1:
                this.speed = SLOW;
                break;
            case 2:
                this.speed = MEDIUM;
                break;
            case 3:
                this.speed = FAST;
                break;
            default:
                System.out.println("invalid speed");
                System.exit(1);
        }

        this.on =on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed>=1 && speed<=3){
            this.speed=speed;
        }else System.out.println("invalid speed");
        System.exit(2);

    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String toString(){
        if (on){
            return "Speed -->"+getSpeed()+"\tColor-->"+getColor()+"\tRadius-->"+getRadius();
        }else
            return "Color-->"+getColor()+"\tRadius-->"+getRadius()+"\nfan is off";
    }
}
