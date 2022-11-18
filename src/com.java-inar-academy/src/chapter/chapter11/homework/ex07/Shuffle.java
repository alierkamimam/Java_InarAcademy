package chapter.chapter11.homework.ex07;


import java.util.ArrayList;
import java.util.Arrays;

public class Shuffle {
    public static void main(String[] args) {
        Integer[] array={1,2,3,4,5,6,7,8,9,10,11,12,14,15,16,17};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(array));
        System.out.println("Before shuffle");
        display(list);
        System.out.println("After shuffle");
        shuffle(list);
        display(list);


    }

    public static void shuffle(ArrayList<Integer> list) {
        if (list==null || list.size()==0){
            return;

        }
        for (int i = 0; i < list.size(); i++) {
            int random=(int) (Math.random()*list.size());
            Integer temp=list.get(i);
            list.set(i,list.get(random));
            list.set(random,temp);
        }

    }
    public static void display(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i)+" ");
        }
        System.out.println();
    }

}

