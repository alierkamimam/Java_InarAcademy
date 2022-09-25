package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises47 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter the first 12 digits of an ISBN-13 as a string:");
		String digits=input.nextLine();
		
		//if(digits.length()>12) {
			//System.out.println(digits+" invalid volue :( ");
			//System.exit(0);
			
		
		int sum1=0;
		int sum=0;
		for(int a=0;a<digits.length();a++) {
			char i=digits.charAt(a);
			if(a%2==0) {
				sum+=i;
				
			}else
				sum1+=i*3;
				
		}
		int total =10-(sum1+sum)%10;
		
		if(total==10) {
			System.out.println("The ISBN-13 number is " +digits+""+0);
		}else
			System.out.println("The ISBN-13 number is"+digits+""+total);
		
		
		
		
	}

}
