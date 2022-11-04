package chapter.chapter09.homework;


import java.util.Date;

public class Exercises03 {
    public static void main(String[] args) {
        long startTime=10000;
        long endTime=100000000000L;
        while (startTime<=endTime){
            Date date1=new Date(startTime);
            System.out.println(date1.toString());
            startTime*=10;

        }
    }
}
