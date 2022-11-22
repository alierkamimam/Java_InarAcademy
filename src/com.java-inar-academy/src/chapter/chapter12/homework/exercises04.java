package chapter.chapter12.homework;

import chapter.chapter10.listing.Loan;

import java.util.Scanner;

public class exercises04 {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


        try {
            getFromUser();
        }catch (IllegalArgumentException ex){
            throw new IllegalArgumentException("IllegalArgumentException");


        }

    }

    public static void getFromUser() throws IllegalArgumentException {
        System.out.print("Enter annual interest rate , for example 8.25:" );
        double interestRate = input.nextDouble();

        System.out.print("Enter number of years as an integer: ");
        int years = input.nextInt();
        System.out.print("Enter loan amount , for example 120000,95: ");
        double loanAmount = input.nextDouble();

        if (!(interestRate<=0 || years<=0 || loanAmount<=0)){
            Loan loan = new Loan(interestRate, years, loanAmount);

            System.out.printf("The loan was created on %s\n" +
                            "The monthly payment is %.2f\nThe total payment is %.2f\n ",
                    loan.getLoanDate(), loan.getMonthlyPayment(), loan.getTotalPayment());

        }else
            throw new IllegalArgumentException();



    }
}
