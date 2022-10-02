package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number:");
        int number = input.nextInt();
        pribtMatrix(number);

    }

    public static void pribtMatrix(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int randomnumber = (int) (Math.random() * 2);
                System.out.print(randomnumber+" ");
            }
            System.out.println();
        }
    }
}
