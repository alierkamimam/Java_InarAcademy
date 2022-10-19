package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises30 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of values:");
        int numberOfValues = input.nextInt();
        System.out.println("Enter the values");
        int[] values = getArray(numberOfValues, input);
        if (count(values)) {
            System.out.println("The list has no consecutive fours");
        } else
            System.out.println("The list has  consecutive fours");


    }

    public static int[] getArray(int number, Scanner input) {

        int[] array = new int[number];
        for (int i = 0; i < array.length; i++) {
            array[i] = input.nextInt();
        }
        return array;
    }

    public static boolean count(int[] values) {
        int count = 0;
        for (int j = 0, i = j + 1; j < values.length - 1 && i < values.length; j++,i++) {

            if (values[j] == values[i]) {
                count++;
            }else {
                count = 0;
            }
            if (count == 3) {
                return false;

            }

        }

    return true;
}

}
