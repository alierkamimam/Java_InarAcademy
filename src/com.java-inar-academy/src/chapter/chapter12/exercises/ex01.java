package chapter.chapter12.exercises;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ex01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter two numbers");
        int number1 = input.nextInt();
        int number2 = input.nextInt();


        p1(number1,number2);



       /* try {
            int result=quotient(number1,number2);
            System.out.println(result);

        }catch (ArithmeticException e){
            System.out.println("Exception: an integer " +
                    "cannot be divided by zero ");
        }
*/


    }
    public static int quotient(int number1, int number2)  {//declare exception
        if (number2 == 0) {
            throw new ArithmeticException("Divisor cannot be zero");//throw exception
        }
        return number1 / number2;
    }

    public static void p1(int number1,int number2) throws ArithmeticException{
        quotient(number1,number2);
    }
}
