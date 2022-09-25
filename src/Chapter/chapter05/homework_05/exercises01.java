package Chapter.chapter_05.homework_05;
import java.util.Scanner;
public class exercises01 {
	
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a integer integer input ends if it 0:");
		int number = input.nextInt();
		
		double total =0;
		
		int pozitive =0;
		
		int negative=0; 
		
		int count=0;
		
		while(number!=0) {
			if(number>0) 
				pozitive++;
			else 
				negative++;
			
			total+=number;
			count++;
			number  = input.nextInt();
		}
		if(number==0) {
			System.out.println(" no numbers are entered except 0");
			System.exit(1);
		}
			
		double average= total/count;
		
		System.out.println("The number of positives is:"+pozitive+"\n"+
		"The number of negatives is:" + negative+"\n"+ 
				"The total is "+ total+"\n" + "The average is"+ average);
		

	}}
