package Chapter.checkpoint_03;
import java.util.Scanner;

public class cp6 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter a score : " );
		int score=input.nextInt();
		int pay;
		
		
		if(score>=90) {
			System.out.println("Increases pay by 3%");
			
		}else 
			System.out.println("Increases pay by 1%.");
		
		
		input.close();
			}

}
