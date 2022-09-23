package chapter.chapter05;

import java.util.Scanner;

public class listing06 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int data;
        int sum=0;
        System.out.println("enter a integer (the input ends if it is 0)");
        do {
            //System.out.println("enter a integer (the input ends if it is 0)");
            data=input.nextInt();


            sum+=data;

        }while (data!=0);
        System.out.println("the sum is "+
        sum);
    }
}
