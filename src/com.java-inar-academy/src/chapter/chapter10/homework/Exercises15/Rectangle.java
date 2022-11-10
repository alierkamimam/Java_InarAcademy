package chapter.chapter10.homework.Exercises15;

import chapter.chapter10.homework.Exercises13.MyRectangle2D;

import java.util.Scanner;

public class Rectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of points");
        int numberOfPoints = input.nextInt();
        double[][] points = getPoints(numberOfPoints, input);
        MyRectangle2D rec = getRectangle(points);
        System.out.println("The bounding rectangle's center " +
                "(" + rec.getX() + "," + rec.getY() + ") " + "width " + rec.getWidth() +
                " height " + rec.getHeight());


    }

    private static double[][] getPoints(int numberOfPoints, Scanner input) {
        double[][] result = new double[numberOfPoints][2];
        System.out.print("Enter points:");
        for (int i = 0; i < result.length; i++) {
            result[i][0] = input.nextDouble();
            result[i][1] = input.nextDouble();
        }
        return result;
    }

    public static MyRectangle2D getRectangle(double[][] points) {
        double lowX = points[0][0];
        double lowY = points[0][1];
        double highX = points[0][0];
        double highY = points[0][1];


        for (int i = 1; i < points.length; i++) {
            if (points[i][0] < lowX) lowX = points[i][0];
            if (points[i][1] < lowY) lowY = points[i][1];
            if (points[i][0] > highX) highX = points[i][0];
            if (points[i][1] > highY) highY = points[i][1];
        }

        double width = highX - lowX;
        double height = highY - lowY;
        double centerX = lowX + (width / 2);
        double centerY = lowY + (height / 2);

        return new MyRectangle2D(centerX, centerY, width, height);
    }
}
