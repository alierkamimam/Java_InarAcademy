package chapter.chapter08.homework;

import java.util.Scanner;

public class exercises36 {
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter number n:");
        int n=input.nextInt();
        while (n<=1){
            System.out.println("Please enter the  greater than 1:");
            n=input.nextInt();
        }

        System.out.printf("Enter %d rows of letter seperated by spaces\n",n);
        char[][] letters=GetFrom(n);
        print(letters);
        String a= String.valueOf((char)('A'+n));

        if (isValid(letters,n)){
            if (!isvalidRow(letters)){
                System.out.println("the letters must not same in row:");
            }
            else if (!isValidCol(letters)){
                System.out.println("The letters must not same in column");
            }
            else
            System.out.println("The input array is a Latin square");
        }else
            System.out.printf("Wrong input : the letter must be from A to %s",(a));





    }

    public static boolean isValid(char[][] letters,int n) {
        for (int row = 0; row < letters.length; row++) {
            for (int col = 0; col < letters.length; col++) {
                if (!('A'<=letters[row][col] && letters[row][col]<'A'+n)){
                    return false;
                }


            }
        }
        return true;
    }

    private static boolean isvalidRow(char[][] letters) {
        for (int row = 0; row < letters.length; row++) {
            for (int col = 0; col < letters.length-1; col++) {
                for (int i = col+1; i <letters.length ; i++) {
                    if (letters[row][col]==letters[row][i]){
                        return false;
                    }
                }

                }
            }
        return true;


    }

    private static boolean isValidCol(char[][] letters) {
        for (int col = 0; col < letters.length; col++) {
            for (int row = 0; row < letters.length - 1; row++) {
                for (int i = row + 1; i < letters.length; i++) {
                    if (letters[row][col] == letters[i][col]) {
                        return false;
                    }
                }

            }
        }
        return true;
        }

    public static char[][] GetFrom(int n) {
        char[][] letter=new char[n][n];
        for (int row = 0; row <letter.length ; row++) {
            for (int column = 0; column < letter.length; column++) {
                String let=input.next();
                char ch=let.charAt(0);
                letter[row][column]=ch;
            }
        }
       return letter;
    }
    private static void print(char[][] m){
        for (int row = 0; row < m.length; row++) {
            for (int column = 0; column < m.length; column++) {
                System.out.print(m[row][column]+" ");
            }
            System.out.println();
        }
    }
}
