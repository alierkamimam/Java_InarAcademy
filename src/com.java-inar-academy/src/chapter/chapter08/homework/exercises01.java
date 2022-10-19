package chapter.chapter08.homework;

import chapter.chapter08.execises.methods;

import java.util.Scanner;

public class exercises01 {
    public static void main(String[] args) {
        double[][] array = getFromUser();
        Summingelementsbycolumn(array);


    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-4 matrix row by row:");
        double[][] array = new double[3][4];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();


            }
        }
        return array;
    }

    public static void Summingelementsbycolumn(double[][] matrix) {

        for (int column = 0; column < matrix[0].length; column++) {
            double total = 0;
            for (int row = 0; row < matrix.length; row++) {
                total += matrix[row][column];
            }
            System.out.println("Sum for column " + column + " is "
                    + total);


        }
    }
}

