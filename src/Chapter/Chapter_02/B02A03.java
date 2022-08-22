package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A03 {
	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			
			System.out.println("Enter a value for feet:");
			double feet=input.nextDouble();
			
			System.out.println(feet + " feet is " +(feet*0.305));
			 
		
			
					}
		
		
		
	}
	
}
