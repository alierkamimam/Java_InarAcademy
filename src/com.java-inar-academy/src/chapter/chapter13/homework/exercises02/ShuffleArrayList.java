package chapter.chapter13.homework.exercises02;

import java.util.ArrayList;

public class ShuffleArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random() * 100));
        }
        System.out.println(list);
        shuffle(list);
        System.out.println(list);

    }

    public static void shuffle(ArrayList<Number> list) {
        java.util.Collections.shuffle(list);
    }
}
