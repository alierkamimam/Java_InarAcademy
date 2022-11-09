package chapter.chapter10.checkpoint;

import java.math.BigDecimal;
import java.math.BigInteger;

public class cp10 {
    public static void main(String[] args) {
        BigDecimal a = new BigDecimal(1.2);
        BigDecimal b = new BigDecimal(5);
        BigDecimal c = a.divide(b,5,BigDecimal.ROUND_CEILING);
        System.out.println(c);


    }
}


