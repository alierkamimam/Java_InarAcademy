package chapter.chapter10.homework.Exercises16;

import java.math.BigInteger;

public class Exercises16 {
    public static void main(String[] args) {
        displayNumber50digit(10);
    }

    public static void displayNumber50digit(int i) {
        int count=0;
       BigInteger number = new BigInteger("100000000000000000000000000000000000000000000000000");


        while (count< i){
            if (number.remainder(new BigInteger("2")).equals(BigInteger.ZERO) ||
            number.remainder(new BigInteger("3")).equals(BigInteger.ZERO)){
                System.out.println(number);
                count++;
            }
            number=number.add(BigInteger.ONE);

        }
    }

}
