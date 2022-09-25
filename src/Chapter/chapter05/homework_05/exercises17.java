package Chapter.chapter_05.homework_05;

public class exercises17 {
	public static void main(String[] args) {
		
		int row=8;
		for(int i=1 ; i<row;i++) {
			
			for(int j= 1; j<row-i;j++) {
				System.out.print("  ");
			}
			
			for(int k=i;k>=1;k--) {
				System.out.print(k+" ");
			}
			
			for(int a=2;a<=i;a++) {
				System.out.print(a+" ");
			}
			System.out.println();
			
			
		}
			
	}}

		
	
	