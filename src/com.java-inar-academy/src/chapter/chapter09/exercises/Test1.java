package chapter.chapter09.exercises;

import chapter.chapter09.listing.CircleWithPrivateDataFields;

public class Test1 {
    public static void main(String[] args) {
        CircleWithPrivateDataFields mycircle=new CircleWithPrivateDataFields(5.0);
        printCircle(mycircle);

    }
    public static void  printCircle(CircleWithPrivateDataFields c){
        System.out.println("The area of the circle of radius"+c.getRadius()+" is "+c.getArea());
    }
}
