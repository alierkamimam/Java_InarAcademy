package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A23 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the driving distance: ");
		double distance = input.nextDouble(); //driving distance
		
		
		System.out.print("Enter miles per gallon: ");//miles per gallon
		double gallon = input.nextDouble();
		
		System.out.print("Enter price per gallon: ");//price per gallon
		double price = input.nextDouble();
		
		
	    double costofDriver= ( distance / gallon ) * price ;
	    
	    System.out.println(" The cost of driving is $ " + (int)(costofDriver *100 )/100.0);
				
				
				
				
		
	}

}
