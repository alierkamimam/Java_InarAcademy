package Chapter.chapter_05.exercises;
import java.util.Scanner;
public class SentinelValue {

	public static void main(String[] args) {
	
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter an integer (the input ends  if it is 0)");
		int number = input.nextInt();
		
		int sum =0;
	
		while(number!=0) {
			sum+=number;
			
			System.out.println("Enter an integer (the input ends  if it is 0)");
			number = input.nextInt();
			
		}		
			System.out.println(" the sum is "+sum);
	}

}
