package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises41 {
	public static void main(String[] args) {
		
	
	
	Scanner input=new Scanner(System.in);
	
	System.out.print("Enter numbers:");
	int max=input.nextInt();
	int number=1;

	int count=1;
	
	while(number>0) {
		number=input.nextInt();
		 
		 if(number>max) {
			 max=number;
			 count=1;
		 }else if(number==max) {
			 count++;
					
			 
			 
		 }
	}
	System.out.println(" The largest number is "+ max);
	System.out.println("The occurrence count of the largest number is "+count);
		
	
	
	}
	

}
