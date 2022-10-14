package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a value lists's lenght");
        int lengt = input.nextInt();

        System.out.println("Enter number of list1");
        int[] list1 = getList1(lengt, input);

        System.out.println("Enter number of list2");
        int[] list2 = getList1(lengt, input);

        int[] sort1 = sort(list1);
        int[] sort2 = sort(list2);


        if (equals(sort1, sort2)) {
            System.out.println("Two list are identical");
        } else
            System.out.println("Two list are not identical");


    }

    public static int[] getList1(int lenght, Scanner input) {
        int[] list1 = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            list1[i] = input.nextInt();

        }
        return list1;
    }

    public static int[] getList2(int lenght, Scanner input) {
        int[] list2 = new int[lenght];
        for (int i = 0; i < lenght; i++) {
            list2[i] = input.nextInt();

        }
        return list2;

    }

    public static boolean equals(int[] list1, int[] list2) {
        for (int i = 0; i < list1.length; i++) { //1 2 3 4 5
            if (list1[i] != list2[i])             //1 2 3 4 5
                return false;
        }
        return true;
    }

    public static int[] sort(int[] list) {
        for (int i = 0; i < list.length - 1; i++) {
            int min = list[i];
            int indexOfMin = 0;
            for (int j = i + 1; j < list.length; j++) {
                if (min > list[j]) {
                    min = list[j];
                    indexOfMin = j;
                }

            }
            if (indexOfMin != i) {
                int temp = list[indexOfMin];
                list[indexOfMin] = list[i];
                list[i] = temp;
            }
        }
        return list;
    }
}
