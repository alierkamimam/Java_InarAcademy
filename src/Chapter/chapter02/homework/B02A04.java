package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A04 {

	public static void main(String[] args) {
		try (Scanner input = new Scanner(System.in)){
			System.out.println("Enter a number in pounds:");
			
			double pound= input.nextDouble();
			double kilogram= (pound * 0.454); // ONE POUND IS 0.454
			
			System.out.println(pound + " pound is " + kilogram + " kilograms ");
					
		}

	}

}
