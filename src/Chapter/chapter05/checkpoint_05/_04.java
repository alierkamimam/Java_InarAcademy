package Chapter.chapter_05.checkpoint_05;
import java.util.Scanner;
public class _04 {
	
	public static void main(String[] args) {
		
	 Scanner input = new Scanner(System.in);
	 System.out.println(" enter a number");
	 int number, max;

	 number = input.nextInt();
	 max = number;
	 
	 while (number != 0) {
	 number = input.nextInt();
	 
	 if (number > max)
	 max = number;
	 }
	 System.out.println("max is " + max);
	 System.out.println("number " + number);

}    /*
System.out.println(" enter a number");
	 int number, max;
	 
	 number = input.nextInt();
	 max = number;
	 
	 do {
		 number = input.nextInt();
	 
		 if (number > max)
			 max = number;
	 
	 }
	 while (number != 0);
	 
	 System.out.println("max is " + max);
	 System.out.println("number " + number);*/
}