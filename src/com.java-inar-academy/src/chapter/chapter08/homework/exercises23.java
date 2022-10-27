package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises23 {
    public static void main(String[] args) {
        System.out.println("6x6 matrix is generating");
        int[][] array = {{1, 1, 1, 0, 1, 1},
                {1, 1, 1, 1, 0, 0,},
                {0, 1, 0, 1, 1, 1,},
                {1, 1, 1, 1, 1, 1,},
                {0, 1, 1, 1, 1, 0,},
                {1, 0, 0, 0, 0, 1}};

        chapter.chapter08.execises.methods.print(array);
        System.out.println("Please change any 1 to 0 ");
        int[][] newarray = getFromUser();
        flippedCell(array,newarray);


    }

    public static void flippedCell(int[][] array, int[][] newarray) {
        int indexrow = 0;
        int indexCol = 0;
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                if (array[row][col] != newarray[row][col]) {
                    indexrow = row;
                    indexCol = col;
                    break;
                }
            }


        }
        System.out.println("The flipped cell is (" + indexrow + "," + indexCol + ")");


    }

    public static int[][] getFromUser() {
        Scanner input = new Scanner(System.in);
        int[][] newarray = new int[6][6];
        for (int row = 0; row < newarray.length; row++) {
            for (int column = 0; column < newarray.length; column++) {
                newarray[row][column] = input.nextInt();

            }
        }
        return newarray;

    }
}
