package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises25 {
    public static void main(String[] args) {
        System.out.println("Enter a 3-by-3 matrix row by row:");
        double[][] array = getFromUser();
        System.out.println(isMarkovMatrix(array)?"It is a Markov Matrix":"It is not a Markov Matrix");


    }

    public static double[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        double[][] array = new double[3][3];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                array[row][column] = input.nextDouble();
            }
        }
        return array;
    }

    public static boolean isMarkovMatrix(double[][] array) {
        for (int column = 0; column < array[0].length; column++) {
            double total = 0;
            for (double[] ints : array) {
                total += ints[column];
            }
            if (total != 1.0) {
                return false;
            }
        }
        return true;
    }
}


