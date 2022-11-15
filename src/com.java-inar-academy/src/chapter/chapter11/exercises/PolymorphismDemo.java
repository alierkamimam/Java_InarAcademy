package chapter.chapter11.exercises;

import chapter.chapter11.listing.GeometricObject.CircleFromSimpleGeometricObject;
import chapter.chapter11.listing.GeometricObject.RectangleFromSimpleGeometricObject;
import chapter.chapter11.listing.GeometricObject.SimpleGeometricObject;

public class PolymorphismDemo{
    public static void main(String[] args) {


        displayObjects(new CircleFromSimpleGeometricObject(1,"red",false));
        displayObjects(new RectangleFromSimpleGeometricObject(1,1,"black",true));

    }
    public static void displayObjects(SimpleGeometricObject objects){
        System.out.println("Created on:"+objects.getDateCreated()+".Color is  "+objects.getColor());
    }
}
