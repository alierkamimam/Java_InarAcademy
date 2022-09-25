package week.wee07;

import java.util.Scanner;

public class loop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int num = input.nextInt();
        boolean isPrimeNumber = isPrime(num);
        System.out.println("is " + num + " prime number?");
        System.out.println(isPrimeNumber);
    }

    public static boolean isPrime(int num) {
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}


