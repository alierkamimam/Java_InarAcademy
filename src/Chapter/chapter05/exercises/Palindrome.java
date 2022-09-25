package Chapter.chapter_05.exercises;
import java.util.Scanner;
public class Palindrome {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string :");
		String polidrome = input.nextLine();
		
		
		boolean isPolidrome= true;
		
		for(int i=0, j=polidrome.length()-1 ; i<j ; i++, j--) {
			char s1 = polidrome.charAt(i);
			char s2= polidrome.charAt(j);
			if(s1!=s2) {
				isPolidrome=false;
			}
			
		}if(isPolidrome) {
			System.out.println(" this string is polidrome");
		}else
			System.out.println(" this string is not polidrome ");
		
	}

}