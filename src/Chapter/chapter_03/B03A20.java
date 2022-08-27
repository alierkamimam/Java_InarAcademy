package Chapter.chapter_03;

import java.util.Scanner;

public class B03A20 {
		public static void main (String[] args) {
			Scanner input = new Scanner(System.in);
	
			System.out.print("Enter the temperature in Fahrenheit between -58°F and 41°F: ");
			
			double Ta = input.nextDouble(); // Ta is the outside temperature measured in degrees Fahrenheit
			if (!(-58<Ta && Ta<41)) {
				System.out.println("Input is  invalid ");
				return;}
				
				
			System.out.print("Enter the wind speed (>=2) in miles per hour: ");
			
			int v =input.nextInt();  //  v is the speed measured in miles per hour
			
			if (!(v>2)) {
				System.out.println("Input is  invalid ");
				return;}
				
			double Twc ;
	
			Twc = 35.74 + (0.6215 * Ta) - (35.75 * Math.pow(v,0.16)) + (0.4275 * Ta * Math.pow(v, 0.16));
	
			System.out.println("The wind chill index is " + Twc );
    
}
}
		

