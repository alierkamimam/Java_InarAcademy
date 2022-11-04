package chapter.chapter09.checkpoint;

public class cp22 {
    private double radius = 1;
        /** Find the area of this circle */
        public double getArea() {
            return radius * radius * Math.PI;
        }

        public static void main(String[] args) {
            cp22 myCircle = new cp22();
            System.out.println("Radius is " + myCircle.radius);
        }
    }

