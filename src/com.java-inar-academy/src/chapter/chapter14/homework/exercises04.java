package chapter.chapter14.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercises04 {
    public static void main(String[] args) {
        double[][] arr = new double[3][3];
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a 3-by-3 matrix row by row: ");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                arr[i][j] = input.nextDouble();
            }

        }
        System.out.println("The row-sorted array is");

        List<Double> arr1 = new ArrayList<>();
        arr1.add(arr[0][0]);
        arr1.add(arr[0][1]);
        arr1.add(arr[0][2]);
        java.util.Collections.sort(arr1);
        System.out.println(arr1);


        List<Double> arr2 = new ArrayList<>();
        arr2.add(arr[1][0]);
        arr2.add(arr[1][1]);
        arr2.add(arr[1][2]);
        java.util.Collections.sort(arr2);
        System.out.println(arr2);

        List<Double> arr3 = new ArrayList<>();
        arr3.add(arr[2][0]);
        arr3.add(arr[2][1]);
        arr3.add(arr[2][2]);
        java.util.Collections.sort(arr3);
        System.out.println(arr3);

    }
}