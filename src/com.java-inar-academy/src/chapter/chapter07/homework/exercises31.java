package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises31 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int[] listone = list1(input);
        int[] listtwo = list2(input);


        int[] merged = merge(listone, listtwo);
        System.out.print("The merged list is:");
        print(merged);
    }


    public static int[] list1(Scanner input) {
        System.out.println("Enter list1:");
        int number = input.nextInt();
        int[] list1 = new int[number];
        for (int i = 0; i < number; i++) {
            list1[i] = input.nextInt();
        }
        return list1;

    }

    public static int[] list2(Scanner input) {
        System.out.println("Enter list2:");
        int number1 = input.nextInt();
        int[] list2 = new int[number1];
        for (int i = 0; i < number1; i++) {
            list2[i] = input.nextInt();
        }
        return list2;

    }

    public static int[] merge(int[] list1, int[] list2) {
        int[] merge = new int[list1.length + list2.length];
        for (int i = 0; i < list1.length; i++) {
            merge[i] = list1[i];
        }
        for (int j = list1.length, k = 0; j < merge.length && k < list1.length; j++, k++) {
            merge[j] = list2[k];
        }

        for (int i = 0; i < merge.length - 1; i++) {
            int index = i;
            int min = merge[i];
            for (int j = i + 1; j < merge.length; j++) {
                if (min > merge[j]) {
                    min = merge[j];
                    index = j;
                }

            }
            if (index != i) {
                merge[index] = merge[i];
                merge[i] = min;
            }
        }
        return merge;
    }

    public static void print(int[] merged) {
        for (int i = 0; i < merged.length; i++) {
            System.out.print(merged[i] + " ");

        }
    }
}
