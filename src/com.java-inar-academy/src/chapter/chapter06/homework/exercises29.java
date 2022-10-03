package chapter.chapter06.homework;

public class exercises29 {
    public static void main(String[] args) {
        int number = 2;
        while (number < 1000) {
            if (isPrime(number) && isPrime(number + 2)) {
                System.out.printf("(%-3d,%d)\n", number, number + 2);
                number++;

            } else
                number++;
        }


    }


    public static boolean isPrime(int n) {

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;


    }
}
