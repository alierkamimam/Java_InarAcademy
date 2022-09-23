package chapter.chapter05;

import java.util.Scanner;

public class listing05 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("enter a intger number if it ends 0");
        int data=input.nextInt();

        int sum=0;
        while (data!=0) {
            sum += data;

            System.out.println("enter a intger number if it ends 0");
            data = input.nextInt();
        }
        System.out.println("the sum is "+sum);
    }

}
