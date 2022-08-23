package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A12 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter speed and acceleration:");
		
		double v = input.nextDouble(); // speed
		double a= input.nextDouble();//acceleration
		double lenght;
		
		lenght= Math.pow(v, 2)  / (2 * a)  ;
		
		System.out.println("The minimum runway length for this airplane is " + lenght);
		
		input.close();
		
	}

}
