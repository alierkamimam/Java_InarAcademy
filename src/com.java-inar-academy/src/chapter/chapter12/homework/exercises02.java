package chapter.chapter12.homework;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exercises02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, n1;

        do {
            try {
                System.out.println("Enter two integer: ");
                n = input.nextInt();
                n1 = input.nextInt();
                System.out.println(n + " + " + n1 + " =" + (n + n1));
                break;

            } catch (InputMismatchException e) {
                System.out.println("Invalid input!");
                input.nextLine();
            }

        } while (true);
    }
}
