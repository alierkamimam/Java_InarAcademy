package chapter.chapter11.homework.ex16;

import java.util.ArrayList;
import java.util.Scanner;

public class AdditionQuiz {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        int num1 = (int) (Math.random() * 100);
        int num2 = (int) (Math.random() * 100);
        int result;

        while (true) {
            System.out.println("What is " + num1 + " + " + num2);
            result = input.nextInt();
            if (result == (num1 + num2)) {
                System.out.println("You got it");
                break;
            } else {
                System.out.println("wrong answer. Try again.");
                if (list.contains(result)) {

                    System.out.println("You already entered " + result);
                }
                list.add(result);

            }
        }


    }
}
