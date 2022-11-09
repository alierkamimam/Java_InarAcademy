package chapter.chapter10.homework.Exercises01;

public class Test {
    public static void main(String[] args) {
        Time time = new Time();
        System.out.println("**************");
        time.display();
        System.out.println("**************");
        System.out.println("for total millis 555550000 ");
        Time time1=new Time(555550000);
        time1.display();
        System.out.println("**************");


    }
}
