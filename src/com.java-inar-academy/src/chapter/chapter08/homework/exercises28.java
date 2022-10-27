package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises28 {
    public static void main(String[] args) {
        System.out.println("Enter list1:");
        int[][] list1=getFromUser();
        System.out.println("Enter list2");
        int[][] list2=getFromUser();
        System.out.println(equals(list1,list2)?"The two arrays are identical":"The two arrays are not identical");


    }
    public static int[][] getFromUser(){
        Scanner input = new Scanner(System.in);
        int[][] array = new int[3][3];
        for (int row = 0; row < array.length; row++) {
            for (int column = 0; column < array.length; column++) {
                array[row][column] = input.nextInt();
            }
        }
        return array;
    }
    public static boolean equals(int[][] list1,int[][] list2){
        for (int row = 0; row<list1.length; row++) {
            for (int column = 0; column < list1.length; column++) {
                if (list1[row][column]!=list2[row][column]){
                    return false;

                }

            }
        }
        return true;

    }

}

