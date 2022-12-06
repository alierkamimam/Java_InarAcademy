package chapter.chapter14.arraylist;

import java.util.ArrayList;
import java.util.List;

public class exercises03 {
    public static void main(String[] args) {
        List<Integer> list = generateRandomNumber();
        System.out.println(list);
        List<Integer> reverse=reverse(list);
        System.out.println(reverse);



    }

    private static  List<Integer> reverse(List<Integer> list) {
        List<Integer> reverse=new ArrayList<>();
        for (int i = list.size()-1; i >=0; i--) {
            reverse.add(list.get(i));


        }
        return reverse;
    }

    private static List<Integer> generateRandomNumber() {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add((int) (Math.random() * 10));
        }
        return list;
    }
}
