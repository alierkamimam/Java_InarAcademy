package chapter.chapter10.homework.Exercises14;

import java.util.Date;
import java.util.GregorianCalendar;

public class MyDate {
    private int year;
    private int month;
    private int day;

    public MyDate() {
        this(System.currentTimeMillis());
    }

    public MyDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH);
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);


    }


    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    public void setDate(long elapsedTime) {
        GregorianCalendar date = new GregorianCalendar();
        date.setTimeInMillis(elapsedTime);
        this.year = date.get(GregorianCalendar.YEAR);
        this.month = date.get(GregorianCalendar.MONTH);
        this.day = date.get(GregorianCalendar.DAY_OF_MONTH);

    }

    public String toString() {

        return getDay()+"\\"+getMonth()+"\\"+getYear();
       // return (this.getDay() >= 10 ? this.getDay() : "0" + this.getDay())+ "\\" +
              //  (this.getMonth() >= 10 ? this.getMonth() : "0" + this.getMonth()) + "\\" + getYear();
    }
}
