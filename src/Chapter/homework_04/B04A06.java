package Chapter.Chapter_04.homework_04;

public class B04A06 {
	public static void main(String[] args) {
		final double PI=Math.PI;
		final double R = 40;		
		
		double angle1 = Math.toRadians( (int)(Math.random()*2 * PI));
		double angle2 = Math.toRadians( (int)(Math.random()*2 * PI));
		double angle3 = Math.toRadians( (int)(Math.random()*2 * PI));
		
		
		double x1= R * Math.cos(angle1);
		double y1= R * Math.sin(angle1);
		

		double x2= R * Math.cos(angle2);
		double y2= R * Math.sin(angle2);
		

		double x3= R * Math.cos(angle3);
		double y3= R * Math.sin(angle3);
		
		
		double a= Math.sqrt(((x1-x2) * (x1-x2)) + ((y1-y2) * (y1-y2)));
		double b= Math.sqrt(((x1-x3) * (x1-x3)) + ((y1-y3) * (y1-y3)));
		double c= Math.sqrt(((x2-x3) * (x2-x3)) + ((y2-y3) * (y2-y3)));
		
		double A = Math.acos((a * a - b * b - c * c) / (-2 * b * c));
		double B = Math.acos((b * b - a * a - c * c) / (-2 * a * c));
		double C = Math.acos((c * c - b * b - a * a) / (-2 * a * b));
		
		System.out.println("The three angles are " + A + " " +B+" " + C);
		
		 
		 
				
	}

}
