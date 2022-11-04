package chapter.chapter09.listing;

public class CircleWithStaticMembers {
    double radius;

    static int numberOfObjects=0;

    CircleWithStaticMembers(){
        radius=1;
        numberOfObjects++;
    }
    CircleWithStaticMembers(double newradius){
        radius=newradius;
        numberOfObjects++;
    }
    static  int getNumberOfObjects(){
        return numberOfObjects;
    }
    double getArea(){
        return radius * radius *Math.PI;
    }

}
