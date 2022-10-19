package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises02 {
    public static void main(String[] args) {
        double[][] array = getFromUser();
        double sum = sumMajorDiagona(array);
        System.out.println("Sum of the elements in the major diagonal "+sum);


    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 4-by-4 matrix row by row:");
        double[][] array = new double[4][4];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }
        }
        return array;
    }

    public static double sumMajorDiagona(double[][] array) {
        double total = 0;
        for (int row = 0, column = 0; row < array.length && column < array[0].length; row++, column++) {
            total += array[row][column];
        }
        double total1 = 0;
        for (int row = 0, column = (array.length - 1); row < array.length && column < array[0].length; row++, column--) {
            total1 += array[row][column];

        }
        if (total1 > total) {
            return total1;

        } else return total;


    }
}