package chapter.chapter11.checkpoint;

import java.util.ArrayList;


public class cp32 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Denver");
        list.add("Dallas");
        list.add("Dallas");
        list.add("Dallas");
        list.remove("Dallas");
        /*for (String str : list) {
            System.out.println(str + " ");

        }*/
        System.out.println(list);
        System.out.println("-------------");

        for (int i = 0; i < list.size(); i++) {
            list.remove("Dallas");
        }
        System.out.println("-------------");

        for (String str : list) {
            System.out.println(str + " ");

        }

    }
}
