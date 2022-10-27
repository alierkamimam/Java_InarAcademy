package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises37 {
    public static void main(String[] args) {
        String[][] capital = capital();

        askQuestion(capital);


    }

    public static void askQuestion(String[][] question) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        for (String[] strings : question) {
            System.out.printf(" What is the capital of %s\n", strings[0]);
            String s = input.nextLine();
            s = s.toUpperCase();
            if (strings[1].toUpperCase().equals(s)) {
                System.out.println("Your answer is correct");
                count++;
            } else
                System.out.println("The correct answer should be " + strings[1]);


        }
        System.out.println("The correct count is " + count);


    }

    public static String[][] capital() {
        String[][] capital1 = {{"Alabama", "Montgomery"},
                {"Alaska", "Juneau"},
                {"Arizona", "Phoenix"},
                {"Arkansas", "Little Rock"},
                {"California", "Sacramento"},
                {"Colorado", "Denver"},
                {"Connecticut", "Hartford"},
                {"Delaware", "Dover"},
                {"Florida", "Tallahassee"},
                {"Georgia", "Atlanta"},
                {"Georgia", "Atlanta"},
                {"Idaho", "Boise"},
                {"Illinois", "Springfield"}};
        return capital1;


    }
}
