package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A22 {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Erter an amount , for example 1156  ");
		
		int amount = input.nextInt();		
	    int numberOfDollars = amount /100;
	    int remaining =amount%100;
	    
	    System.out.println("Your amount consist of  " +  numberOfDollars +
	    		" dollars " + remaining + " cent ");
				
		
		
		
		
		
		
	}
}
