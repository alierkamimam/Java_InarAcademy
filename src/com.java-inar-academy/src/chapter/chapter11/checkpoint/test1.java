package chapter.chapter11.checkpoint;

import chapter.chapter11.listing.GeometricObject.CircleFromSimpleGeometricObject;

public class test1 {
    public static void main(String[] args) {
     Object myObjects=new CircleFromSimpleGeometricObject();
        if (myObjects instanceof CircleFromSimpleGeometricObject){
            System.out.println("The circle diameter is "+((CircleFromSimpleGeometricObject) myObjects).getDiameter());
        }



    }

}
