package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises46 {
	public static void main(String[] args) {
		
		Scanner input=new Scanner(System.in);
		
		 System.out.println("Enter a string:");
		 String a=input.nextLine();
		 
		 for(int i=0;i<a.length();i++) {
			 System.out.print(a.charAt(a.length()-1-i));
		 }
	}

}
