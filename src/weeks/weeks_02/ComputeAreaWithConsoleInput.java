package weeks.weeks_02;
import java.util.Scanner ;

public class ComputeAreaWithConsoleInput {
	public static void main (String [] args) {
		// Create a Scanner object
		  Scanner input = new Scanner(System.in);
		  
		// Prompt the user to enter a radius
		  System.out.print("Enter a number for radius: ");
		  double radius = input.nextDouble();
		  
		// Compute area
		  double area = radius * radius * 3.14159;
		  
		  System.out.println("The are for  the circle of radius  " +  radius +
				 " is " + area );
		    
		  
		  
	}
}
