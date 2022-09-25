package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises45 {
public static void main(String[] args) {
	Scanner input=new Scanner(System.in);
	
	double sum1=0;
	double sum=0;
	
	System.out.println("enter a number");
	for(int i=1;i<=10;i++) {
	
		double number=input.nextDouble();
		sum+=number;
		sum1+=number*number;
		
	}	
	 double mean=sum/10;
	 double deviation =(sum1-((sum*sum)/10))/10-1;
		System.out.println("The mean is" +mean);
		System.out.println("The standard deviation is"+Math.pow(deviation,0.5));
	}
}

