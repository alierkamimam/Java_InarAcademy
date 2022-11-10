package chapter.chapter10.homework.Exercises14;

public class Test {
    public static void main(String[] args) {
        MyDate date=new MyDate();
        System.out.println(date.toString());
        MyDate date1=new MyDate(561555550000l);
        System.out.println(date1.toString());
        System.out.println(System.currentTimeMillis());
    }
}
