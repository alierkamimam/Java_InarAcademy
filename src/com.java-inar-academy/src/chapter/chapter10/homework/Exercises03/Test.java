package chapter.chapter10.homework.Exercises03;

public class Test {
    public static void main(String[] args) {
        MyInteger myInteger = new MyInteger(46);
        System.out.println("for value" + 46);
        System.out.println("Equals-->" + myInteger.equals(46));
        System.out.println("isEven--> " + myInteger.isEven());
        System.out.println("isOdd--> " + myInteger.isOdd());
        System.out.println("isPrime--> " + myInteger.isPrime());
        System.out.println("Get value--> " + myInteger.getValue());
        System.out.println(MyInteger.parseInt("45"));
        char[] arr = {'1', '2', '3'};
        System.out.println(MyInteger.parseInt(arr));
        System.out.println("----------------");

        System.out.println(MyInteger.isEven(new MyInteger(33)));

    }
}
