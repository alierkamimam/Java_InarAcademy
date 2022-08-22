package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A06 {
	public static void main(String[] args) {
	try (Scanner input = new Scanner(System.in)){
		System.out.println("Enter a number between 0 and 1000:");
		int digit = input.nextInt();
		int firstdigit = digit /100 ;
		int remaing = digit % 100;
		int seconddigit = remaing/10;
		int thirddigit  = remaing%10;
		
		int sum = (firstdigit + seconddigit +thirddigit);
		System.out.println("The sum of the digits is " + sum);
				
		
			
		
		
		
		
	}
}
}