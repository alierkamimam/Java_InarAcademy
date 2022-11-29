package chapter.chapter13.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class ex01 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<>();
        list.add(1.5);
        list.add(2.5);
        list.add(3.5);
        ArrayList<Double> list1 = (ArrayList<Double>) list.clone();
        ArrayList<Double> list2 = list;
        list1.add(4.5);
        list2.remove(1.5);

        System.out.println("list is " + list);
        System.out.println("list1 is " + list1);
        System.out.println("list2 is " + list2);

    }
}
