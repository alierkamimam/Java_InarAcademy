
package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises22 {


    public static void main(String[] args) {
        int[][] array=generateRandom();
        chapter.chapter08.execises.methods.print(array);
        System.out.println(checkRow(array) || checkCol(array));

    }
    public static int[][] generateRandom(){
        int[][] array=new int[6][6];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array.length; col++) {
                array[row][col]=(int) (Math.random()*2);
            }
        }
        return array;
    }
    public static boolean checkRow(int[][] array){
        for (int[] ints : array) {
            int count = 0;
            for (int col = 0; col < array.length; col++) {
                if (ints[col] == 1) {
                    count++;
                }
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }
    public static boolean checkCol(int[][] array) {
        for (int column = 0; column < array.length; column++) {
            int count = 0;
            for (int row = 0; row < array.length; row++) {
                if (array[row][column] == 1) {
                    count++;
                }
                if (count >= 2) {
                    return true;
                }
            }
        }
        return false;
    }




}

