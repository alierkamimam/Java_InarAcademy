package chapter.chapter11.homework.ex03;

import chapter.chapter09.homework.Acccount;

public class Test {
    public static void main(String[] args) {
        SavingsAccount savingsAccount=new SavingsAccount(1,500,2);
        CheckingAccount checkingAccount=new CheckingAccount(2,1000,3);
        checkingAccount.withDraw(6001);
        System.out.println(checkingAccount.toString());
        System.out.println("************************");
        savingsAccount.withDraw(600);
        System.out.println(savingsAccount.toString());


    }
}
