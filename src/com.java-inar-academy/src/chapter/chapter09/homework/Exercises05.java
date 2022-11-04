package chapter.chapter09.homework;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Exercises05 {
    public static void main(String[] args) {
        GregorianCalendar calendar = new GregorianCalendar();
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + calendar.get(Calendar.MONTH) +
                "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));
        System.out.println();
        calendar.setTimeInMillis(1234567898765L);
        System.out.println(calendar.get(GregorianCalendar.YEAR) + "/" + calendar.get(Calendar.MONTH) +
                "/" + calendar.get(GregorianCalendar.DAY_OF_MONTH));

    }
}
