package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A10 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		 
		System.out.print("Enter the amount of water in kilograms: ");
		double kilograms= input.nextDouble();
		
		System.out.print("Enter the initial temperature: ");
		double initialtempature=input.nextDouble();		
		
		System.out.print("Enter the final temperature: ");
		double finaltempature = input.nextDouble();
		
		double 	Q ;
		Q = kilograms * ( finaltempature - initialtempature) * 4184 ;
				 
		System.out.println("The energy needed is " + Q  );
	}

}
