package chapter.chapter06.homework;

import java.util.Scanner;

public class exercises25 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a milisecond :");
        long number =input.nextLong();

        System.out.print(number+" milisecond is ");
        System.out.println(covertmillis(number));

    }

    public static String covertmillis(long milis) {

        long totolSecond = milis / 1000;

        long currentSecond = totolSecond % 60;

        long totalMinutes = totolSecond / 60;

        long currentMinute = totalMinutes % 60;

        long totalHours = totalMinutes / 60;

        long currentHour = totalHours % 24;
        return "Current time is " + currentHour + " : " + currentMinute + " : " + currentSecond + " GMT ";

    }

}
