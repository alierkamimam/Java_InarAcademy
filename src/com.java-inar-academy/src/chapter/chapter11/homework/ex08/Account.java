package chapter.chapter11.homework.ex08;

import chapter.chapter09.homework.Acccount;

import java.util.ArrayList;
import java.util.Date;

public class Account {
    private String name;
    private int id;
    private double balance;
    private double annualInterestRate;

    private Date dateCreated;
    public ArrayList<Transaction> transactions = new ArrayList<>();

    public Account() {
        this("", 0, 0);
    }

    public Account(String name, int id, double balance) {
        this.name = name;
        this.id = id;
        this.balance = balance;


    }

    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public double getAnnualInterestRate() {
        return annualInterestRate;
    }

    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public Date getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(Date dateCreated) {
        this.dateCreated = dateCreated;
    }

    public double getMonthlyInterestRate() {

        return getAnnualInterestRate() / 12;
    }

    public double getMonthlyInterest() {
        return getBalance() * getMonthlyInterestRate();


    }
    public void withDraw(double amount){
        if (balance<amount){
            System.out.println("Your balance is $" + this.balance + ",so you cannot withdraw!!");
        }
        this.balance-=amount;
        transactions.add(new Transaction('W',amount,this.balance,"Withdraw from ATM"));


    }
    public void deposit(double amount){
        if (amount<0){
            System.out.println("You cannot deposit negative amount");
            return;
        }
        this.balance+=amount;
        transactions.add(new Transaction('D',amount,this.balance,"Deposit to Bank"));
    }
    @Override
    public String toString(){
        return "Name: "+this.name+
                "\nId: "+this.id+
                "\nBalance: "+this.balance;

    }



}
