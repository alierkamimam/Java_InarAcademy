package Chapter.chapter_05.exercises;



public class _04 {
	public static void main(String[] args) {
		double salary = 10000;
	
		int year =0;
		
		while(salary<20000) {
			salary= salary*1.07;
			year++;
		}
		System.out.println("salary will be doubled in "+year+ " years ");
		System.out.printf("salary will  be $%.2f in %1d years", salary ,year);
	}

}
