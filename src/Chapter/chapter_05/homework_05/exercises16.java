package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises16 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		
		System.out.println("Enter a number:");
		int number=input.nextInt();
		int index=2;
		
		while(number/index!=1) {
			if(number%index==0) {
				System.out.print("divisors of numbers are " +index+" ");
				number/=index;
				
			}else
				index++;
		
		}
		
		System.out.print(number+"");
	}

}
