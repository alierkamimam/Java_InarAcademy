package chapter.chapter06.homework;

import chapter.chapter06.listing.listing07;

public class exercises10 {
    public static void main(String[] args) {

        final int TOTALNUMBER = 1000;
        final int LINE = 10;


        int count = 0;
        int number = 2;
        while (count < TOTALNUMBER) {
            if (listing07.isPrime(number)) {
                count++;
                if (count % 10 == 0) {
                    System.out.printf("%7d\n", number);
                } else

                    System.out.printf("%7d", number);
            }
            number++;

        }

    }
}