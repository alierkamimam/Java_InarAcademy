package Chapter.chapter_05.homework_05;

public class exercises11 {
	public static void main(String[] args) {
		
		int count =0;
		final int TEN_PER_LINE=10;
		
		for(int i =100;i<200;i++) {
			if(i%5==0 || i%6==0) {
				count++;
				if(count%TEN_PER_LINE==0) {
					System.out.println(i);
				}else
					System.out.print(i+" ");
			}
		}
	}

}
