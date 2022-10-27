package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises24 {
    public static void main(String[] args) {

        int[][] grid = readSolution();
        System.out.println((smallBox(grid) && row(grid) && column(grid) &&(range(grid)))
                ?"Valid solution":"Invalid solution");


    }

    public static int[][] readSolution() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a sudoku puzzle solution:");
        int[][] grid = new int[9][9];
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                grid[row][column] = input.nextInt();

            }
        }
        return grid;

    }


    public static boolean range(int[][] grid) {
        for (int row = 0; row < 9; row++) {
            for (int column = 0; column < 9; column++) {
                if (grid[row][column] < 1 || grid[row][column] > 9) {
                    return false;
                }
            }
        }
        return true;
    }


    public static boolean row(int[][] grid) {
        for (int row = 0; row < grid.length; row++) {
            boolean[] check = new boolean[9];
            for (int column = 0; column < grid[row].length; column++) {
                check[grid[row][column] - 1] = true;
            }
            for (boolean b : check) {
                if (b == false) {
                    return false;
                }

            }
        }
        return true;
    }

    public static boolean column(int[][] grid) {

        for (int column = 0; column < grid[0].length; column++) {
            boolean[] check = new boolean[9];
            for (int row = 0; row < grid.length; row++) {
                check[grid[row][column] - 1] = true;
            }
            for (boolean b : check) {
                if (b == false) {
                    return false;
                }
            }
        }
        return true;
    }
    public static boolean smallBox(int[][] grid){
        for (int row = 0; row <grid.length ; row+=3) {
            boolean[] check = new boolean[9];
            for (int ro = 0; ro <3 ; ro++) {
                for (int col = 0; col <grid[0].length ; col+=3) {
                    for (int column = 0; column <3 ; column++) {
                        check[grid[ro][column]-1]=true;
                    }
                    for (boolean b:check){
                        if (b==false){
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
}


