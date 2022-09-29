package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("The amount invested: ");
        double investmentAmaount = input.nextDouble();

        System.out.print("Annual interest rate: ");
        double monthlyInterestRate = input.nextDouble() / 1200;

        System.out.print("Enter a number of years: ");
        int years = input.nextInt();

        System.out.printf("%-15s%-15s", "Years", "Future Value");
        System.out.println("\n");

        for (int i = 1; i <= years; i++) {
            System.out.printf("%-8d----->%13.2f",i, futureInvestmentValue(investmentAmaount, monthlyInterestRate, i));
            System.out.println();
        }


    }


    public static double futureInvestmentValue(double investmentAmaount, double monthlyInterestRate, int years) {
        double futureinvestmen = investmentAmaount * Math.pow((1 + (monthlyInterestRate)), (years * 12));
        return futureinvestmen;
    }
}
