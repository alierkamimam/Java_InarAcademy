package chapter.chapter09.homework;

import java.util.Date;

public class Acccount {
    private int id;
    private double balance;
    private double annualInterestRate;

    private Date dateCreated = new Date();

    Acccount() {
        this(0, 0, 0);

    }

    Acccount(int id, double balance, double annualInterestRate) {
        this.id = id;
        this.balance = balance;
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;

    }

    public double getMonthlyInterestRate() {
        return getAnnualInterestRate() / 12;
    }

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;

    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();


    }
    public double withDraw(double amount){
        return balance-=amount;
    }
    public double deposit(double amount){
        return balance+=amount;
    }

}