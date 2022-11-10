package chapter.chapter10.homework.Exercises05;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number;
        do {
            System.out.println("Enter a number grater then 1:");
            number = input.nextInt();
        } while (number <= 1);
        StackOfInteger factor = getFactors(number);
        display(factor);


    }

    public static StackOfInteger getFactors(int n) {
        StackOfInteger factor = new StackOfInteger();
        int divisior = 2;
        while (n != 1) {
            if (n % divisior == 0) {
                factor.push(divisior);
                n /= divisior;
            } else {
                divisior++;
            }
        }
        return factor;
    }

    public static void display(StackOfInteger stackOfInteger) {
        while (!stackOfInteger.empty()) {
            if (stackOfInteger.getSize() == 1) {
                System.out.println(stackOfInteger.pop());
            } else System.out.print(stackOfInteger.pop() + "-");
        }
    }
}
