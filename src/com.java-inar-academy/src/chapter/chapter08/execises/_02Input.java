package chapter.chapter08.execises;

import java.util.Scanner;

public class _02Input {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int[][] matrix=new int[5][5];
        System.out.println("Enter "+matrix.length+" rows and "+matrix[0].length+" columns");
        for (int row = 0; row < matrix.length; row++) {
            System.out.println("Enter row"+row+" numbes:");
            for (int line = 0; line <matrix[row].length ; line++) {
                matrix[row][line]=input.nextInt();
            }
        }
        methods.print(matrix);

    }
}
