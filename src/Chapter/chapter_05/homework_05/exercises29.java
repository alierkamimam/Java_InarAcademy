package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises29 {
	public static void main(String[] args) {
		
		
		Scanner input=new Scanner(System.in);
		
		System.out.print("Enter a year :");
		int year=input.nextInt();
		
		System.out.println("0:Sunday,1:Monday,....6:Saturday");
		System.out.print("Enter a day: ");
		int day=input.nextInt();
		
		
		int a=1;
		while(a<=12) {
			switch(a) { 
			case 1:System.out.printf("	      January %d		\n",year);break;
			case 2:System.out.printf("\n	      February %d		\n",year);break;
			case 3:System.out.printf("\n	       March %d		\n",year);break;
			case 4:System.out.printf("\n	       April  %d		\n",year);break;
			case 5:System.out.printf("\n		May  %d		\n",year);break;
			case 6:System.out.printf("\n		June  %d		\n",year);break;
			case 7:System.out.printf("\n		July %d		\n",year);break;
			case 8:System.out.printf("\n		August  %d		\n",year);break;
			case 9:System.out.printf("\n		September  %d		\n",year);break;
			case 10:System.out.printf("\n		October  %d		\n",year);break;
			case 11:System.out.printf("\n		November %d		\n",year);break;
			case 12:System.out.printf("\n		December  %d		\n",year);break;
			}
		
		
		System.out.println("---------------------------------------------");
		
			for(int i=0;i<7;i++) {
				switch(i) {
				case 0 :System.out.print("Sun    ");break;
				case 1 :System.out.print("Mon    ");break;
				case 2 :System.out.print("Tue    ");break;
				case 3 :System.out.print("Wed    ");break;
				case 4 :System.out.print("Thu    ");break;
				case 5 :System.out.print("Fri    ");break;
				case 6 :System.out.print("Sun    ");break;
			
				}
				System.out.println();
				day%=7;
				
			for(int j=1;j<=5;j++) {
				for(int b=day;b<=6;b++) {
					System.out.print(" * ");
				
				}
				System.out.println();
		}
		}
		
	a+=1;

}

}}