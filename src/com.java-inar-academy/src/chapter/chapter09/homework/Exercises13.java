package chapter.chapter09.homework;

import java.util.Scanner;

public class Exercises13 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the number of rows and columns in the array: ");
        int row=input.nextInt();
        int column=input.nextInt();

        double[][] arr=create(row,column);
        Location location=locateLargest(arr);
        display(arr);
        System.out.println("--------------------");
        System.out.println(location.toString());


    }

    private static void display(double[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.printf("%2.2f ",arr[i][j]);
            }
            System.out.println();
        }
    }

    private static Location locateLargest(double[][] a) {
        double max=Double.MIN_VALUE;
        int row=-1;
        int column=-1;

        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                if (max<a[i][j]){
                    max=a[i][j];
                    row=i;
                    column=j;
                }
            }
        }
        return new Location(row,column,max);
    }

    public static double[][] create(int row, int column) {
        double[][] result=new double[row][column];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                result[i][j]=(int)((10+(Math.random()*90))*100)/100.0;

            }
        }
    return result;
    }

}
