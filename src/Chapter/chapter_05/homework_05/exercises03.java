package Chapter.chapter_05.homework_05;

public class exercises03 {
	public static void main(String[] args) {
		
		System.out.println("Kilograms      Pounds");
		
		for(int i=1 ; i<=199; i+=2) {
			System.out.printf(
					"%-15d%6.1f\n", i, (i * 2.2));  
				
		}
	}

}
