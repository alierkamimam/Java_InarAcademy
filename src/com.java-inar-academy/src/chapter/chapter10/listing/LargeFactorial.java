package chapter.chapter10.listing;
import  java.math.*;

public class LargeFactorial {
    public static void main(String[] args) {
        System.out.println("50! is\n"+factorial(50));


    }
    public static BigInteger factorial(long a){
        BigInteger result=BigInteger.ONE; // same as new BıgInteger("1")
        for (int i = 1; i <=a; i++)
            result=result.multiply(new BigInteger(i+""));
            return result;


    }
}
