package chapter.chapter13.homework.exercises03;

import java.util.ArrayList;

public class SortArrayList {
    public static void main(String[] args) {
        ArrayList<Number> list = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            list.add((int) (Math.random()*100));
        }
        System.out.println(list.toString());
        sort(list);
        System.out.println(list);

    }
    public static void sort(ArrayList<Number> list){
        for (int i = 0; i < list.size()-1; i++) {
            Number min=list.get(i);
            int minIndex=i;

            for (int j = i+1; j <list.size() ; j++) {
                if (min.doubleValue() > list.get(j).doubleValue()){
                    min=list.get(j);
                    minIndex=j;
                }

            }
            if (minIndex!=i){
                list.set(minIndex,list.get(i));
                list.set(i,min);
            }

        }
    }
}
