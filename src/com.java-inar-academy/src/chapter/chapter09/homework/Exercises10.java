package chapter.chapter09.homework;

public class Exercises10 {
    public static void main(String[] args) {
        QuadraticEquation quadraticEquation=new QuadraticEquation(1.0,3,1);
        QuadraticEquation quadraticEquation1=new QuadraticEquation(1.0,2,1);
        QuadraticEquation quadraticEquation2=new QuadraticEquation(1.0,2,3);

        System.out.println("quadraticEquation:"+quadraticEquation.String());
        System.out.println("quadraticEquation1:"+quadraticEquation1.String());
        System.out.println("quadraticEquation2:"+quadraticEquation2.String());

    }
}
