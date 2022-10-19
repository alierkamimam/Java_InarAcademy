package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises33ChineseZodiac {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year:");
        int year = (input.nextInt() % 12);
        ChineseZodiac(year);


    }

    public static void ChineseZodiac(int year) {

        String[] chineseZodiac = {"monkey", "rooster", "dog", "pig", "rat", "ox",
                "tiger", "rabbit", "dragon", "snake", "horse", "sheep"};
        System.out.println(chineseZodiac[year]);

    }
}
