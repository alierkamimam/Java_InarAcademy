package chapter.chapter12.homework.exercises04;

public class testLoan {
    public static void main(String[] args) {


        try {
            ReviseLoan loan1 = new ReviseLoan(1, 2, 1000);
            loan1.setLoanAmount(-5);
            ReviseLoan loan3 = new ReviseLoan(15.8, 2, 700);
        } catch (IllegalArgumentException ex) {
            ex.printStackTrace();
        }

    }

}
