package chapter.chapter10.listing;

import java.util.Date;

public class Loan {

    private double annualInterestRate;
    private int numberOfYears;
    private double LoanAmount;
    private Date loanDate;


    Loan() {
        this(2.5, 1, 1000);

    }

    Loan(double annualInterstRate, int numberOfYears, double loanAmount) {
        this.annualInterestRate = annualInterstRate;
        this.numberOfYears = numberOfYears;
        this.LoanAmount = loanAmount;
        loanDate = new Date();

    }

    public double getAnnualInterestRate() {
        return this.annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public int getNumberOfYears() {
        return this.numberOfYears;
    }

    public void setNumberOfYears(int numberOfYears) {
        this.numberOfYears = numberOfYears;
    }

    public double getLoanAmount() {
        return this.LoanAmount;
    }

    public void setLoanAmount(double loanAmount) {
        LoanAmount = loanAmount;
    }

    public Date getLoanDate() {
        return this.loanDate;
    }


    public  double getMonthlyPayment() {
        double monthlyInterestRate = annualInterestRate / 1200;
        double monthlyPayment = LoanAmount * monthlyInterestRate / (1 - (1 / Math.pow(1 + monthlyInterestRate, numberOfYears * 12)));
        return monthlyPayment;
    }
    public double getTotalPayment(){
        double totalpayment=getMonthlyPayment() * numberOfYears *12;
        return totalpayment;
    }

}
