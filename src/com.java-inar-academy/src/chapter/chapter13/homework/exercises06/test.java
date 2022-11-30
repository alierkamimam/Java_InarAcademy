package chapter.chapter13.homework.exercises06;

public class test {
    public static void main(String[] args) {
        ComparableCircle circle=new ComparableCircle("black",true,13.6);
        ComparableCircle circle1=new ComparableCircle("Purple",false,12.7);

        System.out.println("Comparable circle:");
        System.out.println(circle);
        System.out.println("****************");
        System.out.println("Comparable circle1");
        System.out.println(circle1);


        System.out.println((circle.compareTo(circle1)==1?"\nComparable circle1 ":"\nComparable circle2")+" is larger than" +
                " of the two circles");
    }
}
