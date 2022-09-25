package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises50 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=input.nextLine();
		
		int sum=0;
		
		for(int a=1;a<str.length();a++) {
			char b=str.charAt(a);
			if(Character.isUpperCase(b)) {
				sum++;
				
				
			}
			
		}
		System.out.println("The number of uppercase letters is "+sum);
	}

}
