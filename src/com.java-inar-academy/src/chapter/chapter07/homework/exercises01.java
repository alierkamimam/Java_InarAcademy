package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of student:");
        int students = input.nextInt();

        int[] scores = new int[students];
        int i = 0;
        System.out.println("Enter " + students + " scores ");
        while (i < students) {
            scores[i] = input.nextInt();
            i++;
        }
        int bsetscore = best(scores);
        grade(bsetscore, scores);


    }

    public static int best(int[] scores) {
        int max = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > max) {
                max = scores[i];

            }
        }

        return max;
    }

    public static void grade(int max, int[] scores) {
        for (int i = 0; i < scores.length; i++) {

            if ((max - 10) <= scores[i]) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is A");

            } else if ((max - 20) <= scores[i]) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is B");

            } else if ((max - 30) <= scores[i]) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is C");

            } else if ((max - 40) <= scores[i]) {
                System.out.println("Student " + i + " score is " + scores[i] + " and grade is D");

            } else System.out.println("Student " + i + " score is " + scores[i] + " and grade is F otherwise");
        }

    }
}
