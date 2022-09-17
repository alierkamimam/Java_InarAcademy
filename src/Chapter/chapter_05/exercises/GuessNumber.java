package Chapter.chapter_05.exercises;

import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) {
		int number = (int)(Math.random()*101);
		
		Scanner input=new Scanner(System.in);
		
		int guess = -1; 
		while(guess != number) {
			System.out.println("Enter a number between 0 and 100 : ");
			 guess = input.nextInt();
			 
			 if (guess == number) {
				 System.out.println("your answer is correct");
			 }else if ( guess > number ) {
				 System.out.println("number is too high");
				
			 }else
				 System.out.println("number is too low");
		}
		

	}

}
