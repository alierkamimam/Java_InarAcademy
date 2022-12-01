package chapter.chapter13.homework.exercises15;

import java.math.BigInteger;

public class test {
    public static void main(String[] args) {
        Rational r1=new Rational(new BigInteger("40000000"),new BigInteger("3600000"));
        Rational r2=new Rational(new BigInteger("5000000"),new BigInteger("267899990"));

        System.out.println(r1 + " + " + r2 + " = " + r1.add(r2));
        System.out.println(r1 + " - " + r2 + " = " + r1.subtract(r2));
        System.out.println(r1 + " * " + r2 + " = " + r1.multiply(r2));
        System.out.println(r1 + " / " + r2 + " = " + r1.divide(r2));
        System.out.println(r2 + " is " + r2.doubleValue());
    }
}
