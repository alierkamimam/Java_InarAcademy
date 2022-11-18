package chapter.chapter11.homework.ex03;

import chapter.chapter09.homework.Acccount;

public class SavingsAccount extends Acccount {


    public SavingsAccount() {

    }

    public SavingsAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withDraw(double amount) {
        if (amount > super.getBalance()) {
            System.out.println("Sorry! You cannot withdraw that such money\nYour balance is :" +
                    super.getBalance() + "$");
            return;
        }
        super.setBalance(super.getBalance() - amount);

    }

    @Override

    public String toString() {
        return "This is Saving Account" +
                "\n---------------------" +
                "\nId: "+super.getId()+
                "\nBalance: "+super.getBalance()+
                "\nDateCreated-->"+super.getDateCreated();
    }


}



