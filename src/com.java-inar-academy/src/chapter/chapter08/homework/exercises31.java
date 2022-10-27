package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises31 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        //(y1 - y2)x - (x1 - x2)y = (y1 - y2)x1 - (x1 - x2)y1
        //(y3 - y4)x - (x3 - x4)y = (y3 - y4)x3 - (x3 - x4)y3
        System.out.println("Enter 4x2 matrix:");
        double[][] array = getArray();
        double[] x = getIntersectingPoint(array);
        if (x==null){
            System.out.println("The two lines are parallel");
        }else {
            System.out.printf("The points is (%6.5f  %6.5f)", x[0], x[1]);
        }

    }

    public static double[][] getArray() {
        double[][] array = new double[4][2];
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[0].length; col++) {
                array[row][col] = input.nextDouble();
            }
        }
        return array;
    }

    public static double[] getIntersectingPoint(double[][] points) {
        double[] array = new double[2];
        double a = points[0][1] - points[1][1];
        double b = -1 * (points[0][0] - points[1][0]);
        double c = points[2][1] - points[3][1];
        double d = -1 * (points[2][0] - points[3][0]);
        double e = a * points[0][0] - (points[0][1] * ((points[0][0] - points[1][0])));
        double f = c * points[2][0] - (points[2][1] * ((points[2][0] - points[3][0])));

        if (a * d - b * c == 0) {
            return null;
        } else {
            array[0] = ((e * d) - (b * f)) / ((a * d) - (b * c));
            array[1] = ((a * f) - (e * c)) / ((a * d) - (b * c));

        }

        return array;
    }


}
