package chapter.chapter11.homework.ex11;

import java.util.ArrayList;
import java.util.Scanner;


public class Sort {
    public static void main(String[] args) {
        ArrayList<Integer> list = getFromUser();
        System.out.println("Before sorting");
        System.out.println(list);
        System.out.println("After sorting");
        sort(list);
        System.out.println(list);

    }

    private static void disPlayList(ArrayList<Integer> list) {

    }

    public static ArrayList<Integer> getFromUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter five points:");
        ArrayList<Integer> list = new ArrayList<>(5);
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        return list;


    }

    public static void sort(ArrayList<Integer> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            Integer min = list.get(i);
            int index = i;
            for (int j = i + 1; j < list.size(); j++) {
                if (min > list.get(j)) {
                    min = list.get(j);
                    index = j;
                }
            }
            if (index != i) {
                Integer temp = list.get(i);
                list.set(i, min);
                list.set(index, temp);
            }
        }

    }

}



