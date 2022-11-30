package chapter.chapter13.checkpoint;

import chapter.chapter13.listing.Rational;

public class cp31 {
    public static void main(String[] args) {

      /*  Cannot resolve method 'compareTo' in 'Object'

        Rational r1 = new Rational(-2, 6);
        Object r2 = new Rational(1, 45);
        System.out.println(r2.compareTo(r1));*/


        /*Object r1 = new Rational(-2, 6);
        Rational r2 = new Rational(1, 45);
        System.out.println(r2.compareTo(r1)); r1  must be cast */

        Rational r1 = new Rational(1, 2);
        Rational r2 = new Rational(1, -2);
        System.out.println(r1.add(r2).intValue());
    }
}
