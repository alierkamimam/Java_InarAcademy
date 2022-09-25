package Chapter.checkpoint_03;
import java.util.Scanner;

public class cp12 {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);	
		
		System.out.println(" enter a count: ");
		int count= input.nextInt() ;
		boolean newLine =(count %10==0);
		
		System.out.println(newLine);
		
		
				
	}

}
