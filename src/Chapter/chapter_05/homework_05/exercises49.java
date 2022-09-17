package Chapter.chapter_05.homework_05;

import java.util.Scanner;

public class exercises49 {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		
		System.out.println("Enter a string: ");
		String str=input.nextLine().toLowerCase();
		
		int sum=0;
		int sum1=0;
		for(int i=0;i<str.length();i++) {
			
			char a=str.charAt(i);
			
			if(a=='a'||a=='e'||a=='ı'||a=='i'||a=='o'||a=='ö'||a=='u'||a=='ü') {
				sum++;
			}else
				sum1++;
		}
		System.out.println("The number of vowels is "+sum);
		System.out.println("The number of consonants is "+sum1);
	}

}
