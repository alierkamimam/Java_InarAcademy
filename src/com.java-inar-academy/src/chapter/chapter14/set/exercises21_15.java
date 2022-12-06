package chapter.chapter14.set;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class exercises21_15 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Set<Integer> list = new HashSet<>();
        int number1 = (int) (Math.random() * 10);
        int number2 = (int) (Math.random() * 10);


        int result = -1;
        while (number1 + number2 != result) {
            System.out.print("what is " + number1 + " + " + number2+": ");
            result = input.nextInt();
            if (!list.contains(result)) {
                list.add(result);
                System.out.print("Wrong answer. Try again.");
            } else System.out.print("You already entered " + result);

        }
        System.out.printf("You got it!");

    }
}