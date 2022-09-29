package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a three double:");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        System.out.print("increasing order is ");
        displaySortedNumbers(num1, num2, num3);

    }

    public static void displaySortedNumbers(double num1, double num2, double num3) {
        if (num2 < num1 && num2 < num3) {
            double temp = num2;                   //num2<num1<num3
            num2 = num1;
            num1 = temp;
        } else if (num3 < num1 && num3 < num2) {
            double temp = num3;
            num3 = num1;
            num1 = temp;                              // num3<num2<num1

        }
        if (num3 < num2) {
            double temp = num3;
            num3 = num2;
            num2 = temp;
        }
        System.out.println(num1 + "  " + num2 + "  " + num3);

    }
}

