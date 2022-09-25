package Chapter.chapter_03;
import java.util.Scanner;
public class B03A10 {
	
		 public static void main(String[] args) {
			 Scanner input = new Scanner(System.in);
			 

			 int number1 = (int)(Math.random() * 100);
			 int number2 = (int)(Math.random() * 100); 
			 System.out.println("What is  "+  number1+ " + " + number2 +" ="   );
			 
			 
			 int guess = input.nextInt();
			 
			if (number1+number2==guess) {
				System.out.println("you're correct");
				
			}else
				System.out.println("your answer is wrong");
			 
		 }
}
