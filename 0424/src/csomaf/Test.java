package csomaf;

import java.util.Scanner;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class Test {

	public static void main(String[] args) {
		int[] array = new int[5];
		//readNextInt(array);
		//readNextLine(array);
		//inputBR(array);
		//inputBR2(array);
		
		try {
			readNextInt(array);
		} catch (PrimeException e){
			e.printStackTrace();
		}
		
		//Out(array);
	}
	
	public static void Out(int[] arr){
		for (int i = 0;i < arr.length; i++) {
			System.out.println("A tömb " + i + ". eleme: "+ arr[i]);
		}	
	}
	
	public static void readNextInt(int[] array) throws PrimeException  {
		Scanner sc = new Scanner(System.in);
		 
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Kérem a tömb "+i+". elemét: ");
			int number = sc.nextInt();
			
			if(isPrime(number)){
				array[i] = number;
				
			} else {
				throw new PrimeException(number + " nem prím szám!");
				
			}
			
		}
		sc.close();
		System.out.println("");
		Out(array);
	}
	
	public static void readNextLine(int[] array) {
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < array.length; i++) {
			
			System.out.println("Kérem a tömb "+i+". elemét: ");
			String line = sc.nextLine();
			array[i] =Integer.parseInt(line);
		}
		sc.close();
		System.out.println("");
		Out(array);
	}
	
	public static void inputBR(int[] array) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < array.length; i++) {
			System.out.println("Kérem a tömb "+i+". elemét: ");
			String line = "";
			
			try {
				line = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			array[i] = Integer.valueOf(line).intValue(); 
		}
		
		System.out.println("");
		Out(array);
		
	}
	
	public static void inputBR2(int[] array) {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		for (int i = 0; i < array.length; i++) {
			System.out.println("Kérem a tömb "+i+". elemét: ");
			String line = "";
			
			try {
				line = in.readLine();
			} catch (IOException e) {
				e.printStackTrace();
			}
			array[i] = Integer.parseInt(line); 
		}
		
		System.out.println("");
		Out(array);
		
	}
	
	public static boolean isPrime(int n) {

	      if (n < 2) return false;

	      for (int i = 2; i <= n / 2 ; i++) {

	          if (n % i == 0) return false;
	      }
	      return true;
	  }
	
	
	
	
}
