package chapter.chapter08.execises;

public class cumulativesong {
    public static void main(String[] args) {
        System.out.println("On the 1st of \"Xmas\" , my true love gave to me\"");
        printLine1();

        System.out.println("On the 2st of \"Xmas\" , my true love gave to me\"");
        printLine2();

        System.out.println("On the 3st of \"Xmas\" , my true love gave to me\"");
        printLine3();

        System.out.println("On the 4st of \"Xmas\" , my true love gave to me\"");
        printLine4();


    }
    public static void printLine1(){
        System.out.println("          a partridge in a pear tree");
    }
    public static void printLine2(){
        System.out.println("          two turtle doves,and");
        printLine1();
    }
    public static void printLine3(){
        System.out.println("         three French hens");
        printLine2();
    }

    public static void printLine4() {
        System.out.println("         four calling birds");
        printLine3();
    }
}
