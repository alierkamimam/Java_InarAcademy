package Chapter.Chapter_04.Exercises;
import java.util.Scanner;
public class ex7 {
	public static void main(String[] args ) {
		Scanner input = new Scanner(System.in);
		
	
		String s1 = input.next();
		String s2 = input.next();
		String s3 = input.next();
		
		System.out.println("s1 is "+s1);
		System.out.println("s2 is "+s2);
		System.out.println("s3 i  "+s3);
		
		
		System.out.println("Enter a line: ");
		String s = input.nextLine();
		System.out.println("The line entered is " + s);
		
	}

}
