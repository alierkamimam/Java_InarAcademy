package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3x3 matrix");

        System.out.print("Enter matrix1:");
        double[][] matrix1 = exercises05.getFromUser(input);

        System.out.print("Enter matrix2:");
        double[][] matrix2 = exercises05.getFromUser(input);

        double[][] multiplication = multiplication(matrix1, matrix2);
        exercises05.disPlay(multiplication);


    }

    public static double[][] multiplication(double[][] matrix1, double[][] matrix2) {
        double[][] matrix3 = new double[matrix1.length][matrix2[0].length];
        for (int i = 0; i < matrix3.length; i++) {
            for (int j = 0; j < matrix3[i].length; j++) {
                for (int k = 0; k < matrix1[0].length; k++) {
                    matrix3[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }
        return matrix3;
    }

}
