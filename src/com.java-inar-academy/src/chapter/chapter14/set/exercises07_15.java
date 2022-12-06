package chapter.chapter14.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercises07_15 {
    public static void main(String[] args) {

        System.out.print("Enter ten integer:");
        Set<Integer> list = eliminateDuplicates();
        System.out.printf("The distinct numbers are: "+list);

    }

    public static Set<Integer> eliminateDuplicates() {
        Scanner input = new Scanner(System.in);
        Set<Integer> list = new HashSet<>();
        for (int i = 0; i < 10; i++) {
            list.add(input.nextInt());
        }
        return list;
    }
}
