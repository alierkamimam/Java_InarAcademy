package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises48 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String a=input.nextLine();
		
		String c="";
		for(int i=0; i<a.length();i++) {
			char b=a.charAt(i);
			if(i%2==0) {
				c+=b;
				
				
			}
			
			
		}
		System.out.println(c);
		
	}

}
