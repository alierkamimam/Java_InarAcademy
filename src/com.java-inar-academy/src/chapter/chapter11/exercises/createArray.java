package chapter.chapter11.exercises;

import java.util.ArrayList;
import java.util.Arrays;

public class createArray {
    public static void main(String[] args) {
        /*String[] array={"red","green","blue"};
        ArrayList<String> list=new ArrayList<>(Arrays.asList(array));
        System.out.println(list);

        String[] array1=new String[list.size()];
        list.toArray(array1);
        System.out.println();*/

        Integer[] array={3,5,95,4,15,34,3,6,5};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(array));
        java.util.Collections.sort(list);
        System.out.println(list);


        System.out.println(java.util.Collections.max(list));
        System.out.println(java.util.Collections.min(list));



        java.util.Collections.shuffle(list);
        System.out.println(list);
        ArrayList<Integer> cloneNumber = (ArrayList<Integer>)list.clone();
        System.out.println(cloneNumber);

    }
}
