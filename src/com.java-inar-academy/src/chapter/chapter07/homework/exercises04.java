package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter score ");
        int[] number = new int[100];
        int index = 0;
        for (int i = 0; i < number.length; i++) {
            number[i] = input.nextInt();

            if (number[i] < 0) {
                break;
            }
            index++;
        }
        result(number, index);

    }

    public static int average(int[] number, int index) {
        int sum = 0;
        for (int i = 0; i < index; i++) {
            sum += number[i];
        }
        return (sum / (index - 1));


    }

    public static void result(int[] numbers, int index) {
        int above = 0, equal = 0, below = 0;
        for (int i = 0; i < index; i++) {
            if (numbers[i] > average(numbers, index)) {
                above++;
            } else if (numbers[i] < average(numbers, index)) {
                below++;
            } else
                equal++;


        }
        System.out.println("The sum is " + average(numbers, index));
        System.out.println("Above: " + above + "\n" + "Below: " + below + "\n" + "Egual: " + equal);
    }
}