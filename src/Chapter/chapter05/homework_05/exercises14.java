package Chapter.chapter_05.homework_05;
import java.util.Scanner;
public class exercises14 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter two numbers:");
		int num1=input.nextInt();
		int num2=input.nextInt();
		
		
		if(num1<0&& num2<0) {
			System.out.println("Please enter two positive numbers");
		System.exit(0);
		}
		int gcd=0;
		//int min=Math.min(num1, num2)-1;
		
		for( int min=Math.min(num1, num2); min<=num1 &&  min<=num2 && min!=0;min--) {
			if(num1%min==0 && num2%min==0) {
				gcd=min;
				System.out.println(min);
				
					break;
				}
				
			}
			
		}
	}
	
	


