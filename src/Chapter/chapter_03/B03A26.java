package Chapter.chapter_03;
import java.util.Scanner;
public class B03A26 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("Enter a integer:");
		 int number =input.nextInt();
		 
		 
		 System.out.println("Is " + number + " divisible by 5 and 6? "
					+ ((number%5 == 0 && number%6 == 0)?true:false));
		 

		 System.out.println("Is " + number + " divisible by 5 and 6? "
					+ ((number%5 == 0 || number%6 == 0)?true:false));
		 

		 System.out.println("Is " + number + " divisible by 5 and 6? "
					+ ((number%5 == 0 ^ number%6 == 0)?true:false));
		 
		 
	}

}
