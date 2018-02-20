package mf;

public class Mf {

//	
	public static void main(String[] args) {
	int a = 5;
	int b = 20;
	int c = 2;
	double discriminant = 0;
	double x1,x2 = 0;
	
	discriminant = Math.sqrt((b * b) - 4 * a * c);
	
	if (Double.isNaN(discriminant)) {
		System.out.println("Nincs valós gyöke.");
	}
	else {
		x1 = (b * (-1) + discriminant) / (2 * a);
		x2 = (b * (-1) - discriminant) / (2 * a);
		System.out.println("A megoldások: x1:" + x1 + " x2:" + x2);
	}
	
	

	}
//
}
