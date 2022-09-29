package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a integer: ");
        int n = input.nextInt();
        displayPattern(n);

    }

    public static void displayPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - i; j++) {
                System.out.printf("%4s","");
            }
            for (int k = i; k >= 1; k--) {
                System.out.printf("%4d",k);
            }
            System.out.println();

        }
    }
}
