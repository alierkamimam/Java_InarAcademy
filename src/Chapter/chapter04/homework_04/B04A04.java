package Chapter.Chapter_04.homework_04;
import java.util.Scanner;

public class B04A04 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		final double  PI =Math.PI;
		
		System.out.println("Enter the side value : ");
		double s = input.nextDouble(); // lenght of side
		
		
		double area = (6 * s * s ) / (4 * Math.tan(PI/6));
		
		System.out.printf("The area of the hexagon is %4.2f" , area);
		
		
	}

}
