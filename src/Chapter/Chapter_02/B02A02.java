package Chapter.Chapter_02;
import java.util.Scanner ;

public class B02A02 {
	public static void main(String[] args) { 
		System.out.println("Enter the radius and length of a cylinder:");
		try (Scanner input = new Scanner(System.in)) {
			final double PI = 3.14159;
			double radius=input.nextDouble();
			double lenght=input.nextDouble();
			
			double area = radius * radius * PI;
			double volume= area*lenght ;
			System.out.println("The area is=  "+ area);
			System.out.println("The volume is=  " + volume );
		}
	}
	

}
