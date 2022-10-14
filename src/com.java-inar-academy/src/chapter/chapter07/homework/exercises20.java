package chapter.chapter07.homework;

import java.util.Scanner;


public class exercises20 {
    public static void main(String[] args) {

        int[] array = getFromUser();
        System.out.println("Before sorting");
        display(array);
        System.out.println();
        System.out.println("After sorting");
        selectionSort(array);
        display(array);



    }

    public static int[] getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter ten numbers: ");
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static void selectionSort(int[] numbers) {
        for (int i = 0; i < numbers.length - 1; i++) {
            int max = numbers[i];
            int index = i;

            for (int j = (i + 1); j < numbers.length; j++) {
                if (max < numbers[j]) {
                    max = numbers[j];
                    index = j;
                }
            }
            if (index != i) {
                int temp = numbers[index];
                numbers[index] = numbers[i];
                numbers[i] = temp;
            }
        }

    }
    public static void display(int[] number){
        for (int i=0;i<number.length;i++){
            System.out.print(number[i]+" ");
        }
    }
}
