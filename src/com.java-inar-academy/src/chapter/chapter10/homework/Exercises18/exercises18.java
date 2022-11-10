package chapter.chapter10.homework.Exercises18;

import java.math.BigInteger;

public class exercises18 {
    public static void main(String[] args) {
        displayfivePrimeNumber();

    }

    public static void displayfivePrimeNumber() {
        BigInteger number = new BigInteger(Long.MAX_VALUE + "");
        int count = 0;
        while (count < 5) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number = number.add(BigInteger.ONE);
        }
    }

    public static boolean isPrime(BigInteger number) {
        BigInteger divisior = new BigInteger("2");
        BigInteger zero = new BigInteger("0");
        BigInteger stop = number.divide(new BigInteger("2")).add(BigInteger.ONE);
        while (divisior.compareTo(stop) != 0) {
            if (number.remainder(divisior).compareTo(zero) == 0) {
                return false;
            }
            divisior=divisior.add(BigInteger.ONE);


        }

        return true;

    }

}
