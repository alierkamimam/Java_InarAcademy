package chapter.chapter11.checkpoint;

import chapter.chapter11.listing.GeometricObject.SimpleGeometricObject;

public class cp25 {
    public static void main(String[] args) {
        Circle circle = new Circle(1);
        SimpleGeometricObject object = new SimpleGeometricObject();

      //  System.out.println(circle instanceof SimpleGeometricObject); false
        System.out.println(object instanceof SimpleGeometricObject);  // true
        System.out.println(circle instanceof  Circle);
        //System.out.println(object instanceof Circle);  //false

       /* Circle circle1=new Circle(5);
        SimpleGeometricObject object1=(SimpleGeometricObject) circle1;

        */

        /*SimpleGeometricObject object2 = new SimpleGeometricObject();
        Circle circle1 = (Circle)object2;
        */

       }
    }
