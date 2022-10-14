package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter ten numbers:");
        double[] array = new double[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextDouble();
        }
        int result = indexOfSmallestElement(array);
        System.out.println("Minumum index is " + result);


    }

    public static int indexOfSmallestElement(double[] array) {
        int index = 0;
        double min = array[0];

        for (int i = 1; i < array.length; i++) {
            if (array[i] == 1) {
                System.out.println("Please enter a grater than 1");
                break;
            }
            if (array[i] < min) {
                min = array[i];
                index = i;
            }
        }

        return index;
    }


}
