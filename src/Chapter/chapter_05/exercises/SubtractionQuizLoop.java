package Chapter.chapter_05.exercises;
import java.util.Scanner;
public class SubtractionQuizLoop {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		String  report = "";
		int count = 0;
		int correctCount = 0;
		int wrongCount =0;
		long startTime = System.currentTimeMillis();
		while(count<5) {
			int number1 = (int)(Math.random()*10);
			int number2 = (int)(Math.random()*10);
			
			if (number1<number2) {
				int temp=number1;
				number1=number2;
				number2=temp;
				
				
			}
			System.out.println(number1+ " - "+number2+ " = ?") ;
			int answer =input.nextInt();
			
			if (number1-number2==answer)
			{
				System.out.println(" your answer is correct");
				correctCount++;
				report+= number1+" - "+number2+" = "+answer + " correct\n";
			}
			else {
				System.out.println("your answer is wrong");
				wrongCount++;
				report+= number1+" - "+number2+" = "+answer + " wrong\n";
				
			}
			count++;
		}
		long endTime =System.currentTimeMillis();
		long testtime= endTime - startTime;
		System.out.println(" the time "+testtime/1000 +"seconds");
		System.out.println(correctCount+" correct answer ");
		System.out.println(wrongCount+" correct answer ");
		System.out.println(report);
		
		
		
		
		
		
	}

}
