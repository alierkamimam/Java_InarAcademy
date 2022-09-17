package Chapter.chapter_05.checkpoint_05;

import java.util.Scanner;

public class _10 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number ,sum=0 ,count;
		
		for(count =0 ; count<5 ; count++) {
			System.out.print(" Enter a number: ");
			number=input.nextInt();
			sum+=number;
		}
		System.out.println("sum is " + sum);
		System.out.println("count is "+count);

	}

}
