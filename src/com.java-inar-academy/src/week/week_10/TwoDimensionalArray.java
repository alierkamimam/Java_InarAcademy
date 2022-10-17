package Week.week_10;

import java.util.Scanner;

public class TwoDimensionalArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.println("Enter the number of columns:");
        int columns = input.nextInt();
        int[][] arr2 = new int[rows][columns];
        fill2DArrWithRandomValues(arr2, 0, 10);
        disPlay(arr2);


    }

    public static void fill2DArrWithRandomValues(int[][] arr2, int start, int limit) {
        for (int row = 0; row < arr2.length; row++) {
            for (int col = 0; col < arr2[row].length; col++) {
                arr2[row][col] = (int) (start + Math.random() * (limit - start));

            }

        }
    }

    public static void disPlay(int[][] arr2) {
        for (int[] ints : arr2) {
            for (int anInt : ints) {
                System.out.printf("[%d]", anInt);
            }
            System.out.println();

        }
    }

}
