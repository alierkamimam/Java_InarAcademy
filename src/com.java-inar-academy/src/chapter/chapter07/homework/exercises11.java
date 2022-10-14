package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        double mean = mean(array);
        double deviation = deviation(array);
        System.out.printf("The mean is %2.2f \n", mean);
        System.out.printf("The deviation is %1.5f", deviation);

    }

    public static double deviation(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += Math.pow((x[i] - mean(x)), 2);
        }
        return Math.pow(sum / (x.length - 1), 0.5);

    }

    public static double mean(double[] x) {
        double sum = 0;
        for (int i = 0; i < x.length; i++) {
            sum += x[i];

        }
        return (sum / x.length);


    }
}
