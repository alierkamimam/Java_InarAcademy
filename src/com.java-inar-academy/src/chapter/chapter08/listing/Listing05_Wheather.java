package chapter.chapter08.listing;

import java.util.Scanner;

public class Listing05_Wheather {
    public static void main(String[] args) {
        final int NUMBER_OF_DAYS = 10;
        final int NUMBER_OF_HOURS = 24;

        double[][][] data = new double[NUMBER_OF_DAYS][NUMBER_OF_HOURS][2];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < NUMBER_OF_DAYS * NUMBER_OF_HOURS; i++) {
            int day = (int) (Math.random()*10+1);
            int hours = (int) (Math.random()*24+1);

            double temp = (int) (Math.random()*100);
            double hum = (int) (Math.random()*100);

            data[day - 1][hours - 1][0] = temp;
            data[day - 1][hours - 1][1] = hum;
        }

        for (int row = 0; row < NUMBER_OF_DAYS; row++) {
            double dailyTempTotal = 0, dailyHumTotal = 0;
            for (int column = 0; column < NUMBER_OF_HOURS; column++) {
                dailyTempTotal += data[row][column][0];
                dailyHumTotal += data[row][column][1];
            }
            System.out.println("Day " + row + "'s avarage tempature is " + dailyTempTotal/NUMBER_OF_DAYS);
            System.out.println("Day " + row + "'s avarage humidity is " + dailyHumTotal/NUMBER_OF_HOURS);

        }


    }
}
