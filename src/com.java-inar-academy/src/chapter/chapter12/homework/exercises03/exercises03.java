package chapter.chapter12.homework.exercises03;

import java.util.ArrayList;
import java.util.Scanner;

public class exercises03 {
    public static void main(String[] args) {
        /*
        (ArrayIndexOutOfBoundsException) Write a program that meets the following
        requirements:
        ■ Creates an array with 100 randomly chosen integers.
        ■ Prompts the user to enter the index of the array, then displays the corresponding
        element value. If the specified index is out of bounds, display the
        message Out of Bounds.
         */
        Scanner input = new Scanner(System.in);


        ArrayList<Integer> number = randomInteger();

        try {
            System.out.print("Enter the index of the array: ");
            int index = input.nextInt();
            System.out.println(index + ". index of the array--> " + number.get(index));
        } catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("The index you enter is Out of bounds!!");


        }


    }

    public static ArrayList<Integer> randomInteger() {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            list.add((int) (Math.random() * 100));

        }
        return list;
    }
}
