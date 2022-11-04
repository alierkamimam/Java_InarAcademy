package chapter.chapter09.checkpoint;

import java.util.Date;

public class cp26a {
    public static void main(String[] args) {
        Date date = null; //return null value
        m1(date);
        System.out.println(date);
    }
    public static void m1(Date date) {
        date = new Date();
    }
}
