package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises15 {
    public static void main(String[] args) {
        int[] numbers = getFromUser();// 1 2 2 4 5

        int[] duplicate = eliminateDuplicates(numbers);
        display(duplicate);
    }
    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }
    public static int[] eliminateDuplicates(int[] numbers) {
        int index = 0;
        int[] array = new int[10];
        for (int i = 0; i < numbers.length - 1; i++) {   // 1 2 2 3 4
            boolean isDuplicated = false;
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    isDuplicated = true;
                }
            }
            if (!isDuplicated) {
                array[index] = numbers[i];
                index++;
            }
        }
        return array;
    }
    public static void display(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 0) {
                System.out.print(numbers[i] + " ");
            }
        }
    }
}


