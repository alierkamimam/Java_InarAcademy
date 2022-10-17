package chapter.chapter08.listing;

import java.util.Scanner;

public class Listing03FindNearestPoint {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of points:");
        int numberOfPOints = input.nextInt();


        double[][] points = new double[numberOfPOints][2];
        System.out.println("Enter " + numberOfPOints + " points");
        for (int i = 0; i < points.length; i++) {
            points[i][0] = input.nextDouble();
            points[i][1] = input.nextDouble();
        }

        int p1 = 0, p2 = 1;
        double shortDistance = distance(points[p1][0], points[p1][1]
                , points[p2][0], points[p2][1]);

        for (int i = 0; i < points.length-1; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double distance = distance(points[i][0], points[i][1]
                        , points[j][0], points[j][1]);
                if (shortDistance > distance) {
                    p1 = i;
                    p2 = j;
                    shortDistance=distance;
                }

            }

        }
        System.out.println("The closest two points are " +
                "(" + points[p1][0] + ", " + points[p1][1] + ") and (" +
                points[p2][0] + ", " + points[p2][1] + ")");


    }

    private static double distance(double x1, double y1, double x2, double y2) {
             return Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));


    }
}
