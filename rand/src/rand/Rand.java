package rand;

import java.util.Random;


public class Rand {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int array[]=new int[10];
		Random rnd = new Random();
		
		for (int i = 0; i < array.length; i++) {
			array[i] = rnd.nextInt(50) + 1;
			System.out.println(array[i]);
			
			//array[i] =(int)(Math.random() * 50) + 1;
			//System.out.println(array[i]);
		}
		
		System.out.println("\n");
		/*for (int e : array) {
			System.out.println(e);
		}*/
		
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[9-i]+ " ");
		}
		
		int maxEven = 0;
		for (int i = 0; i < array.length; i++) {
			if(array[i] > array[maxEven] && array[i] % 2 == 0)
				maxEven = i;
		}
		System.out.println("A legnagyobb elem: " + array[maxEven]);
	}

}
