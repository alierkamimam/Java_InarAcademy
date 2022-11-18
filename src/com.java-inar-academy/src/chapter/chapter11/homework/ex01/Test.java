package chapter.chapter11.homework.ex01;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Triangle triangle = getFromUser();
        System.out.println(triangle.toString());
        System.out.println("The area of the triangle : " + triangle.getArea());
        System.out.println("The perimeter of the triangle : " + triangle.getPerimeter());
        System.out.println("Color is : " + triangle.getColor());
        System.out.println("Is Filled : " + triangle.isFilled());

    }

    public static Triangle getFromUser() {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter three sides: ");

        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        System.out.print("\nEnter the color:");
        String color = input.next();

        System.out.print("\nEnter whether the triangle is filled(true/false) ");
        boolean isFilled = input.nextBoolean();

        Triangle t1 = new Triangle(side1, side2, side3);
        t1.setColor(color);
        t1.setFilled(isFilled);
        return t1;


    }
}
