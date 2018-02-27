package cal;

import java.util.Scanner;

public class Calc {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int number1 = 0;
		int number2 = 0;
		int result = 0;
		String op = "";
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Kérem az 1. számot!");
		number1 = sc.nextInt();
		
		System.out.println("Kérem az operandust!");
		op = sc.next();
		
		System.out.println("Kérem az 2. számot!");
		number2 = sc.nextInt();
		
		sc.close();
		
		System.out.print(number1 + " " + op + " " + number2);
		
		switch (op) {
		case "+":
			result=number1+number2;
			break;
        case "-":
        	result=number1-number2;
			break;
        case "*":
        	result=number1*number2;
	        break;
        case "/":
        	if (number2 == 0)
        		System.out.println("0-val nem lehet osztani!");
        	else
        		result=number1/number2;
	        break;
	        
        	

		
		}
		
		System.out.println(" = " + result);
		

	}

}
