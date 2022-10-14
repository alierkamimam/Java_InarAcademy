package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises19 {
    public static void main(String[] args) {

        int[] numbers = getFromUser();


        disPlaySorted(numbers);


    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        System.out.println("Enter   increasing  order array");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();

        }
        return array;
    }

    public static boolean isSorted(int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            if (number[i] > number[i + 1]  )
                return false;

        }
        return true;
    }

    public static void disPlaySorted(int[] numbers) {
        if (isSorted(numbers)) {
            System.out.println("The list is already sorted");
        } else
            System.out.println("The list is not sorted");

    }
}
