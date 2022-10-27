package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises14 {


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the size for the matrix:");
        int size = input.nextInt();

        int[][] matrix = new int[size][size];
        randomGenerate(matrix);
        print(matrix);
        row(matrix, 1);
        row(matrix, 0);
        col(matrix, 1);
        col(matrix, 0);
        majordioganal(matrix, 1);
        majordioganal(matrix, 0);
        subdioganal(matrix, 1);
        subdioganal(matrix, 0);

    }


    public static int[][] randomGenerate(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                matrix[row][col] = (int) (Math.random() * 2);
            }
        }
        return matrix;
    }

    public static void print(int[][] matrix) {
        for (int row = 0; row < matrix.length; row++) {
            for (int col = 0; col < matrix[0].length; col++) {
                System.out.print(matrix[row][col] + " ");
            }
            System.out.println();
        }
    }

    public static void row(int[][] matrix, int x) {
        int row = 0;
        int index = x;
        for (int ro = 0; ro < matrix.length; ro++) {
            int count = 0;
            for (int col = 0; col < matrix.length; col++) {
                if (index != matrix[ro][col]) {
                    break;
                } else {
                    count++;
                }
                if (count == 4) {
                    row++;
                }
            }

        }
        if (row == 0) {
            System.out.printf("No same numbers on a row for %s\n", index);
        } else {
            System.out.printf("All %s s on row %s\n", (index), row);
        }
    }

    public static void col(int[][] matrix, int x) {
        int index = x;
        int row = 0;
        for (int col = 0; col < matrix.length; col++) {
            int count = 0;
            for (int ro = 0; ro < matrix.length; ro++) {
                if (index != matrix[ro][col]) {
                    break;
                } else {
                    count++;
                }
                if (count == 4) {
                    row++;
                }
            }
        }
        if (row == 0) {
            System.out.printf("No same numbers on a column for %s\n", index);
        } else {
            System.out.printf("All %s s on column %s\n", index, row);
        }
    }

    public static void majordioganal(int[][] matrix, int x) {
        int row = 0;
        if (x == matrix[0][0] && x == matrix[1][1] && x == matrix[2][2] && x == matrix[3][3]) {
            row++;
        }
        if (x == matrix[0][3] && x == matrix[1][2] && x == matrix[2][1] && x == matrix[3][0]) {
            row++;
        }

        if (row == 0) {
            System.out.printf("No same numbers on the major diagonal for %s\n",x);
        } else
            System.out.printf("All %s s on major diogonal %s\n", x, row);

    }


    public static void subdioganal(int[][] matrix, int x) {
        int row = 0;
        if (x == matrix[1][0] && x == matrix[2][1] && x == matrix[3][2]) {
            row++;
        }
        if (x == matrix[1][3] && x == matrix[2][2] && x == matrix[3][1]) {
            row++;
        }

        if (row == 0) {
            System.out.printf("No same numbers on the major diagonal for %s\n",x);
        } else
            System.out.printf("All %s s on major diogonal %s\n", x, row);

    }
}



