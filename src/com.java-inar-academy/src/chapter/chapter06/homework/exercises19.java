package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises19 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a three double value: ");

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        if (isValid(side1, side2, side3)) {
            System.out.println( area(side1, side2, side3));
        } else {
            System.out.println("invalid triangle");
        }


    }

    public static double area(double side1, double side2, double side3) {
        double s = (side1 + side2 + side3) / 2;
        double formula = s * (s - side1) * (s - side2) * (s - side3);
        double area;
        area = Math.pow(formula, 0.5);
        return area;
    }

    public static boolean isValid(double side1, double side2, double side3) {
        return ((side1 + side2) > side3) &&
                ((side1 + side3) > side2) &&
                ((side2 + side3) > side1);

    }
}
