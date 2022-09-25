package Chapter.chapter_05.homework_05;

public class exercises06 {
	public static void main(String[] args) {
		
		System.out.println("Miles   Kilometers  |  Kilometers   Miles");
		for(int i= 1, p=20 ;i<11 && p<66;i++,p+=5) {
			System.out.printf("\n%-9d%7.1f    |   %-5d%15.2f " , i,(i*1.609) , p,p/1.609);
	}

}
}