package futi;

import abstr.*;

public class Futtat {
	public static void main(String[] args) {
		Henger h1 = new Henger(5, 10);
		
		System.out.println(h1.toString());
		System.out.println("A h1 térfogata: " + h1.getVolume());
		
		System.out.println("---");
		
		Teglatest t1 = new Teglatest(5, 10, 5);
		System.out.println(t1.toString());
		System.out.println("A t1 térfogata: " + t1.getVolume());
	}

}
