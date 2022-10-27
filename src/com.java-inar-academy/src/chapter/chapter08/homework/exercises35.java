package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises35 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Enter the number of rows in the matrix:");
        int number = input.nextInt();
        int[][] matrix = getFromUser(number);
        int[] array = findLargestBlock(matrix);
        display(array);


    }

    private static int[][] getFromUser(int number) {
        int[][] array = new int[number][number];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column <array.length ; column++) {
                array[row][column]=input.nextInt();

            }

        }
        return array;
    }

    public static int[] findLargestBlock(int[][] m) {
        int[] array = new int[3];
        int size = 2;

        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {

                while (isSuquare(m, row, column, size)) {
                    array[0] = row;
                    array[1] = column;
                    array[2] = size;
                    size++;

                }
            }
        }
        return array;
    }

    public static boolean isSuquare(int[][] m, int row, int column, int size) {
        if (row + size > m[0].length) {
            return false;
        }
        if (column + size > m.length) {
            return false;
        }

        for (int i = row; i < row + size; i++) {
            for (int j = column; j < column + size; j++) {
                if (m[i][j] != 1) {
                    return false;
                }

            }
        }
        return true;

    }

    public static void display(int[] array) {

            System.out.println("The maximum square submatrix is at (" + array[0] + "," + array[1] + ")" +
                    " with size " + array[2]);



    }
}
