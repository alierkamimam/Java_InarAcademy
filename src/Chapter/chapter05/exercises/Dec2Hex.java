package Chapter.chapter_05.exercises;
import java.util.Scanner;
public class Dec2Hex {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a decimal number:");
		int decimal = input.nextInt();
		
		
		String hex = "";
		int sayac=0;
		while(decimal!=0) {
			int hexValue= decimal %16;
			
			char hexDigit = (hexValue<=9 && hexValue>=0)?
					(char)(hexValue+'0'): (char)(hexValue - 10 + 'A');
			hex =hexDigit+hex;
			decimal= decimal/16;
			sayac++;
		}
		
		
		System.out.println("the number is "+hex);
		System.out.println(sayac);
	}

}
