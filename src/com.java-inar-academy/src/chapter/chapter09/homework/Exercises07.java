package chapter.chapter09.homework;

public class Exercises07 {
    public static void main(String[] args) {
        Acccount acccount=new Acccount(1122,20000,4.5);
        acccount.withDraw(2500);
        acccount.deposit(3000);
        System.out.println("Balance--> "+acccount.getBalance());
        System.out.println("Monthly interest rate--> "+acccount.getMonthlyInterestRate());
        System.out.println("Date created-->"+acccount.getDateCreated().toString());

    }
}
