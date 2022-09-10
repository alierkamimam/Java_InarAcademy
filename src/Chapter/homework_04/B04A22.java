package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A22 {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter string s1: ");
		String s1 =input.nextLine();
		
		
		System.out.println("Enter string s2: ");
		String s2 =input.nextLine();
		
		boolean a =
				s1.contains(s2);
		System.out.print(s2+ " is "+((a)? "  a substring " : " not a substring "  ));

        System.out.println(" of "+s1);

}}