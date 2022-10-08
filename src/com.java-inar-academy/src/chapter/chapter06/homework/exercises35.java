package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the side: ");
        double side=input.nextDouble();
        System.out.println("The are of the pentagon is "+area(side));


    }
    public static double area(double side1 ){
        double area=(5*side1*side1)/(4*Math.tan(Math.PI/5));
        return area;
    }
}
