package chapter.chapter11.homework.ex04;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayList1 {
    public static void main(String[] args) {
        Integer[] number={1,3,4,5,6,7,3,4,5,8,9,12,45,23,67,98,78,123,1,3,4,5,6,2,2};
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(number));
        ArrayList<Integer> list1=null;
        ArrayList<Integer> list2=new ArrayList<>();
        System.out.println(max(list));
        System.out.println(max(list1));
        System.out.println(max(list2));



    }
    public static Integer max(ArrayList<Integer> list){
        if (list==null || list.size()==0) {
            return null;
        }

        Integer max=Integer.MIN_VALUE;

        for (int i = 0; i <list.size() ; i++) {
            if (max<list.get(i)) {
                max = list.get(i);
            }
        }
        return max;
    }

    }

