package a;

public class AlkFut {

	public static void main(String[] args) {
		Alkalmazott[] alkok =  new Alkalmazott[5];
		alkok[0] = new Alkalmazott();
		alkok[0].setName("Tomi1");
		alkok[0].setPayment(10);
		
		alkok[1] = new Alkalmazott();
		alkok[1].setName("Tomi2");
		alkok[1].setPayment(43);
		
		alkok[2] = new Alkalmazott();
		alkok[2].setName("Tomi3");
		alkok[2].setPayment(29);
		
		alkok[3] = new Alkalmazott();
		alkok[3].setName("Tomi4");
		alkok[3].setPayment(68);
		
		alkok[4] = new Alkalmazott();
		alkok[4].setName("Tomi5");
		alkok[4].setPayment(67);
		
		for(int i=0; i<alkok.length; i++){
			System.out.println(alkok[i].szovegVissza());
		}
		
		
		int max = alkok[0].getPayment();
		for (int j = 0; j < alkok.length; j++) {
			if (alkok[j].getPayment()>max) {
				max = alkok[j].getPayment();
			}
		}
		System.out.println("A legnagyobb fizetésű alkalmazott: " + max);
		
		
		
		
		
		
		Alkalmazott alk1 = new Alkalmazott();
		alk1.setName("Tomi");
		alk1.setPayment(1);
		
		Alkalmazott alk2 = new Alkalmazott();
		alk2.setName("Tomi2");
		alk2.setPayment(80);
		
		System.out.println(alk1.szovegVissza());
		alk1.fizNov(10);
		System.out.println(alk1.szovegVissza());
		
		boolean isTrue = (alk1.fizHatar(10, 20));
		if(isTrue)
			System.out.println("A megadott határok közé esik a fizetése.");
		else System.out.println("Nem esik a megadott határok közé esik a fizetése.");
		
		System.out.println("Az adó értéke: " + alk1.getAdo());
		
		if((alk1.nagyobbE(alk2)))
			System.out.println("Az alk1 fizetése nagyobb.");
		else System.out.println("Az alk2 fizetése nagyobb.");
	}

}
