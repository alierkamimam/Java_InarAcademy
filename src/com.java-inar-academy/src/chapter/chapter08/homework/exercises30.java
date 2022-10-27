package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 2x2 matrix:");
        double[][] matrix = new double[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix[i][j] = input.nextDouble();
            }
        }

        System.out.println("Enter two value for (x+y=b) b:");
        double[] b = new double[2];
        for (int i = 0; i < 2; i++) {
            b[i] = input.nextDouble();
        }

        linearEquation(matrix, b);
    }

    public static void linearEquation(double[][] a, double[] b) {
        double[] result = new double[2];
        double x = ((b[0] * a[1][1]) - (b[1] * a[0][1])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        double y = ((b[1] * a[0][0]) - (b[0] * a[1][0])) / ((a[0][0] * a[1][1]) - (a[0][1] * a[1][0]));
        if (isNull(a)) {
            System.out.println("The equation has no solution");
        } else {
            System.out.println("x--> " + x);
            System.out.println("y--> "+y);
        }

    }



    public static boolean isNull(double[][] a) {
        return (a[0][0] * a[1][1]) - (a[0][1] * a[1][0]) == 0;

    }


}




