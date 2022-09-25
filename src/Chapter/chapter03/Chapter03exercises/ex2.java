package Chapter03exercises;
import java.util.Scanner;
public class ex2 {
	public static void main(String[] args) {
		int sayı1 = (int)(Math.random() *10);
		int sayı2=(int)(Math.random() *10);
		
		System.out.println(sayı1 + "+" +sayı2 + "=?");
		
		Scanner input = new Scanner(System.in);
		
		int toplam = input.nextInt();
		
		if (sayı1+sayı2 == toplam) {
			System.out.println("doğru cevap");
			
		}else {
			System.out.println("yanlış cevap");
		}
		

		
		
		
				
		
	}

}
