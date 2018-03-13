package teglalap;

import java.util.Scanner;




public class TeglalapFut2 {

	
	public static void main(String[] args) {
		Teglalap rectangles[] = new Teglalap[10];
		Scanner sc = new Scanner(System.in);
		
		for (int i = 0; i < rectangles.length; i++) {
			rectangles[i] = new Teglalap((int)(Math.random()*8) + 2, (int)(Math.random()*8) + 2);
			System.out.println(rectangles[i].getAdatok());
		}
		
		System.out.println("");
		int min = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if(rectangles[i].getTerulet() < rectangles[min].getTerulet())
				min = i;
		}
		System.out.println("A legkisebb területű téglalap adatai: " + rectangles[min].getAdatok());
		System.out.println("");
		
		System.out.println("Kérem a téglalap A oldalát: ");
		int newA = sc.nextInt();
		
		System.out.println("Kérem a téglalap B oldalát: ");
		int newB = sc.nextInt();
		
		Teglalap newRectangle = new Teglalap(newA,newB);
		
		
		int db = 0;
		
		for (Teglalap t : rectangles) {
			if (t.getTerulet() < newRectangle.getTerulet())
				db++;
		}
		System.out.println("A megadott új téglalaptól kisebb területű téglalapok száma: " + db);
		System.out.println("");
		boolean isTrue = false;
		int index = 0;
		for (int i = 0; i < rectangles.length; i++) {
			if (rectangles[i].equal(newRectangle)) {
				isTrue = true;
				index = i;
				break;
			}
		}
		
		if(isTrue)
			System.out.println("Az egyező oldalú téglalap objektum indexe: " + index);
		else
			System.out.println("Nem volt egyező méretű téglalap!");
		
		
	}

}
