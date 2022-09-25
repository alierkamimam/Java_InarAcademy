package Chapter.chapter_03;
import java.util.Scanner;
public class B0314 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int coin = (int)(Math.random()*2);
		 
		  System.out.print("Guess the flip of the coin result as integers 0 for head, 1 for tail: ");
		 
		 int guess = input.nextInt();
		 
		 if (coin == guess)
			 System.out.println("Correct answer");
		 else
			 System.out.println("Wrong answer");
		 
		 
		 
		 
		 
	}

}
