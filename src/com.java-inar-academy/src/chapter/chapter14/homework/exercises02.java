package chapter.chapter14.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class exercises02 {
    public static void main(String[] args) {
        List<Integer> list = generatesRandomNumbers();
        System.out.println(list);
        count(list);

    }

    private static void count(List<Integer> list) {
       List<Integer> arr=new ArrayList<>(10);
        for (int i = 0; i < list.size(); i++) {
            arr.add(0);
        }
        for (int i = 0; i <list.size() ; i++) {
           arr.set(list.get(i),arr.get(list.get(i))+1);

        }
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(i+"s "+arr.get(i));
        }

    }

    private static List<Integer> generatesRandomNumbers() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        return list;
    }
}
