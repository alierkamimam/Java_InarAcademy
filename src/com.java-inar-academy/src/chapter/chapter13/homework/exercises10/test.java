package chapter.chapter13.homework.exercises10;

public class test {
    public static void main(String[] args) {
        Rectangle rectangle1=new Rectangle(4,7);
        Rectangle rectangle2=new Rectangle(5,9);
        Rectangle rectangle3=new Rectangle(14,2);


        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle2) ? "" : "not ") +
                "equal to rectangle2");
        System.out.println("Rectangle2 is " + (rectangle2.equals(rectangle3) ? "" : "not ") +
                "equal to rectangle3");
        System.out.println("Rectangle1 is " + (rectangle1.equals(rectangle3) ? "" : "not ") +
                "equal to rectangle3");

    }
}
