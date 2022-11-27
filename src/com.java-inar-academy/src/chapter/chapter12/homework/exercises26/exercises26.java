package chapter.chapter12.homework.exercises26;

import java.io.File;
import java.util.Scanner;

public class exercises26 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a directory name:");
        String name = input.next();
        File file = new File(name);

        if (!file.exists()) {
            file.mkdirs();
            System.out.println("Directory created successfully.");
        } else
            System.out.println("Directory already exists.");
    }
}
