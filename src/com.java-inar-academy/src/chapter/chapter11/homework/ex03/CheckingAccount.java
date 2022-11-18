package chapter.chapter11.homework.ex03;

import chapter.chapter09.homework.Acccount;

public class CheckingAccount extends Acccount {
    public static final int OVER_DRAFT_LIMIT = -5000;

    public CheckingAccount() {
    }

    public CheckingAccount(int id, double balance, double annualInterestRate) {
        super(id, balance, annualInterestRate);
    }

    @Override
    public void withDraw(double amount) {
        if (super.getBalance() - amount < OVER_DRAFT_LIMIT) {
            System.out.println("Your balance is --> " + super.getBalance() + "$" + "\n" +
                    "You can withdraw only --> " + (super.getBalance() - CheckingAccount.OVER_DRAFT_LIMIT) + "$");
            return;
        }
        super.setBalance(super.getBalance() - amount);

    }

    @Override
    public String toString() {
        return "This is a Saving Account" +
                "\n------------------------" +
                "\nId --> " + super.getId() +
                "\nBalance --> " + super.getBalance() +
                "\nDateCreated --> " + getDateCreated();
    }
}
