package Chapter.Chapter_02;
import java.util.*;

public class B02A13 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		double sum = 0;
		System.out.println("Enter the monthly saving amount: ");
		
		int amount = input.nextInt();
		
		double interestrate = 0.05 /12 ;
		
		sum=(sum+amount)*(1+interestrate);
		sum=(sum+amount)*(1+interestrate);
		sum=(sum+amount)*(1+interestrate);
		sum=(sum+amount)*(1+interestrate);
		sum=(sum+amount)*(1+interestrate);
		sum=(sum+amount)*(1+interestrate);
		
		System.out.println("After the sixth month, the account value is " + sum);
		
	}
		
		
	

}
