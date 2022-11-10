package chapter.chapter10.homework.Exercises11;

public class Test {
    public static void main(String[] args) {
        Circle2D circle2D=new Circle2D(2,2,5.5);
        System.out.println("Area --> "+circle2D.getArea());
        System.out.println("Perimeter--> "+circle2D.getPerimeter());
        System.out.println(circle2D.contains(3,3));
        System.out.println(circle2D.contains(new Circle2D(4,5,10.5)));
        System.out.println(circle2D.overlaps(new Circle2D(3,5,2.3)));

    }
}
