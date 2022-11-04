package chapter.chapter09.listing;

public class _01TestSimpleCircle {
    public static void main(String[] args) {

       _01Circle circle1=new _01Circle();
        System.out.println("The area of circle of radius "+
                circle1.radius+" is "+circle1.getArea());
        System.out.println("-------------" );

        _01Circle circle2=new _01Circle(25);
        System.out.println("The area of circle of radius "+
                circle2.radius+ " is "+ circle2.getArea());
        System.out.println("-------------");

        _01Circle circle3=new _01Circle(125);
        System.out.println("The area of circle of radius "+
                circle3.radius+" is "+circle3.getArea());
        System.out.println("------------");

        circle2.radius=100;
        System.out.println("The area of circle of radius " +
                circle2.radius+" is "+circle2.getArea());
        System.out.println("----------------");

        circle1.setRadius(2);
        System.out.println(circle1.getArea());
        }
    }

