package chapter.chapter13.checkpoint;

import chapter.chapter13.listing.Rational;

public class cp30 {
    public static void main(String[] args) {
        Rational r1 = new Rational(-2, 6);
        System.out.println(r1.getNumerator());
        System.out.println(r1.getDenominator());
        System.out.println(r1.intValue());
        System.out.println(r1.doubleValue());
    }
}
