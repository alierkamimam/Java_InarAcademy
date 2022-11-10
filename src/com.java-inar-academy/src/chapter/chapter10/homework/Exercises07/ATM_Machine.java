package chapter.chapter10.homework.Exercises07;

import chapter.chapter09.homework.Acccount;

import java.util.Scanner;

public class ATM_Machine {
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        Acccount[] acccounts = new Acccount[10];

        for (int i = 0; i < 10; i++) {
            acccounts[i] = new Acccount(i, 100, 10);
        }
        while (true) {
            System.out.print("Enter a id:");
            int id = input.nextInt();
            System.out.println();

            while (!(0 <= id && id < 10)) {
                System.out.println("Invalid id Re-enter id:");
                id = input.nextInt();
            }
            int choise = -1;
            while (choise != 4) {
                displayMenu();
                choise = input.nextInt();
                System.out.println();
                switch (choise) {
                    case 1:
                        displayBalance(acccounts[id]);
                        break;
                    case 2:
                        displayWithDraw(acccounts[id]);
                        break;
                    case 3:
                        displayDeposit(acccounts[id]);
                        break;
                    case 4:
                        break;
                    default:
                        do {
                            System.out.println("Invalid choise plese enter a number between 1-4");
                            choise = input.nextInt();
                        }while (choise>4 || choise<=0);


                }
            }
        }

    }

    public static void displayDeposit(Acccount acccount) {
        System.out.print("Enter an amount for deposit:");
        double deposit=input.nextDouble();
        while (0>deposit){
            System.out.print("Invalid input. Please enter an amount for deposit:");
            deposit=input.nextDouble();
        }
        acccount.deposit(deposit);
    }

    public static void displayWithDraw(Acccount acccount) {
        System.out.print("Enter an amount for withdraw:");
        double amount = input.nextDouble();
        System.out.println();
      while (0>amount || amount>acccount.getBalance()) {
          if (amount < 0) {
              System.out.println("Invalid input re-enter an amount");
          } else {
              System.out.println("You don't have " + amount + " money in your account\n" +
                      "Your balance is " + acccount.getBalance() + "Enter a reasonable amount:");
          }
          amount = input.nextDouble();
      }
      acccount.withDraw(amount);




    }

    public static void displayBalance(Acccount acccount) {
        System.out.println("The balance is "+acccount.getBalance());
        System.out.println();


    }public static void displayMenu() {
        System.out.print("Main Menu\n" +
                "1:check balance\n" +
                "2:withdraw\n" +
                "3:deposit\n" +
                "4:exit\n" +
                "Enter a choise:");

    }


}
