package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises32 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		int number1=(int)(Math.random()*10);
		int number2;
		while(true) {
			number2=(int)(Math.random()*10);
			if(number1!=number2)
				break;
		}
		
		System.out.print("Enter your lottery pick(two distinct digits): ");
		int guess=input.nextInt();
		
		
		int guess1=guess/10;
		int guess2=guess%10;
		
		
		System.out.println("The lottery is "+number1+number2);
		
		
		if(guess1==number1 && guess2==number2) {
			System.out.println("Exact match : you win %10.000");
		}else if(guess1==number2 && guess2==number1) {
			System.out.println("Match all digits: you win %3.000");
		}else if(guess1==number1 || guess1==number2 || 
			guess2==number1 || guess2==number2) {
			System.out.println("Match one digit: you win %1.000");
		}else
			System.out.println("Sorry no match");
		
	}

	
}
