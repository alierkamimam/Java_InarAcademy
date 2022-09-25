package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A15 {
	public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter a letter: ");
		String letter = input.nextLine();
		char ch = letter.charAt(0);
		char ch1= Character.toUpperCase(ch);
		
		if( 'A'<=ch && ch<='Z' ||
			'a'<=ch && ch<='z') {
			if (ch1=='A'|| ch1=='B'|| ch1 =='C') {
				System.out.println("The corresponding number is  2 "   );
			}
			else if (ch1=='D'|| ch1=='E'|| ch1 =='F') {
				System.out.println("The corresponding number is  3 "   );
				
			}else if (ch1=='G'|| ch1=='H'|| ch1 =='İ' || ch1=='I') {
				System.out.println("The corresponding number is  4 "   );
		
			}else if (ch1=='J'|| ch1=='K'|| ch1 =='L') {
				System.out.println("The corresponding number is  5 "   );
		
				
			}else if (ch1=='M'|| ch1=='N'|| ch1 =='O' ||  ch1 =='Ö') {
				System.out.println("The correspondin g number is  6 "   );
		
				
			}else if (ch1=='P'|| ch1=='R'|| ch1 =='S'  || ch1 =='Ş' || ch1=='Q') {
				
				System.out.println("The corresponding number is  7"   );
		
		
			}else if (ch1=='T'|| ch1=='U'|| ch1 =='Ü' || ch1=='V') {
				System.out.println("The corresponding number is  8 "   );
		

			}else if (ch1=='W'|| ch1=='Y'|| ch1 =='Z' || ch1=='X')
				System.out.println("The corresponding number is  9 "   );
		
	
		else {
			System.out.println(ch + " is an invalid input");
		}
				
				
		
		
			
		
		
		
		
		}

}
}