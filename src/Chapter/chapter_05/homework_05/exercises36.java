package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises36 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		
		while(true) {
		System.out.println("Enter the first 9 digits of an ISBN as integer: ");
		
		int number=input.nextInt();
		int number2=number;
		
		int d9=number%10;
		number/=10;
		
		int d8=number%10;
		number/=10;
		
		int d7=number%10;
		number/=10;
	

		int d6=number%10;
		number/=10;
				

		int d5=number%10;
		number/=10;
				

		int d4=number%10;
		number/=10;
		
		

		int d3=number%10;
		number/=10;
				
		

		int d2=number%10;
		number/=10;
		

		int d1=number%10;
		number/=10;
		
		
		int total=(d1 * 1 + d2 * 2 + d3 * 3 + d4 * 4 + d5 * 5 +
				d6 * 6 + d7 * 7 + d8 * 8 + d9 * 9) % 11;
		
		
		if(total==10) {
			System.out.println(number2+"X");
		}else
			System.out.println(number2+total);
		
				
		
				
		
				
		
		
		
		
		
		
		
		}
		
		
		
		
	
	}

}