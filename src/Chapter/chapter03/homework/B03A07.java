package Chapter.chapter_03;
import java.util.Scanner;
public class B03A07 {
	

	
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  
		  System.out.println("Enter an amount in double, for example 11,56: ");
		  double amount = input.nextDouble();
		  
		  int remainingAmount= (int)(amount*100);
		  
		  
		  int numberOFDollar= remainingAmount /100;
		  remainingAmount= remainingAmount%100;
		  
		  int numberOFAQuarter= remainingAmount /25;
		  remainingAmount=remainingAmount%25;
		  
		  int numberOFDimes=remainingAmount/10;
		  remainingAmount=remainingAmount%10;
		  
		  
		  int numberOFNikels=remainingAmount/5;
		  remainingAmount= remainingAmount%5;
		  
		  int numberOFPennies =remainingAmount;
		  
		  if (numberOFDollar == 0) { 
			  System.out.println("please enter a valid value:");
			  return;
		  }
		   
		 if (numberOFDollar	==1 && numberOFPennies==1){
			 System.out.println(numberOFDollar +" dolar " + numberOFPennies +" pennie ");
		 } else
			System.out.println(numberOFDollar + " dollars "+ numberOFAQuarter+" quarter " +numberOFDimes+ " dimes "+
		numberOFNikels+ " nikels " +numberOFPennies+ " pennies " );
		 
		 
	
		 
			  
		  
		  
		  
				  
	}
}
