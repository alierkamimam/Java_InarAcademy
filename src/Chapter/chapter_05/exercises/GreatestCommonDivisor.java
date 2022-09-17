package Chapter.chapter_05.exercises;

import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		Scanner input =new Scanner(System.in);
		while(true) {
		System.out.print(" Enter a  two number: ");
		int number1= input.nextInt();
		int number2= input.nextInt();
		
		int obeb = 0;
		int divide =1;
	
			while(divide<=number1 && divide<=number2) {
				if(number1%divide==0 && number2%divide==0) {
				obeb=divide;
				
			}
				divide++;
		}
			System.out.println( " "+number1 + " and "+ number2+" 's obeb are "+ obeb+" \n");
	}
		
	}
	
}
