package chapter.chapter11.checkpoint;

public class Circle {
    public double radius;

    public Circle(){

    }

         public Circle(double radius) {
         this.radius = radius;
         }

         public double getRadius() {
         return this.radius;
         }

         public double getArea() {
         return radius * radius * Math.PI;
         }
 }


         class B extends Circle {
             private double length;

             B(double radius, double length) {
                 super(radius);

                 this.length = length;
             }

             @Override
             public double getArea() {
                 return super.getArea() * length;

             }
             @Override
             public boolean equals(Object o) {
                 if (o instanceof Circle)
                     return radius == ((Circle)o).radius;
                 else
                     return this == o;
             }
         }