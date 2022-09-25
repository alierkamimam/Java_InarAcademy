package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A09 {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a character : ");
		
		String a = input.nextLine();
		 if (a.length()!=1) {
			 System.out.println("Enter a valid character");
		 }
		 
		 char b = a.charAt(0);
		  System.out.println("The unicode for the character " + b + " is "+(int)b);
		
	
}
}
