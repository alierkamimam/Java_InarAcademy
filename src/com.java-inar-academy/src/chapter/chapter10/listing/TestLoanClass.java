package chapter.chapter10.listing;

import java.util.Scanner;

public class TestLoanClass {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter annual interest rate , for example 8.25");
        double interestRate= input.nextDouble();

        System.out.print("Enter number of years as an integer:");
        int years=input.nextInt();

        System.out.println("Enter loan amount , for example 120000,95");
        double loanAmount=input.nextDouble();

        Loan loan=new Loan(interestRate,years,loanAmount);

        System.out.printf("The loan was created on %s\n" +
                "The monthly payment is %.2f\nThe total payment is %.2f\n ",
                loan.getLoanDate(),loan.getMonthlyPayment(),loan.getTotalPayment());



    }
}
