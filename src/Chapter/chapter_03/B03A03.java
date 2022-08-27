package Chapter.chapter_03;
import java.util.Scanner;

public class B03A03 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a, b, c, d, e, f:");
		double a=input.nextDouble();
		double b=input.nextDouble();
		double c=input.nextDouble();
		double d=input.nextDouble();
		double e=input.nextDouble();
		double f=input.nextDouble();
		double x = 0 ;
		double y =0;
	
	
	if((a*d - b*c)==0)
		System.out.println("The equation has no solution ");
	else
		x =(e*d -b*f)/(a*d-b*c);
	    y =(a*f - e*c) /(a*d- b*c);	
	    System.out.println(" x is " + x + " y is "+ y);
		
		
	}	

}
