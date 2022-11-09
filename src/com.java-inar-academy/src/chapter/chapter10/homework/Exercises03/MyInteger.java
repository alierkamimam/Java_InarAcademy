package chapter.chapter10.homework.Exercises03;

public class MyInteger {
    private int value;


    public MyInteger() {
        this(0);
    }

    public MyInteger(int value) {
        this.value = value;
    }


    public int getValue() {
        return this.value;
    }

    public boolean isEven() {
        return (this.value / 2) == 0;
    }

    public boolean isOdd() {
        return !isEven();
    }

    public boolean isPrime() {
        for (int i = 2; i < getValue() / 2; i++) {
            if (getValue() % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static boolean isEven(int value) {
        return (value / 2) == 0;
    }

    public static boolean isOdd(int value) {
        return !isEven(value);
    }

    public static boolean isPrime(int value) {
        for (int i = 2; i < value / 2; i++) {
            if (value % i == 0) {
                return false;
            }
        }
        return true;

    }


    public static boolean isEven(MyInteger myInteger) {
        return myInteger.isEven();
    }

    public static boolean isOdd(MyInteger myInteger) {
        return myInteger.isOdd();
    }

    public static boolean isPrime(MyInteger myInteger) {
        return myInteger.isPrime();
    }


    public boolean equals(int value) {
        return getValue() == value;
    }

    public boolean equals(MyInteger myInteger) {
        return equals(myInteger.getValue());
    }

    public static int parseInt(String c){
        return Integer.parseInt(c);

    }
    public static int parseInt(char[] c){
        return parseInt(new String(c));
    }




}
