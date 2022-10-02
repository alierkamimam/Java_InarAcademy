package chapter.chapter06.homework;



public class exercises16 {
    public static void main(String[] args) {

        final int YEAR = 2020;
        System.out.printf("%-10s%4s","YEAR","DAYS");
        System.out.println("\n---------------");


        for (int i =2000;i<=YEAR;i++){
            System.out.printf("%-10d%4d\n",i,numberOfDayInYear(i));

        }

    }

    public static int numberOfDayInYear(int year) {
        return ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) ? 366 : 365;
    }
}
