package chapter.chapter13.listing;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class TestCalendar {
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar();
        System.out.println("Current time is " + new Date());
        System.out.println("YEAR: " + calendar.get(Calendar.YEAR));
        System.out.println("MONTH: " + calendar.get(Calendar.MONTH));
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        calendar.add(Calendar.DATE, 2);
        System.out.println("DATE: " + calendar.get(Calendar.DATE));
        System.out.println("HOURS: " + calendar.get(Calendar.HOUR));
        System.out.println("HOUR OF DAY: " + calendar.get(Calendar.HOUR_OF_DAY));
        System.out.println("MINUTE: " + calendar.get(Calendar.MINUTE));
        System.out.println("SECOND: " + calendar.get(Calendar.SECOND));
        System.out.println("DAY OF WEEK: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("DAY OF MONTH:" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("DAY OF YEAR: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("WEEK OF YEAR: " + calendar.get(Calendar.WEEK_OF_MONTH));
        System.out.println("WEEK OF YEAR: " + calendar.get(Calendar.WEEK_OF_YEAR));
        System.out.println("AM_PM: " + calendar.get(Calendar.AM_PM));



        Calendar calendar1 = new GregorianCalendar(2001, 11, 11);
        String[] dayOfWeek = {"SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        System.out.println("September 11, 2001 is a " + dayOfWeek[calendar1.get(Calendar.DAY_OF_WEEK) - 1]);


    }
}
