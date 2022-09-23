package chapter.chapter05;

import java.util.Scanner;

public class listing04 {
    public static void main(String[] args) {

        int correct=0;
        int wrong=0;

        int count=0;
        while (count<5){
            Scanner input=new Scanner(System.in);

            int number1=(int)(Math.random()*10);
            int number2=(int)(Math.random()*10);

            int total=number1+number2;

            System.out.println("what is "+number1+"+"+number2+"?");
            int guess=input.nextInt();

            if(guess==total){
                System.out.println("you are correct");
                correct++;
            } else {
                System.out.println("your answer is wrong");
                wrong++;
            }
            count++;
            }
        System.out.println("correct answer is "+correct);
        System.out.println("wrong answer is "+wrong);


        }

    }

