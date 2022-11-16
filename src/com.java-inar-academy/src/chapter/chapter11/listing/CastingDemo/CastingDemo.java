package chapter.chapter11.listing.CastingDemo;

import chapter.chapter11.listing.GeometricObject.CircleFromSimpleGeometricObject;
import chapter.chapter11.listing.GeometricObject.RectangleFromSimpleGeometricObject;

public class CastingDemo {
    public static void main(String[] args) {
        Object objects1=new CircleFromSimpleGeometricObject(1);
        Object objects2=new RectangleFromSimpleGeometricObject(1,1);


        displayObjects(objects1);
        displayObjects(objects2);

    }

    public static void displayObjects(Object objects) {
        if (objects instanceof CircleFromSimpleGeometricObject){
            System.out.println("The circle area is "+((CircleFromSimpleGeometricObject) objects).getArea());
            System.out.println("The diameter is "+ ((CircleFromSimpleGeometricObject) objects).getDiameter());;
        }else if(objects instanceof RectangleFromSimpleGeometricObject){
            System.out.println("The rectangle area is "+((RectangleFromSimpleGeometricObject) objects).getArea());
        }
    }
}
