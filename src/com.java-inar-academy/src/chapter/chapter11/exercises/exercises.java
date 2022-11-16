package chapter.chapter11.exercises;

import chapter.chapter11.listing.GeometricObject.CircleFromSimpleGeometricObject;

public class exercises {
    public static void main(String[] args) {
        Object o=new CircleFromSimpleGeometricObject();
        CircleFromSimpleGeometricObject C= (CircleFromSimpleGeometricObject) o;//no new object is created
    }
}
