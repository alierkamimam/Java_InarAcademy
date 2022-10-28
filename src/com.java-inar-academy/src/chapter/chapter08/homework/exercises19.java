
package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises19 {
    public static void main(String[] args) {
        int[][] array = generateRandom();
        print(array);
        System.out.println(checkRow(array) || checkCol(array) || diagonal(array));
    }

    public static int[][] generateRandom() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 6x7 matrix");
        int[][] array = new int[6][7];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = input.nextInt();
            }

        }
        return array;
    }

    public static void print(int[][] array) {

        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                System.out.print(array[row][col] + " ");
            }
            System.out.println();
        }

    }

    public static boolean checkRow(int[][] m) {
        int count;
        for (int i = 0; i < m.length; i++) {
            count = 1;
            for (int j = 0; j < m[i].length - 1; j++) {
                if (m[i][j] == m[i][j + 1]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
        }
        return false;
    }

    public static boolean checkCol(int[][] m) {
        int count;
        for (int j = 0; j < m[0].length; j++) {
            count = 1;
            for (int i = 0; i < m.length - 1; i++) {
                if (m[i][j] == m[i + 1][j]) {
                    count++;
                    if (count == 4) {
                        return true;
                    }
                } else {
                    count = 1;
                }
            }
        }
        return false;
    }

    public static boolean isRigtDiagonal(int[][] matrix,int row, int column)  {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column >= matrix[0].length - 3) {
            return false;
        }

        int number = matrix[row][column];
        int count = 1;

        for (int i = 1; i < 4; i++) {
            if (number == matrix[row + i][column + i]) {
                count++;

            }

        }
        if (count == 4) {
            return true;

        } else
            return false;

    }

    public static boolean leftDiagonal(int[][] matrix, int row, int column) {
        if (row >= matrix.length - 3) {
            return false;
        }
        if (column < 3) {
            return false;
        }

        int number = matrix[row][column];
        int count = 1;

        for (int i = 1; i < 4; i++) {
            if (number == matrix[row + i][column - i]) {
                count++;
            }
        }
        if (count == 4) {
            return true;
        } else
            return false;


    }
    public static boolean diagonal(int[][] m){
        for (int row = 0; row <m.length; row++) {
            for (int column = 0; column < m[0].length; column++) {
                if (leftDiagonal(m,row,column) || isRigtDiagonal(m,row,column)){
                    return true;
                }
            }
        }
        return false;
    }

}


