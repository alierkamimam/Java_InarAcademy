package Chapter.checkpoint_03;
import java.util.Scanner;

public class cp8{
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);	
		System.out.print("enter x , y numbers:");
		int x =input.nextInt();
		int y =input.nextInt();
		int z;
		
		if(x>2) {
			if(y>2) {
				z=x+y;
				System.out.println("z is "+ z);
			}
			
		}else
			System.out.println("x is " + x);
		
	
			
	}

}
