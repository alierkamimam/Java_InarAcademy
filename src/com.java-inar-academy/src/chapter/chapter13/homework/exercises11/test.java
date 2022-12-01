package chapter.chapter13.homework.exercises11;

import chapter.chapter13.homework.exercises10.GeometricObjects;

public class test {
    public static void main(String[] args) throws CloneNotSupportedException {
        Octagon octagon = new Octagon(5);
        System.out.println(octagon.toString());

        System.out.println("Cloning Octagon...");
        Octagon octagon1 = (Octagon) octagon.clone();

        int result=octagon.compareTo(octagon1);

        if (result==1){
            System.out.println("Octagon is greater than Octagon1");
        }else if (result==-1){
            System.out.println("Octagon1 is greater than Octagon");
        }else
            System.out.println("Octagon is equal to  its clone");
    }
}
