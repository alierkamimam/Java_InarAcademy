package chapter.chapter11.homework.ex08;

import chapter.chapter09.homework.Acccount;

import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Account account = new Account("Erkam", 2217, 100);
        account.setAnnualInterestRate(2.19);
        System.out.println(account);
        ArrayList<Transaction> transactions = account.getTransactions();
        int x;

      while (true){
            System.out.println("1:Deposit\n2:Withdraw\n3:Bank Statement");
             x = input.nextInt();
             if (x==3){
                 System.out.println(transactions+"\nBalance: "+ account.getBalance());
                 break;
             }
            if (x != 1 && x != 2) {
                System.out.println("Please choose 1 , 2  ");
                return;
            }

            System.out.print("Enter an amount:");
            double amount = input.nextDouble();
            if (x==1){
                account.deposit(amount);
                System.out.println(account.getTransactions());
                System.out.println("*********************");
            }else {
                account.withDraw(amount);
                System.out.println(account.getTransactions());
                System.out.println("*********************");
            }

        }





    }
}
