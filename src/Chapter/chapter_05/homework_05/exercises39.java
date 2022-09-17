package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises39 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		double sum=0;
		//System.out.println(" ");
		for(double i=0.01;sum<30000;i++) {
		
			if(i<5.000) {
			sum=i*0.08;
			}else if(i<10000) {
				sum=5000*0.08+(i-5000)*0.10;
			}else
			sum=5000*0.08+(i-5000)*(0.10+i-10000)*0.12;
			System.out.println(i);
		}
	
	System.out.println(sum);
	//stem.out.println(i);
		
	}
		
	
		
		
		
		
		
		
		
	}

