package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] array = new double[10];
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        double result = min(array);
        System.out.print("The minumun number is " + result);


    }

    public static double min(double[] array) {
        double min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min)
                min = array[i];
        }
        return min;


    }

}
