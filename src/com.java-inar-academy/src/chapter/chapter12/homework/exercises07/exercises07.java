package chapter.chapter12.homework.exercises07;

import java.util.Scanner;

public class exercises07 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        try {
            System.out.println("Enter binary value to convert decimal number");
            String binary = input.nextLine();
            bin2Dec(binary);
        } catch (NumberFormatException ex) {
            ex.printStackTrace();
        }


    }

    public static void bin2Dec(String binary) throws NumberFormatException {
        int decimal=0;
        int pow=-1;

        for (int i = binary.length()-1; i >=0 ; i--) {
            char binChar=binary.charAt(i);

            if (binChar=='1' || binChar=='0'){
                pow++;
                decimal+=(binChar-'0') * Math.pow(2,pow);

            }else
                throw new NumberFormatException("NumberFormatException");


        }
        System.out.println(decimal);
    }
}
