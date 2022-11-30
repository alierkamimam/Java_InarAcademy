package chapter.chapter13.homework.exercises05;

public class test {
    public static void main(String[] args) {
        GeometricObject circle=new Circle("Purple",true,5.0);
        System.out.println(circle.toString());
        System.out.println("********************");


        GeometricObject circle1=new Circle("Black",false,7.8);
        System.out.println(circle1.toString());
        System.out.println("********************");

        System.out.println("Max circle:");
        System.out.println( GeometricObject.max(circle,circle1));
        System.out.println("********************");


        GeometricObject rectangle=new Rectangle("Pink",true,34,56);
        System.out.println(rectangle.toString());
        System.out.println("********************");
        GeometricObject rectangle1=new Rectangle("Blue",false,23,78);
        System.out.println(rectangle1.toString());
        System.out.println("********************");
        System.out.println("Max rectangle:");
        System.out.println(Rectangle.max(rectangle,rectangle1));
    }
}
