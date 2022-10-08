package chapter.chapter06.homework;

public class exercises27 {
    public static void main(String[] args) {
        int count = 0;
        int number = 11;
        while (count < 100) {
            if (isprime(number) && isprime(reverse(number))) {

                count++;
                if (count % 10 == 0) {
                    System.out.printf("%-5s\n", number);

                } else
                    System.out.printf("%-5s", number);


            }
            number++;


        }
    }

    public static boolean isprime(int a) {
        for (int i = 2; i <= a / 2; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static int reverse(int number) {
        int remainder;
        int reverse = 0;
        while (number != 0) {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number /= 10;
        }
        return reverse;


    }
}
