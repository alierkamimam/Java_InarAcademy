package chapter.chapter11.checkpoint;

import java.util.ArrayList;

public class cp30 {
    public static void main(String[] args) {
        ArrayList<Double> list=new ArrayList<>();
        list.add(34.5);
        list.add(45.2);
        list.add(18.6);
        list.add(0,5.7);
        int size=list.size();
        list.remove(1);
        list.remove(list.size()-1);
        System.out.println(list.contains(34.5));
        list.get(3);


    }
}
