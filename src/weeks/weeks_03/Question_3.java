package weeks.weeks_03;
import java.util.Scanner;
public class Question_3 {
	public static void main(String[] args) {
		Scanner input= new Scanner(System.in);
		
		
		System.out.println("Enter  four number : ");
		String number = input.nextLine();
		
		char a1 = number.charAt(0);
		char a2 = number.charAt(1);
		char a3 = number.charAt(2);
		char a4 = number.charAt(3);
		
		System.out.println(a4 +""+ a3 +""+ a2 +""+ a1 );
	}

}
