package chapter.chapter08.listing;

import java.util.Scanner;

public class Listing01_PassTwoDimensionalArray {
    public static void main(String[] args) {

        int[][] m=getArray();
        System.out.println("\nSum of elements is "+sum(m));


    }

    public static int[][] getArray() {
        Scanner input = new Scanner(System.in);

        int[][] m = new int[3][4];
        System.out.println("Enter " + m.length + " rows and" + m[0].length + " columns:");
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m[row].length; column++) {
                m[row][column] = input.nextInt();
            }

        }
        return m;


    }

    public static int sum(int[][] m) {
        int total = 0;
        for (int[] ints : m) {
            for (int anInt : ints) {
                total += anInt;
            }
        }
        return total;
    }
}
