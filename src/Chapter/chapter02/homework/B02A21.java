package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A21 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter investment amount: ");
		double amount= input.nextDouble();
				
		System.out.print("Enter annual interest rate in percentage: ");
		double interestrate= input.nextDouble();
		
		
		System.out.print("Enter number of years: ");
		double years=input.nextDouble();
		
		
		//futureInvestmentValue =investmentAmount * (1 + monthlyInterestRate)^numberofyears*12
		double futureinvestmentvalue ;
		futureinvestmentvalue = amount * Math.pow((1+(interestrate/1200)), years*12);
		
		System.out.println("Accumulated value is " + futureinvestmentvalue);
		
		
		
	
	}

}
