package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises32 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //s = (side1 + side2 + side3)/2;
        //area = root s(s - side1)(s - side2)(s - side3)

        System.out.println("Enter x1, y1, x2, y2, x3, y3:");
        double[][] array = getArray();
        triangle(array);


    }

    private static double[][] getArray() {
        double[][] array = new double[3][2];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }

    public static void triangle(double[][] array) {
        double[] result = new double[2];
        double side1 = Math.sqrt(Math.pow(array[1][0] - array[0][0], 2) + Math.pow(array[1][1] - array[0][1], 2));
        double side2 = Math.sqrt(Math.pow(array[2][0] - array[1][0], 2) + Math.pow(array[2][1] - array[1][1], 2));
        double side3 = Math.sqrt(Math.pow(array[2][0] - array[0][0], 2) + Math.pow(array[2][1] - array[0][1], 2));
        double s = (side1 + side2 + side3) / 2;
        double area=Math.sqrt(s*(s - side1)*(s - side2)*(s - side3));
        result[0]=area;

        if (result[0]==0){
            System.out.println("The three points are on the same line");

        }else
            System.out.printf("The area of triangle is  %3.1f ", result[0]);

    }
}

