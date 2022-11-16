package chapter.chapter11.exercises;

public class TEST1 {
    public static void main(String[] args) {
        Fruit fruit = new GoldenDelicious();
        Orange orange = new Orange();
        System.out.println(fruit instanceof Fruit);
        System.out.println(fruit instanceof Orange);
        System.out.println(fruit instanceof Apple);
        System.out.println(fruit instanceof GoldenDelicious);
        System.out.println(fruit instanceof McIntosh);
        System.out.println(orange instanceof Orange);
        System.out.println(orange instanceof Fruit);
        //System.out.println(orange instanceof  Apple );

    }
}