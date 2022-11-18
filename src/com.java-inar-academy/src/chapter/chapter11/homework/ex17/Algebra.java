package chapter.chapter11.homework.ex17;

import java.util.ArrayList;
import java.util.Scanner;

public class Algebra {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a integer m: ");
        int number = input.nextInt();
        ArrayList<Integer> list = getFactor(number);
        System.out.println(list);
        int n = findSmallest(list);
        System.out.println("The smallest number n for m * n to be a perfect square is "+n+" is "+(n* number));



    }

    private static int findSmallest(ArrayList<Integer> list) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            int count = 1;
            for (int j = 0; j < list.size(); j++) {
                if(i==j){
                    continue;
                }
                if (list.get(i).equals(list.get(j))) {
                    count++;
                }
                if (count % 2 == 1) {
                    if (!result.contains(list.get(i))) {
                        result.add(list.get(i));
                    }
                }
            }
        }

        int sum = 1;
        for (int i = 0; i < result.size(); i++) {
            sum *= result.get(i);
        }

        return sum;

    }

    private static ArrayList<Integer> getFactor(int number) {


        ArrayList<Integer> num1 = new ArrayList<>();
        int divisor = 2;
        while (number != 1) {
            if (number % divisor == 0) {
                num1.add(divisor);
                number /= divisor;
            } else
                divisor++;
        }

        return num1;
    }

}
