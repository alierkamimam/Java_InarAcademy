package Chapter.chapter_03;
import java.util.Scanner;
public class B03A12 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter a three-digit integer :");
		 int number = input.nextInt();
		 
		int  d3=number %10;
		int d1 =number/100;
		
		if (d1==d3) {
			System.out.println(number+" is a palindrome ");
		}else
			System.out.println(number +" is not a palindrome ");
				
		
		 
		 
		 
	}

}
