package chapter.chapter11.listing;

import chapter.chapter11.listing.GeometricObject.CircleFromSimpleGeometricObject;

import java.util.ArrayList;
import java.util.Comparator;


public class TestArrayList {
    public static void main(String[] args) {
        //create a list to store city list
        ArrayList<String> cityList = new ArrayList<>();

        //Add some cities in the list
        cityList.add("London");
        //city list now contains [London]
        cityList.add("Denver");
        //city list now contains [London,Denver]
        cityList.add("Paris");
        //city list now contains [London,Denver,Paris]
        cityList.add("Miami");
        //city list now contains [London,Denver,Paris,Miami]
        cityList.add("Seoul");
        //city list now contains [London,Denver,Paris,Miami,Seoul]
        cityList.add("Tokyo");
        //city list now contains [London,Denver,Paris,Miami,Seoul,Tokyo]


        System.out.println("List size? " + cityList.size());
        System.out.println("Is miami in the list? " + cityList.contains("Miami"));
        System.out.println("The location of Denver in the list? " + cityList.indexOf("Denver"));
        System.out.println("Is the list empty? " + cityList.isEmpty());

        // Insert a new city at index 2
        cityList.add(2, "Ankara");

        // Remove a city from the list
        cityList.remove("Miami");

        // Remove a city at index 1
        cityList.remove(1);

        // Display the contents in the list
        System.out.println(cityList.toString());

        for (int i = cityList.size() - 1; i >= 0; i--) {
            System.out.print(cityList.get(i) + " ");
            System.out.println();
        }

        System.out.println("-----------------------");


        for (int i = 0; i < cityList.size(); i++) {
            System.out.print(cityList.get(i) + " ");
            System.out.println();
        }
        // Create a list to store two circles
        ArrayList<CircleFromSimpleGeometricObject> list = new ArrayList<>();
        // Add two circles
        list.add(new CircleFromSimpleGeometricObject(2));
        list.add(new CircleFromSimpleGeometricObject(3));

        System.out.println("The area of the circle? "+list.get(0).getArea());
        System.out.println("The area of the circle? "+list.get(1).getArea());



    }
}

