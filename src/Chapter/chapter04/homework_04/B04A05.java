package Chapter.Chapter_04.homework_04;
import java.util.Scanner;

public class B04A05 {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		final double  PI =Math.PI;
		
		
		System.out.println("Enter the number of sides: ");
		double n = input.nextDouble();
		
		System.out.println("Enter the side: ");
		double s = input.nextDouble();
		
		double area = (n * s * s) /(4 * Math.tan(PI/n) );
		
		System.out.println("The area of the polygon is" +area);
}
}
