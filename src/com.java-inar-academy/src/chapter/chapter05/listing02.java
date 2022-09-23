package chapter.chapter05;

import java.util.Scanner;

public class listing02 {
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        int number = (int)(Math.random()*101);
        int guess=-1;

        while(guess!=number){
            System.out.println("Enter a number between 0 and 100");
             guess=input.nextInt();

            if(guess==number){
                System.out.println("Yes.number is "+number);
            } else if (guess<number) {
                System.out.println("Your guess too low");

            }else
                System.out.println("your guess too high");


        }


    }
}
