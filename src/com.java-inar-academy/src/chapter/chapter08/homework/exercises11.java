package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises11 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number between 0 and 511");
        int number = input.nextInt();
        int[] array = convert(number);
        print(array);


    }

    public static int[] convert(int number) {
        int[] array = new int[9];
        int i = array.length - 1;

        while (number > 0) {
            array[i] = number % 2;
            number /= 2;
            i--;

        }
        return array;
    }
    public static void print(int[] array){
        int count=0;
        for (int row = 0; row < array.length ; row++) {
            if (array[row]==0){
                System.out.print("H ");
                count++;
            }else {
                System.out.print("T ");
                count++;
            }
            if (count%3==0){
                System.out.println();
            }
        }
    }
}
