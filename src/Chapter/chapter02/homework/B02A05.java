package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A05 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
	
			System.out.println("Enter the subtotal and a gratuity rate:");
			double subtotal = input.nextDouble();
			double gratuity_rate =input.nextDouble();
			double gratuity = subtotal / 100 * gratuity_rate ;
			double total= subtotal + gratuity ;
			System.out.println("The gratuity is $ " + gratuity+ " and total is $ "+ total );
			
					
			
			
			
			
		}

	}

}
