package chapter.chapter14.homework;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class exercises01 {
    public static void main(String[] args) {
        /*(Analyze scores) Write a program that reads an unspecified number of scores and
determines how many scores are above or equal to the average and how many
scores are below the average. Enter a negative number to signify the end of the
input. Assume that the maximum number of scores is 100.*/
        List<Integer> number = getFromUser();
        int average = average(number);
        findAboveEqualBelow(number, average);


    }

    private static void findAboveEqualBelow(List<Integer> number, int average) {
        List<Integer> above = new ArrayList<>();
        List<Integer> equal = new ArrayList<>();
        List<Integer> below = new ArrayList<>();
        for (int i = 0; i < number.size(); i++) {
            if (number.get(i) < average) {
                below.add(number.get(i));
            } else if (number.get(i) > average) {
                above.add(number.get(i));

            } else equal.add(number.get(i));

        }
        System.out.println("Above values is : " + above.size());
        System.out.println("Equal values is : " + equal.size());
        System.out.println("Below values is : " + below.size());

    }

    private static int average(List<Integer> number) {
        int sum = 0;
        for (int i = 0; i < number.size(); i++) {
            sum += number.get(i);
        }
        return (sum / number.size());

    }

    private static List<Integer> getFromUser() {
        List<Integer> list = new ArrayList<>();
        Scanner input = new Scanner(System.in);
        System.out.println("Enter scores (to finished enter negative value): ");
        int number = 1;
        while (number > 0) {
            number = input.nextInt();
            if (number > 0) {
                list.add(number);
            }
        }
        return list;

    }


}
