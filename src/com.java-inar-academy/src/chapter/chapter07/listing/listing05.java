package chapter.chapter07.listing;

public class listing05 {
    public static void main(String[] args) {
        printMax(34, 3, 4, 3, 56.5);
        printMax(new double[]{1, 2, 3});
        printMax(1,2,2,1,4);
        printMax(new double[]{1,2,3});



    }

    public static void printMax(double... numbers) {
        if (numbers.length == 0) {
            System.out.println("no longer passed");
            return;
        }
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++)
            if (numbers[i] > result)
                result = numbers[i];

            System.out.println("the max value is " + result);
        }

    }

