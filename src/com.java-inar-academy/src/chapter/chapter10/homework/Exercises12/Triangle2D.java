/*
package chapter.chapter10.homework.Exercises12;

import chapter.chapter10.homework.Exercises04.Mypoint;

public class Triangle2D {
    private Mypoint p1;
    private Mypoint p2;
    private Mypoint p3;


    public Triangle2D() {
        this(0, 0, 1, 1, 2, 5);

    }

    public Triangle2D(double p1X, double p1Y, double p2X, double p2Y, double p3X, double p3Y) {
        this(new Mypoint(p1X, p1Y), new Mypoint(p2X, p2Y), new Mypoint(p3X, p3Y));

    }

    public Triangle2D(Mypoint p1, Mypoint p2, Mypoint p3) {
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

    }

    public Mypoint getP1() {
        return this.p1;
    }

    public Mypoint getP2() {
        return this.p2;
    }

    public Mypoint getP3() {
        return this.p3;
    }

    public void setP1(Mypoint p1) {
        this.p1 = p1;
    }

    public void setP2(Mypoint p2) {
        this.p2 = p2;
    }

    public void setP3(Mypoint p3) {
        this.p3 = p3;
    }

    public double getArea() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        double s = (side3 + side1 + side2) / 3;
        return Math.pow(s * (s - side1) * (s - side2) * (s - side3), 0.5);
    }

    public double getPerimeter() {
        double side1 = p1.distance(getP2());
        double side2 = p1.distance(getP3());
        double side3 = p2.distance(getP3());

        return (side3 + side1 + side2);

    }

    public boolean contains(double x,double y) {
        Mypoint p=new Mypoint(x,y);

        boolean b1,b2,b3;

        b1=loc(p,p1,p2)<0.0;
        b2=loc(p,p2,p3)<0.0;
        b3=loc(p,p3,p1)<0.0;

        return




    }
}
*/
