package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A13 {

	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		System.out.println("Enter a letter :");
		String letter =  input.nextLine();
		
		char ch =letter.charAt(0);
		//System.out.println(a);
		
		if (65<=ch && ch>=90 || ch<=97 && ch>=122) {
			if (ch=='a' || ch=='e' || ch=='i' || ch=='ı' || ch=='o' || ch=='ö' || ch=='u' || ch=='ü'
			   ||  ch=='A' || ch=='E' || ch=='I' || ch=='İ' || ch=='O' || ch=='Ö' || ch=='U' || ch=='Ü') {
				System.out.println(ch + " is  a vowel");
			}
			else
				System.out.println(ch + " is a constant");
				
	    		
		}else
			System.out.println(ch + " is an invalid input");
		
		
		
		

}
}