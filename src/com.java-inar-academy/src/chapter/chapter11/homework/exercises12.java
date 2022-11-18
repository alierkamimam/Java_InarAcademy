package chapter.chapter11.homework;

import chapter.chapter09.exercises.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class exercises12 {
    public static void main(String[] args) {
        Double[] doubleList = getFromUser();
        ArrayList<Double> list = new ArrayList<>(Arrays.asList(doubleList));
        System.out.println(list);
        System.out.println("Sum--> " + sum(list));


    }

    public static Double[] getFromUser() {
        Scanner input = new Scanner(System.in);

        Double[] array = new Double[5];

        System.out.println("Enter a five number:");
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }

        return array;
    }


    public static double sum(ArrayList<Double> list) {
        Double sum = 0.0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }

        return sum;

    }
}
