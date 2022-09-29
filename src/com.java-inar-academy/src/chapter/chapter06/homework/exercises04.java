package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a integer value:");
        int number = input.nextInt();
        reverse(number);

    }


    public static void reverse(int number) {
        String reverse = "";
        while (number != 0) {
            int d1 = number % 10;
            number /= 10;
            reverse += d1;
        }
        System.out.println(reverse);

    }
}
