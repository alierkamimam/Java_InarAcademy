package weeks.weeks_03;
import java.util.Scanner;
public class Question_1 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 System.out.println(" Enter your salary: ");
		 double salary = input.nextDouble();
		 System.out.println("How long years working company? ");
		 int year= input.nextInt();
		 
		 if (year>5) {
			 ;
			 System.out.println("Your salary is "+((salary*0.05)+salary) );
		 } else
			 System.out.println("Your salary is " + salary);
			 
		 
		 
		 
		 
		
	}
}
