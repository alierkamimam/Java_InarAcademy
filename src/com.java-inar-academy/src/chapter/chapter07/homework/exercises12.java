package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the array lenght:");
        int lenght = input.nextInt();
        System.out.println("Array filled random numbers 0 between 99");
        int[] array = fillArray(lenght);
        System.out.println("Array before reverse method");
        disPlayArray(array);
        System.out.println();
        System.out.println("Array after reverse method");
        reverseArray(array);
        disPlayArray(array);


    }

    public static int[] fillArray(int lenght) {
        int[] array = new int[lenght];
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
        return array;
    }

    public static void disPlayArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if ((i + 1) % 10 == 0) {
                System.out.println(array[i]);
            } else
                System.out.print(array[i] + " ");
        }
    }

    public static void reverseArray(int[] array) {
        for (int i = 0, j = array.length - 1; i < array.length/2; i++, j--) {
            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;

        }
    }
}
