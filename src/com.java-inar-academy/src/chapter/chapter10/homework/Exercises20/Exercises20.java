package chapter.chapter10.homework.Exercises20;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Exercises20 {
    public static void main(String[] args) {
        for (int j = 100; j <= 1000; j += 100) {
            BigDecimal number = new BigDecimal("1");
            for (int i = 1; i <j; i++) {
                BigDecimal increase = BigDecimal.ONE.divide(factorial(i), 25, BigDecimal.ROUND_UP);
                number = number.add(increase);
            }
            System.out.println(j+"-->"+number);
        }
    }


    public static BigDecimal factorial(long a) {
        BigDecimal result = new BigDecimal("1");
        for (int i = 1; i < a; i++) {
            result = result.multiply(new BigDecimal(i + ""));
        }
        return result;
    }
}

