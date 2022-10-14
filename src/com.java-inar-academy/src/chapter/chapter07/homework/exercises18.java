package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextDouble();

        }

        bubbleSorting(array);
        display(array);

    }

    public static double[] bubbleSorting(double[] number) {
        int count = 0;
        while (count < 10) {
            for (int i = 0; i < number.length - 1; i++) {
                if (number[i] > number[i + 1]) {
                    double temp = number[i + 1];
                    number[i + 1] = number[i];
                    number[i] = temp;
                }
            }
            count++;

        }
        return number;

    }

    public static void display(double[] number) {
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + " ");
        }
    }

}
