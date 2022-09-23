package chapter.chapter05;

import java.util.Scanner;

public class listing09 {
    public static void main(String[] args) {
        int gcd=1;
        int k=2;
        Scanner input =new Scanner(System.in);

    while (true){

        System.out.print("enter a value:");
        int number1=input.nextInt();
        System.out.print("enter a value2: ");
        int number2=input.nextInt();

        while (k<=number2 && k<=number1){
            if(number2 % k==0 && number1 % k==0)
                gcd=k;

            k++;
        }
        System.out.println("The greatest common divisor for "+number1+" and "+number2+" is "+gcd);;

    }
}
}