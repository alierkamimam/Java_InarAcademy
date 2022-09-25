package Chapter.chapter_03;
import java.util.Scanner;

public class B03A17 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 int number =(int)(Math.random()*3);
		 
		 System.out.println("scissor (0), rock (1), paper (2): ");
		 int guess = input.nextInt();
		
		 
		 if (guess== 1 && number==1 )
		  
			 System.out.println("The computer is rock. You are rock too. It is a draw");
		 else if(guess==0 && number==0)
			 System.out.println("The computer is scissor . You are scissor  too. It is a draw");
		 
		 else if(guess==2 && number==2)
			 System.out.println("The computer is paper . You are paper  too. It is a draw");
		 
			 
		 else if (guess==0 && number==1)
			 System.out.println("The computer is rock. You are scissor. You lost");
		 else if(guess==0 && number==2)
			 System.out.println("The computer is paper. You are scissor. You won");
		 
		 
		 
		 else if (guess==2 && number==1)
			 System.out.println("The computer is rock. You are paper. You won");
		 else if (guess==2 && number==0)
			 System.out.println("The computer is scissor. You are paper. You won");
		 
		 
		 
		 else if (guess==1 && number==2)
			 System.out.println("The computer is paper. You are rock. You lost");
		 else if (guess==1 && number==0)
			 System.out.println("The computer is scissor You are rock. You won");
		 
		 
		 
		 
		 
		 
		 
		 
		 
	}
}
