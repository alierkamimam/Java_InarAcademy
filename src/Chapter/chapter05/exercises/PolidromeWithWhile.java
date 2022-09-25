package Chapter.chapter_05.exercises;
import java.util.Scanner;
public class PolidromeWithWhile {
	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 System.out.println("Enter a string:");
		 String polidrome = input.nextLine();
		 
		 
		 int low =0;
		 
		 int high =polidrome.length()-1;
		 boolean ispolidrome  =true;
		 while(low<high) {
			 if(polidrome.charAt(low)!= polidrome.charAt(high)) {
				ispolidrome=false;
				 break;
			 }
			 low++;
			 high--;
			 
			
		 }	
		 if(ispolidrome) {
			 System.out.println(" This string is polidrome");
			 
		 }else
			 System.out.println("This string is not polidrome");
		 
		 

}
}