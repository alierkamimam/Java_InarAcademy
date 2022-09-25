package Chapter.Chapter_02;
import java.util.Scanner;
public class B02A14 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter weight in pounds: ");
		double weight=input.nextDouble();
		weight= weight *  0.45359237 ; // one pound is 0.45359237 kilograms
	  

		System.out.print("Enter height in inches:");
		double height = input.nextDouble(); 
		height = height * 0.0254; //one inch is 0.0254 meters
		
		double BMI = weight / (height * height);
		System.out.println("BMI is " + BMI);
		
		
	}
}
