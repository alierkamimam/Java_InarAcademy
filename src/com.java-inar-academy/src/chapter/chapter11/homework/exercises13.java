package chapter.chapter11.homework;

import chapter.chapter09.exercises.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercises13 {
    public static void main(String[] args) {
        Integer[] number=getFromUser();
        ArrayList<Integer> list=new ArrayList<>(Arrays.asList(number));
        System.out.println(list);
        System.out.println();
        System.out.println("The distinct integer are ");
        removeDuplicate(list);



    }

    public static Integer[] getFromUser() {
        Scanner input=new Scanner(System.in);
        Integer[] array=new Integer[10];
        System.out.println("Enter ten integer numbers:");
        for (int i = 0; i <10 ; i++) {
            array[i]=input.nextInt();


        }
        return array;

    }
    public static void removeDuplicate(ArrayList<Integer> list){
        ArrayList<Integer> nonDuplicate=new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (!(nonDuplicate.contains(list.get(i)))){
                nonDuplicate.add(list.get(i));
            }

        }
        System.out.println(nonDuplicate);
    }

}
