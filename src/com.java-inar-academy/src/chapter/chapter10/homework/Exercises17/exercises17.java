package chapter.chapter10.homework.Exercises17;

import java.math.BigInteger;

public class exercises17 {
    public static void main(String[] args) {
        display(10);


    }

    public static void display(int i) {

        long number1=(long) (Math.sqrt(Long.MAX_VALUE)+1);
        BigInteger bigInteger=new BigInteger(number1+"");

        System.out.println("LONG.MAC_VALUES is "+Long.MAX_VALUE);
        for (int j = 0; j < i; j++) {
            System.out.println(bigInteger.multiply(bigInteger));
            bigInteger=bigInteger.add(BigInteger.ONE);
        }


    }
}
