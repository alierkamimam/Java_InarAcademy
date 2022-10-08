package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of sides: ");
        int number=input.nextInt();
        System.out.print("Enter a side:");
        double side=input.nextDouble();
        System.out.println("The are of the polygon is "+area(side,number));


    }
    public static double area(double side,double n){
        double area=(n*side*side)/(4*Math.tan(Math.PI/5));
        return area;

    }
}
