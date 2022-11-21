package chapter.chapter12.listing;

import java.util.Scanner;

public class Quotient {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.print("Enter  two numbers:");
        int number=input.nextInt();
        int number1= input.nextInt();

        System.out.println(number+"/"+number1+" is "+(number/number1));

    }

}
