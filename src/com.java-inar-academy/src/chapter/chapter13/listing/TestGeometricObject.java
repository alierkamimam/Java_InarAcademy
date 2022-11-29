package chapter.chapter13.listing;

public class TestGeometricObject {
    public static void main(String[] args) {
        GeometricObjects geoObject1 = new Circle(5);
        GeometricObjects geoObject2 = new Rectangle(5, 3);

        System.out.println("The two objects have the same area? ");
        equalArea(geoObject1, geoObject2);


        displayGeometricObjects(geoObject1);

        displayGeometricObjects(geoObject2);
    }

    public static void displayGeometricObjects(GeometricObjects objects) {
        System.out.println();
        System.out.println("The area is " + objects.getArea());
        System.out.println("The perimeter is " + objects.getPerimeter());
    }

    public static boolean equalArea(GeometricObjects objects1, GeometricObjects objects2) {
        return objects1.getArea() == objects2.getArea();


    }


}
