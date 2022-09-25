package Chapter.Chapter_04.homework_04;
import java.util.Scanner;
public class B04A24 {
public static void main(String[] args) {
		
		Scanner input= new Scanner(System.in);
		
		System.out.println("Enter three city name :");
		String a=input.next();
		String b= input.next();
		String c=input.next();
		
		String city1=a.toUpperCase();
		String city2=b.toUpperCase();
		String city3=c.toUpperCase();
	
		if(city1.compareTo(city2)<0 && city2.compareTo(city3)<0) {
			System.out.println("The cities in alphabetical order are "+ city1 + " " +city2+" "
					+city3);
		}
		else if(city1.compareTo(city2)<0 && city3.compareTo(city2)<0 && city1.compareTo(city3)< 0) {	
			System.out.println("The cities in alphabetical order are" + city1 + " " +city3+" "
					+city2);
		}else if(city2.compareTo(city1)<0 && city2.compareTo(city3)<0 && city1.compareTo(city3) < 0){
			System.out.println("The cities in alphabetical order are "+ city2+ " " +city1+" "
					+city3);
		}else if (city2.compareTo(city1)<0 && city2.compareTo(city3)<0 && city3.compareTo(city1)<0) {
			System.out.println("The cities in alphabetical order are "+ city2+ " " +city3+" "
				+city1);
		}else if (city3.compareTo(city1)<0 && city1.compareTo(city2)<0 && city3.compareTo(city2)<0) {
			System.out.println("The cities in alphabetical order are "+ city3+" "+city1+" " +city2);
			
					
		}else if (city3.compareTo(city2)<02 && city3.compareTo(city1)<0 && city3.compareTo(city2)<0) {
			System.out.println("The cities in alphabetical order are "+ city3+" "+city2+" " + city3);
		}
		
				
}
}