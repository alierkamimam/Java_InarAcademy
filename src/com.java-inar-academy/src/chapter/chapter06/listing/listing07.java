package chapter.chapter06.listing;

public class listing07 {
    public static void main(String[] args) {
        printPrimeNumbers(50);
    }


    public static void printPrimeNumbers(int numberofPrimes) {
        final int TEN_PER = 10;
        int count = 0;
        int number = 2;
        while (count < numberofPrimes) {
            if (isPrime(number)) {
                count++;
                if (count % TEN_PER == 0) {
                    System.out.printf("%-5d\n", number);
                } else
                    System.out.printf("%-5d", number);
            }
            number++;
        }


    }

    public static boolean isPrime(int number) {
        for (int divisior = 2; divisior <= number / 2; divisior++) {
            if (number % divisior == 0) {
                return false;
            }
        }
        return true;
    }
}
