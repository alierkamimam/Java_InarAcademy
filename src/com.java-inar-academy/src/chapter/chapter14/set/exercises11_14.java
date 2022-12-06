package chapter.chapter14.set;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class exercises11_14 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter five numbers:");
        List<Integer> list1=getfrom(5);

        System.out.print("Enter five numbers:");
        List<Integer> list2=getfrom(5);


        System.out.println("The combined list is " + combine(list1, list2));

    }

    private static List<Integer>  combine(List<Integer> list1, List<Integer> list2) {
        for (int i = 0; i < list2.size(); i++) {
            list1.add(list2.get(i));
        }
        return list1;
    }

    private static List<Integer> getfrom(int i) {
        Scanner input=new Scanner(System.in);
        List<Integer> list=new ArrayList<>();
        for (int j = 0; j < i; j++) {
            list.add(input.nextInt());


        }
        return list;
    }
}
