package chapter.chapter14.set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class exercises07_06 {
    public static void main(String[] args) {
        final int NUMBER_OF_NUMBERS = 50;
        List<Integer> list = new ArrayList<>();

        int index = 0;
        int num = 2;
        while (index < NUMBER_OF_NUMBERS) {
            if (isPrime(num)) {
                list.add(num);
                index++;
            }
            num++;
        }
        print(list);

    }

    public static void print(List<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.printf("%4d ", list.get(i));
            if ((i + 1) % 10 == 0) {
                System.out.println("");

            }
        }
    }

        public static boolean isPrime ( int num){
            for (int i = 2; i < Math.sqrt(num); i++) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
    }
