package chapter.chapter07.homework;


import java.util.Scanner;

public class exercises06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final int TOTAL_NUMBER = 50;
        int count = 0;
        int number = 2;

        int[] prime = new int[TOTAL_NUMBER];

        while (count < 50) {


            if (isPrime(number, prime, count)) {
                prime[count] = number;
                count++;
            }
            number++;


        }
        display(prime);
    }

    private static boolean isPrime(int number, int[] prime, int count) {
        for (int i = 0; i < count; i++) {
            if (prime[i] <= Math.sqrt(number)) {
                if (number % prime[i] == 0) {
                    return false;
                }
            }
        }
        return true;
    }
    private static void display(int[] prime){
        for (int i = 0; i <prime.length; i++) {
            if ((i+1)%10==0) {
                System.out.println(prime[i]);
            }else
                System.out.printf("%-4d",prime[i]);

        }

    }
}
