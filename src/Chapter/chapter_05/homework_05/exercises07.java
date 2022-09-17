package Chapter.chapter_05.homework_05;

public class exercises07 {
	public static void main(String[] args) {
		String total="";
		int tution=1000;
		int lastfouryear=0;
		int year=1;
		while(year<15) {
		 tution= tution+(int) (tution * 0.05);
		 total=year+". year tution is $"+tution;
		 System.out.println(total );
		 if(year>10) {
			 tution= tution+(int) (tution * 0.05);
			 lastfouryear+=tution;
			 
		 }
		 year++;
		}
		
	
		System.out.println("last four years tution price is $ "+lastfouryear);
	}

}
