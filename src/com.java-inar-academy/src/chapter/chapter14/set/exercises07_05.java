package chapter.chapter14.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercises07_05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> list = new HashSet<>();
        System.out.print("Enter ten numbers:");
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        System.out.println("The number of distinct number is "+list.size());
        System.out.println("The distinct numbers are: "+list);


    }
}
