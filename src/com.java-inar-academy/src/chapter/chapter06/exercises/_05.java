package chapter.chapter06.exercises;

public class _05 {                              //ambiguous invocation
    public static void main(String[] args) {
        System.out.println(max(1, 2));

    }

    public static double max(double number1, double number2) {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }

    public static int max(int number1, int number2) {
        if (number1 > number2)
            return number1;
        else
            return number2;
    }
}
