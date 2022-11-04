package chapter.chapter09.homework;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;


    QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return ((b * b) - (4 * a * c));
    }

    public double getRoot1() {
        if (getDiscriminant() < 0) {
            return 0;
        }
        return (((-1 * getB()) + Math.sqrt(getDiscriminant())) / 2 * getA());
    }

    public double getRoot2() {
        if (getDiscriminant() < 0) {
            return 0;

        }
        return (((-1 * getB()) + Math.sqrt(getDiscriminant())) / 2 * getA());

    }

    public String String() {
        if (getDiscriminant() < 0) {
            return "The equation has no real root";
        }else if (getDiscriminant()==0){
            return "The equqation has one root"+getRoot1();
        }else
            return "root1--> "+getRoot1()+"\troot2--> "+getRoot2();

}

}
