package chapter.chapter07.listing;

import java.util.Scanner;

public class aaaa {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter list 1 length then the elements : ");
        int[] list1 = createList(input.nextInt(), input);

        System.out.print("Enter list 2 length then the elements : ");
        int[] list2 = createList(input.nextInt(), input);
    }

        public static int[] createList( int length, Scanner input){
            int[] result = new int[length];
            for (int i = 0; i < result.length; i++) {
                result[i] = input.nextInt();
            }
            return result;
        }


        public static boolean equals ( int[] list1, int[] list2){
            if (list1.length != list2.length)
                return false;

            for (int i = 0; i < list1.length; i++) {
                if (list1[i] != list2[i])
                    return false;
            }
            return true;

        }

    }
