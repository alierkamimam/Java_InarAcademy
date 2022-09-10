package Chapter.Chapter_04.homework_04;

import java.util.Scanner;

public class B04A26 {
	public static void main(String[] args) {
		// Create a Scanner
		Scanner input = new Scanner(System.in);

		// Receive the amount
		System.out.print("Enter an amount: ");
		String amount = input.nextLine();
		
		int k = amount.indexOf('.');
		// Find the number of one dollars
		String numberOfOneDollars = amount.substring(0, k);
		String numberofOneCent = amount.substring(k+1);
		
		
		

		// Display results
		System.out.print("Your amount " + amount + " consists of");
		System.out.println("	" + numberOfOneDollars + "  dollars " + numberofOneCent+" cents");
}
}