package Chapter.chapter_05.exercises;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		System.out.println("                MultiplicationTable");
		
	    System.out.print("    ");
		for(int j =1; j<=9; j++) 
			System.out.print("   " + j);
			
		System.out.println("\n---------------------------------------------");
		
		for(int i= 1; i<=9;i++) {
			System.out.print(i+" | ");
			for(int j=1 ;j<=9; j++) {
				System.out.printf("%4d" , i*j);
				
			}System.out.println();
		}
		
		
		}
			
			
			
		}



