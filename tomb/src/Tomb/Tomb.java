package Tomb;

public class Tomb {

//
	public static void main(String[] args) {
		int[] tomb =  new int[10];
		int max = 0; 
		int min = 0;
		for(int i=0;i<tomb.length;i++){
			tomb[i] = i+1;
			System.out.println("A(z) " + i + ". elem: " + tomb[i]);
		}
		
		for(int i=0;i<tomb.length;i++){
			max=tomb[0];
			if (tomb[i]>max) {
				max=tomb[i];
			}
		}
		System.out.println("A tömb legnagyobb eleme: " + max);
		
		for(int i=0;i<tomb.length;i++){
			min=tomb[0];
			if (tomb[i]<min){
				min=tomb[i];
			}
		}
		System.out.println("A tömb legkisebb eleme: " + min);
		
		int keresett = 5;
		boolean van = false;
		for(int i=0;i<tomb.length;i++){
			if (keresett==tomb[i]) {
				van=true;
			} 
		}
		if (van==true) {
			System.out.println("Van ilyen elem.");
		} else {
			System.out.println("Nincs ilyen elem.");
		}
	}
//
}
