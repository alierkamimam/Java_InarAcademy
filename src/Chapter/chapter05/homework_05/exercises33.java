package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises33 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int i=6;
		int index=2;
		while(i<=10000){
			while(i/index!=1) {
				if(i%index==0) {
					i/=index;
					
				}else
					index++;
				System.out.println();
			}
			
		}
		
		
	}

}
