package chapter.chapter10.homework.Exercises13;

public class Test {
    public static void main(String[] args) {
        MyRectangle2D a = new MyRectangle2D(2, 2, 5.5, 4.9);
        System.out.println("Area--> " + a.getArea());
        System.out.println("Perimeter--> " + a.getPerimeter());
        System.out.println(a.contains(3, 3));
        System.out.println(a.contains(new MyRectangle2D(4, 5, 10.5, 3.2)));
        System.out.println(a.overlaps(new MyRectangle2D(3, 5, 2.3, 5.4)));

    }
}