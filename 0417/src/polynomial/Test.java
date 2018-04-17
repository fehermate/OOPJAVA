package polynomial;

import math.IPolynomial;
import java.util.Scanner;



public class Test {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		LinearPolynomial[] lpArray = new LinearPolynomial[5];
		
		for (int i = 0; i < lpArray.length; i++) {
			System.out.println("Kérem az " + i + ". polinom 'a' együtthatóját: ");
			double a = sc.nextDouble();
			System.out.println("Kérem az " + i + ". polinom 'b' együtthatóját: ");
			double b = sc.nextDouble();
			
			lpArray[i] = new LinearPolynomial(a, b);
		}
		sc.close();
		
		for (LinearPolynomial lp : lpArray) {
			System.out.println(lp.toString());
		}
		
		getLookupTable(lpArray[4]);
		
	}
	
	
	
	public static void getLookupTable(IPolynomial polyref){
		for (double i = 0; i <= 1; i = i + 0.1) {
			System.out.println(i + ": " + polyref.getY(i));
		}
	}
	
}
