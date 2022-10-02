package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises22 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to get square root :");
        long number = input.nextLong();

        System.out.println(sqrt(number));


    }

    public static double sqrt(long n) {
        double lastGuess = 1;
        double nextGuess = (lastGuess + n / lastGuess) / 2;
        while (Math.sqrt(nextGuess - lastGuess) > 0.000001) {
            lastGuess = nextGuess;
            nextGuess = (lastGuess + n / lastGuess) / 2;

        }
        return nextGuess;

    }
}
