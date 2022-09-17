package Chapter.chapter_05.homework_05;

public class exercises10 {
	public static void main(String[] args) {
		final int TEN_PER_LİNE=10;
		int count=0;

		for (int i = 100; i <= 1000; i++) {
			
			if (i % 5 == 0 && i % 6 == 0) {
				count++;
				
				if (count % TEN_PER_LİNE == 0) 
					System.out.println(i);
				else
					System.out.print(i + " ");
				
			}
			
		}
	
		}
	

}
