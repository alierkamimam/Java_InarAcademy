package Chapter.chapter_05.homework_05;
import java.util.Scanner;
public class exercises02 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		final int TOTALQUASTION= 10;
		int correctCount=0;
		int count =0;
		long startTime = System.currentTimeMillis();
		
		String output =" ";
		
		while(count<TOTALQUASTION){
			int num1= (int)(Math.random()*15);
			int num2= (int)(Math.random()*15);
			
			
			
			
			System.out.println("What is "+num1+" + "+num2+":");
			int result=input.nextInt();
			
			if(result==(num1+num2)) {
				correctCount++;
				System.out.println("You're correct.");
			}else
				System.out.println(" Your answer is wrong\n");
		
		count++;
		
		output += "\n" + num1 + "-" + num2 + "=" + result +
				 ((num1 + num2 == result) ? " correct" : " wrong");
		}
		long endTime = System.currentTimeMillis();
		long testTime= endTime-startTime;
		
		System.out.println("\nCorrect count is " + correctCount +
				 "\nTest time is " + testTime / 1000 + " seconds\n" + output);

}
}