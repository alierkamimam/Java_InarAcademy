package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises30 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		
		System.out.print("How much dollar can save each month? ");
		int money=input.nextInt();
	
		System.out.print(" Enter number of months: ");
		int month =input.nextInt();
		
		final double INTEREST_RATE=(0.00417);
		double sum=0;

	
		for(int i=1;i<=month;i++) {
			sum=(money+sum)*(1+0.00417);
		
				System.out.printf(i+".month: %.3f \n",sum);
			}
		System.out.printf("Total saving : %.3f",sum);
		
		
		
		
		
		
	}

}
