package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises31 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a initial deposit amount : ");
	    double deposit=input.nextDouble();
		
		System.out.print("Enter  annual percentage yield : ");
		double percentage=input.nextDouble();
		
		System.out.print
		("Enter maturity period(number of months): ");
		int months=input.nextInt();
		
		System.out.println("\n\nMonth  CD  Value");
		
	
		
		
		for(int i=1;i<=months;i++) {
			
			deposit= deposit + deposit * 5.75 / 1200;
			System.out.printf("%2d .months %.2f \n",i,deposit);
		}
		System.out.println();
		System.out.printf("\nTotal : %.2f",deposit);
				
		
		
	}

}
