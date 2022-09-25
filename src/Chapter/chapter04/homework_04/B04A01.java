package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A01 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		final double  PI =Math.PI;
		
		System.out.println("Enter the length from the center to a vertex: ");
		double vertex = input.nextDouble();
		
		double s = 2 * vertex * Math.sin(PI/5); // s is the lenght of a side
		
		double area = (5 * s * s ) / (4 * Math.tan(PI/5));
		
		
		System.out.printf("The area of the pentagon is %4.2f " , area);
		
		
		
		
		
		
		
		
		
		
		
}
}
