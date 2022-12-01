package chapter.chapter13.homework.exercises19;

import chapter.chapter13.homework.exercises15.Rational;

import java.math.BigInteger;
import java.util.Scanner;

public class exercises19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] str = input.nextLine().split("[.]");

        Rational num1 = new Rational(new BigInteger(str[0]), BigInteger.ONE);

        Rational num2 = new Rational(new BigInteger(str[1]), new BigInteger(String.valueOf((int) (Math.pow(10, str[1].length())))));

        System.out.println("The fraction number is " +
                (str[0].charAt(0) == '-' ? (num1).subtract(num2) : (num1).add(num2)));
    }
}
