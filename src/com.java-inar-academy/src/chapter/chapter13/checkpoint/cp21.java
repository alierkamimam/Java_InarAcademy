package chapter.chapter13.checkpoint;

public class cp21 {
    public static void main(String[] args) {
        // Person cannot be cast to java.lang.Comparable
        Person[] persons = {new Person(3), new Person(4), new Person(1)};
        java.util.Arrays.sort(persons);
    }
}
class Person {
    private int id;

    Person(int id) {
        this.id = id;
    }
}