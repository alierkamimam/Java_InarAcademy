package chapter.chapter11.homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercises14 {
    public static void main(String[] args) {
        Integer[] number1 = getFromUser();
        Integer[] number2 = getFromUser();
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(number1));
        ArrayList<Integer> list2 = new ArrayList<>(Arrays.asList(number2));
        ArrayList<Integer> list3 = union(list1, list2);
        System.out.println(list3);

        System.out.println();


    }

    public static Integer[] getFromUser() {
        System.out.println("Enter a five integer");
        Scanner input = new Scanner(System.in);
        Integer[] array = new Integer[5];

        for (int i = 0; i < 5; i++) {
            array[i] = input.nextInt();

        }
        return array;

    }

    public static ArrayList<Integer> union(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> total = new ArrayList<>();
        for (int i = 0; i < list1.size(); i++) {
            total.add(list1.get(i));
        }
        for (int i = 0; i < list2.size(); i++) {
            total.add(list2.get(i));
        }
        return total;

    }
}
