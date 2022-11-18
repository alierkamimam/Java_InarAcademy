package chapter.chapter11.homework.ex06;

import chapter.chapter09.exercises.A;
import chapter.chapter10.listing.Loan;
import chapter.chapter11.listing.GeometricObject.CircleFromSimpleGeometricObject;


import java.util.ArrayList;
import java.util.Date;

public class exercises06 {
    public static void main(String[] args) {
        ArrayList<Loan> loanList = new ArrayList<Loan>();
        loanList.add(new Loan(5, 10, 1000));
        loanList.add(new Loan(4, 10, 1000));
        loanList.add(new Loan(3, 10, 1000));
        loanList.add(new Loan(2, 10, 1000));

        ArrayList<Date> dateArrayList = new ArrayList<>();
        dateArrayList.add(new Date());
        dateArrayList.add(new Date(345678907578L));
        dateArrayList.add(new Date(98765432345L));
        dateArrayList.add(new Date(234567890987654L));

        ArrayList<String> list = new ArrayList<String>();
        list.add("erkam");
        list.add("Mustafa");

        ArrayList<CircleFromSimpleGeometricObject> circle = new ArrayList<>();
        circle.add(new CircleFromSimpleGeometricObject());
        circle.add(new CircleFromSimpleGeometricObject(5));
        circle.add(new CircleFromSimpleGeometricObject(8));
        circle.add(new CircleFromSimpleGeometricObject(7));


        display(loanList);
        display(dateArrayList);
        display(circle);
        System.out.println("\n\n\n");

        System.out.println(loanList.toString());
        System.out.println(dateArrayList.toString());
        System.out.println(circle.toString());


    }

    public static void display(ArrayList<?> list) {
        System.out.println("{");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).toString());
            System.out.println("=====================");
        }
        System.out.println("}\n----------------------------");
    }
}