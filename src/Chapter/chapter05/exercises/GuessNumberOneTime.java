package Chapter.chapter_05.exercises;

import java.util.Scanner;

public class GuessNumberOneTime {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		int number = (int)(Math.random()*101);
		
		System.out.println("Guess a magic number between 0 and 100 ");
		
		while(true) {
		
		System.out.print("Enter your guess:");
		int guess = input.nextInt();
		
		if(guess == number) {
			System.out.println("Yes, the number is " + number);
		}
		else if(guess>number) {
			System.out.println("your guess is too high");
			
		}else
			System.out.println("your guess is too low");
		
		
		
		
		
	}

}}
