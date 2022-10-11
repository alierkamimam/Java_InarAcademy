package chapter.chapter07.listing;

import java.util.Scanner;

public class listing01 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number of items");
        int number = input.nextInt();
        double[] numbers = new double[number];
        double sum = 0;


        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Enter the number:");
            numbers[i] = input.nextDouble();
            sum += numbers[i];

        }
        double average = sum / number;
        int count = 0;
        for (int i = 0; i < number; i++) {
            if (numbers[i] > average)
                count++;
        }
        System.out.println("Average is " + average);
        System.out.println("Number of elements above the average is " + count);

    }
}
