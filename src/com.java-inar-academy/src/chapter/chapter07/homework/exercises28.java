package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises28 {
    public static void main(String[] args) {
        int[] array = getArray();
        print(array);
        System.out.println();
        combination(array);
    }

    private static int[] getArray() {
        Scanner input = new Scanner(System.in);
        int[] numbers = new int[10];
        System.out.println("Enter ten numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        return numbers;
    }

    public static void combination(int[] array) {
        for (int row = 0; row < array.length - 1; row++) {
            for (int column = row + 1; column < array.length; column++) {
                System.out.printf("(%2d ,%2d)---(%2d ,%2d)\n",array[row] , array[column] ,array[column] , array[row]);

            }

        }
    }

    public static void print(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]+" ");

        }
    }
}
