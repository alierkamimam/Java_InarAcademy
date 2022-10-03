package chapter.chapter06.homework;

public class exercises28 {
    public static void main(String[] args) {
        System.out.printf("%-7s%-5s\n", "p", "2^p-1");

        int number = 2;
        while (number <= 31) {
            if (isPrime(number)) {
                System.out.printf("%-7d%-5d\n", number, (int) mersemePrime(number));
                number++;
            } else
                number++;

            if (number == 31) {
                break;
            }
        }

    }


    public static boolean isPrime(int num) {
        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

    public static double mersemePrime(int i) {
        return Math.pow(2, i) - 1;
    }

}

