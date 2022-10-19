package chapter.chapter07.homework;

import java.util.Scanner;

public class exercises34sortedCharacters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a String:");
        String str = input.nextLine();
        str.toLowerCase();
        String s=sort(str);
        System.out.println(s);
        //  System.out.println(sort(str));


    }

    public static String sort(String str) {
        char[] arrayOfs = str.toCharArray();

        for (int i = 0; i < arrayOfs.length - 1; i++) {
            for (int j = i + 1; j < arrayOfs.length; j++) {
                if (arrayOfs[i] > arrayOfs[j]) {
                    char temp = arrayOfs[i];
                    arrayOfs[i] = arrayOfs[j];
                    arrayOfs[j] = temp;
                }
            }
        }
        String sorted="";
        for (int i=0;i<arrayOfs.length;i++){
            sorted+=arrayOfs[i];
        }

        return sorted;
    }
}
