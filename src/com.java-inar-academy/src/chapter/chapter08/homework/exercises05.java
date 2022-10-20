package chapter.chapter08.homework;


import java.util.Scanner;

public class exercises05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3x3 matrix:");

        System.out.print("Enter matrix1: ");
        double[][] matrix1 = getFromUser(input);
        System.out.print("Enter matrix2: ");
        double[][] matrix2 = getFromUser(input);
        double[][] total = total(matrix1, matrix2);
        disPlay(total);
    }

    public static void disPlay(double[][] total) {
        for (int row = 0; row < total.length; row++) {
            for (int col = 0; col < total[row].length; col++) {
                System.out.printf("%-3.1f ",total[row][col]);
            }
            System.out.println();
        }
    }

    public static double[][] total(double[][] matrix1, double[][] matrix2) {
        double[][] total = new double[3][3];
        for (int row = 0; row < matrix1.length; row++) {
            for (int column = 0; column < matrix1[row].length; column++) {
                total[row][column] = matrix1[row][column] + matrix2[row][column];
            }
        }
        return total;
    }

    public static double[][] getFromUser(Scanner input) {
        double[][] array = new double[3][3];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array[row].length; column++) {
                array[row][column] = input.nextDouble();
            }

        }
        return array;
    }

}
