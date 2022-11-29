package chapter.chapter12.homework.exercises21;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class exercises21 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        File file = new File("C:\\Users\\Ali Erkam İMAM\\Desktop\\SortedString.txt");

        try {
            Scanner input = new Scanner(file);
            while (input.hasNext()) {
                String s = input.next();
                list.add(s);
            }
            if (!isSorted(list)) {
                System.out.println("String are  sorted");
            }else
            System.out.println("Strings are not  sorted .First two strings out of order is ["+
                    list.get(0)+","+list.get(1)+"]");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


    }

    public static boolean isSorted(ArrayList<String> list) {
        for (int i = 0; i < list.size() - 1; i++) {
            if (list.get(i).compareTo(list.get(i + 1)) > 0) {
                return true;
            }
        }
        return false;

    }
}
