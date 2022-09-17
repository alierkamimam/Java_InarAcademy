package Chapter.chapter_05.homework_05;

public class exercises15 {
	public static void main(String[] args) {
		
		int count=0;
		final int TEN_PER_LINE=10;
		
		
		for(int i=33;i<127;i++) {
			count++;
			if(count%TEN_PER_LINE==0) {
				System.out.println((char)i);
			}else
				System.out.print((char)i+" ");
		}
	}

}
