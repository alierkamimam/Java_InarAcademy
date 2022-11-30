package chapter.chapter13.homework.exercises07;

import chapter.chapter13.homework.exercises06.GeometricObject;

public class test {
    public static void main(String[] args) {
        GeometricObject[] array={new Square(4),new Square(6.9),new Square(3.9),
                new Square(6),new Square(9.5)};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("Area of %d.Square: %2.2f\n",(i+1),array[i].getArea());
            System.out.print("How to color: ");
            ((Colarable)array[i]).howToColor();
            System.out.println();

        }
    }
}
