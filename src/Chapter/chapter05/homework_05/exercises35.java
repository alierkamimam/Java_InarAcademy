package Chapter.chapter_05.homework_05;

public class exercises35 {
	public static void main(String[] args) {
		
		
		double sum =0;
		for(int i=1;i<625;i++) {
			sum+=1/(i+Math.pow(i+1, 0.5));
		
		}
		System.out.println(sum);

		
	}

}
