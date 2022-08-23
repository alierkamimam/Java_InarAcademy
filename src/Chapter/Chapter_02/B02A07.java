package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A07 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println(" Enter the number of minutes");
		
		long minutes = input.nextLong();
		
		long hours = minutes /60 ;
		
		long days = hours /24 ;
	    long years = days /365;
		days=days%365;
		
		System.out.println(minutes+ "  minutes is approximately " + years + " and " + days+ " days.");
		
	
	
	}

}
