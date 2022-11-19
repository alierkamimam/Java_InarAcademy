package chapter.chapter11.homework.ex09;

import java.util.ArrayList;
import java.util.Scanner;

import static Week.Week_11.erkam.display;

public class exercises09 {
    public static void main(String[] args) {
        int[][] matrix = getFromUser();
        ArrayList<Integer> row = new ArrayList<>();
        ArrayList<Integer> column = new ArrayList<>();

        fillRow(row, matrix);
        fillColumn(column, matrix);

        disPlay(matrix);

        displayMaxRow(row);
        displayMaxColumn(column);

    }

    public static void displayMaxColumn(ArrayList<Integer> column) {
        System.out.print("The largest column index: ");
        for (int i = 0; i < column.size(); i++) {
            if (column.get(i).equals(java.util.Collections.max(column))) {
                System.out.print(i+" ");
            }

        }

    }

    public static void displayMaxRow(ArrayList<Integer> row) {
        System.out.print("The largest row index: ");
        for (int i = 0; i < row.size(); i++) {
            if (row.get(i).equals(java.util.Collections.max(row))) {
                System.out.print(i+ " ");
            }


        }
        System.out.println();


    }

    private static void fillColumn(ArrayList<Integer> column, int[][] matrix) {
        for (int i = 0; i < matrix[0].length; i++) {
            int count = 0;
            for (int j = 0; j < matrix.length; j++) {
                if (matrix[j][i] == 1) {
                    count++;
                }
            }
            column.add(count);

        }
    }

    public static void fillRow(ArrayList<Integer> row, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            int count = 0;
            for (int j = 0; j < matrix[i].length; j++) {
                if (matrix[i][j] == 1) {
                    count++;
                }
            }
            row.add(count);
        }
    }

    public static int[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the array size n: ");
        int size = input.nextInt();
        int[][] array = new int[size][size];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 2);
            }

        }
        return array;

    }
    public static void disPlay(int[][] matrix){
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j]+" ");

            }
            System.out.println();

        }
    }
}
