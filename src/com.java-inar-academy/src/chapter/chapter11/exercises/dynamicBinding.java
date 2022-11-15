package chapter.chapter11.exercises;

import chapter.chapter11.listing.GeometricObject.SimpleGeometricObject;

public class dynamicBinding {
    public static void main(String[] args) {
        Object o=new SimpleGeometricObject();
        System.out.println(o.toString());
    }
}
