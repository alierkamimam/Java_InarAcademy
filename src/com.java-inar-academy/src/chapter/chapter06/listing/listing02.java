package chapter.chapter06.listing;

import java.util.Scanner;

public class listing02 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter score of student:");
        double score =input.nextDouble();
        printGrade(score);

    }
    public static void printGrade(double score){

        if(score<0 || score>100){
             System.out.println("invalid score");
            return ;
        }

        if (score>=90.0){
            System.out.println("The student's grade is A");
        } else if (score>=80.0) {
            System.out.println("The student's grade is B");

        } else if (score>=70.0) {
            System.out.println("The student's grade is C");
        } else if (score>=60) {
            System.out.println("The student's grade is D");
        }else
            System.out.println("The student's grade is F");

    }
}
