package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of Students:");
        int student = input.nextInt();
        String[] students = new String[student];
        int[] score = new int[student];

        for (int i = 0; i < student; i++) {

            System.out.print("Enter student's name:");

            students[i] = input.next();

            System.out.print("Enter score:");
            score[i] = input.nextInt();

        }
        sortStudents(students, score);
        display(students,score);


    }


    public static void sortStudents(String[] names, int[] number) {
        for (int i = 0; i < number.length - 1; i++) {
            int max = number[0];
            int currentIndex = i;
            for (int j = i + 1; j < number.length; j++) {
                if (max < number[j]) {
                    max = number[j];
                    currentIndex = j;


                }

            }
            if (currentIndex != i) {
                number[currentIndex] = number[i];
                number[i] = max;
                names[currentIndex] = names[i];
                names[i] = names[max];


            }


        }
    }

    public static void display(String[] names, int[] score) {
        for (int i = 0; i < names.length; i++) {
            System.out.printf("%-20s:%-3d\n", names[i], score[i]);
            ;

        }
    }
}
