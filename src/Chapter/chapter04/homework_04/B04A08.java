package Chapter.Chapter_04.homework_04;

import java.util.Scanner;

public class B04A08 {

		public static void main(String[] args) {
			Scanner input = new Scanner(System.in);
			
			System.out.println("Enter an ASCII code: ");
			
			int ascıı=input.nextInt();
			
			System.out.println("The character for ASCII code " +ascıı + " is " + (char)ascıı);
}
}