package chapter.chapter12.homework.exercises13;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class exercises13 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter file path:");
        String path = input.nextLine();



        File file = new File(path);
        input =new Scanner(file);

        int numberOfChar = 0;
        int numberOfWord = 0;
        int numberOfLine = 0;



            while (input.hasNext()) {
                String s = input.nextLine();
                numberOfLine++;
                numberOfWord += countWord(s);
                numberOfChar += countChar(s);

            }
        System.out.println("Number of lines: "+numberOfLine+"\nNumber of Word: "+numberOfWord+"\nNumber of Characters "+
                numberOfChar);

        }



        private static int countChar (String s){
            int count = 0;
            for (int i = 0; i < s.length(); i++) {
                if (!(s.charAt(i) == ' ') && !(s.charAt(i) == '\n')) {
                    count++;
                }
            }
            return count;
        }

        private static int countWord (String s){
            String[] arr = s.split(" ");
            return arr.length;


        }


    }

