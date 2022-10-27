package chapter.chapter08.homework;

import java.util.Scanner;


public class exercises13 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows and columns of the array:");
        int row = input.nextInt();
        int col = input.nextInt();
        System.out.println("Enter the array:");
        double[][] array = getFromUser(row, col);
        largestNumber(array);


    }

    public static double[][] getFromUser(int row, int col) {
        double[][] arr = new double[row][col];
        for (int ro = 0; ro < row; ro++) {
            for (int co = 0; co < col; co++) {
                arr[ro][co] = input.nextDouble();
            }
        }
        return arr;
    }

    public static void largestNumber(double[][] array) {
        double max = array[0][0];
        int indexrow = 0;
        int indexcol = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 1; col < array[0].length; col++) {
                if (max < array[row][col]) {
                    max = array[row][col];
                    indexrow = row;
                    indexcol = col;
                }
            }
        }
        System.out.printf("The location of the largest element is %s  at (" + indexrow + "," + indexcol + ")", max);


    }
}
