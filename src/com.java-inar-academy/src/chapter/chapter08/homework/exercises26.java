package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises26 {
    public static void main(String[] args) {
        double[][] array = getFromUser();
        System.out.println("Before sorting");
        print(array);
        System.out.println("\n");
        System.out.println("After sorting");
        double[][] sortedArray = sortRows(array);
        print(sortedArray);


    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        double[][] array = new double[3][3];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                array[row][column] = input.nextDouble();
            }
        }
        return array;
    }

    public static double[][] sortRows(double[][] m) {
        for (int row = 0; row < m.length; row++) {
            for (int col = 0; col < m[row].length - 1; col++) {

                double min = m[row][col];
                int minIndex = col;

                for (int j = col + 1; j < m.length; j++) {
                    if (min > m[row][j]) {
                        min = m[row][j];
                        minIndex = j;

                    }
                }
                if (minIndex != col) {
                    m[row][minIndex] = m[row][col];
                    m[row][col] = min;
                }
            }
        }
        return m;
    }

    public static void print(double[][] x) {
        for (int ro = 0; ro < x.length; ro++) {
            for (int col = 0; col < x.length; col++) {
                System.out.print(x[ro][col] + " ");

            }
            System.out.println();
        }
    }
}
/*
        0,15 0,875 0,375
        0,55 0,005 0,225
        0,30 0,12 0,4 */
