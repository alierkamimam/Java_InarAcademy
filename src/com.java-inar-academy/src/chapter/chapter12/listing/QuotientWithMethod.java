package chapter.chapter12.listing;

import java.util.Scanner;

public class QuotientWithMethod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter two numbers:");
        int number1 = input.nextInt();
        int number2 = input.nextInt();


        int result = quotient(number1, number2);
        System.out.println(number1 + " / " + number2 + " is "
                + result);

    }

    public static int quotient(int number1, int number2)  {
        if (number2 == 0) {
            System.out.println("Divisor cannot be zero");
            System.exit(1);
        }
        return number1 / number2;
    }
}

