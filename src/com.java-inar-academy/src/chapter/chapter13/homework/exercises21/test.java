package chapter.chapter13.homework.exercises21;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a,b,c:");
        Rational a = new Rational(input.nextLong(), 1);
        Rational b = new Rational(input.nextLong(), 1);
        Rational c = new Rational(input.nextLong(), 1);

        //   -b  / 2a
        Rational h = new Rational(-b.getNumerator(), 2 * a.getNumerator());
        // k= c - a*h'2;
        Rational k = c.subtract(a.multiply(h.multiply(h)));
        System.out.println("h is " + h + " k is " + k);
    }
}
