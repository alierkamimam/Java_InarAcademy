package Chapter.chapter_03;
import java.util.Scanner;

public class B03A08 {
	public static void main(String[] args) {
		  Scanner input = new Scanner(System.in);
		  System.out.print("Enter three number:");
		  
		  
		  int number1=input.nextInt();//1   1	2 	2	3	3
		  int number2=input.nextInt();//2	3	1 	3	1	2			
		  int number3=input.nextInt();//3	2	3 	1	2	1
		  int temp; 
		  
		  if(number1 >number2 && number2>number3) {
			  System.out.println( number1+ " , "+number2+ " , "+  number3 );
		  }
		 else if( number3>number2 && number3<number1) {	// num2<num3<num1  
		  temp=number3;
		  number3=number2;
		  number2= temp ;
		  System.out.println( number1+ " , "+number2+ " , "+  number3 );
	     } 
		 else if(number1<number2 && number1>number3) {
			 temp=number2;
			 number2=number1;
			 number1=temp;
			 System.out.println( number1+ " , "+number2+ " , "+  number3 );
		 }
		  
		 else if(number2<number1 && number2<number3 && number1<number3){
			 temp=number3;
			 number3=number1;
			 number1=temp;
			 
			 temp=number3;
			 number3=number2;
			 number2=temp;
			 System.out.println( number1+ " , "+number2+ " , "+  number3 );
		 }
		 else if (number1<number2 && number1<number3 && number2<number3) {  //    3     1    2
		     temp=number2;
			 number2=number1;
			 number1=temp;
			 
			 temp=number3;
			 number3=number2;
			 number2=temp;
		 }
		 else {
			 System.out.println(number3+"," +number2 + "," +number1 );
	     }
			 

		 
		 
	
		  
	

	
			 
			 
		  
		
		  
		  
	
		  
		  
		  
}
		  
}
