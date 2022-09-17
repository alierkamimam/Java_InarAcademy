package Chapter.chapter_05.homework_05;

public class exercises40 {
	public static void main(String[] args) {
		
		
		int i=1;
		while(i<1000000) {
			int headorTails=(int)(Math.random()*2);
		
			switch(headorTails) {
			case 0:System.out.println("Head");break;
			case 1:System.out.println("Tails");
			
		}
			i++;
		
		
	}

}
}