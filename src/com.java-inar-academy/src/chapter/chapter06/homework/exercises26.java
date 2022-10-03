package chapter.chapter06.homework;



public class exercises26 {
    public static void main(String[] args) {
        int number = 2;
        int count = 0;
        while (count < 100) {
            if (isPrime(number) && isPolidrome(number)) {
                count++;
                if (count % 10 == 0) {
                    System.out.printf("%6d\n",number);
                } else
                    System.out.printf("%6d",number );
            }
            number++;
        }


    }

    public static boolean isPrime(int n) {
        for (int i = 2; i < n / 2; i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }


    public static boolean isPolidrome(int number) {
        return reverse(number) == number;
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



