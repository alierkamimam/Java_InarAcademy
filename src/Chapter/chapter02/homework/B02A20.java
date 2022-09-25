package Chapter.Chapter_02;
import java.util.Scanner;
public class B02A20 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter balance and interest rate (e.g., 3 for 3%): ");
		int balance = input.nextInt();
		double interestrate=input.nextDouble();
		
		double interest;
		interest= balance *(interestrate / 1200);
		
		System.out.println("The interest is " + interest);
		 
		input.close();
	
	
	
	}

}
