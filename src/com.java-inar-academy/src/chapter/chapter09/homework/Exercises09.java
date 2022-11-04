package chapter.chapter09.homework;

public class Exercises09 {
    public static void main(String[] args) {
        RegularPolygon regularPolygon=new RegularPolygon(6,4);
        RegularPolygon regularPolygon1=new RegularPolygon(10,4,5.6,7.8);

        System.out.println("First polygon's perimeter --> "+regularPolygon.getPerimeter());
        System.out.println("First polygon's area--> "+regularPolygon.getArea());

        System.out.println("------------------------------------------");


        System.out.println("Second polygon1's perimeter--> "+regularPolygon1.getPerimeter());
        System.out.println("First polygon1's area--> "+regularPolygon1.getArea());

    }
}
