package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises34 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		

		int pc = 0 , gamer=0;
		while(Math.abs(pc - gamer) <= 2) {

			System.out.println("enter a value(0:cissor 1:rock 2: paper");
			int value=input.nextInt();
			
		
			
			int pcvalue=(int)(Math.random()*3);
			System.out.println(pcvalue);
		

			
				if((pcvalue==0 && value==2) || (pcvalue==1 && value==0)||(pcvalue==2 && value==1)){
				System.out.println("you lost");
				pc+=1;
				}
				else if((value==0 && pcvalue==2) ||(value==1 && pcvalue==0)||(value==2 && pcvalue==1)){
				System.out.println("you won");
				gamer+=1;
				
			}else {
				System.out.println("too, It is a draw");
				
				}
					
				}
			
			System.out.println("pc :"+pc+"you :"+gamer);
			}
		
				
		}
		
		
	


