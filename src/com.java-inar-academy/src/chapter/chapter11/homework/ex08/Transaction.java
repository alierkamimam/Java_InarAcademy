package chapter.chapter11.homework.ex08;

import java.util.Date;

public class Transaction {
    public static final char WITH_DRAW = 'W';
    public static final char DEPOSIT = 'D';
    private Date date;
    private char type;


    private double amount;
    private double balance;
    private String description;

    public Transaction() {
        this(' ', 0, 0, null);
    }

    public Transaction(char type, double amount, double balance, String description) {
        this.type = type;
        this.amount = amount;
        this.balance = balance;
        this.description = description;
        date = new Date();
    }

    @Override
    public String toString() {
        return "Date: " + this.date.toString() +
                "\nTransaction type: " + (this.type == 'W' ? "Withdraw" : "Deposit") +
                "\nAmount: " + this.amount +
                "\nBlance: " + this.balance +
                "\nDescription: " + this.description ;



    }


}
