package chapter.chapter11.exercises;

import java.util.ArrayList;

public class exercises1 {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList<>(); //we cannot primitive data type such as int
        list.add(1);
        list.add(2);
        System.out.println(list.get(0)+" "+list.get(1));
    }
}
