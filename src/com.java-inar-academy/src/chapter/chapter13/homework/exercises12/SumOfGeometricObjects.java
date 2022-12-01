package chapter.chapter13.homework.exercises12;

import chapter.chapter13.homework.exercises01.Triangle;
import chapter.chapter13.homework.exercises09.Circle;
import chapter.chapter13.homework.exercises10.GeometricObjects;
import chapter.chapter13.homework.exercises10.Rectangle;
import chapter.chapter13.homework.exercises11.Octagon;

public class SumOfGeometricObjects {
    public static void main(String[] args) {
        GeometricObjects[] array={new Rectangle(2,9),new Rectangle(3,6),new Octagon(7)};
        System.out.printf("Sum the areas of geometric objects: %2.2f ",sumArea(array));


    }
    public static double sumArea(GeometricObjects[] a){
        double sum=0;
        for (int i = 0; i < a.length; i++) {
            sum+=a[i].getArea();
        }
        return sum;
    }
}
