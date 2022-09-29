package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer value: ");
        int number = input.nextInt();
        System.out.println("The sum of integer is " + sumDigit(number));


    }

    public static int sumDigit(long n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n = n / 10;
        }
        return sum;
    }
}