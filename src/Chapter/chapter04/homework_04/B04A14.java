package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A14 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Enter a letter grade: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		if ('A'<=ch && ch<='F' && ch!='E') {
		     switch(ch) {
		     case 'A':System.out.println("The numeric value for grade " + ch+" is 4" );break;
		     case 'B':System.out.println("The numeric value for grade " + ch+" is 3" );break;
		     case 'C':System.out.println("The numeric value for grade " + ch+" is 2" );break;
		     case 'D':System.out.println("The numeric value for grade " + ch+" is 1" );break;
		     case 'F':System.out.println("The numeric value for grade " + ch+" is 0" );break;
		     }
		}else
			System.out.println(ch + " is an invalid grade");
		
	}
}
