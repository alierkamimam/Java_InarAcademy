package chapter.chapter10.homework.Exercises06;

import chapter.chapter10.homework.Exercises05.StackOfInteger;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        StackOfInteger stackOfInteger = new StackOfInteger();
        System.out.println("prime numbers less than 120 is ");
        int n = 2;
        while (n < 120) {
            if (isPrime(n)) {
                stackOfInteger.push(n);

            }
            n++;


        }
        display(stackOfInteger);


    }

    private static boolean isPrime(int number) {
        StackOfInteger prime = new StackOfInteger();
        for (int i = 2; i < number / 2; i++) {
            if (number % i == 0) {
                return false;

            }

        }
        return true;
    }

    private static void display(StackOfInteger stackOfInteger){
        while (!stackOfInteger.empty()){
            System.out.print(stackOfInteger.pop()+" ");

        }

    }
}
