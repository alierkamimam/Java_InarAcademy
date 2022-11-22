package chapter.chapter12.homework.exercises_04;

import java.util.Date;

public class ReviseLoan {

    private double annualInterestRate;
    private int numberOfYears;
    private double LoanAmount;
    private Date loanDate;


    public ReviseLoan() {
        this(2.5, 1, 1000);

    }

    public ReviseLoan(double annualInterestRate, int numberOfYears, double loanAmount) throws IllegalArgumentException {

        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Illegal annual interest rate -> " + annualInterestRate);
        } else if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Illegal number of years -> " + numberOfYears);
        } else if (loanAmount <= 0) {
            throw new IllegalArgumentException("Illegal loan Amount -> " + loanAmount);
        } else {
            this.annualInterestRate = annualInterestRate;
            this.numberOfYears = numberOfYears;
            this.LoanAmount = loanAmount;
            loanDate = new Date();

        }
    }


    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) throws IllegalArgumentException {
        if (annualInterestRate <= 0) {
            throw new IllegalArgumentException("Please enter grater than zero.");
        }
        this.annualInterestRate = annualInterestRate;

    }

    public int getNumberOfYears() {
        return numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) throws IllegalArgumentException {
        if (numberOfYears <= 0) {
            throw new IllegalArgumentException("Please enter grater than zero.");
        }
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return LoanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        if (loanAmount <= 0) {
            throw new IllegalArgumentException("Please enter grater than zero.");
        }
        this.LoanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return loanDate;
    }

    public double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = LoanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }

    public double getTotalPayment() {
        double totalpayment = getMonthlyPayment() * numberOfYears * 12;
        return totalpayment;
    }

    @Override
    public String toString() {
        String s = String.format("Loan Amount : %.2f\nTotal Amount %.2f", this.LoanAmount, this.getTotalPayment());
        return s;


    }


}