package chapter.chapter10.homework.Exercises19;

import java.math.BigInteger;

import static chapter.chapter10.homework.Exercises18.exercises18.isPrime;


public class exercises19 {
    public static void main(String[] args) {
        displayFirst100();


    }
    public static void displayFirst100(){
        System.out.printf("%-10s | %-10s\n","p","2^p-1");

        int count=0;
        BigInteger number=new BigInteger("2");
        while (count<100){
            if (isMersennePrime(number)){
                System.out.printf("%-10d | %-10d\n", number, getPow(number).subtract(BigInteger.ONE));
                count++;
            }
            number=number.add(BigInteger.ONE);

        }
    }

    private static boolean isMersennePrime(BigInteger number) {
        return isPrime(number) && isPrime(getPow(number).subtract(BigInteger.ONE));
    }

    public static BigInteger getPow(BigInteger number) {
       BigInteger result=new BigInteger("2");
       BigInteger start=new BigInteger("1");

       while (start.compareTo(number)!=0){
           result=result.multiply(new BigInteger("2"));
           start=start.add(BigInteger.ONE);
       }
       return result;




    }
}
