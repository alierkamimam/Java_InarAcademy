package Chapter.chapter_05.homework_05;
import java.util.Scanner;
public class exercises08{
	
public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int max;
		int count=1;
		String total ="" ;
		System.out.println("Enter number of students: ");
		int number = input.nextInt();
		
		while(count<number) {
		System.out.println("Enter student's name: ");
		String name = input.next();
		
		System.out.println("Enter student's score:");
		int score= input.nextInt();
		max=score;
			
				
				
			
			if(score>max) { 
				max=score;
			
			}
				total=name+" "+max;
			
			
			
		count++;
		
		}
		System.out.println(total);
		}
		
}
		

