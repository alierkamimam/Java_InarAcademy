package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer value:");
        int number = input.nextInt();

        if (isPolidrome(number)) {
            System.out.println(number + " is polidrome");

        } else
            System.out.println(number + " is not polidrome");
    }

    public static boolean isPolidrome(int number) {
        return reverse(number) == number;
    }

    public static int reverse(int number) {
        int orginalnumber = number;
        int remainder;
        int reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;
    }
}
