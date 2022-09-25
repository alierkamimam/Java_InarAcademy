package Chapter.chapter_05.homework_05;
import java.util.Scanner;
public class exercises09 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int max;
		int max1 = 0;
		String s1="";
		String s2="";
		//TODO		
		System.out.println("Enter number of students :");
		int students=input.nextInt();
		for(int i =1;i<=students;i++) {
			System.out.println("Enter student's name :");
			String name= input.next();
			
			System.out.println("Enter score of student:");
			int score=input.nextInt();
			max=score;
			s1=name+" "+max;
			
			
			if(score>max) {
				max1=max;
				
				s2=name+" "+max1;
			}
			
		}
		
		
		System.out.println("1:"+s2);
		System.out.println("2:"+s1);
		
		
	}

}