package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises15 {
   static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println("Enter five points (x,y)");
        double[][] point=new double[5][2];
        getfrom(point);
        onTheLineSegment(point);
        if (!onTheLineSegment(point)){
            System.out.println("The five points are on the same line");
        }else
            System.out.println("The five points are  not on the same line");




    }
    public static double[][] getfrom(double[][] point){
        for (int row = 0; row < point.length; row++) {
            for (int col = 0; col <point[0].length; col++) {
                point[row][col]=input.nextDouble();

            }
        }
        return point;
    }
    public static boolean onTheLineSegment(double[][] point) {
        return ((point[1][0]-point[0][0]) * (point[1][1]-point[0][1]) -
                (point[2][0]-point[0][0]) * (point[2][1]-point[0][1]) -
                (point[3][0]-point[0][0]) * (point[3][1]-point[0][1]) -
                (point[4][0]-point[0][0]) * (point[4][1]-point[0][1]))>0;


    }




}
