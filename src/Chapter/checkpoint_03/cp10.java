package Chapter.checkpoint_03;
import java.util.Scanner;
public class cp10{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		 System.out.println("Enter a score: ");
		int score= input.nextInt();
		
		
		if (score>=90){
			System.out.println("A");
			
		}else if(score>=80)
			System.out.println("B");
		else if(score>=70)
			System.out.println("c");
		else if(score>=60)
			System.out.println("D");
		else
			System.out.println("f");
			
		
		
	}


}
