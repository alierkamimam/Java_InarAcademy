package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises38 {
	public static void main(String[] args) {
		
	
	Scanner input=new Scanner(System.in);
	
	
	System.out.println("Enter a decimal value: ");
	int decimal=input.nextInt();
	String oct="";
	
	for(int i=decimal;i>0;i/=8) {
		oct=(i%8)+oct;
		
		
	}
System.out.println("The binary value of the decimial \"" + decimal + "\" is: " + oct);
	
	


}
}