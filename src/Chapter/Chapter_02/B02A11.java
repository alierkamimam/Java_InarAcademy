package Chapter.Chapter_02;
import java.util.Scanner;

public class B02A11 {
	public static void main (String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the number of years:");
		
		int years= input.nextInt();
		int population =(312032486 + years * (365 * 60 *60* 24 /7  ) - (365 * 60* 60 *24 /13) - (365 * 60 *60 * 24 /45));
		System.out.println(" The population in  " + years + " years is " + population);
		
		
		input.close();
		
	}
		

}
