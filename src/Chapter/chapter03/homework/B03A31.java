package Chapter.chapter_03;
import java.util.Scanner;
public class B03A31 {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		
		 
		 
		 System.out.println("Enter the exchange rate from dollars to RMB: ");
		 double rate = input.nextDouble();
		 
		 System.out.println("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		 int choise =  input.nextInt();
		 
		 if (choise ==0) {
			 System.out.println("Enter the dollar amount:");
		 		double dollars= input.nextInt();
		 		System.out.print("$" +dollars + " dollars is " );
		 		dollars*=rate;
		 		System.out.println(dollars+" yuan" );
		 
		
		
	}else if(choise == 1) {
			System.out.println("Enter the RMB amount:");
		    double rbm= input.nextInt();
		    System.out.print(rbm + " yuan is " );
		    rbm/=rate;
		    System.out.println(rbm+"dollar" );
	} else
		System.out.println("Incorrect input");
		    	
		 
		 
		 
		 
	}

}
