package ujcsomag;

import abstr.*;

public class TarolFuttat {
	public static void main(String[] args) {
		Tarol ht = new Tarol(5);
		
		ht.SetHasabRef(0, new Henger(4, 10));
		ht.SetHasabRef(1, new Henger(2, 3));
		ht.SetHasabRef(2, new Teglatest(5, 5, 2));
		ht.SetHasabRef(3, null);
		ht.SetHasabRef(4, null);
		
		for(int i = 0; i< 5; i++){
			if (ht.getIndexoHasab(i)!=null)
				System.out.println(ht.getIndexoHasab(i).toString());
		}
		
		System.out.println("---");
		
		System.out.println("A hasábok átlagos térfogata: "+ ht.getHasabAverageVolume());
		System.out.println("A hengerek száma: " + ht.getHengerHasab());
		System.out.println("A null elemek száma: " + ht.getNotNullElements());
	}

}
